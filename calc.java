class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        int sum = a + b;
        int diff = a - b;
        int mult = a * b;
        int div = a / b;

        String magic = "Lets do it";

        System.out.println("way 1");
        System.out.println("Addition of a&b: " + sum);
        System.out.println("Subtraction of a&b: " + diff);
        System.out.println("Multiplication of a&b: " + mult);
        System.out.println("Division of a&b: " + div);

        System.out.println("way 2");
        System.out.println("Addition of a&b: " + (a + b));
        System.out.println("Subtraction of a&b: " + (a - b));
        System.out.println("Multiplication of a&b: " + (a * b));
        System.out.println("Division of a&b: " + (a / b));
        System.out.println("Remainder : " + (a % b));

        System.out.println(magic);

        System.out.println(
            "Addition: " + (a + b) +
            " Subtraction: " + (a - b) +
            " Multiplication: " + (a * b) +
            " Division: " + (a / b)
        );
    }
}