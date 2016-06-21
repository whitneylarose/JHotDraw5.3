package CH.ifa.draw.contrib;

/**
 * Created by WHitney Nelson on 6/20/2016.
 */

import edu.cmu.cs.glacier.qual.Immutable;

//package CH.ifa.draw.figures;
        import java.awt.*;
        import java.beans.Transient;
@Immutable
public class Rectangle {

    /**
     * The X coordinate of the upper-left corner of the <code>Rectangle</code>.
     */
    public final int x;

    /**
     * The Y coordinate of the upper-left corner of the <code>Rectangle</code>.
     */
    public final int y;

    /**
     * The width of the <code>Rectangle</code>.
     * @since 1.0
     */
    public final int width;


    /**
     * The height of the <code>Rectangle</code>.
     */
    public final int height;

    /*
     * JDK 1.1 serialVersionUID
     */
    private static final long serialVersionUID = -4345857070255674764L;

    /**
     * Initialize JNI field and method IDs
     */
    private static native void initIDs();


    /**
     * Constructs a new <code>Rectangle</code> whose upper-left corner
     * is at (0,&nbsp;0) in the coordinate space, and whose width and
     * height are both zero.
     */
    public Rectangle() {
        this(0, 0, 0, 0);
    }

    /**
     * Constructs a new <code>Rectangle</code>, initialized to match
     * the values of the specified <code>Rectangle</code>.
     * @param r  the <code>Rectangle</code> from which to copy initial values
     *           to a newly constructed <code>Rectangle</code>
     * @since 1.1
     */
    public Rectangle(java.awt.Rectangle r) {
        this(r.x, r.y, r.width, r.height);
    }

    /**
     * Constructs a new <code>Rectangle</code> whose upper-left corner is
     * specified as
     * {@code (x,y)} and whose width and height
     * are specified by the arguments of the same name.
     * @param     x the specified X coordinate
     * @param     y the specified Y coordinate
     * @param     width    the width of the <code>Rectangle</code>
     * @param     height   the height of the <code>Rectangle</code>
     * @since 1.0
     */
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Constructs a new <code>Rectangle</code> whose upper-left corner
     * is at (0,&nbsp;0) in the coordinate space, and whose width and
     * height are specified by the arguments of the same name.
     * @param width the width of the <code>Rectangle</code>
     * @param height the height of the <code>Rectangle</code>
     */
    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }

    /**
     * Constructs a new <code>Rectangle</code> whose upper-left corner is
     * specified by the {@link Point} argument, and
     * whose width and height are specified by the
     * {@link Dimension} argument.
     * @param p a <code>Point</code> that is the upper-left corner of
     * the <code>Rectangle</code>
     * @param d a <code>Dimension</code>, representing the
     * width and height of the <code>Rectangle</code>
     */
    public Rectangle(Point p, Dimension d) {
        this(p.x, p.y, d.width, d.height);
    }

    /**
     * Constructs a new <code>Rectangle</code> whose upper-left corner is the
     * specified <code>Point</code>, and whose width and height are both zero.
     * @param p a <code>Point</code> that is the top left corner
     * of the <code>Rectangle</code>
     */
    public Rectangle(Point p) {
        this(p.x, p.y, 0, 0);
    }

    /**
     * Constructs a new <code>Rectangle</code> whose top left corner is
     * (0,&nbsp;0) and whose width and height are specified
     * by the <code>Dimension</code> argument.
     * @param d a <code>Dimension</code>, specifying width and height
     */
    public Rectangle(Dimension d) {
        this(0, 0, d.width, d.height);
    }


    /**
     * Returns the X coordinate of the bounding <code>Rectangle</code> in
     * <code>double</code> precision.
     * @return the X coordinate of the bounding <code>Rectangle</code>.
     */
    public double getX() {
        return x;
    }

    /**
     * Returns the Y coordinate of the bounding <code>Rectangle</code> in
     * <code>double</code> precision.
     * @return the Y coordinate of the bounding <code>Rectangle</code>.
     */
    public double getY() {
        return y;
    }

    /**
     * Returns the width of the bounding <code>Rectangle</code> in
     * <code>double</code> precision.
     * @return the width of the bounding <code>Rectangle</code>.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Returns the height of the bounding <code>Rectangle</code> in
     * <code>double</code> precision.
     * @return the height of the bounding <code>Rectangle</code>.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Gets the bounding <code>Rectangle</code> of this <code>Rectangle</code>.
     * <p>
     * This method is included for completeness, to parallel the
     * <code>getBounds</code> method of
     * {@link Component}.
     * @return    a new <code>Rectangle</code>, equal to the
     * bounding <code>Rectangle</code> for this <code>Rectangle</code>.
     */
    @Transient
    public java.awt.Rectangle getBounds() {
        return new java.awt.Rectangle(x, y, width, height);
    }

    /**
     * Returns the location of this <code>Rectangle</code>.
     * <p>
     * This method is included for completeness, to parallel the
     * <code>getLocation</code> method of <code>Component</code>.
     * @return the <code>Point</code> that is the upper-left corner of
     *                  this <code>Rectangle</code>.
     * @see       java.awt.Component#getLocation

     */
    public Point getLocation() {
        return new Point(x, y);
    }

    /**
     * Gets the size of this <code>Rectangle</code>, represented by
     * the returned <code>Dimension</code>.
     * <p>
     * This method is included for completeness, to parallel the
     * <code>getSize</code> method of <code>Component</code>.
     * @return a <code>Dimension</code>, representing the size of
     *            this <code>Rectangle</code>.
     */
    public Dimension getSize() {
        return new Dimension(width, height);
    }

    /**
     * Computes the intersection of this <code>Rectangle</code> with the
     * specified <code>Rectangle</code>. Returns a new <code>Rectangle</code>
     * that represents the intersection of the two rectangles.
     * If the two rectangles do not intersect, the result will be
     * an empty rectangle.
     *
     * @param     r   the specified <code>Rectangle</code>
     * @return    the largest <code>Rectangle</code> contained in both the
     *            specified <code>Rectangle</code> and in
     *            this <code>Rectangle</code>; or if the rectangles
     *            do not intersect, an empty rectangle.
     */
