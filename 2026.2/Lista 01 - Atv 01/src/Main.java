//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    double num;
    System.out.print("Digite seu número: ");
    num = text.nextDouble();

    num *= 2;
    System.out.print("Seu número agora é: " + num);
}