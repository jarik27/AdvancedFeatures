package tln6;

public class GenericBox2<T extends Shape> {
    // generic stavitsja <>

    private T item;

    public GenericBox2(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
