package services;

import model.Command;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static services.ProcessService.process;


public class ProcessServiceTest {

    @Test()
    public void testProcess() {
        List<Command> commands = new ArrayList<>();
        assertEquals("blah", process(commands));
    }

}
