package hello;

import java.util.Scanner;

public class Cascade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        int z;
        System.out.print("请输入3个整数：");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        int max = 0;
        if (x > y)
        {
        	if (x > z)
        	{
        		max = x;
        	}
        	else
        	{
        		max = z;
        	}
        }
        else
        {
        	if (y > z)
        	{
        		max = y;
        	}
        	else
        	{
        		max = z;
        	}
        }
        System.out.println("这3个整数中的最大值是：" + max);
	}

}
