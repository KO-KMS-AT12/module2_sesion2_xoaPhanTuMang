import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = nhap(scanner);
        int[] arr = nhapPhanTu(size, scanner);
        hienThi(arr);
        int k = nhapPhanTuXoa(scanner);
        int j = xoaPhanTu(arr, k);
        hienThiSauXoa(arr, j);
    }

    static int nhap(Scanner scanner) {
        int size;
        do {
            System.out.println("Nhap kich thuoc mang: ");
            size = scanner.nextInt();
        } while (size <= 0);
        return size;
    }

    static int nhapPhanTuXoa(Scanner scanner) {
        System.out.print("Nhap phan tu: ");
        int k = scanner.nextInt();
        return k;
    }

    static int[] nhapPhanTu(int size, Scanner scanner) {
        int arr[] = new int[size];
        System.out.println("Nhap cac phan tu mang: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    static void hienThi(int[] arr) {
        System.out.print("Mang : { ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("}\n");
    }

    static void hienThiSauXoa(int[] arr, int j) {
        System.out.print("Mang : { ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("}\n");
    }

    static int xoaPhanTu(int[] arr, int k) {
        int j = 0;
        //{1,2,3,4,5} 3
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != k) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}
