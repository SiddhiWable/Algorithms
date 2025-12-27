package recursion;

public class TowersOfHanoiPuzzle {

    public void towerOfHanoi(int n, char fromTower, char toTower, char auxTower){
        //if only one disks move the Disc and return
        if(n==1){
            System.out.println("Move disk 1 from tower "+ fromTower+ " to tower "+ toTower);
            return;
        }
        // Move disks n-1 from A to B using C as auxiliary
        towerOfHanoi(n-1,fromTower,auxTower,toTower);
        // Move remaining disks from A to C
        System.out.println("Move disk "+(n)+" from tower "+ fromTower+ " to tower "+ toTower);
        // Move n-1 disk from B to C using A as auxiliary
        towerOfHanoi(n-1,auxTower,toTower,fromTower);
    }

    public static void main(String args[]){
        TowersOfHanoiPuzzle obj = new TowersOfHanoiPuzzle();
        obj.towerOfHanoi(3,'A','B','C');
    }
}

//OUTPUT
//
//        Move disk 1 from tower A to tower B
//        Move disk 2 from tower A to tower C
//        Move disk 1 from tower B to tower C
//        Move disk 3 from tower A to tower B
//        Move disk 1 from tower C to tower A
//        Move disk 2 from tower C to tower B
//        Move disk 1 from tower A to tower B
//
