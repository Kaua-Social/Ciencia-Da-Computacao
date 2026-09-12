void main() {
    Scanner text = new Scanner(System.in);

    double peso;
    int idade;
    int mg;
    double gotas;

    System.out.print("Digite o peso do paciente em Kg: ");
    peso = text.nextDouble();
    System.out.print("Digite a idade do paciente em anos: ");
    idade = text.nextInt();

    if (idade >= 12){
        if (peso >= 60){
            mg = 1000;
        }
        else{
            mg = 875;
        }
    }
    else{
        if (peso <= 9){
            mg = 125;
        }
        else if (peso <= 16){
            mg = 250;
        }
        else if (peso <= 24){
            mg = 375;
        }
        else if (peso <= 30){
            mg = 500;
        }
        else{
            mg = 750;
        }
    }
    gotas = mg * (20.0 / 500);
    System.out.print("O paciente deve tomar " + gotas + " gotas.");
}