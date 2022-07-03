package Ex_1;

import java.security.spec.RSAOtherPrimeInfo;

public class bai_1 {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 1, 4, 1, 5};
        countMin(a);
        System.out.println();
        LietKeTanSuatXuatHien(a);
    }

    public static int count(int[] array, int k) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k)
                count++;
            else
                continue;
        }
        return count;
    }

    public static void countMin(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (count(a, a[i]) == 1) {
                System.out.print(a[i] + "\t");
            }
        }
    }


    public static void LietKeTanSuatXuatHien(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int dem = 0;
            for (int j = 0; j < a.length; j++) // j chạy từ 0
            {
                if (a[i] == a[j]) {
                    if (i <= j) {
                        dem++;
                    } else {
                        break;    // bỏ qua phần tử bị trùng
                    }
                }
            }
            if (dem != 0) {
                System.out.print(a[i] + "(" + dem + ")" + "\t");
            }
        }
    }
}
