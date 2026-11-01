package se.leo.checkout;
public record SaleLine(Product product, int quantity) {
    public int totalOre() {
        // TODO #2: validera data och beräkna radens summa.
        throw new UnsupportedOperationException("Issue #2");
    }
}
