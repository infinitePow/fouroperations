	package SZYS.view;
	
	import SZYS.controller.SZYScontrol;
	
	public class SZYSView {
		private SZYScontrol control = new SZYScontrol(); 
		public void view(){
			while(true){
			System.out.println("����������������������������������������������������������������������������������������������������������");
			System.out.println("                                   ��������������"	);
			System.out.println("-----------------------------------------------------");
			System.out.println("        |  0.�ӷ�		1.����	|"	);
			System.out.println("         -------------------------------");
			System.out.println("        |  2.�˷�		3.����	|"	);
			System.out.println("         -------------------------------");
			System.out.println("        |  4.��ϼӼ���	5.�������	|"	);
			System.out.println("         -------------------------------");
			System.out.println("-----------------------------------------------------");
			System.out.println("��ѡ��˵���ţ�");
			control.Select();
		}
		}
	}
