/*
 * @(#)ImmutableRectangleFigure.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.figures;

import java.awt.*;
import java.io.IOException;
import java.util.Vector;

import CH.ifa.draw.contrib.ImmutableRectangle;
import CH.ifa.draw.framework.*;
import CH.ifa.draw.standard.*;
import CH.ifa.draw.util.*;
import CH.ifa.draw.standard.BoxHandleKit;



/**
 * A ImmutableRectangle figure.
 *
 * @version <$CURRENT_VERSION$>
 */
public class ImmutableRectangleFigure extends AttributeFigure {

	private ImmutableRectangle fDisplayBox;


	/*
	 * Serialization support.
	 */
	private static final long serialVersionUID = 184722075881789163L;
	private int ImmutableRectangleFigureSerializedDataVersion = 1;

	public ImmutableRectangleFigure() {
		this(new Point (0,0), new Point(0,0));
	}

	public ImmutableRectangleFigure(int x, int y) {
		this(new Point(x,y), new Point(x,y));
		basicMoveBy(x,y);
	}

	public ImmutableRectangleFigure(Point origin, Point corner) {
		basicDisplayBox(origin,corner);
	}

	public void basicDisplayBox(Point origin, Point corner) {
		//fDisplayBox = new ImmutableImmutableRectangle(origin);
		//add corner
		fDisplayBox = new ImmutableRectangle(origin, corner);
		//fDisplayBox.add(corner);
	}

	public Vector handles() {
		Vector handles = new Vector();
		BoxHandleKit.addHandles(this, handles);
		System.out.println(handles);
		return handles;

	}

	public ImmutableRectangle displayBox() {
		return new ImmutableRectangle(
			fDisplayBox.x,
			fDisplayBox.y,
			fDisplayBox.width,
			fDisplayBox.height);
	}

	protected void basicMoveBy(int x, int y) {
		fDisplayBox = fDisplayBox.translate(x,y);
	}

	public void drawBackground(Graphics g) {
		ImmutableRectangle r = displayBox();
		g.fillRect(r.x, r.y, r.width, r.height);
	}

	public void drawFrame(Graphics g) {
		ImmutableRectangle r = displayBox();
		g.drawRect(r.x, r.y, r.width-1, r.height-1);
	}

	//-- store / load ----------------------------------------------

	public void write(StorableOutput dw) {
		super.write(dw);
		dw.writeInt(fDisplayBox.x);
		dw.writeInt(fDisplayBox.y);
		dw.writeInt(fDisplayBox.width);
		dw.writeInt(fDisplayBox.height);
	}

	public void read(StorableInput dr) throws IOException {
		super.read(dr);
		fDisplayBox = new ImmutableRectangle(
			dr.readInt(),
			dr.readInt(),
			dr.readInt(),
			dr.readInt());
	}

}
