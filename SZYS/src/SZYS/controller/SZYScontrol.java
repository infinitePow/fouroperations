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
			System.out.println("��ѡ����Ǽӷ����");
			System.out.println("������Ҫ��ӡ��Ŀ�ķ�ʽ���       1.���д�ӡ    2.ͳһ��ӡ");
			int num1 = sc.nextInt();
			switch (num1) {
			case 1:
				ser.add1();
				break;
			case 2:
				ser.add2();
				break;

			default:
				System.out.println("û�д˱�ţ�");
				System.out.println("�Զ�������д�ӡģʽ��");
				ser.add1();
			}
			break;
		case 1:
			System.out.println("��ѡ����Ǽ������");
			System.out.println("������Ҫ��ӡ��Ŀ�ķ�ʽ���       1.���д�ӡ    2.ͳһ��ӡ");
			int num2 = sc.nextInt();
			switch (num2) {
			case 1:
				ser.sub1();
				break;
			case 2:
				ser.sub2();
				break;

			default:
				System.out.println("û�д˱�ţ�");
				System.out.println("�Զ�������д�ӡģʽ��");
				ser.sub1();
			}
			break;
		case 2:
			System.out.println("��ѡ����ǳ˷����");
			System.out.println("������Ҫ��ӡ��Ŀ�ķ�ʽ���       1.���д�ӡ    2.ͳһ��ӡ");
			int num3 = sc.nextInt();
			switch (num3) {
			case 1:
				ser.mult1();
				break;
			case 2:
				ser.mult2();
				break;

			default:
				System.out.println("û�д˱�ţ�");
				System.out.println("�Զ�������д�ӡģʽ��");
				ser.mult1();
			}
			break;
		case 3:
			System.out.println("��ѡ����ǳ������(�𰸲�����С��)");
			System.out.println("������Ҫ��ӡ��Ŀ�ķ�ʽ���       1.���д�ӡ    2.ͳһ��ӡ");
			int num4 = sc.nextInt();
			switch (num4) {
			case 1:
				ser.dvid1();
				break;
			case 2:
				ser.dvid2();
				break;

			default:
				System.out.println("û�д˱�ţ�");
				System.out.println("�Զ�������д�ӡģʽ��");
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
