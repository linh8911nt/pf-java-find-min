import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int size;
        int[] numbers;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số lượng phần tử của mảng: ");
        size = input.nextInt();
        numbers = new int[size];

        for (int i = 0; i < size; i++){
            System.out.println("Phần tử thứ " + (i + 1) + " : ");
            numbers[i] = input.nextInt();
        }
        System.out.print("Mảng: ");
        for (int element: numbers) {
            System.out.print(element + " ");
        }
        int min = numbers[0];
        for (int j = 1; j < size; j++){
            if (numbers[j] < min)
                min = numbers[j];
        }
        System.out.println("Giá trị nhỏ nhất: " + min);
    }
}
