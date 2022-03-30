package com.demo;

public class FizzBuzz 
{
    String processNumber(int num)
	{	
    	// Copy your code here
          if(num == 0)
          {
            return String.valueOf(0);  
          }
          else if(num % 15 == 0)
          {
            return "fizz buzz";
          }
          else if(num % 5 == 0)
          {
            return "buzz";
          }
          else if(num % 3 == 0)
          {
            return "fizz";
          }
          else
          {
            return String.valueOf(num);
          }
	}
	
	String processNumbers (int[] nums)
	{
    String temp = "";
    if(nums.length == 0)
          {
            return "invalid";
          }
        for(int i = 0; i < nums.length; i++)
        {
          if(nums[i] == 0)
          {
            temp += String.valueOf(0) + ",";  
          }
          else if(nums[i] % 15 == 0)
          {
            temp += "fizz buzz,";
          }
          else if(nums[i] % 5 == 0)
          {
            temp += "buzz,";
          }
          else if(nums[i] % 3 == 0)
          {
            temp += "fizz,";
          }
          else
          {
            temp += String.valueOf(nums[i]) + ",";
          }
        }
        return temp;
	}

}
