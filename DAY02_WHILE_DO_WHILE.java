public class DAY02_WHILE_DO_WHILE {
    static void main() {
        int n = 20;
        long mul =1;
        int sum = 0;
        int i = 1;

        while (i <= n){
            mul = mul * i;
            i++;


        }

        do{
            sum += i;


        }while (i <= n);
        System.out.println(sum);
        System.out.println(mul);
    }
}
