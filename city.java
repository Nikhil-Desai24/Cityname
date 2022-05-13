import java.io.*;
import java.util.*;
class ArrayOfString1
{
		public static void main(String[]args)
		{
			String[]arr=new String[5];
			String tmp=" ";
			BufferedReader br=null;
			try
			{
				br=new  BufferedReader(new InputStreamReader(System.in));
			}
			catch(Exception e){}
			System.out.println("enter City name:");
			int i=0,j=0;
			while(i<5)
			{
				try
				{
					tmp=br.readLine();
				}
				catch(Exception e){}
				if(i!=0)
				{
					for(i=0;j<5;i++)
					{
						if(tmp.compareTo(arr[i])==0)
						break;
					}
					for(j=0;j<i;j++)
					System.out.println(arr[j]);
				}
			}
		}
}