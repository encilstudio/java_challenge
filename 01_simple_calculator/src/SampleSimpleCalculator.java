import java.util.Scanner;

public class SampleSimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Masukkan operasi matematika, contoh 1 + 2 ");

        String input = scanner.nextLine();
        try {
            Double result = calculate(input);
            System.out.println("Hasilnya: " + result);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        scanner.close();
    }

    public static Double calculate(String input) throws Exception {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new Exception("Pastikan memasukkan dengan benar, contoh: 1 + 2");
        }

        String operator = parts[1];
        Double num1 = Double.parseDouble(parts[0]);
        Double num2 = Double.parseDouble(parts[2]);

        switch (operator) {
            case "+":
                return num1 + num2;

            case "-":
                return num1 - num2;

            case "*":
                return num1 * num2;

            case "/":
                if (num2 == 0) {
                    throw new Exception("angka ke dua tidak boleh 0");
                }
                return num1 / num2;

            default:
                throw new Exception("Pastikan mengisi dengan benar");
        }

    }

}