	package SZYSService;
	
	import java.util.Random;
	import java.util.Scanner;
	
	public class SZYSservice {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		public void add1(){
			double result = 0;
			int i=0;//������Ŀ����
			int j=1;//������Ŀ���
			int h=0;//���ƻ���
			int y=0;int n=0;//��ȷ��Ŀ�ʹ�����Ŀ�ļ�����
			
			System.out.println("��������Ŀ������");
			int num = sc.nextInt();
			System.out.println("��������Ŀ��ֵ��Χ(Ĭ�ϴ���0)��");
					int scope = 0;
					scope = sc.nextInt();
			while(i<num){
				int a = r.nextInt(scope);
				int b = r.nextInt(scope);
			System.out.print(j+"��"+a+"+"+ b+"="+"\t");
			int answer = sc.nextInt();
			result = a+b;
			//System.out.print("��Ϊ��"+result);
			
			if(answer==result){
				y++;
				System.out.println("�ش���ȷ");
			}else{
				n++;
				System.out.println("�ش����");
			}
			i++;
			j++;
			h++;
			if(h%5==0){
				System.out.println();
						}
			}
			System.out.println("����Ϊ��"+num+"/t"+"��ĳɼ�Ϊ��"+y);
		}
		public void add2(){
			int result = 0;
			int i=0;//������Ŀ����
			int i1=0;
			int j=1;//������Ŀ���
			int j1=1;
			int h=0;//���ƻ���
			int y=0;int n=0;//��ȷ��Ŀ�ʹ�����Ŀ�ļ�����
			
			System.out.println("��������Ŀ������");
			int num = sc.nextInt();
			int []c = new int[num];
			while(i<num){
				int a = r.nextInt(100);
				int b = r.nextInt(100);
				
			System.out.print(j+"��"+a+"+"+ b+"="+"\t");
			result = a+b;
			c[i] = result;
			i++;
			j++;
			h++;
				if(h%5==0){
					System.out.println();
							}
			}
			System.out.println();
			System.out.println("����������𰸣�");
			while(i1<num){
				
				System.out.println(j1+":");
				int answer = sc.nextInt();
				if(answer==c[i1]){
					y++;
					System.out.println("�ش���ȷ��");
				}else{
					n++;
					System.out.println("�ش����");
				}
				i1++;
				j1++;
		}
			System.out.println("����Ϊ��"+num+"/t"+"��ĳɼ�Ϊ��"+y);
			}
		public void sub1(){
			double result = 0;
			int i=0;//������Ŀ����
			int j=1;//������Ŀ���
			int h=0;//���ƻ���
			int y=0;int n=0;//��ȷ��Ŀ�ʹ�����Ŀ�ļ�����
			
			System.out.println("��������Ŀ������");
			int num = sc.nextInt();
			while(i<num){
				int a = r.nextInt(100);
				int b = r.nextInt(100);
			System.out.print(j+"��"+a+"-"+ b+"="+"\t");
			int answer = sc.nextInt();
			result = a-b;
			//System.out.print("��Ϊ��"+result);
			
			if(answer==result){
				y++;
				System.out.println("�ش���ȷ");
			}else{
				n++;
				System.out.println("�ش����");
			}
			i++;
			j++;
			h++;
			if(h%5==0){
				System.out.println();
						}
			}
			System.out.println("���ճɼ�Ϊ��"+y);
		}		
		public void sub2(){
			int result = 0;
			int i=0;//������Ŀ����
			int i1=0;
			int j=1;//������Ŀ���
			int j1=1;
			int h=0;//���ƻ���
			int y=0;int n=0;//��ȷ��Ŀ�ʹ�����Ŀ�ļ�����
			
			System.out.println("��������Ŀ������");
			int num = sc.nextInt();
			int []c = new int[num];
			while(i<num){
				int a = r.nextInt(100);
				int b = r.nextInt(100);
				
			System.out.print(j+"��"+a+"-"+ b+"="+"\t");
			result = a-b;
			c[i] = result;
			i++;
			j++;
			h++;
				if(h%5==0){
					System.out.println();
							}
			}
			System.out.println();
			System.out.println("����������𰸣�");
			while(i1<num){
				
				System.out.println(j1+":");
				int answer = sc.nextInt();
				if(answer==c[i1]){
					y++;
					System.out.println("�ش���ȷ��");
				}else{
					n++;
					System.out.println("�ش����");
				}
				i1++;
				j1++;
		}
			System.out.println("����Ϊ��"+num+"/t"+"��ĳɼ�Ϊ��"+y);
		}		
		public void mult1(){
			double result = 0;
			int i=0;//������Ŀ����
			int j=1;//������Ŀ���
			int h=0;//���ƻ���
			int y=0;int n=0;//��ȷ��Ŀ�ʹ�����Ŀ�ļ�����
			
			System.out.println("��������Ŀ������");
			int num = sc.nextInt();
			while(i<num){
				int a = r.nextInt(50);
				int b = r.nextInt(50);
			System.out.print(j+"��"+a+"*"+ b+"="+"\t");
			int answer = sc.nextInt();
			result = a*b;
			//System.out.print("��Ϊ��"+result);
			
			if(answer==result){
				y++;
				System.out.println("�ش���ȷ");
			}else{
				n++;
				System.out.println("�ش����");
			}
			i++;
			j++;
			h++;
			if(h%5==0){
				System.out.println();
						}
			}
			System.out.println("����Ϊ��"+num+"/t"+"��ĳɼ�Ϊ��"+y);
		}		
		public void mult2(){
			int result = 0;
			int i=0;//������Ŀ����
			int i1=0;
			int j=1;//������Ŀ���
			int j1=1;
			int h=0;//���ƻ���
			int y=0;int n=0;//��ȷ��Ŀ�ʹ�����Ŀ�ļ�����
			
			System.out.println("��������Ŀ������");
			int num = sc.nextInt();
			int []c = new int[num];
			while(i<num){
				int a = r.nextInt(50);
				int b = r.nextInt(50);
				
			System.out.print(j+"��"+a+"*"+ b+"="+"\t");
			result = a*b;
			c[i] = result;
			i++;
			j++;
			h++;
				if(h%5==0){
					System.out.println();
							}
			}
			System.out.println();
			System.out.println("����������𰸣�");
			while(i1<num){
				
				System.out.println(j1+":");
				int answer = sc.nextInt();
				if(answer==c[i1]){
					y++;
					System.out.println("�ش���ȷ��");
				}else{
					n++;
					System.out.println("�ش����");
				}
				i1++;
				j1++;
		}
			System.out.println("����Ϊ��"+num+"/t"+"��ĳɼ�Ϊ��"+y);
		}		
		public void dvid1(){
			double result = 0;
			int i=0;//������Ŀ����
			int j=1;//������Ŀ���
			int h=0;//���ƻ���
			int y=0;int n=0;//��ȷ��Ŀ�ʹ�����Ŀ�ļ�����
			
			System.out.println("��������Ŀ������");
			int num = sc.nextInt();
			while(i<num){
				int a = r.nextInt(100);
				int b = r.nextInt(100);
			System.out.print(j+"��"+a+"/"+ b+"="+"\t");
			double answer = sc.nextDouble();
			result = a/b;
			//System.out.print("��Ϊ��"+result);
			
			if(answer==result){
				y++;
				System.out.println("�ش���ȷ");
			}else{
				n++;
				System.out.println("�ش����");
			}
			i++;
			j++;
			h++;
			if(h%5==0){
				System.out.println();
						}
			}
			System.out.println("����Ϊ��"+num+"/t"+"��ĳɼ�Ϊ��"+y);
		}
		public void dvid2(){
			double result = 0;
			int i=0;//������Ŀ����
			int i1=0;
			int j=1;//������Ŀ���
			int j1=1;
			int h=0;//���ƻ���
			int y=0;int n=0;//��ȷ��Ŀ�ʹ�����Ŀ�ļ�����
			
			System.out.println("��������Ŀ������");
			int num = sc.nextInt();
			double []c = new double[num];
			while(i<num){
				int a = r.nextInt(100);
				int b = r.nextInt(100);
				
			System.out.print(j+"��"+a+"/"+ b+"="+"\t");
			result = a/b;
			c[i] = result;
			i++;
			j++;
			h++;
				if(h%5==0){
					System.out.println();
							}
			}
			System.out.println();
			System.out.println("����������𰸣�");
			while(i1<num){
				
				System.out.println(j1+":");
				double answer = sc.nextDouble();
				if(answer==c[i1]){
					y++;
					System.out.println("�ش���ȷ��");
				}else{
					n++;
					System.out.println("�ش����");
				}
				i1++;
				j1++;
		}
			System.out.println("����Ϊ��"+num+"/t"+"��ĳɼ�Ϊ��"+y);
		}
		public void addsub(){
			
		}
		public void mutdvi(){
			
		}
	}
