import java.io.*;

public class Housing{
	String materialStandard,automation;
	double area;
	public void input(String materialStandard,double area, String automation){
		this.materialStandard=materialStandard;
		this.area=area;
		this.automation=automation;
	}
	public double cost(){
		if(materialStandard=="Standard"){
			return 1200*area;}
		else if(materialStandard=="Above Standard"){
			return 1500*area;}
		else if(materialStandard=="High" && automation=="No"){
			return 1800*area;}
		else if(materialStandard=="High" && automation=="Full"){
			return 2500*area;}
		else{
			return 0;}
}
}