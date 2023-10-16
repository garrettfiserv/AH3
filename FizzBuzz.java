public class FizzBuzz {
    public static void main(String[] args){
        int n = 15;
        fizzBuzz(n);
    }

    public static void fizzBuzz(int n){
        boolean fizzBuzz = false;
        for(int i = 1; i<= n; i++){
            if(i%3 == 0){
                System.out.print("Fizz");
                fizzBuzz = true;
            }
            if(i%5 == 0){
                System.out.print("Buzz");
                fizzBuzz = true; 
            }
            if(fizzBuzz == false){
                System.out.print(i);
            }
            fizzBuzz = false;
            System.out.println();

        }

    }

}
