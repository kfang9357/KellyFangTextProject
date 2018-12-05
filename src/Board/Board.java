package Board;

import Places.Place;
public class Board
{
    private Place[][]map;
    public Board(Place[][]map)
    {
        this.map=map;
    }

    public Board (int height, int width)
    {
        map = new Place[height][width];
    }
}