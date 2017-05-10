package services;

import model.Command;
import model.PlaceCommand;

import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;
import static java.util.regex.Pattern.compile;
import static store.KeyValue.vecAliaces;


public class ParseService {

    public static List<Command> parse(List<String> commands) {
        return commands.stream().map(c -> parse(c)).collect(Collectors.toList());
    }

    private static Command parse(String s) {
        Matcher place = compile("(PLACE) (\\d)(,)(\\d)(,)(NORTH|EAST|WEST|SOUTH)").matcher(s);
        Matcher other = compile("(MOVE|RIGHT|LEFT|REPORT)").matcher(s);

        if (place.matches()) {
            return new PlaceCommand(new int[]{parseInt(place.group(2)), parseInt(place.group(4))},
                vecAliaces.get(parseInt(place.group(6))));
        } else if (other.matches()) {
            return new Command(place.group(1));
        }
        return null;
    }

}
