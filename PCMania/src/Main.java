import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Computador

        Computador[] comp = new Computador[3];
        Computador c1 = new Computador();
        Computador c2 = new Computador();
        Computador c3 = new Computador();

        c1.marca = "Positivo";
        c2.marca = "Acer";
        c3.marca = "Vaio";

        // Parte do HardwareBasico

        HArdwareBasico hardware1 = new HArdwareBasico();


        HArdwareBasico hardware2 = new HArdwareBasico();

        HArdwareBasico hardware3 = new HArdwareBasico();

        hardware1.nome = "Pentium Core i3";
        hardware1.capacidade = 2200;


        hardware2.nome = "Pentium Core i5";
        hardware2.capacidade = 3370;

        hardware3.nome = "Pentium Core i7" ;
        hardware3.capacidade = 4500;

        // parte das MemoriaUSB

        MemoriaUSB promo1 = new MemoriaUSB();
        MemoriaUSB promo2 = new MemoriaUSB();
        MemoriaUSB promo3 = new MemoriaUSB();

        promo1.nome = "Pen Drive de ";
        promo1.capacidade = 16;

        promo2.nome = "Pen Drive de ";
        promo2.capacidade = 32;

        promo3.nome = "HD Externo";
        promo3.capacidade = 1000;

        // sistema operacional

        sistemaOperacional op1 = new sistemaOperacional();
        sistemaOperacional op2 = new sistemaOperacional();
        sistemaOperacional op3 = new sistemaOperacional();

        op1.nome = "Linux";
        op1.tipo = 32;

        op2.nome = "Windows 8";
        op2.tipo = 64;

        op3.nome = "Windows 10";
        op3.tipo = 64;


        Scanner sc = new Scanner(System.in);


        System.out.println(" Digite o seu nome");
        String nome = sc.next();
        System.out.println(" Coloque o seu CPF");
        long CPF = sc.nextInt();

        // Parte Cliente

        cliente comprador = new cliente();
        comprador.nome = nome;
        comprador.CPF = CPF;



        int pc1 = 0;
        int pc2 = 0;
        int pc3 = 0;

        System.out.println("Promoção 1");
        System.out.println("Marca: Positivo");
        System.out.println("Preço: R$2067");
        System.out.println("Pentium Core I3 (2200 Mhz)");
        System.out.println("8 Gb de Memoria RAM");
        System.out.println("500GB de HD");
        System.out.println("Sistema Operacional Linux Ubuntu (32 bits)");
        System.out.println("Acompanha Pen-drive de 16GB");

        System.out.println("Promoção 2");
        System.out.println("Marca: Acer");
        System.out.println("Preço: R$3301");
        System.out.println("Pentium Core I5 (3370 Mhz)");
        System.out.println("16 Gb de Memoria RAM");
        System.out.println("1TB de HD");
        System.out.println("Sistema Operacional Windows 8 (64 bits)");
        System.out.println("Acompanha Pen-drive de 32 GB");


        System.out.println("Promoção 3");
        System.out.println("Marca: Vaio");
        System.out.println("Preço: R$7745");
        System.out.println("Pentium Core I7 (4500 Mhz)");
        System.out.println("32 Gb de Memoria RAM");
        System.out.println("2TB de HD");
        System.out.println("Sistema Operacional Windows 10 (64 bits)");
        System.out.println("Acompanha HD Externo 1TB");

        System.out.println("Escolha a Promoção que deseja: ");
        int promocao = sc.nextInt();  // entrada para o comprador escolher a promocao

        while(promocao != 0) {

            if(promocao == 1){
                c1.addHard(hardware1);
                c1.addMemoriaUSB(promo1);
                c1.addOp(op1);

                pc1 = pc1 + 1;

            } else if(promocao == 2){

                c2.addHard(hardware2);
                c2.addMemoriaUSB(promo2);
                c2.addOp(op2);
                pc2 = pc2 + 1;
            } else if(promocao == 3){

                c3.addHard(hardware3);
                c3.addMemoriaUSB(promo3);
                c3.addOp(op3);
                pc3 = pc3 + 1;
            }
            promocao = sc.nextInt();  // entrada para o comprador escolher a promocao
        }
        comprador.valor1 = 2067 * pc1;
        comprador.valor2 = (2067 + 1235) * pc2;
        comprador.valor3 = (2067 +5678)* pc3;
        comprador.calculartotalCompra();



        System.out.println("Nome:" + comprador.nome +" Com o CPF: " + comprador.CPF);
        c1.mostraPCConfigs();
        c2.mostraPCConfigs();
        c3.mostraPCConfigs();
    }
}