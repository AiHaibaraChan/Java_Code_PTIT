import java.util.*;
public class J01006_TinhSoFibonacci {
    public static int N = 93;
    public static long []a = new long[N];
    public static void generate()
    {
    a[0] = 0;
    a[1] = 1;
    for(int i = 2; i < N ; i++) a[i] = a[i-1]+ a[i-2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        generate();
        while(t-->0)
        {
        int n = sc.nextInt();
        System.out.println(a[n]);
        }
    }
}
