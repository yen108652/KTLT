package yen108652;

public class Baitapbuoi9 {
    public static void tamGiacSaoVuong(int n) {  
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
          }
        }
    public static void tamGiacSaoVuongNguoc(int n) {  
            for(int i=n; i>=1; i--)
            {
                for(int j=n; j>=1; j--)
                {
                    System.out.print("* ");
                }
                System.out.println();
              }
            } 
    public static void tamGiacVuongSo(int n) {  
            for(int i=1; i<=n; i++)
            {
                for(int j=1; j<=i; j++)
                {
                    System.out.print(j + " ");
                }
                System.out.println();
              }
            }  
    public static void tamGiacVuongSoNguoc(int n) { 
            System.out.println("Tam giác vuông số: "); 
            for(int i=n; i>=n; i++)
            {
                for(int j=2; j>=i; j++)
                {
                    System.out.print(j + " ");
                }
                System.out.println();
              }
            }                
    
    public static void main(String[] args) {
        tamGiacSaoVuong(5);
        tamGiacSaoVuongNguoc(5);
        tamGiacVuongSo(5);
        
    } 
}
    