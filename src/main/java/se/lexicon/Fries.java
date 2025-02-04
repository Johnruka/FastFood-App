package se.lexicon;



public class Fries extends Product {

    private Size size;
    private boolean isSpicy;
    private boolean isSweetPotato;


    public Fries(se.lexicon.Size size, boolean isSpicy, boolean isSweetPotato) {
        super(size.getLabel(), size.getPrice());
        this.size = size;
        this.isSpicy =isSpicy;
        this.isSweetPotato = isSweetPotato;
    }

    @Override
    public String getDescription() {
        return "Name: " + super.getName() + " , Price: " + super.getPrice() + " , Size: " + this.size + " , Spicy: " + isSpicy;
    }

    @Override
    public double calculateTax() {
        return super.getPrice() * 0.2;
    }

    @Override
    public String toString() {
        return "Fries{" +
                "size=" + size +
                ", isSpicy=" + isSpicy +
                ", isSweetPotato=" + isSweetPotato +
                '}';
    }
}
