	package SZYSService;
	
	import java.util.Random;
	import java.util.Scanner;
	
	public class SZYSservice {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		public void add1(){
			double result = 0;
			int i=0;//控制题目数量
			int j=1;//控制题目编号
			int h=0;//控制换行
			int y=0;int n=0;//正确题目和错误题目的计数器
			
			System.out.println("请输入题目数量：");
			int num = sc.nextInt();
			System.out.println("请输入题目数值范围(默认大于0)：");
					int scope = 0;
					scope = sc.nextInt();
			while(i<num){
				int a = r.nextInt(scope);
				int b = r.nextInt(scope);
			System.out.print(j+"、"+a+"+"+ b+"="+"\t");
			int answer = sc.nextInt();
			result = a+b;
			//System.out.print("答案为："+result);
			
			if(answer==result){
				y++;
				System.out.println("回答正确");
			}else{
				n++;
				System.out.println("回答错误");
			}
			i++;
			j++;
			h++;
			if(h%5==0){
				System.out.println();
						}
			}
			System.out.println("满分为："+num+"/t"+"你的成绩为："+y);
		}
		public void add2(){
			int result = 0;
			int i=0;//控制题目数量
			int i1=0;
			int j=1;//控制题目编号
			int j1=1;
			int h=0;//控制换行
			int y=0;int n=0;//正确题目和错误题目的计数器
			
			System.out.println("请输入题目数量：");
			int num = sc.nextInt();
			int []c = new int[num];
			while(i<num){
				int a = r.nextInt(100);
				int b = r.nextInt(100);
				
			System.out.print(j+"、"+a+"+"+ b+"="+"\t");
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
			System.out.println("请依次输入答案：");
			while(i1<num){
				
				System.out.println(j1+":");
				int answer = sc.nextInt();
				if(answer==c[i1]){
					y++;
					System.out.println("回答正确！");
				}else{
					n++;
					System.out.println("回答错误！");
				}
				i1++;
				j1++;
		}
			System.out.println("满分为："+num+"/t"+"你的成绩为："+y);
			}
		public void sub1(){
			double result = 0;
			int i=0;//控制题目数量
			int j=1;//控制题目编号
			int h=0;//控制换行
			int y=0;int n=0;//正确题目和错误题目的计数器
			
			System.out.println("请输入题目数量：");
			int num = sc.nextInt();
			while(i<num){
				int a = r.nextInt(100);
				int b = r.nextInt(100);
			System.out.print(j+"、"+a+"-"+ b+"="+"\t");
			int answer = sc.nextInt();
			result = a-b;
			//System.out.print("答案为："+result);
			
			if(answer==result){
				y++;
				System.out.println("回答正确");
			}else{
				n++;
				System.out.println("回答错误");
			}
			i++;
			j++;
			h++;
			if(h%5==0){
				System.out.println();
						}
			}
			System.out.println("最终成绩为："+y);
		}		
		public void sub2(){
			int result = 0;
			int i=0;//控制题目数量
			int i1=0;
			int j=1;//控制题目编号
			int j1=1;
			int h=0;//控制换行
			int y=0;int n=0;//正确题目和错误题目的计数器
			
			System.out.println("请输入题目数量：");
			int num = sc.nextInt();
			int []c = new int[num];
			while(i<num){
				int a = r.nextInt(100);
				int b = r.nextInt(100);
				
			System.out.print(j+"、"+a+"-"+ b+"="+"\t");
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
			System.out.println("请依次输入答案：");
			while(i1<num){
				
				System.out.println(j1+":");
				int answer = sc.nextInt();
				if(answer==c[i1]){
					y++;
					System.out.println("回答正确！");
				}else{
					n++;
					System.out.println("回答错误！");
				}
				i1++;
				j1++;
		}
			System.out.println("满分为："+num+"/t"+"你的成绩为："+y);
		}		
		public void mult1(){
			double result = 0;
			int i=0;//控制题目数量
			int j=1;//控制题目编号
			int h=0;//控制换行
			int y=0;int n=0;//正确题目和错误题目的计数器
			
			System.out.println("请输入题目数量：");
			int num = sc.nextInt();
			while(i<num){
				int a = r.nextInt(50);
				int b = r.nextInt(50);
			System.out.print(j+"、"+a+"*"+ b+"="+"\t");
			int answer = sc.nextInt();
			result = a*b;
			//System.out.print("答案为："+result);
			
			if(answer==result){
				y++;
				System.out.println("回答正确");
			}else{
				n++;
				System.out.println("回答错误");
			}
			i++;
			j++;
			h++;
			if(h%5==0){
				System.out.println();
						}
			}
			System.out.println("满分为："+num+"/t"+"你的成绩为："+y);
		}		
		public void mult2(){
			int result = 0;
			int i=0;//控制题目数量
			int i1=0;
			int j=1;//控制题目编号
			int j1=1;
			int h=0;//控制换行
			int y=0;int n=0;//正确题目和错误题目的计数器
			
			System.out.println("请输入题目数量：");
			int num = sc.nextInt();
			int []c = new int[num];
			while(i<num){
				int a = r.nextInt(50);
				int b = r.nextInt(50);
				
			System.out.print(j+"、"+a+"*"+ b+"="+"\t");
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
			System.out.println("请依次输入答案：");
			while(i1<num){
				
				System.out.println(j1+":");
				int answer = sc.nextInt();
				if(answer==c[i1]){
					y++;
					System.out.println("回答正确！");
				}else{
					n++;
					System.out.println("回答错误！");
				}
				i1++;
				j1++;
		}
			System.out.println("满分为："+num+"/t"+"你的成绩为："+y);
		}		
		public void dvid1(){
			double result = 0;
			int i=0;//控制题目数量
			int j=1;//控制题目编号
			int h=0;//控制换行
			int y=0;int n=0;//正确题目和错误题目的计数器
			
			System.out.println("请输入题目数量：");
			int num = sc.nextInt();
			while(i<num){
				int a = r.nextInt(100);
				int b = r.nextInt(100);
			System.out.print(j+"、"+a+"/"+ b+"="+"\t");
			double answer = sc.nextDouble();
			result = a/b;
			//System.out.print("答案为："+result);
			
			if(answer==result){
				y++;
				System.out.println("回答正确");
			}else{
				n++;
				System.out.println("回答错误");
			}
			i++;
			j++;
			h++;
			if(h%5==0){
				System.out.println();
						}
			}
			System.out.println("满分为："+num+"/t"+"你的成绩为："+y);
		}
		public void dvid2(){
			double result = 0;
			int i=0;//控制题目数量
			int i1=0;
			int j=1;//控制题目编号
			int j1=1;
			int h=0;//控制换行
			int y=0;int n=0;//正确题目和错误题目的计数器
			
			System.out.println("请输入题目数量：");
			int num = sc.nextInt();
			double []c = new double[num];
			while(i<num){
				int a = r.nextInt(100);
				int b = r.nextInt(100);
				
			System.out.print(j+"、"+a+"/"+ b+"="+"\t");
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
			System.out.println("请依次输入答案：");
			while(i1<num){
				
				System.out.println(j1+":");
				double answer = sc.nextDouble();
				if(answer==c[i1]){
					y++;
					System.out.println("回答正确！");
				}else{
					n++;
					System.out.println("回答错误！");
				}
				i1++;
				j1++;
		}
			System.out.println("满分为："+num+"/t"+"你的成绩为："+y);
		}
		public void addsub(){
			
		}
		public void mutdvi(){
			
		}
	}
