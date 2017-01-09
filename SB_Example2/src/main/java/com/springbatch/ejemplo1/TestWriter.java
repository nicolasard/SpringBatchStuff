package com.springbatch.ejemplo1;

import java.util.List;
import org.springframework.batch.item.ItemWriter;
import com.springbatch.ejemplo1.Destination;

public class TestWriter implements ItemWriter<Object> {

 @Override
 public void write(List<?> arg0) throws Exception {
  for(Destination dest : (List<Destination>)arg0)
  {
   System.out.println("Writing : "+dest.getOutput());
  }
  System.out.println("Finished Writing");
 }
 
}