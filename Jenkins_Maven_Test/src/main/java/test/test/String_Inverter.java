package test.test;

public class String_Inverter {

	public String invert(String s){

	    String umgekehrt = new String();

	    for ( int j = s.length()-1; j >= 0; j-- )
	      umgekehrt += s.charAt(j);

	    return umgekehrt;
	}
	
	public String scream(String s){
		return s.toUpperCase()+"!!";
	}
}
