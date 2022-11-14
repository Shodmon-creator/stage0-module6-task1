package com.epam.mjc.stage0;

public class Bird extends Animal {
 Bird(){
  super("brown",4,true);
 }
 @Override
 public String getDescription(){

  return getDescription()+" Moreover, it has 2 wings and can fly.";
 }


}
