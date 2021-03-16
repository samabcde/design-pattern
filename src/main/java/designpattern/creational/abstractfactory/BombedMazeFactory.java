package designpattern.creational.abstractfactory;

import designpattern.creational.maze.BoomedWall;
import designpattern.creational.maze.Room;
import designpattern.creational.maze.RoomWithABomb;
import designpattern.creational.maze.Wall;

public class BombedMazeFactory extends MazeFactory {
    @Override
    public Wall makeWall() {
        return new BoomedWall();
    }

    @Override
    public Room makeRoom(int n) {
        return new RoomWithABomb(n);
    }
}
