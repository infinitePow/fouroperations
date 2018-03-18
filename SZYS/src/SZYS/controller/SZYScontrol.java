package SZYS.controller;

import java.util.Scanner;

import SZYSService.SZYSservice;

public class SZYScontrol {
	private SZYSservice ser = new SZYSservice();
	Scanner sc = new Scanner(System.in);
	public void Select(){
		int enter;
		enter = sc.nextInt();
		switch (enter) {
		case 0:
			System.out.println("您选择的是加法题库");
			System.out.println("请输入要打印题目的方式编号       1.分行打印    2.统一打印");
			int num1 = sc.nextInt();
			switch (num1) {
			case 1:
				ser.add1();
				break;
			case 2:
				ser.add2();
				break;

			default:
				System.out.println("没有此编号！");
				System.out.println("自动进入分行打印模式！");
				ser.add1();
			}
			break;
		case 1:
			System.out.println("您选择的是减法题库");
			System.out.println("请输入要打印题目的方式编号       1.分行打印    2.统一打印");
			int num2 = sc.nextInt();
			switch (num2) {
			case 1:
				ser.sub1();
				break;
			case 2:
				ser.sub2();
				break;

			default:
				System.out.println("没有此编号！");
				System.out.println("自动进入分行打印模式！");
				ser.sub1();
			}
			break;
		case 2:
			System.out.println("您选择的是乘法题库");
			System.out.println("请输入要打印题目的方式编号       1.分行打印    2.统一打印");
			int num3 = sc.nextInt();
			switch (num3) {
			case 1:
				ser.mult1();
				break;
			case 2:
				ser.mult2();
				break;

			default:
				System.out.println("没有此编号！");
				System.out.println("自动进入分行打印模式！");
				ser.mult1();
			}
			break;
		case 3:
			System.out.println("您选择的是除法题库(答案不保留小数)");
			System.out.println("请输入要打印题目的方式编号       1.分行打印    2.统一打印");
			int num4 = sc.nextInt();
			switch (num4) {
			case 1:
				ser.dvid1();
				break;
			case 2:
				ser.dvid2();
				break;

			default:
				System.out.println("没有此编号！");
				System.out.println("自动进入分行打印模式！");
				ser.dvid1();
			}
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			break;
		}
	}
}
