import java.util.Scanner;

public class kt {
    public static void main(String[] args) {
        int sum = 0;
        int a, b, vt;
        boolean check = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac gia tri cua mang: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Mang vua nhap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.print("\nTong cac phan tu chan trong mang: " + sum);

        System.out.print("\nNhap phan tu a: ");
        a = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                check = true;
                System.out.println(a + " co trong mang va o vi tri: " + i);
                arr[i] = arr[i + 1];
                System.out.println("Mang sau khi xoa phan tu " + a + " : " + arr[i]);
            }
        } if (check == false) {
            System.out.println(a + " khong co trong mang.");
        }

        System.out.print("Nhap phan tu can them vao mang: ");
        b = scanner.nextInt();
        System.out.print("\nNhap vi tri can them (nho hon hoac bang " + (arr.length+1) + "): ");
        vt = scanner.nextInt();
        int[] arr2 = new int[arr.length+1];
        for (int i = 0; i < vt-1; i++) {
            arr2[i] = arr[i];
        }
        arr2[vt-1] = b;
        for (int i = vt-1; i < arr.length; i++) {
            arr2[i+1] = arr[i];
        }
        System.out.println("Mang sau khi them " + b + " vao mang la:");
        arr = arr2;
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
