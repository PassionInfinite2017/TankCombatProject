package com.yizhi.tank;

import java.awt.Frame;
import java.awt.Graphics;

public class TankFrame  extends Frame{
	private int x ,y;
	public TankFrame(){
		this.setSize(800,600);
		this.setResizable(false);
		this.setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		g.fillRect(x, y, 100, 100);
		x++;
	}
	
}
