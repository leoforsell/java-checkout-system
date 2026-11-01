package se.leo.checkout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ProductTest {
    @Test void productPreservesOreAndIdentity() {
        Product p = new Product("P1", "Kaffe", 2500);
        assertEquals("P1", p.id());
        assertEquals("Kaffe", p.name());
        assertEquals(2500, p.priceOre());
    }
}
