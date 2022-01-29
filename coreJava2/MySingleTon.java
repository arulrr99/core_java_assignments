//OOPS-> Question number 1

package oops;

public class MySingleTon {
	   private static MySingleTon myObj=new MySingleTon();
	   
	   private MySingleTon() {
		   
	   }
	   public static MySingleTon getInstance(){
	        if(myObj == null){
	            myObj = new MySingleTon();
	        }
	        return myObj;
	    }
	     
	    public void getSomeThing(){
	        // do something here
	        System.out.println("This is a singleton class.");
	    }
	     
	    public static void main(String a[]){
	        MySingleTon st = MySingleTon.getInstance();
	        st.getSomeThing();
	    }


}
