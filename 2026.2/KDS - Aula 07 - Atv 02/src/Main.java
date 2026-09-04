//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    int idade;

    System.out.print("Digite sua idade: ");
    idade = text.nextInt();

    if (idade >=0 && idade <= 122){
        if (idade >=18){
            System.out.print("Você é maior de idade: ");
        }
       else {
            System.out.print("Você é menor de idade: ");
        }
    }
    else{
        System.out.print("Você digitou uma idade invalida: ");
    }
}