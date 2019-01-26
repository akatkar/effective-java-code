package com.akatkar.effective.java.item07;

import java.awt.Color;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ali Katkar
 */
public class ColorPointTest {

    public ColorPointTest() {
    }

    @Test
    public void testSymmetry() {
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        assertTrue(p.equals(cp));
        assertTrue(cp.equals(p));
    }

    @Test
    public void testTransivity() {
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
        
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p3));
        assertTrue(p1.equals(p3));
        
        
    }
}
