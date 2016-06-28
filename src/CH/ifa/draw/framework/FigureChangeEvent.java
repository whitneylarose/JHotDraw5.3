/*
 * @(#)FigureChangeEvent.java
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
 * FigureChange event passed to FigureChangeListeners.
 *
 * @version <$CURRENT_VERSION$>
 */
public class FigureChangeEvent extends EventObject {

	private ImmutableRectangle fImmutableRectangle;
	private static final ImmutableRectangle  fgEmptyImmutableRectangle = new ImmutableRectangle(0, 0, 0, 0);

   /**
	* Constructs an event for the given source Figure. The ImmutableRectangle is the
	* area to be invalvidated.
	*/
	public FigureChangeEvent(Figure source, ImmutableRectangle r) {
		super(source);
		fImmutableRectangle = r;
	}

	public FigureChangeEvent(Figure source) {
		super(source);
		fImmutableRectangle = fgEmptyImmutableRectangle;
	}

	/**
	 *  Gets the changed figure
	 */
	public Figure getFigure() {
		return (Figure)getSource();
	}

	/**
	 *  Gets the changed ImmutableRectangle
	 */
	public ImmutableRectangle getInvalidatedImmutableRectangle() {
		return fImmutableRectangle;
	}
}
