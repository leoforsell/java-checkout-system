package se.leo.checkout;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@Disabled("Issue #2: aktivera ett test åt gången och lägg till egna gränsfall")
class SaleTest {
    @Test void emptySaleCostsZero() { assertEquals(0, new Sale().totalOre()); }
    @Test void multipleLinesAndQuantities() {
        Sale sale = new Sale();
        sale.add(new Product("P1", "Kaffe", 2500), 2);
        sale.add(new Product("P2", "Bulle", 1800), 1);
        assertEquals(6800, sale.totalOre());
    }
    @Test void invalidQuantityIsRejected() {
        assertThrows(IllegalArgumentException.class,
            () -> new Sale().add(new Product("P1", "Kaffe", 2500), 0));
    }
    @Test void negativePriceIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> new Product("P1", "Kaffe", -1));
    }
}
