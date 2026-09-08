//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    int num1;
    int num2;
    int num3;

    System.out.print("Digite seu primeiro número: ");
    num1 = text.nextInt();
    System.out.print("Digite seu segundo número: ");
    num2 = text.nextInt();
    System.out.print("Digite seu terceiro número: ");
    num3 = text.nextInt();

    if ( num1 > num2 && num1 > num3) {
        System.out.print("O maior número é: " + num1);
    }
    else if (num2 > num1 && num2 > num3) {
        System.out.print("O maior número é: " + num2);
    }
    else{
        System.out.print("O maior número é: " + num3);
    }
}