package CH.ifa.draw.contrib;

/**
 * Created by Whitney Nelson on 6/20/2016.
 */

import edu.cmu.cs.glacier.qual.Immutable;

//package CH.ifa.draw.figures;
        import java.awt.*;
        import java.beans.Transient;
        import java.io.Serializable;

@Immutable
public class ImmutableRectangle implements Serializable{

    /**
     * The X coordinate of the upper-left corner of the <code>ImmutableRectangle</code>.
     */
    public final int x;

    /**
     * The Y coordinate of the upper-left corner of the <code>ImmutableRectangle</code>.
     */
    public final int y;

    /**
     * The width of the <code>ImmutableRectangle</code>.
     * @since 1.0
     */
    public final int width;


    /**
     * The height of the <code>ImmutableRectangle</code>.
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
     * Constructs a new <code>ImmutableRectangle</code> whose upper-left corner
     * is at (0,&nbsp;0) in the coordinate space, and whose width and
     * height are both zero.
     */
    public ImmutableRectangle() {
        this(0, 0, 0, 0);
    }

    /**
     * Constructs a new <code>ImmutableRectangle</code>, initialized to match
     * the values of the specified <code>ImmutableRectangle</code>.
     * @param r  the <code>ImmutableRectangle</code> from which to copy initial values
     *           to a newly constructed <code>ImmutableRectangle</code>
     * @since 1.1
     */
    public ImmutableRectangle(ImmutableRectangle r) {
        this(r.x, r.y, r.width, r.height);
    }


    /**
     * Constructs a new <code>ImmutableRectangle</code> whose upper-left corner is
     * specified as
     * {@code (x,y)} and whose width and height
     * are specified by the arguments of the same name.
     * @param     x the specified X coordinate
     * @param     y the specified Y coordinate
     * @param     width    the width of the <code>ImmutableRectangle</code>
     * @param     height   the height of the <code>ImmutableRectangle</code>
     * @since 1.0
     */
    public ImmutableRectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Constructs a new <code>ImmutableRectangle</code> whose upper-left corner
     * is at (0,&nbsp;0) in the coordinate space, and whose width and
     * height are specified by the arguments of the same name.
     * @param width the width of the <code>ImmutableRectangle</code>
     * @param height the height of the <code>ImmutableRectangle</code>
     */
    public ImmutableRectangle(int width, int height) {
        this(0, 0, width, height);
    }

    /**
     * Constructs a new <code>ImmutableRectangle</code> whose upper-left corner is
     * specified by the {@link Point} argument, and
     * whose width and height are specified by the
     * {@link Dimension} argument.
     * @param p a <code>Point</code> that is the upper-left corner of
     * the <code>ImmutableRectangle</code>
     * @param d a <code>Dimension</code>, representing the
     * width and height of the <code>ImmutableRectangle</code>
     */
    public ImmutableRectangle(Point p, Dimension d) {
        this(p.x, p.y, d.width, d.height);
    }

    /**
     * Constructs a new <code>ImmutableRectangle</code> whose upper-left corner is the
     * specified <code>Point</code>, and whose width and height are both zero.
     * @param p a <code>Point</code> that is the top left corner
     * of the <code>ImmutableRectangle</code>
     */
    public ImmutableRectangle(Point p) {
        this(p.x, p.y, 0, 0);
    }


    public ImmutableRectangle (Point origin, Point corner){
        this(origin.x, origin.y, corner.x, corner.y);
    }
    /**
     * Constructs a new <code>ImmutableRectangle</code> whose top left corner is
     * (0,&nbsp;0) and whose width and height are specified
     * by the <code>Dimension</code> argument.
     * @param d a <code>Dimension</code>, specifying width and height
     */
    public ImmutableRectangle(Dimension d) {
        this(0, 0, d.width, d.height);
    }


