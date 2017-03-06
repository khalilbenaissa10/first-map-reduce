package insat.reducers;

import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class ActivityFourReducer<KEY> extends
		Reducer<KEY, LongWritable, KEY, LongWritable> {

	private LongWritable result = new LongWritable();

	public void reduce(KEY key, Iterable<LongWritable> values, Context context)
			throws IOException, InterruptedException {
		long max = 0;
		for (LongWritable val : values) {
			if(val.get()>max){
				max = val.get();
			}
		}
		 System.out.println(key+":"+max);
		result.set(max);
		
		context.write(key, result);
	}
}