import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 200);
    }

    @Test
    public void hasSheets(){
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void hasVolume(){
        assertEquals(200, printer.getVolume());
    }

    @Test
    public void canPrint(){
        assertEquals(true, printer.print());
    }

    @Test
    public void cantPrint(){
        Printer printer2 = new Printer(40, 100);
        assertEquals(false, printer2.print());
    }

}
