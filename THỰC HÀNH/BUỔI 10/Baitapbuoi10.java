package yen108652;

public class Baitapbuoi10 {
    //Xuất tam giác số vuông 
    public static void xuatTamGiacSoVuong(int n) {
        System.out.println("Tam giác số vuông là: ");
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    // Xuất tam giác số vuông ngược
    public static void xuatTamGiacSoVuongNguoc(int n) {
        System.out.println("\nTam giác số vuông là: ");
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    //Kim tự tháp sao *
    public static void kimTuThapSao(int n) {
        System.out.println("Kim tự tháp chứa ngôi sao * là: ");
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Kim tự tháp chứa số*
    public static void kimTuThapSo(int n) {
        System.out.println("Kim tự tháp số là: ");
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i)/2; k++)
            {
                System.out.print(k);
            }
            for(int l=(2*i)/2; l>=1; l--)
            {
                System.out.print(l);
            }    
            System.out.println();
        }
    }

    public static void main(String[] args) {
       xuatTamGiacSoVuong(4);
       xuatTamGiacSoVuongNguoc(4); 
       kimTuThapSao(5);
       kimTuThapSo(5);
    }
    
}