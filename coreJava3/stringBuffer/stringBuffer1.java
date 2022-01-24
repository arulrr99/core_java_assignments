//StringBuffer-Question number 1
package javaAssignments;

public class stringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("StringBuffer");
		StringBuffer sb1=new StringBuffer(" is a peer class of String");
		StringBuffer sb2=new StringBuffer(" that provides much of");
		StringBuffer sb3=new StringBuffer(" the functionality of strings");
		//appending sb1,sb2 and sb3 to sb
		sb.append(sb1);
		sb.append(sb2);
		sb.append(sb3);
		System.out.println(sb);
	}

}
