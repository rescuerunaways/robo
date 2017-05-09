package services;

import model.Command;
import org.testng.annotations.*;

import static model.CommandType.PLACE;
import static org.testng.Assert.*;
import static services.Validator.validate;

public class ValidatorTest {

    @Test()
    public void testValidate() {
        Command placeCommand = new Command(PLACE);
        assertTrue(validate(placeCommand));
    }
}
