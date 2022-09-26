package triangle;

public class Triangle {
    //declare variables area, height and length
    double area;
    int height;
    int length;

    public static void main(String[] args) {
        int x = 0;

        //create Triangle objects' array with length of 4
        Triangle [] t = new Triangle[4];

        //while x is bigger than 4
        while ( x < 4 ) {
            //assign triangle object to index x
            t[x] = new Triangle();

            //get variables height and length of x Triangle object and assign them values
            t[x].height = ( x + 1 ) * 2;
            t[x].length = x + 4;

            //set area of a Triangle object under index x
            t[x].setArea();

            //print the output in one line
            System.out.print("Triangle " + x + ", ");
            System.out.print("height = " + t[x].height + ", ");
            System.out.print("length = " + t[x].length + ", ");
            System.out.println("area = " + t[x].area);

            //increment x by one with each loop
            x += 1;
        }

    }

    //create a class that calculates the area of a triangle
    void setArea() {
        area = (height * length) / 2;
    }
}
