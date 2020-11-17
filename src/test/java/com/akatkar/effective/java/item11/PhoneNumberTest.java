package com.akatkar.effective.java.item11;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ali Katkar
 */
public class PhoneNumberTest {

    @Test
    public void testHashCode() {
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(408, 867, 5309), "Jenny");
        String actual = m.get(new PhoneNumber(408, 867, 5309));
        assertEquals("Jenny", actual);
    }
}
