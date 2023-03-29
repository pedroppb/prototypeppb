package prototypeppb;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CloneTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Ovelha ovelha = new Ovelha("sem nome", new DNA("original",0));

        Ovelha ovelhaClone = ovelha.clone();
        ovelhaClone.setNome("dolly");
        ovelhaClone.getDna().setTipo("clonado");
        ovelhaClone.getDna().setTentativa(1);
        assertEquals("ovelha:sem nome\n" +
                "tentativa 0 tipo: original", ovelha.toString());
        assertEquals("ovelha:dolly\n" +
                "tentativa 1 tipo: clonado", ovelhaClone.toString());
    }


}





