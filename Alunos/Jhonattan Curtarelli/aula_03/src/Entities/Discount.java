package src.Entities;

abstract public class Discount {
    protected Discount next;
    public Discount(Discount next)
    {
        this.next = next;
    }

}
