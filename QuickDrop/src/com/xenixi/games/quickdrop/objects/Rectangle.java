package com.xenixi.games.quickdrop.objects;

import java.awt.Point;

public class Rectangle extends GameObject {
	public Rectangle(String objectID) {
		super(objectID);
	}

	public Rectangle(String objectID, Point position) {
		super(objectID, position);
	}

	public Rectangle(String objectID, Point position, boolean visible) {
		super(objectID, position, visible);

	}

	public Rectangle(String objectID, boolean visible) {
		super(objectID, visible);

	}
}
