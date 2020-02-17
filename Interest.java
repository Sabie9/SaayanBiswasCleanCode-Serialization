import java.io.*;
import java.lang.Math;

abstract class Interest{
	double principal,rateOfInterest,years,total;
	public void input()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		principal=Double.parseDouble(br.readLine());
		
		rateOfInterest=Double.parseDouble(br.readLine());
		years=Double.parseDouble(br.readLine());
	}
	abstract public void calculate();
	abstract public double output();
}