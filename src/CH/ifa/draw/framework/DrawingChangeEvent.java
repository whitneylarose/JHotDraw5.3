/*
 * @(#)DrawingChangeEvent.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.framework;

//import java.awt.ImmutableRectangle;
import java.util.EventObject;
import CH.ifa.draw.contrib.ImmutableRectangle;


/**
 * The event passed to DrawingChangeListeners.
 *
 * @version <$CURRENT_VERSION$>
 */
public class DrawingChangeEvent extends EventObject {

	private ImmutableRectangle fImmutableRectangle;

	/**
	 *  Constructs a drawing change event.
	 */
	public DrawingChangeEvent(Drawing source, ImmutableRectangle r) {
		super(source);
		fImmutableRectangle = r;
	}

	/**
	 *  Gets the changed drawing
	 */
	public Drawing getDrawing() {
		return (Drawing)getSource();
	}

	/**
	 *  Gets the changed ImmutableRectangle
	 */
	public ImmutableRectangle getInvalidatedImmutableRectangle() {
		return fImmutableRectangle;
	}
}
