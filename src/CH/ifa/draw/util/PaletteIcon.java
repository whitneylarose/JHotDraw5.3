/*
 * @(#)PaletteIcon.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.util;

//import edu.cmu.cs.glacier.qual.Immutable;

import java.awt.*;

/**
 * A three state icon that can be used in Palettes.
 *
 * @see PaletteButton
 *
 * @version <$CURRENT_VERSION$>
 */
 public  class PaletteIcon extends Object {

	private final Image       fNormal;
	private final Image       fPressed;
	private final Image       fSelected;
	private final Dimension   fSize;

	public PaletteIcon(Dimension fsize, Image fnormal, Image fpressed, Image fselected) {
		this. fSize = fsize;
		this. fNormal = fnormal;
		this. fPressed = fpressed;
		this. fSelected = fselected;
	}

	public Image normal() { return fNormal; }
	public Image pressed() { return fPressed; }
	public Image selected() { return fSelected; }

	public int getWidth() { return fSize.width; }
	public int getHeight() { return fSize.height; }

}
