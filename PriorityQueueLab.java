// import statements
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PriorityQueueLab{

    public static void main(String[] args){
        Scanner s = null;
        try{
            s = new Scanner(new File("./RandIntegers.txt"));
        }
        catch(FileNotFoundException e){
            System.out.println("No file goofy");
        }

        PriorityQueue<Integer> q = new PriorityQueue<>();

        while(s.hasNextInt()){
            q.add(s.nextInt());
        }

        int size = q.size();
        for(int i=0; i<size; i++){
            System.out.println(q.remove());
        }
    }






}

