public class Test {
    public static void main(String[] args) {
        int a = 2;
        int b = -3;
        System.out.println(powRecursion(a, b));
        System.out.println(powInter(a, b));

    }
    public static double powRecursion(double a, int b) {
        if(b==0) return 1;

        if(b<0){
            powRecursion(1/a, -b);

        }

        double res = powRecursion(a, b/2);

        return b % 2 == 0 ?   res * res :   res * res * a;

        }

    public static double powInter(int a, int b) {
        if(a==0 || a == 1) return a;
        if(b==0) return 1;

        if(b<0){
            b = -b;
            a= 1/a;
        }
        double res = 1;
        while(b > 0){
            if(b % 2 == 1)
                res =  res * a;

            a = a*a;
            b = b/2;

        }
        return res;

}
}
