/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapreducesec1p1;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/**
 *
 * @author cloudera
 */
public class wordcountreducer extends Reducer<Text, IntWritable, Text, IntWritable> {

    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        //To change body of generated methods, choose Tools | Templates.
        int sum = 0;
        for (IntWritable iw : values) {
            sum += iw.get();
        }
       context.write(key, new IntWritable(sum));
    }

}
