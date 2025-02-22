public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calcultor calculator = new Calculator();

    while (scanner.hasNext()) {
      String command = scanner.next();

      switch (command) {
        case "add":
          int a1 = scanner.nextInt();
          int b1 = scanner.nextInt();
          System.out.println(calculator.add(a1, b1));
          break;
        case "subtract":
          int a2 = scanner.nextInt();
          int b2 = scanner.nextInt();
          System.out.println(calculator.subtract(a2, b2));
          break;
        case "multiply":
          int a3 = scanner.nextInt();
          int b3 = scanner.nextInt();
          System.out.println(calculator.multiply(a3, b3));
          break;
        case "divide":
          int a4 = scanner.nextInt();
          int b4 = scanner.nextInt();
          if (b4 == 0) {
            System.out.println("Error: Division by zero");
          } else {
            System.out.println(calculator.divide(a4, b4));
          }
          break;
        case "fibonacci":
          int n = scanner.nextInt();
          System.out.println(calculator.fibonacciNumberFinder(n));
          break;
        case "binary":
          int number = scanner.nextInt();
          System.out.println(calculator.intToBinaryNumber(number));
          break;
        default:
          System.out.println("Invalid command");
          break;
      }
    }
    scanner.close();
  }
}