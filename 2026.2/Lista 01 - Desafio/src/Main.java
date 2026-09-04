//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    int num1;
    int num2;
    int numbackup;

    System.out.print("Digite o primeiro número: ");
    num1 = text.nextInt();

    System.out.print("Digite o segundo número: ");
    num2 = text.nextInt();

    System.out.println("O valor do primeiro número é: " + num1);
    System.out.println("O valor do segundo número é: " + num2);

    numbackup = num1;
    num1 = num2;
    num2 = numbackup;

    System.out.println("O valor do primeiro número agora é: " + num1);
    System.out.print("O valor do segundo número agora é: " + num2);
}
