//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);
    int num;

    System.out.print("Digite o seu número: ");
    num = text.nextInt();

    if (num >= 1) {
        System.out.println("O número é positivo");
    }
    else if (num <= -1) {
        System.out.println("O número é negativo");
    }
    else {
        System.out.println("Você digitou 0");
    }
}