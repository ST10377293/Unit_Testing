/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package helloworld;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

/**
 *
 * @author uthac
 */
public class MessageTest {
    
    Message message = new Message();
    
    public MessageTest() {
    }

    @Test
    public void testSomeMethod() {
        String expected = "I have arrived";
        String actual = message.getMessage();
        
        assertEquals(expected, actual);
    }
    
}
