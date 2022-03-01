package tns;

import tns.application.MMBankFactory;
import tns.application.MMCurrentAcc;
import tns.application.MMSavingAcc;
import tns.framework.BankFactory;
import tns.framework.CurrentAcc;
import tns.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf= new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(12345, "poonam", 1000);
		sa.Withdraw(500);
		CurrentAcc ca= new MMCurrentAcc(12365,"chandu", 500);
		ca.Withdraw(500);
	}

}
