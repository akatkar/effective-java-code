package com.akatkar.effective.java.item08;

import com.akatkar.effective.java.item10.PhoneNumber;
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
        // This test will be failed due to not override of hashCode method.
        // Overriding equals method without hashCode can be dangerous.
        // see item11 for solution and passing test case
        assertEquals("Jenny", actual);
    }
}
