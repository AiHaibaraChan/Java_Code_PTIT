import java.util.*;
public class J01026_SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t-->0)
        {
        int n = sc.nextInt();
        if(check(n)) System.out.println("YES");
        else System.out.println("NO");
        }
    }
    public static boolean check(int n)
    {
    int k = (int)Math.sqrt(n);
    return k*k==n;
    }
}


