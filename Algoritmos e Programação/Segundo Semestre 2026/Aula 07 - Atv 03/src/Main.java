//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    int nota;

    System.out.print("Digite sua nota: ");
    nota = text.nextInt();

    if (nota >= 0 && nota <= 10) {
        if (nota >= 7) {
            System.out.print("Você foi aprovado!");
        } else {
            if (nota >= 4) {
                System.out.print("Você está de recuperação!");
            }
            else {
                System.out.print("Você foi reprovado.");
            }
        }
    }
    else {
        System.out.print("Sua nota é inválida.");
    }
}