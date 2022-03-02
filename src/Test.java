public class Test {
    public static void main(String args[]){
        int n = 100;
        int sum1 = 0;
        for(int i = 1;i<=n;i++){
            sum1 += (i*i);
        }

        int sum2 = 0;
        for(int i = 1;i<=n;i++){
            sum2 += i;
        }
        sum2 = sum2 * sum2;

        System.out.println(sum2-sum1);
    }
}
