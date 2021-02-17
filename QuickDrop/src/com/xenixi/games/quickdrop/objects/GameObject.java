package com.xenixi.games.quickdrop.objects;

import java.awt.Dimension;
import java.awt.Point;

public class GameObject {
	String objectID;
	Point position;
	Dimension dimensions;
	boolean visible;
	boolean moveable;
	boolean activated;

	public GameObject(String objectID) {
		this.objectID = objectID;
		visible = true;
		moveable = true;
		activated = true;
	}

	public GameObject(String objectID, Point position) {
		this.objectID = objectID;
		visible = true;
		moveable = true;
		activated = true;
		this.position = position;
	}

	public GameObject(String objectID, Point position, boolean visible) {
		this.objectID = objectID;
		visible = true;
		moveable = true;
		activated = true;
		this.position = position;
		this.visible = visible;
	}

	public GameObject(String objectID, boolean visible) {
		this.objectID = objectID;
		visible = true;
		moveable = true;
		activated = true;
		this.visible = visible;
	}
	public void setWidth(int width) {
		dimensions.width = width;
	}
	public void setHeight(int height) {
		dimensions.height = height; 
	}

}
