class Solution {
    public boolean canReachCorner(int X, int Y, int[][] circles) {
         boolean allowed = true;
        if (circles.length == 1 && (circles[0][0] - circles[0][2]) <= 0 && (circles[0][1] - circles[0][2]) <= 0) {
            return false;
        }
        boolean side = false;
        boolean top = false;
        boolean intersect = false;
        for (int i = 0; i < circles.length; i++) {
            intersect = false;
            if (!side && (circles[i][0] + circles[i][2]) >= X) {
                side = true;
            }
            if (!top && (circles[i][1] + circles[i][2]) >= Y) {
                top = true;
            }
            for (int j = 0; j < circles.length; j++) { // Iterate to check if the circle intersects any other circle or not
                double d = Math.sqrt(Math.pow(circles[i][0] - circles[j][0], 2) + Math.pow(circles[i][1] - circles[j][1], 2));
                if (d <= circles[i][2] + circles[j][2]) {
                    intersect = true;
                    break;
                }
            }
        }
        return !(side && top && intersect);
    }
}
