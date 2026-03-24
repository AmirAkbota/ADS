import java.util.Scanner;

//Task1
/* public class Main {
    public static void DigitsOfNumber(int n) {
        if (n == 0) {
            return;
        }
        DigitsOfNumber(n / 10);
        System.out.println(n % 10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        System.out.println("Digits of the number:");
        DigitsOfNumber(n);
    }
}*/
//Task2
 /*public class Main {
        public static void inputArray(int[] arr, int index, Scanner scanner) {
        if (index == arr.length) {
            return;
        }
        arr[index] = scanner.nextInt();
        inputArray(arr, index + 1, scanner);
    }
    public static int summ(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + summ(arr, index + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter numbers:");
        inputArray(arr, 0, scanner);

        int total = summ(arr, 0);

        double average = (double) total / n;

        System.out.println("Average: " + average);
    }
}*/
//Task3
/*public class Main {
    public static boolean checkPrime(int n, int i) {
        if (n <= 1) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return checkPrime(n, i - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (checkPrime(n, n / 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
}*/
//Task4
/*public class Main {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter number:");
        int n=scanner.nextInt();

        System.out.println("Factorial of " + n + " = " + factorial(n));
    }
}*/
//Task5
/*public class Main {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci number: " + fibonacci(n));
    }
}*/
//Task6
/*public class Main {
    public static int findPower(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * findPower(a, b - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n and p: ");
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        System.out.println("Result is : " + findPower(n, p));
    }
}*/
//Task7
/*public class Main {
    public static void rvr(int a, Scanner scanner) {
        if (a == 0) {
            return;
        }
        int number = scanner.nextInt();
        rvr(a - 1, scanner);
        System.out.print(number + " ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int a = scanner.nextInt();

        System.out.println("Enter numbers:");
        rvr(a, scanner);
    }
}*/
//Task8
/*public class Main {
    public static boolean checkDigits(String a, int ind) {
        if (ind == a.length()) {
            return true;
        }
        if (!Character.isDigit(a.charAt(ind))) {
            return false;
        }
        return checkDigits(a, ind + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        if (checkDigits(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}*/
//Task9
/*public class Main {
    public static int Chars(String a, int ind) {
        if (ind == a.length()) {
            return 0;
        }
        return 1 + Chars(a, ind + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.println("Number of characters: " + Chars(s, 0));
    }
}*/
//Task10
/*public class Main {
    public static int getGcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGcd(n2, n1 % n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int answer = getGcd(num1, num2);

        System.out.println("GCD result = " + answer);
    }
}*/