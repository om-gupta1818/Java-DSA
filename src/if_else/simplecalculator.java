
public static void main(String[] args) {
    int a = 20;
    int b = 10;
    char op = '+';

    if (op == '+') {
        System.out.println(a + b);
    } else if (op == '-') {
        System.out.println(a - b);
    } else if (op == '*') {
        System.out.println(a * b);
    } else if (op == '/') {
        System.out.println(a / b);
    } else {
        System.out.println("Invalid operator");
    }
}

