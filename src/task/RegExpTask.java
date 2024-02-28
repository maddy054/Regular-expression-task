package task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Map;

public class RegExpTask {

	public boolean isValidNumber(String number) {
		Pattern pattern = getPattern("^[7-9]\\d{9}$");
		Matcher match = getMatcher(pattern,number);
		return match.matches();
	}
	
	public boolean isAlphaNumeric(String alphaNumeric) {
		Pattern pattern = getPattern("^[a-zA-Z0-9]+$");
		Matcher match = getMatcher(pattern,alphaNumeric);
		return match.matches();
	}
	public boolean isStart(String givenString,String matchingString) {
		Pattern pattern = getPattern("^"+ matchingString+".*$");
		Matcher match = getMatcher(pattern,givenString);
		return match.matches();
	}
	
	public boolean isContains(String givenString,String matchingString) {
		Pattern pattern = getPattern("^.*"+ matchingString+".*$");
		Matcher match = getMatcher(pattern,givenString);
		return match.matches();
	}
	public boolean isEndWith(String givenString,String matchingString) {
		Pattern pattern = getPattern("^.*"+matchingString+"$");
		Matcher match = getMatcher(pattern,givenString);
		return match.matches();
	}
	public boolean isBothEqual(String givenString,String matchingString) {
		Pattern pattern = Pattern.compile(matchingString);
		Matcher match = pattern.matcher(givenString);
		return match.matches();
	}
	public boolean isStartCaseInSensitive(String givenString,String matchingString) {
		Pattern pattern = Pattern.compile("^"+matchingString+".*$",Pattern.CASE_INSENSITIVE);
		Matcher match = pattern.matcher(givenString);
		return match.matches();
	}
  public boolean iscontainsSymbol(String email,String symbol) {
	  Pattern pattern = Pattern.compile("[^"+symbol+"]+"+symbol+"[^"+symbol+"]+");
		Matcher match = pattern.matcher(email);
		return match.matches();
  }
  public boolean checkLength(int minLength,int maxLength , String values) {
	  Pattern pattern = Pattern.compile("^.{1,6}$");
	  Matcher match = pattern.matcher(values);
	  return match.matches();
  }
  public <K> Map<K,Integer> getIndexInMap(List<K> myList,List<K> checkValues) {
	  Map<K,Integer> myMap = new HashMap<K,Integer>();
	  
	  for(K checkValue :checkValues) {
		  for(K myValue : myList) {
			  if(isBothEqual(checkValue.toString(), myValue.toString())) {
					 myMap.put(checkValue,myList.indexOf(myValue));
				 }
		  }
	  }
	  return myMap;
  }
  public List<String> getHtmlTag(String htmlString){
	  List<String> tagList = new ArrayList<String>();
	  Pattern pattern = Pattern.compile("<[^>]+>");
	  Matcher matcher = pattern.matcher(htmlString);
	  while(matcher.find()) {
		  tagList.add(matcher.group());
	  }
	  return tagList;
  }
	public Pattern getPattern(String regEx) {
		return Pattern.compile(regEx);
	}
	public Matcher getMatcher(Pattern pattern, String match) {
		return pattern.matcher(match);
	}
  public boolean isValidZohoPassword(String password) {
	  Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[\\W]).{8,}$");
	  Matcher match = pattern.matcher(password);
	  return match.matches();
  }
}
