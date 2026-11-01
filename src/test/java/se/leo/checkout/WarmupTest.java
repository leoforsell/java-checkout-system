package se.leo.checkout;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class WarmupTest {
    @Test @Disabled("R1: ta bort annotationen när du börjar")
    void calculatesLineTotal() { assertEquals(7500, Warmup.lineTotal(2500, 3)); }
    @Test @Disabled("R1: validering")
    void rejectsInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Warmup.lineTotal(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> Warmup.lineTotal(100, 0));
        assertThrows(IllegalArgumentException.class, () -> Warmup.lineTotal(100, -1));
        assertEquals(0, Warmup.lineTotal(0, 2));
    }
    @Test @Disabled("R2: aktivera nästa")
    void sumsArrays() {
        assertEquals(0, Warmup.sum(new int[]{}));
        assertEquals(600, Warmup.sum(new int[]{100, 200, 300}));
    }
}
