//StringBuilder-Question number 1
package javaAssignments;

public class stringBuilder1 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("StringBuffer");
		StringBuilder sb1=new StringBuilder(" is a peer class of String");
		StringBuilder sb2=new StringBuilder(" that provides much of");
		StringBuilder sb3=new StringBuilder(" the functionality of strings");
		//appending sb1,sb2 and sb3 to sb
		sb.append(sb1);
		sb.append(sb2);
		sb.append(sb3);
		System.out.println(sb);
	}

}