    /**
     * Returns the X coordinate of the bounding <code>ImmutableRectangle</code> in
     * <code>double</code> precision.
     * @return the X coordinate of the bounding <code>ImmutableRectangle</code>.
     */
    public double getX() {
        return x;
    }

    /**
     * Returns the Y coordinate of the bounding <code>ImmutableRectangle</code> in
     * <code>double</code> precision.
     * @return the Y coordinate of the bounding <code>ImmutableRectangle</code>.
     */
    public double getY() {
        return y;
    }

    /**
     * Returns the width of the bounding <code>ImmutableRectangle</code> in
     * <code>double</code> precision.
     * @return the width of the bounding <code>ImmutableRectangle</code>.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Returns the height of the bounding <code>ImmutableRectangle</code> in
     * <code>double</code> precision.
     * @return the height of the bounding <code>ImmutableRectangle</code>.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Gets the bounding <code>ImmutableRectangle</code> of this <code>ImmutableRectangle</code>.
     * <p>
     * This method is included for completeness, to parallel the
     * <code>getBounds</code> method of
     * {@link Component}.
     * @return    a new <code>ImmutableRectangle</code>, equal to the
     * bounding <code>ImmutableRectangle</code> for this <code>ImmutableRectangle</code>.
     */
    @Transient
    public ImmutableRectangle getBounds() {
        return new ImmutableRectangle(x, y, width, height);
    }

    /**
     * Returns the location of this <code>ImmutableRectangle</code>.
     * <p>
     * This method is included for completeness, to parallel the
     * <code>getLocation</code> method of <code>Component</code>.
     * @return the <code>Point</code> that is the upper-left corner of
     *                  this <code>ImmutableRectangle</code>.
     * @see       java.awt.Component#getLocation

     */
    public Point getLocation() {
        return new Point(x, y);
    }


    /**
     * Gets the size of this <code>ImmutableRectangle</code>, represented by
     * the returned <code>Dimension</code>.
     * <p>
     * This method is included for completeness, to parallel the
     * <code>getSize</code> method of <code>Component</code>.
     * @return a <code>Dimension</code>, representing the size of
     *            this <code>ImmutableRectangle</code>.
     */
    public Dimension getSize() {
        return new Dimension(width, height);
    }

    /**
     * Adds the specified {@code Point} to the bounds of this
     * {@code ImmutableRectangle}.
     * <p>
     * If this {@code ImmutableRectangle} has any dimension less than zero,
     * the rules for <a href=#NonExistant>non-existant</a>
     * ImmutableRectangles apply.
     * In that case, the new bounds of this {@code ImmutableRectangle} will
     * have a location equal to the coordinates of the specified
     * {@code Point} and width and height equal to zero.
     * <p>
     * After adding a <code>Point</code>, a call to <code>contains</code>
     * with the added <code>Point</code> as an argument does not
     * necessarily return <code>true</code>. The <code>contains</code>
     * method does not return <code>true</code> for points on the right
     * or bottom edges of a <code>ImmutableRectangle</code>. Therefore if the added
     * <code>Point</code> falls on the right or bottom edge of the
     * enlarged <code>ImmutableRectangle</code>, <code>contains</code> returns
     * <code>false</code> for that <code>Point</code>.
     * If the specified point must be contained within the new
     * {@code ImmutableRectangle}, a 1x1 ImmutableRectangle should be added instead:
     * <pre>
     *     r.add(pt.x, pt.y, 1, 1);
     * </pre>
     * @param pt the new <code>Point</code> to add to this
     *           <code>ImmutableRectangle</code>
     */

      public ImmutableRectangle add(Point pt, Point po) {
          return new ImmutableRectangle(pt, po);
    }

    public ImmutableRectangle add (ImmutableRectangle ir){
        return new ImmutableRectangle(ir);
    }

      public ImmutableRectangle grow (int x, int y){

          return new ImmutableRectangle(x,y);
      }

