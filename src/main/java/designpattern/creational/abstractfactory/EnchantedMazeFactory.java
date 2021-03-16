package designpattern.creational.abstractfactory;

import designpattern.creational.maze.*;

public class EnchantedMazeFactory extends MazeFactory {

    @Override
    public Room makeRoom(int n) {
        return new EnchantedRoom(n, castSpell());
    }

    @Override
    public Door makeDoor(Room room1, Room room2) {
        return new DoorNeedingSpell(room1, room2);
    }

    protected Spell castSpell() {
        return null;
    }
}
