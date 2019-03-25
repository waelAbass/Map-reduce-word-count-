/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapreducesec1p1;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
public class wordcountmapper extends Mapper<Object, Text, Text, IntWritable>{

    @Override
    protected void map(Object key, Text value, Context context) throws IOException, InterruptedException {
         //To change body of generated methods, choose Tools | Templates.
       String mytext =value.toString();
       String allwords []=mytext.split(" ");
       for(String x:allwords){
        context.write(new Text(x), new IntWritable(1));
       }
        
    }   
}
