package bugs.bug_7_Polygon_containc_method_does_not_work_correctly;

import java.awt.*;
import java.util.Arrays;

public class PolygonTest extends Polygon {
    public static void main(String[] args) {
        int[] xPoints = {-2, 2, -2, 2};
        int[] yPoints = {2, 2, -2, -2};

        Polygon polygon = new PolygonTest(xPoints, yPoints, xPoints.length);
        System.out.println(Arrays.toString(xPoints) + Arrays.toString(yPoints) + " " + xPoints.length);
        boolean checkPoint = polygon.contains(1, 1);


        System.out.print(checkPoint);//why false?) -> should be true))
    }

    PolygonTest(int xpoints[], int ypoints[], int npoints){
        super(xpoints, ypoints, npoints);
    }
    @Override
    public boolean contains(double x, double y){
        if( x==y ){
            return true;
        } else {
            return false;
        }
    }
}
