//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    int escolha;
    double saldo = 1000;
    double valor;

    System.out.print("Digite 1 para sacar e Digite 2 para depositar: ");
    escolha = text.nextInt();

    if (escolha == 1){
        System.out.print("Digite o valor que você deseja sacar: ");
        valor = text.nextDouble();
        if (valor <= saldo){
            saldo -= valor;
            System.out.print("O valor foi sacado com sucesso! Seu novo saldo bancário agora é: " + saldo);
        }
        else{
            System.out.print("Você não possui saldo suficiente!");
        }
    }
    else if (escolha == 2){
        System.out.print("Digite o valor para deposito: ");
        valor = text.nextDouble();
        saldo += valor;
        System.out.print("Seu saldo bancário foi atualizado com sucesso e agora é: " + saldo);
    }
    else{
        System.out.print("Opção Inválida!");
    }
}