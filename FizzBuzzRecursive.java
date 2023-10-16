public class FizzBuzzRecursive {
    public static void main(String[] args) {
            int n = 15;
            fizzBuzz(n);
    }

    public static void fizzBuzz(int n){
        if(n>0){
        fizzBuzz(n-1);
        if(n%3 == 0){
            System.out.print("Fizz");
        }
        if(n%5 == 0){
            System.out.print("Buzz");
        }
        if(n%3 != 0 && n%5 != 0){
            System.out.print(n);
        }
        System.out.println();
    }
}

}

