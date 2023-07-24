package units;
public class Coordinates {
    int X,Y;
    
    public Coordinates(int X, int Y) { 
        this.X=X; 
        this.Y=Y; 
    }

    public int[] getCoordinates() {
        return new int[]{X, Y};
    }

    @Override 
    public String toString() {
        return "x: "+X+" y: "+Y;
    }

    public static double rastoynie(int x1, int x2, int y1, int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

    public  int[] coordStep(Coordinates coordP) {

        int[] coordStep = {X,Y};
        
        if(coordP.X == this.X){
            if (coordP.Y > this.Y) coordStep[1] += 1;
            else coordStep[1] -= 1;
        }
        else {
            if (coordP.X > this.X) coordStep[0] += 1;
            else coordStep[0] -= 1;
        }

        return coordStep;
    }
}
