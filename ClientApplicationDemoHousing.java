import java.io.*;

class ClientApplicationDemoHousing{
	public static void main(String args[])throws IOException{
		System.out.println("Welcome to Saayan's Housing Cost Calculator");
		int ch=1;
		Housing h= new Housing();
		do{
		System.out.println("Follow the instructions to perform desired interest operation : ");
		System.out.println("Press 1 for Standard Material");
		System.out.println("Press 2 for Above Standard Material");
		System.out.println("Press 3 for High Standard Material with No automation in Housing");
		System.out.println("Press 4 for High Standard Material with Fully automated Housing");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());

		System.out.println("Enter area of house in square feet");
		double area=Double.parseDouble(br.readLine());
		switch (x){
			case 1: h.input("Standard",area,"No");
				System.out.println("The Required Cost is : "+h.cost());
				break;
			case 2: h.input("Above Standard",area,"No");
				System.out.println("The Required Cost is : "+h.cost());
				break;
			case 3: h.input("High",area,"No");
				System.out.println("The Required Cost is : "+h.cost());
				break;
			case 4: h.input("High",area,"Full");
				System.out.println("The Required Cost is : "+h.cost());
				break;
		}	
		System.out.println("Press 0 to EXIT or any other digit to CONTINUE");
		ch=Integer.parseInt(br.readLine());
		}while(ch!=0);
	}
}
	