    public ImmutableRectangle translate (ImmutableRectangle r, int px, int py){

        int newx = r.x + px;
        int newy = r.y + py;

        return new ImmutableRectangle(newx, newy);
    }



    /**
     * Checks whether or not this <code>ImmutableRectangle</code> contains the
     * specified <code>Point</code>.
     * @param p the <code>Point</code> to test
     * @return    <code>true</code> if the specified <code>Point</code>
     *            is inside this <code>ImmutableRectangle</code>;
     *            <code>false</code> otherwise.
     * @since     1.1
     */
    public boolean contains(Point p) {
        return contains(p.x, p.y);
    }

    /**
     * Checks whether or not this <code>ImmutableRectangle</code> contains the
     * point at the specified location {@code (x,y)}.
     *
     * @param  x the specified X coordinate
     * @param  y the specified Y coordinate
     * @return    <code>true</code> if the point
     *            {@code (x,y)} is inside this
     *            <code>ImmutableRectangle</code>;
     *            <code>false</code> otherwise.
     * @since     1.1
     */
    public boolean contains(int x, int y) {
        return inside(x, y);
    }

    /**
     * Checks whether or not this <code>ImmutableRectangle</code> entirely contains
     * the specified <code>ImmutableRectangle</code>.
     *
     * @param     r   the specified <code>ImmutableRectangle</code>
     * @return    <code>true</code> if the <code>ImmutableRectangle</code>
     *            is contained entirely inside this <code>ImmutableRectangle</code>;
     *            <code>false</code> otherwise
     * @since     1.2
     */
    public boolean contains(ImmutableRectangle r) {
        return contains(r.x, r.y, r.width, r.height);
    }

    /**
     * Checks whether this <code>ImmutableRectangle</code> entirely contains
     * the <code>ImmutableRectangle</code>
     * at the specified location {@code (X,Y)} with the
     * specified dimensions {@code (W,H)}.
     * @param     X the specified X coordinate
     * @param     Y the specified Y coordinate
     * @param     W   the width of the <code>ImmutableRectangle</code>
     * @param     H   the height of the <code>ImmutableRectangle</code>
     * @return    <code>true</code> if the <code>ImmutableRectangle</code> specified by
     *            {@code (X, Y, W, H)}
     *            is entirely enclosed inside this <code>ImmutableRectangle</code>;
     *            <code>false</code> otherwise.
     * @since     1.1
     */
    public boolean contains(int X, int Y, int W, int H) {
        int w = this.width;
        int h = this.height;
        if ((w | h | W | H) < 0) {
            // At least one of the dimensions is negative...
            return false;
        }
        // Note: if any dimension is zero, tests below must return false...
        int x = this.x;
        int y = this.y;
        if (X < x || Y < y) {
            return false;
        }
        w += x;
        W += X;
        if (W <= X) {
            // X+W overflowed or W was zero, return false if...
            // either original w or W was zero or
            // x+w did not overflow or
            // the overflowed x+w is smaller than the overflowed X+W
            if (w >= x || W > w) return false;
        } else {
            // X+W did not overflow and W was not zero, return false if...
            // original w was zero or
            // x+w did not overflow and x+w is smaller than X+W
            if (w >= x && W > w) return false;
        }
        h += y;
        H += Y;
        if (H <= Y) {
            if (h >= y || H > h) return false;
        } else {
            if (h >= y && H > h) return false;
        }
        return true;
    }

    /**
     * Checks whether or not this <code>ImmutableRectangle</code> contains the
     * point at the specified location {@code (X,Y)}.
     *
     * @param  X the specified X coordinate
     * @param  Y the specified Y coordinate
     * @return    <code>true</code> if the point
     *            {@code (X,Y)} is inside this
     *            <code>ImmutableRectangle</code>;
     *            <code>false</code> otherwise.
     * @deprecated As of JDK version 1.1,
     * replaced by <code>contains(int, int)</code>.
     */
    @Deprecated
    public boolean inside(int X, int Y) {
        int w = this.width;
        int h = this.height;
        if ((w | h) < 0) {
            // At least one of the dimensions is negative...
            return false;
        }
        // Note: if either dimension is zero, tests below must return false...
        int x = this.x;
        int y = this.y;
        if (X < x || Y < y) {
            return false;
        }
        w += x;
        h += y;
        //    overflow || intersect
        return ((w < x || w > X) &&
                (h < y || h > Y));
    }

