//Generics-> Question number 3


package generics;

public class GenericSwapMethod {

    public static final  <T> void swap(T[] array, int i , int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

   public static void main(String[] args) {
       Integer [] a = {5,6,5,4,7,4,3,};
       swap(a,5,4);                           // swap Integer array
       for(Integer e : a){
           System.out.print(e +" ");
       }
      
   }
}
