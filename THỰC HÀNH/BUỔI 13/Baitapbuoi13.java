package kimyen108652;

public class Baitapbuoi13 {
    //Bài 30. Số đối xứng (Palindrome) là số nhận được khi thực hiện đảo ngược các chữ số củanó cho kết quả bằng số ban đầu. Ví dụ: 121, 3553.Viết chương trình kiểm tra số nguyên dương n nhập vào từ bàn phím có phải là số đối xứng (Palindrome) không. Nếu đúng thì hiển hiện thông báo “Số vừa nhập là số đối xứng”, ngược lại hiển thị thông báo “Số vừa nhập không phải là số đối xứng”
    public static final Scanner sc = new Scanner(System.in);
    public static void kiemTraSoDoiXung(int num)
    {
        int soBanDau = num, soDaoNguoc = 0;
        while(num!=0)
        {
            int tam = num%10;
            soDaoNguoc = soDaoNguoc*10 + tam;
            num /=10;

        }
        if(soBanDau == soDaoNguoc)
        {
            System.out.println(soBanDau + " là số đối xứng!");

        }
        else
            System.out.println(soBanDau + " không phải là số đối xứng!");
    }
    /*Mở rộng: Viết chương trình nhập vào một số và hiện thị số đảo ngược */
    public static void hienThiSoDaoNguoc(int num) 
    {
        System.out.print("Đảo ngược số ban đầu" + num + "thành");
        {
            System.out.print(num%10);
            num /=10;
        }

    }
    /*Bài 38. Viết chương trình nhập vào mảng A gồm n phần tử, các phần tử là những số nguyên
    lớn hơn 0 và nhỏ hơn 100 được nhập từ bàn phím. Thực hiện các yêu cầu sau:
    a. Tìm phần tử lớn thứ 2 cùng với chỉ số.
    b. Sắp xếp mảng theo thứ tự giảm dần.
    c. Nhập số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo thứ tự sắp xếp giảm
    dần của mảng A.*/
    public static int [] nhapMang()
    {
        int n;
        while(true){
            try{
                System.out.print("Nhập kích thước mảng: ");
                n = Integer.parseInt(sc.nextLine());
                if (n > 0)
                    break;
                else
                    System.out.println("Giá trị hợp lệ, hãy nhập lại!");
            } catch (Exception e) {
                System.out.println("Dữ liệu không hợp lệ, hãy nhập lại!!!");
            }
        }
        int tam[] = new int[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Nhập phần tử: ");
                    tam[i] = Integer.parseInt(sc.nextLine());
                    if (tam[i] > 0 && tam[i] < 100)
                        break;
                    else
                        System.out.println("Giá trị không hợp lệ, hãy nhập lại!");
                } catch (Exception e) {
                    System.out.println("Dữ liệu không hợp lệ, hãy nhập lại!!!");
                }
            }
        }
        return tam;
    }
    public static void xuatMang(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t" + a[i]);
        }
    }

    public static void main(String[] args) {
       /*  int num = 1231234123;
        kiemTraSoDoiXung(num);
        hienThiSoDaoNguoc(num);*/
           int tam[] = nhapMang();
           System.out.print("Mảng vừa nhập là: ");
           xuatMang(tam); 
    }
}
