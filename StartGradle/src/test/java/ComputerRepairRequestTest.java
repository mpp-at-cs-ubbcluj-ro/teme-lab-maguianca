import ro.mpp2025.model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First Test")
    public void testExample(){
        ComputerRepairRequest crr=new ComputerRepairRequest();
        assertEquals("",crr.getOwnerName());
        assertEquals("",crr.getOwnerAddress());
    }
    @Test
    @DisplayName("Test Example")
    public void testExample2(){
        assertEquals(5,5,"Numerele ar trebui sa fie egale!");
    }
    @Test
    @DisplayName("Third Test")
    public void testExample3(){
        ComputerRepairRequest crr=new ComputerRepairRequest(1,"Andrei","Strada 1","072222","Asus","13/10/2020","Broken display");
        assertEquals("Andrei",crr.getOwnerName());
        assertEquals("Strada 1",crr.getOwnerAddress());
        assertEquals("072222",crr.getPhoneNumber());
        assertEquals("Asus",crr.getModel());
        assertEquals("13/10/2020",crr.getDate());
        assertEquals("Broken display",crr.getProblemDescription());

    }
    @Test
    @DisplayName("Forth Test")
    public void testExample4(){
        ComputerRepairRequest crr=new ComputerRepairRequest(2,"Ana","","","","","Broken display");
        assertEquals("Ana",crr.getOwnerName());
        assertEquals("",crr.getOwnerAddress());
        assertEquals("",crr.getPhoneNumber());
        assertEquals("",crr.getModel());
        assertEquals("",crr.getDate());
        assertEquals("Broken display",crr.getProblemDescription());
        System.out.println("Au trecut testele");
    }

      
}
