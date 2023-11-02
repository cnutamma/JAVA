package pillars;

public class Test {
public static void main(String[] args) {
	SA a1=new SA();
	a1.setAcc_Id(1);
	a1.setAcc_Name("srinu");
	a1.setAcc_Bal(15000.00);
	
	a1.setMin_Bal(500);
	CA a2=new CA();
	
	a2.setAcc_Id(2);
	a2.setAcc_Name("lakshmi");
	a2.setAcc_Bal(55000.00);
	a2.setMin_Bal(25000);
	
	
	System.out.println("srinivas Balance:");
	//a1.cal_Bal();
	AccountService.get_Service(a1);
	System.out.println("lakshmi Balance:");
	//a2.cal_Bal();
	AccountService.get_Service(a2);
}
}