package designpattern.creational.maze;

import java.util.HashMap;
import java.util.Map;

public class Room extends MapSite {
    private int roomNumber;
    private Map<Direction, MapSite> sides = new HashMap<>();

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public MapSite getSide(Direction direction) {
        return sides.get(direction);
    }

    public void setSide(Direction direction, MapSite mapSite) {
        sides.put(direction,mapSite);
    }

    @Override
    public void enter() {
        // TODO implement
    }
}
