//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    int num1;
    int num2;
    int num3;

    System.out.print("Digite o primeiro número: ");
    num1 = text.nextInt();
    System.out.print("Digite o segundo número: ");
    num2 = text.nextInt();
    System.out.print("Digite o terceiro número: ");
    num3 = text.nextInt();

    int valor = num1 + num2 + num3;
    System.out.println("A soma dos 3 números é: " + valor);
    valor /= 3;
    System.out.println("A média aritmética é: " + valor);
}
