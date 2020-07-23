package hello;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int foot;
        double inch;
        Scanner in = new Scanner(System.in);
//        System.out.print("请输入英尺数：");
        foot = (int)(30 / 3.0);
        System.out.print("请输入寸数：");
        inch = in.nextDouble();
//        float height;
//        height = (foot + inch / 12) * 0.3048;
        System.out.println(10/3);
        System.out.println("foot = "+foot+",inch = "+inch);
        System.out.println("您的身高为" + (int)((foot + inch / 12) * 0.3048 * 100) + "cm");
	    System.out.println(1.2-1.1);
	}

}
