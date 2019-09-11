public class Coolfavorates
{ public static void main (String[] args)
    { String[] food = {"1 slice of pizza", "2 slice of pizza", "3 slice of pizza", "4 slice of pizza", "5 slice of pizza"};
 for(int i = 0; i < food.length; i++) {
     System.out.println(food[i]);
    }
    System.out.println("  ");
    System.out.println("  ");
    System.out.println("  ");
    int test =(int)(Math.random()*5);
    food[test]="veggie tables";
    for(int i = 0; i < food.length; i++) {
     System.out.println(food[i]);
    }
    int f=0;
    while(f<5){
        System.out.print(food[f]+", ");
        f=f+1;
    }
}
}// end of main method
