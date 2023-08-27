import java.util.*;
import java.io.*;
import java.math.*;

class Sinhvien implements Comparable<Sinhvien> {

    String ten, lop, ns, msv;
    double gpa;

    public Sinhvien(int id, String ten, String lop, String ns, double gpa) {
        if (id < 10) {
            msv = "B20DCCN00" + String.valueOf(id);
        } else {
            msv = "B20DCCN0" + String.valueOf(id);
        }
        if (ns.charAt(1) == '/') {
            ns = "0" + ns;
        }
        if (ns.charAt(4) == '/') {
            ns = ns.substring(0, 3) + "0" + ns.substring(3);
        }
        String ans="";
        StringTokenizer ss = new StringTokenizer(ten.toLowerCase());
        while(ss.hasMoreElements())
        {
        String s = ss.nextToken();
        char x = (char)(s.charAt(0) - 32);
        ans += x+s.substring(1)+" ";
        }
        this.ns = ns;
        this.ten = ans.substring(0,ans.length()-1);
        this.lop = lop;
        this.gpa = gpa;
    }

    public void display() {

        System.out.printf("%s %s %s %s %.2f\n", msv, ten, lop, ns, gpa);
    }

    @Override
    public int compareTo(Sinhvien t) {
       return this.gpa>t.gpa?-1:1;
    }

}
public class J05005_DanhSachDoiTuongSinhVien3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Sinhvien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            a.add(new Sinhvien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
        }
        Collections.sort(a);
        for (Sinhvien p : a) {
            p.display();
        }
    }
}
