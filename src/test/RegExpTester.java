package test;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import task.RegExpTask;

public class RegExpTester {
	
	public static void main(String... args) {
		try(Scanner taskScanner = new Scanner(System.in);) {
			Logger logger = Logger.getLogger(RegExpTester.class.toString());
			RegExpTask regTask = new RegExpTask();
			
			int condition = 1;
			String stringOne = null;
			String stringTwo  = null;
			do {
				
				logger.log(Level.INFO,"choose any one ");
			    condition = taskScanner.nextInt();
				taskScanner.nextLine();
				
				if(condition == 3 || condition == 4 || condition ==  5 || condition == 6 || condition == 7) {
					logger.log(Level.INFO,"Enter the string to check starting chars ");
				    stringOne = taskScanner.nextLine();
					logger.log(Level.INFO,"Enter the checking string ");
					stringTwo = taskScanner.nextLine();
				}
				switch(condition) {
				case 1:
					logger.log(Level.INFO,"Enter the phone number to validate ");
					String number = taskScanner.nextLine();
					logger.log(Level.INFO,"Is the mobile number is valid "+regTask.isValidNumber(number));
			
					break;
				case 2:
					logger.log(Level.INFO,"Enter the alpha numeric to validate ");
					String alphaNumeric = taskScanner.nextLine();
					logger.log(Level.INFO,"Is it is a alpha numeric "+regTask.isAlphaNumeric(alphaNumeric));
					
					break;
				case 3:
				
					logger.log(Level.INFO,"Is the string start with that chars "+regTask.isStart(stringOne,stringTwo));
					break;
				case 4:
					logger.log(Level.INFO,"Is the string contains that chars "+regTask.isContains(stringOne,stringTwo));
					break;
				case 5:
					logger.log(Level.INFO,"Is the string ends with that chars "+regTask.isEndWith(stringOne,stringTwo));
					break;
				case 6:
					logger.log(Level.INFO,"Is the string contains that chars "+regTask.isBothEqual(stringOne,stringTwo));
					break;
				case 7:
					logger.log(Level.INFO,"Is the string contains that chars "+regTask.isStartCaseInSensitive(stringOne,stringTwo));
					break;
				case 8:
					logger.log(Level.INFO,"Enter the mail id to validate ");
					String mail = taskScanner.nextLine();
					logger.log(Level.INFO,"Is the main id contain @ between two string "+regTask.iscontainsSymbol(mail,"@"));
					logger.log(Level.INFO,"Is the main id contain . between two string "+regTask.iscontainsSymbol(mail,"."));
					break;
				case 9:
					logger.log(Level.INFO,"Enter the string to check the length ");
					String myString = taskScanner.nextLine();
					logger.log(Level.INFO,"Is the main id contain . between two string "+regTask.checkLength(1, 6, myString));
					
			        break;
				case 10:
					
			        List<String> myList = new ArrayList<String>();
			        List<String> checkList = new ArrayList<String>();
			        myList.add("mukesh");
			        myList.add("maddy");
			        myList.add("hii");
			        myList.add("hello");
			        myList.add("beni");
			        
			        checkList.add("maddy");
			        checkList.add("beni");
			        checkList.add("mukesh");
			       
			        System.out.println(regTask.getIndexInMap(myList,checkList));
			        break;
				case 11:
					logger.log(Level.INFO,"Tags from given html "+ regTask.getHtmlTag("<p>The <code>President</code> of India is the first citizen of our country.</p>"));
			       break;
				case 12:
					logger.log(Level.INFO,"Enter password ");
					String pass = taskScanner.nextLine();
					logger.log(Level.INFO, "is password is valid "+regTask.isValidZohoPassword(pass));
					
				
			   }
			}while(condition !=0);
		}
	}
}
