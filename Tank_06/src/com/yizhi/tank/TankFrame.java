package com.yizhi.tank;

import java.awt.Frame;
import java.awt.Graphics;

public class TankFrame  extends Frame{
	public TankFrame(){
		this.setSize(800,600);
		this.setResizable(false);
		this.setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		g.fillRect(50, 50, 100, 100);
	}
	
}
