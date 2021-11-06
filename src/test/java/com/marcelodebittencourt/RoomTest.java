package com.marcelodebittencourt;
import org.junit.jupiter.api.Test;

public class RoomTest {
    
    @Test
    void testNewRoom(){
        //Entrada de Dados
        int NumberofRoom = 200;
        String NameofRoom = "Suite Luxo";
        double ValorPerDay = 500;

        //T - Teste - Execução do Testel
        Room RoomLuxo = Room(NumberofRoom, NameofRoom, ValorPerDay);
        
        //R - Resultado - Validação de Resultado
        assertEquals(NumberofRoom, RoomLuxo.getId());
        assertEquals(NameofRoom, RoomLuxo.getName() );
        assertEquals(ValorPerDay, RoomLuxo.getPricePerDay() );
    }
}