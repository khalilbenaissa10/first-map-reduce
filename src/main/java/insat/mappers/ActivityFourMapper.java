package insat.mappers;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class ActivityFourMapper extends
		Mapper<LongWritable, Text, Text, LongWritable> {

	private Text word = new Text();
	private LongWritable count = new LongWritable();

	@Override
	protected void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		// value is tab separated values: word, year, occurrences, #books,
		// #pages
		// we project out (word, occurrences) so we can sum over all years
		String[] split = value.toString().split("\t+");
		if (split[2].equals("Reno")) {
			word.set(split[2]);
			System.out.println(split[2]);
			if (split.length == 6) {
				try {
					System.out.println(split[4]);
					count.set(Long.parseLong(split[4]));
					context.write(word, count);
				} catch (NumberFormatException e) {
					// cannot parse - ignore
				}
			}
		}
	}
}
