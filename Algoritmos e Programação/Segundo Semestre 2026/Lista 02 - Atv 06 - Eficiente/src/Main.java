void main() {

    Scanner text = new Scanner(System.in);

    int codigo;
    int quantidade;

    double preco = 0;
    double precoTotal;
    double desconto;

    System.out.println("Programa emissor de NF");
    System.out.println("Informe o código do produto: ");
    codigo = text.nextInt();
    System.out.println("Informe a quantidade do produto: ");
    quantidade = text.nextInt();

    if (codigo >= 1 && codigo <= 10){
        preco = 10;
    }
    else if (codigo >= 11 && codigo <= 20){
        preco = 15;
    }
    else if (codigo >= 21 && codigo <= 30){
        preco = 20;
    }
    else if (codigo >= 31 && codigo <=40){
        preco = 30;
    }
    else{
        System.out.print("Código de produto inválido!");
    }

    precoTotal = preco * quantidade;

    if (precoTotal < 250){
        desconto = 0.5;
    }
    else if(precoTotal >=251 && precoTotal <=500){
        desconto = 0.1;
    }
    else{
        desconto = 0.15;
    }

    System.out.println("O preço do produto é: " + preco);
    System.out.println("O valor total de acordo com a quantidade de produtos é: " + precoTotal);
    System.out.println("O valor do desconto é: " + desconto);
    precoTotal = precoTotal - (precoTotal * desconto);
    System.out.println("O valor final é: " + precoTotal);
}