/**    public java.awt.Rectangle intersection(java.awt.Rectangle r) {
 int tx1 = this.x;
 int ty1 = this.y;
 int rx1 = r.x;
 int ry1 = r.y;
 long tx2 = tx1; tx2 += this.width;
 long ty2 = ty1; ty2 += this.height;
 long rx2 = rx1; rx2 += r.width;
 long ry2 = ry1; ry2 += r.height;
 if (tx1 < rx1) tx1 = rx1;
 if (ty1 < ry1) ty1 = ry1;
 if (tx2 > rx2) tx2 = rx2;
 if (ty2 > ry2) ty2 = ry2;
 tx2 -= tx1;
 ty2 -= ty1;
 // tx2,ty2 will never overflow (they will never be
 // larger than the smallest of the two source w,h)
 // they might underflow, though...
 if (tx2 < Integer.MIN_VALUE) tx2 = Integer.MIN_VALUE;
 if (ty2 < Integer.MIN_VALUE) ty2 = Integer.MIN_VALUE;
 return new java.awt.Rectangle(tx1, ty1, (int) tx2, (int) ty2);
 }**/

    /**
     * Adds the specified {@code Point} to the bounds of this
     * {@code Rectangle}.
     * <p>
     * If this {@code Rectangle} has any dimension less than zero,
     * the rules for <a href=#NonExistant>non-existant</a>
     * rectangles apply.
     * In that case, the new bounds of this {@code Rectangle} will
     * have a location equal to the coordinates of the specified
     * {@code Point} and width and height equal to zero.
     * <p>
     * After adding a <code>Point</code>, a call to <code>contains</code>
     * with the added <code>Point</code> as an argument does not
     * necessarily return <code>true</code>. The <code>contains</code>
     * method does not return <code>true</code> for points on the right
     * or bottom edges of a <code>Rectangle</code>. Therefore if the added
     * <code>Point</code> falls on the right or bottom edge of the
     * enlarged <code>Rectangle</code>, <code>contains</code> returns
     * <code>false</code> for that <code>Point</code>.
     * If the specified point must be contained within the new
     * {@code Rectangle}, a 1x1 rectangle should be added instead:
     * <pre>
     *     r.add(pt.x, pt.y, 1, 1);
     * </pre>
     * @param pt the new <code>Point</code> to add to this
     *           <code>Rectangle</code>
     */
    //  public void add(Point pt) {
    //    add(pt.x, pt.y);
    //}
    /**
     * {@inheritDoc}
     * @since 1.2
     */
    public boolean isEmpty() {
        return (width <= 0) || (height <= 0);
    }

    /**
     * Returns a <code>String</code> representing this
     * <code>Rectangle</code> and its values.
     * @return a <code>String</code> representing this
     *               <code>Rectangle</code> object's coordinate and size values.
     */
     public  String toString() {
        return getClass().getName() + "[x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]";
     }

}
