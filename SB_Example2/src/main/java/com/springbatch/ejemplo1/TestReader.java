package com.springbatch.ejemplo1;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import com.springbatch.ejemplo1.Source;

public class TestReader implements ItemReader<Source> {
 
 private int count = 10;
 private boolean raiseError = false;
 private static int internalCount = 0;

 public Source read() throws Exception, UnexpectedInputException,
   ParseException, NonTransientResourceException {
  
  if(raiseError)
  {
   System.out.println("Exception occured while reading");
   throw new Exception("New Exception");
  }
  internalCount++;
  if(internalCount >= count)
  {
   System.out.println("Reached max count "+internalCount);
   return null;
  }
  Source source = new Source();
  source.setInput("Input "+internalCount);
  System.out.println("Reading item "+internalCount);
  return source;
 }
 
 //Getters y setters
 
 public void setCount(int PCount){
	 this.count = PCount;
 }
 public int getCount(){
	 return this.count;
 }
 
  public void setRaiseError(boolean PRError){
	 this.raiseError = PRError;
 }
 public boolean getRaiseError(){
	 return this.raiseError;
 }
 
}