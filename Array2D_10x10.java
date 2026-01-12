import java.util.Random;

public class Array2D_10x10 {

    public static void main(String[] args) {

        int[][] arr1 = new int[10][10];
        int[][] arr2 = new int[10][10];
        int[][] sum = new int[10][10];

        // สุ่มค่าให้ array ตัวที่ 1 และ 2
        randomArray(arr1);
        randomArray(arr2);

        System.out.println("Array ที่ 1:");
        printArray(arr1);

        System.out.println("\nArray ที่ 2:");
        printArray(arr2);

        // บวกค่า array ทั้งสองตัว
        addArray(arr1, arr2, sum);

        System.out.println("\nผลรวมของ Array ที่ 1 และ 2:");
        printArray(sum);
    }

    // method สำหรับสุ่มค่า 50 - 59 ใส่ใน 2D Array
    public static void randomArray(int[][] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(10) + 50; // 50 - 59
            }
        }
    }

    // method สำหรับแสดงผล 2D Array แบบตาราง
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // method สำหรับบวกค่า array สองตัวแล้วเก็บลง array ใหม่
    public static void addArray(int[][] a, int[][] b, int[][] result) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
    }
}