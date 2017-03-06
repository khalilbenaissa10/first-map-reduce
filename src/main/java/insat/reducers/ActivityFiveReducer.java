package insat.reducers;

import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import sun.rmi.rmic.iiop.ContextElement;

public class ActivityFiveReducer<KEY> extends
		Reducer<KEY, LongWritable, KEY, LongWritable> {

	private LongWritable result = new LongWritable();
	private LongWritable result2 = new LongWritable();

	public void reduce(KEY key, Iterable<LongWritable> values, Context context)
			throws IOException, InterruptedException {
		long sum = 0;
		long compte = 0;
		for (LongWritable val : values) {
			sum += val.get();
			compte++;
		}
		 System.out.println(compte+":"+sum);
		result.set(sum);
		result2.set(compte);
		
		context.write(key, result);
		context.write(key,result2);
		
	}
}