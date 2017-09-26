package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.forge.ecp2.Point;

public class PointTest {
    private Point pt, primer, segundo, tercero, cuarto;

    @Before
    public void before() {
        pt = new Point(2, 3);
        primer = new Point(2, 3);
        segundo = new Point(-2, +3);
        tercero = new Point(-2, -3);
        cuarto = new Point(2, -3);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(2, pt.getX());
        assertEquals(3, pt.getY());
    }

    @Test
    public void testPunto() {
        pt = new Point();
        assertEquals(0, pt.getX());
        assertEquals(0, pt.getY());
    }

    @Test
    public void testModulo() {
        assertEquals(3.6055, pt.module(), 10e-5);
    }

    @Test
    public void testFase() {
        assertEquals(0.9828, pt.phase(), 10e-5);
    }

    @Test
    public void testTranslate() {
        this.pt.translateOrigin(new Point(1, 1));
        assertEquals(1, pt.getX());
        assertEquals(2, pt.getY());
    }

    @Test
    public void testToString() {
        assertEquals("Point[2,3]", pt.toString());
    }
    
    /*
    @Test
    public void testQuadrant() {
        assertEquals(1, primer.quadrant());
        assertEquals(2, segundo.quadrant());
        assertEquals(3, tercero.quadrant());
        assertEquals(4, cuarto.quadrant());
    }
    */
    

}
