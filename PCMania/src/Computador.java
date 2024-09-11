public class Computador {


    public String marca;
    public float preco;

    HArdwareBasico[] hard = new HArdwareBasico[3];
    MemoriaUSB[] presente = new MemoriaUSB[3];
    sistemaOperacional[] Op = new sistemaOperacional[3];

    void addHard(HArdwareBasico Novo) {
        for (int i = 0; i < hard.length; i++) {
            if (hard[i] == null) {
                hard[i] = Novo;
                break;
            }
        }
    }

    void addMemoriaUSB(MemoriaUSB musb) {
        for (int i = 0; i < presente.length; i++) {
            if (presente[i] == null) {
                presente[i] = musb;
                break;
            }
        }
    }

    void addOp(sistemaOperacional novo) {
        for (int i = 0; i < Op.length; i++) {
            if (Op[i] == null) {
                Op[i] = novo;
                break;
            }
        }
    }

    public void mostraPCConfigs() {
        for (int i = 0; i < hard.length; i++) {
            if (hard[i] != null) {
                System.out.println("Esse Computador é da marca: " + this.marca);
                System.out.println("Esse Computador tem o processador: " + hard[i].nome + " Com capacidade de " + hard[i].capacidade + "Mhz");

            }
        }

        for (int i = 0; i < presente.length; i++) {
            if (presente[i] != null) {
                System.out.println("Esse PC vem com 1 " + presente[i].nome + " Com a capacidade de " + presente[i].capacidade + "GB");
            }
        }

        for (int i = 0; i < Op.length; i++) {
            if (Op[i] != null) {

                System.out.println("Com o sistema Operacional " + Op[i].nome + " Com " + Op[i].tipo + "Bits");

            }
        }

    }


}




