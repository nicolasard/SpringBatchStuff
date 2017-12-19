package com.springbatch.ejemplo1;

import org.springframework.batch.item.ItemProcessor;
import com.springbatch.ejemplo1.Destination;
import com.springbatch.ejemplo1.Source;

public class TestProcessor implements ItemProcessor<Source,Destination> {

	@Override
	public Destination process(Source source) throws Exception {
		Destination destination = new Destination();
		destination.setOutput(source.getInput().replace("Input", "Output"));
		System.out.println("Converted "+source.getInput()+" to "+destination.getOutput());
		return destination;
	}

}