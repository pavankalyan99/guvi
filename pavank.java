/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner s = new Scanner(System.in);
     int x = s.nextInt();
     int y = s.nextInt();
      int z = s.nextInt();
 
      if ( x > y && x > z )
      {
         System.out.println(x);
      }
      else if( y > x && y > z )
      {
         System.out.println(y);
      }
      else 
      { 
     System.out.println(z);
      }
}
}
