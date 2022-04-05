import java.util.Scanner;

public class kt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Cau 1 2:
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        //Cau 3
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("\nTong cac phan tu chan: " + sum);

        //Cau 3 4 5
        System.out.print("Nhap vao so can tim: ");
        int a1 = scanner.nextInt();
        System.out.print("Vi tri trong mang la: " + timViTri(arr, a1));
        System.out.print("\nNhap vao so can xoa: ");
        int a2 = scanner.nextInt();
        int viTriCanXoa = timViTri(arr, a2);
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < viTriCanXoa; i++) {
            newArr[i] = arr[i];
        }
        for (int i = viTriCanXoa; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }
        arr = newArr;
        inMang(arr);

        //Cau 6
        System.out.print("Nhap phan tu can them vao mang: ");
        int b = scanner.nextInt();
        System.out.print("\nNhap vi tri can them (nho hon hoac bang " + (arr.length+1) + "): ");
        int vt = scanner.nextInt();
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

    static int timViTri(int[] arr, int soCanTim) {
        int viTri = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == soCanTim) {
                viTri = i;
            }
        }
        return viTri;
    }

    static void inMang(int[] arr) {
        System.out.println("Mang la: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
