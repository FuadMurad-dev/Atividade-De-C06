public class cliente
{
    public String nome;
    public long CPF;
    float valor1;
    float valor2;
    float valor3;
    float valortotal;

    void  calculartotalCompra()
    {
        valortotal = this.valor1 + this.valor2 + this.valor3;
        System.out.println( "Valor Total R$" + valortotal);
    }



}
