import java.util.Scanner;

public class Application implements IntSet{
    public static void main(String[] args)
    {

            IntSet set1= new ArrayBasedSet();
            Scanner scanner =new Scanner(String.valueOf(set1.add(12)));
            set1.add(33);
            set1.add(23);
            set1.add(14);
            set1.add(55);
            set1.add(1);
            set1.add(2);
            set1.add(23);
            set1.add(18);
            set1.add(33);
            set1.add(33);
            set1.add(33);
            set1.add(22);
            set1.remove(22);
            set1.add(1234);
set1.intersection(1);
        System.out.println(set1);


    }


    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean add(int newEntry) {
        return true;
    }

    @Override
    public boolean remove(int anEntry) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(int anEntry) {
        return false;
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public IntSet union(IntSet arg) {
        return null;
    }

    @Override
    public IntSet intersection(int arg) {
        return null;
    }

    @Override
    public IntSet intersection(int arg, int anEntry, int newEntry) {
        return null;
    }

    @Override
    public IntSet difference(IntSet arg) {
        return null;
    }
}

