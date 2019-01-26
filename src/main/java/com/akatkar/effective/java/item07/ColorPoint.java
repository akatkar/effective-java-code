package com.akatkar.effective.java.item07;

import java.awt.Color;

public class ColorPoint extends Point {

    private Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }
//... // Remainder omitted

    //Broken - violates symmetry!
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint)) {
            return false;
        }
        ColorPoint cp = (ColorPoint) o;
        return super.equals(o) && cp.color == color;
    }

//    //Broken - violates transitivity.
//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Point)) {
//            return false;
//        }
//        // If o is a normal Point, do a color-blind comparison
//        if (!(o instanceof ColorPoint)) {
//            return o.equals(this);
//        }
//        // o is a ColorPoint; do a full comparison
//        ColorPoint cp = (ColorPoint) o;
//        return super.equals(o) && cp.color == color;
//    }
}
