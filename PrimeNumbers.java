public class PrimeNumbers{
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.println("Please Enter The Number");
        // int n =in.nextInt();
        //     Boolean ans =Isprime(n);
        // System.out.println(n + " " + ans );
        int sum = 0;
        for (int n = 1;n < 11; n++) {
        if (Isprime(n)) {
            sum =sum + n;
        }
            Boolean ans =Isprime(n);
        System.out.println(n + " " + ans );
        }
        System.out.println(sum);
    }
    static Boolean Isprime(int n){
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c*c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}