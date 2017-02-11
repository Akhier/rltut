package rltut;

import java.awt.Color;

public class World {
	private Tile[][] tiles;
	private int width;
	public int width() { return width; }

	private int height;
	public int height() { return height; }

	public World(Tile[][] tiles) {
		this.tiles = tiles;
		this.width = tiles.length;
		this.height = tiles[0].length;
	}
}
