package kimyen108652;

public class Bai19_20 {
    public static boolean kiemTraNguyenTo(int n) {
        boolean nt = true;
        if (n == 0 || n == 1)
            return false;
        int i = 1;
        int tam = (int) Math.sqrt(n);
        while (i <= tam) {
            if (n % i == 0) {
                nt = false;
                break;
            }
            i++;
        }
        return nt;
    }
    //Bài 19. Liệt kê các số nguyên tố nhỏ hơn n
    public static void lietKeNguyenTo(int n)
    {
       System.out.printf("Các số nguyên tố nhỏ hơn %d là: ", n);
       for(int i = 2; i<n; i++)
       {
        if(kiemTraNguyenTo(i) == true)
        {
            System.out.print("\t" + i);
        } 
       }
    }
    //Bài 20. Liệt kê n số nguyên đầu tiên
    public static void lietKeSoNguyenTo(int n)
    {
        int dem = 0;
        System.out.printf("\n Danh sách %d số nguyên tố đầu tiên là: ", n);
        for(int i=1; ;i++)
        {
            if(kiemTraNguyenTo(i)==true)
            {
                if(dem == n)
                {
                    break;
                }
                else
                {
                    dem += 1;
                    System.out.print("\t" + i);
                }
            }
        }
    }
    public static void main(String[] args) {
       lietKeNguyenTo(11);
       lietKeSoNguyenTo(5);
    }
}
