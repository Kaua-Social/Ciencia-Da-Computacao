//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner text = new Scanner(System.in);

    int codigo;
    int quantidade;
    double preco;
    double precoTotal;
    double desconto;

    System.out.print("Digite o código do seu produto: ");
    codigo = text.nextInt();
    System.out.print("Digite a quantidade comprada: ");
    quantidade = text.nextInt();

    if (codigo >= 1 && codigo <= 10){

        preco = 10;
        precoTotal = preco * quantidade;

        System.out.println("O preço do produto é: " + preco);
        System.out.println("O valor total de acordo com a quantidade de produtos é: " + precoTotal);
        
        if (precoTotal <= 250){
            desconto = precoTotal * (5.0 / 100);
            precoTotal -= desconto;
            System.out.println("O valor do desconto é: " + desconto);
            System.out.println("O valor final é: " + precoTotal);
        }
        else if (precoTotal >=251 && precoTotal <=500){
            desconto = precoTotal * (10.0 / 100);
            precoTotal -= desconto;
            System.out.println("O valor do desconto é: " + desconto);
            System.out.println("O valor final é: " + precoTotal);
        }
        else{
            desconto = precoTotal * (15.0 / 100);
            precoTotal -= desconto;
            System.out.println("O valor do desconto é: " + desconto);
            System.out.println("O valor final é: " + precoTotal);
        }
    }
    else if (codigo >= 11 && codigo <= 20){

        preco = 15;
        precoTotal = preco * quantidade;

        System.out.println("O preço do produto é: " + preco);
        System.out.println("O valor total de acordo com a quantidade de produtos é: " + precoTotal);

        if (precoTotal <= 250){
            desconto = precoTotal * (5.0 / 100);
            precoTotal -= desconto;
            System.out.println("O valor do desconto é: " + desconto);
            System.out.println("O valor final é: " + precoTotal);
        }
        else if (precoTotal >=251 && precoTotal <=500){
            desconto = precoTotal * (10.0 / 100);
            precoTotal -= desconto;
            System.out.println("O valor do desconto é: " + desconto);
            System.out.println("O valor final é: " + precoTotal);
        }
        else{
            desconto = precoTotal * (15.0 / 100);
            precoTotal -= desconto;
            System.out.println("O valor do desconto é: " + desconto);
            System.out.println("O valor final é: " + precoTotal);
        }
    }
    else if (codigo >= 21 && codigo <= 30){

        preco = 20;
        precoTotal = preco * quantidade;

        System.out.println("O preço do produto é: " + preco);
        System.out.println("O valor total de acordo com a quantidade de produtos é: " + precoTotal);

        if (precoTotal <= 250){
            desconto = precoTotal * (5.0 / 100);
            precoTotal -= desconto;
            System.out.println("O valor do desconto é: " + desconto);
            System.out.println("O valor final é: " + precoTotal);
        }
        else if (precoTotal >=251 && precoTotal <=500){
            desconto = precoTotal * (10.0 / 100);
            precoTotal -= desconto;
            System.out.println("O valor do desconto é: " + desconto);
            System.out.println("O valor final é: " + precoTotal);
        }
        else{
            desconto = precoTotal * (15.0 / 100);
            precoTotal -= desconto;
            System.out.println("O valor do desconto é: " + desconto);
            System.out.println("O valor final é: " + precoTotal);
        }
    }
    else if (codigo >= 31 && codigo <=40){

        preco = 30;
        precoTotal = preco * quantidade;

        System.out.println("O preço do produto é: " + preco);
        System.out.println("O valor total de acordo com a quantidade de produtos é: " + precoTotal);

        if (precoTotal <= 250){
            desconto = precoTotal * (5.0 / 100);
            precoTotal -= desconto;
            System.out.println("O valor do desconto é: " + desconto);
            System.out.println("O valor final é: " + precoTotal);
        }
        else if (precoTotal >=251 && precoTotal <=500){
            desconto = precoTotal * (10.0 / 100);
            precoTotal -= desconto;
            System.out.println("O valor do desconto é: " + desconto);
            System.out.println("O valor final é: " + precoTotal);
        }
        else{
            desconto = precoTotal * (15.0 / 100);
            precoTotal -= desconto;
            System.out.println("O valor do desconto é: " + desconto);
            System.out.println("O valor final é: " + precoTotal);
        }
    }
    else{
        System.out.print("Código de produto inválido!");
    }
}