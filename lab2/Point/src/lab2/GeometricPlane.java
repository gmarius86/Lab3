package lab2;

public class GeometricPlane
{
	
	//members
	public Point[] points;
	
	//public functions
	public Point getCenter()
	{
		if (points == null)	return null;
		if (points.length == 0) return null;
		return points[0];
		Point p = new Point(0,0);
		for (int i=0;i<points.length;i++)
			{
				p.setX(points[i].getX() + p.getX());
				p.setY(points[i].getY() + p.getY());
			}
		p.setX(p.getX()/points.length);
		p.setY(p.getY()/points.length);
		return p;
	}
}
