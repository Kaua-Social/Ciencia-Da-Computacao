//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    int idade;
    System.out.print("Digite sua idade: ");
    idade = text.nextInt();

    idade *= 12;
    System.out.print("Você possui " + idade + " meses de vida");
}
