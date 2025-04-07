import java.util.Arrays;


public class main {
  public static void main(String[] args) {
    // System.out.println("Hello World");

    int age = 24;
    boolean Ishandsome = true;
    System.out.println(age);
    System.out.println(Ishandsome);
    // primitive {mutable}
    // reference using new keyword {{unmutable}}
    // strings are immutable
     // array are reference type
     int[] number = new int[5];
     number[0] = 2;
     number[1] = 3;
     System.out.println(Arrays.toString(number));
    
    int[] sahur = {3,2,6,1,0};
    Arrays.sort(sahur);
    System.out.println(Arrays.toString(sahur));
    }
}