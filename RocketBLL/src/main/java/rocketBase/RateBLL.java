package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import javassist.bytecode.ExceptionsAttribute;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) throws RateException
	{
		//TODO - RocketBLL RateBLL.getRate - make sure you throw any exception
		ArrayList<RateDomainModel> List = RateDAL.getAllRates();
		double drte = 0;
		for (RateDomainModel rte : List)
			if (rte.getiMinCreditScore() < GivenCreditScore)
				return drte = rte.getdInterestRate();
		throw new RateException(null);
			}
	
				
		//		Call RateDAL.getAllRates... this returns an array of rates
		//		write the code that will search the rates to determine the 
		//		interest rate for the given credit score
		//		hints:  you have to sort the rates...  you can do this by using
		//			a comparator... or by using an OrderBy statement in the HQL
		
		
		//TODO - RocketBLL RateBLL.getRate
		//			obviously this should be changed to return the determined rate
	
	
	//TODO - RocketBLL RateBLL.getPayment 
	//		how to use:
	//		https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
	
	public static double getPVPayment(double r, double n, double y, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, y, f, t);
	}
}
