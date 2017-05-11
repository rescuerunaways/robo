package services;

import model.Command;
import model.CommandType;
import model.ICommand;
import model.PlaceCommand;

import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;
import static java.util.regex.Pattern.compile;
import static store.KeyValue.vecAliaces;


public class ParseService {

    public static List<ICommand> parse(List<String> strings) {
        return strings.stream().map(ParseService::p).collect(Collectors.toList());
    }

    private static ICommand p(String s) {
        Matcher place = compile("(PLACE) (\\d)(,)(\\d)(,)(NORTH|EAST|WEST|SOUTH)").matcher(s);
        Matcher command = compile("(MOVE|RIGHT|LEFT|REPORT)").matcher(s);

        if (place.matches()) {
            return new PlaceCommand(new int[]{parseInt(place.group(2)), parseInt(place.group(4))},
                vecAliaces.get(place.group(6)));
        } else if (command.matches()) {
            return new Command(CommandType.valueOf(command.group(1)));
        }
        return null;
    }

}
