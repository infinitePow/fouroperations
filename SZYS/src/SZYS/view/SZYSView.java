	package SZYS.view;
	
	import SZYS.controller.SZYScontrol;
	
	public class SZYSView {
		private SZYScontrol control = new SZYScontrol(); 
		public void view(){
			while(true){
			System.out.println("—————————————————————————————————————————————————————");
			System.out.println("                                   四则运算生成器"	);
			System.out.println("-----------------------------------------------------");
			System.out.println("        |  0.加法		1.减法	|"	);
			System.out.println("         -------------------------------");
			System.out.println("        |  2.乘法		3.除法	|"	);
			System.out.println("         -------------------------------");
			System.out.println("        |  4.混合加减法	5.混合运算	|"	);
			System.out.println("         -------------------------------");
			System.out.println("-----------------------------------------------------");
			System.out.println("请选择菜单编号：");
			control.Select();
		}
		}
	}
