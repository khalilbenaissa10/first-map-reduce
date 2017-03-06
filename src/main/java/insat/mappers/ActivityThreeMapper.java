package insat.mappers;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.jasper.tagplugins.jstl.core.If;

public class ActivityThreeMapper extends
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
		//if (split[3].equals("Toys"))
		if (split[3].equals("Consumer Electronics")){
			word.set(split[3]);
			System.out.println(split[3]);
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
