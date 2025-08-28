public class Prodotto{
    private String nome;
    private double prezzo_base;

    public Prodotto(String nome, double prezzo_base){
        this.nome= nome;
        this.prezzo_base = prezzo_base;
        }

    public double calcolaPrezzoFinale(double sconto){
        double prezzo_finale = prezzo_base - sconto /100;
        System.out.println("il prodotto: " + nome + " ha come prezzo finale: "+ prezzo_finale);
        return prezzo_finale;
        }
}