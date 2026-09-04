//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    int idade;

    System.out.print("Digite sua idade: ");
    idade = text.nextInt();

    if (idade <= 12){
        System.out.print("Você é da categoria Infantil");
    }
    else if (idade <= 17){
        System.out.print("Você é da categoria Juvenil");
    }
    else{
        System.out.print("Você é da categoria Adulto");
    }
}