    /**
     * Determines whether or not this <code>ImmutableRectangle</code> and the specified
     * <code>ImmutableRectangle</code> intersect. Two ImmutableRectangles intersect if
     * their intersection is nonempty.
     *
     * @param r the specified <code>ImmutableRectangle</code>
     * @return    <code>true</code> if the specified <code>ImmutableRectangle</code>
     *            and this <code>ImmutableRectangle</code> intersect;
     *            <code>false</code> otherwise.
     */
    public boolean intersects(ImmutableRectangle r) {
        int tw = this.width;
        int th = this.height;
        int rw = r.width;
        int rh = r.height;
        if (rw <= 0 || rh <= 0 || tw <= 0 || th <= 0) {
            return false;
        }
        int tx = this.x;
        int ty = this.y;
        int rx = r.x;
        int ry = r.y;
        rw += rx;
        rh += ry;
        tw += tx;
        th += ty;
        //      overflow || intersect
        return ((rw < rx || rw > tx) &&
                (rh < ry || rh > ty) &&
                (tw < tx || tw > rx) &&
                (th < ty || th > ry));
    }

    /**
     * Computes the intersection of this <code>ImmutableRectangle</code> with the
     * specified <code>ImmutableRectangle</code>. Returns a new <code>ImmutableRectangle</code>
     * that represents the intersection of the two ImmutableRectangles.
     * If the two ImmutableRectangles do not intersect, the result will be
     * an empty ImmutableRectangle.
     *
     * @param     r   the specified <code>ImmutableRectangle</code>
     * @return    the largest <code>ImmutableRectangle</code> contained in both the
     *            specified <code>ImmutableRectangle</code> and in
     *            this <code>ImmutableRectangle</code>; or if the ImmutableRectangles
     *            do not intersect, an empty ImmutableRectangle.
     */
    public ImmutableRectangle intersection(ImmutableRectangle r) {
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
        return new ImmutableRectangle(tx1, ty1, (int) tx2, (int) ty2);
    }

    /**
     * Computes the union of this <code>ImmutableRectangle</code> with the
     * specified <code>ImmutableRectangle</code>. Returns a new
     * <code>ImmutableRectangle</code> that
     * represents the union of the two ImmutableRectangles.
     * <p>
     * If either {@code ImmutableRectangle} has any dimension less than zero
     * the rules for <a href=#NonExistant>non-existant</a> ImmutableRectangles
     * apply.
     * If only one has a dimension less than zero, then the result
     * will be a copy of the other {@code ImmutableRectangle}.
     * If both have dimension less than zero, then the result will
     * have at least one dimension less than zero.
     * <p>
     * If the resulting {@code ImmutableRectangle} would have a dimension
     * too large to be expressed as an {@code int}, the result
     * will have a dimension of {@code Integer.MAX_VALUE} along
     * that dimension.
     * @param r the specified <code>ImmutableRectangle</code>
     * @return    the smallest <code>ImmutableRectangle</code> containing both
     *            the specified <code>ImmutableRectangle</code> and this
     *            <code>ImmutableRectangle</code>.
     */

    public boolean isEmpty() {
        return (width <= 0) || (height <= 0);
    }

    /**
     * Returns a <code>String</code> representing this
     * <code>ImmutableRectangle</code> and its values.
     * @return a <code>String</code> representing this
     *               <code>ImmutableRectangle</code> object's coordinate and size values.
     */
     public  String toString() {
        return getClass().getName() + "[x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]";
     }

}
