
import java.util.Arrays;

public class MyList<H> {
    private int size=0;
    private static final int DEFAUFT_CAPACITY=10;
    private Object elements[];

    public MyList(){
        elements=new Object[DEFAUFT_CAPACITY];
    }
    public void ensureCapacity(){
        int newSize=elements.length*2;
        elements= Arrays.copyOf(elements, newSize);
    }
    public void add(H e){
        if(size==elements.length){
            ensureCapacity();
        }
        elements[size++]=e;
    }

    public H get(int i){
        if(i>=size|| i<0){
            throw new IndexOutOfBoundsException("Index:"+i+", Size "+i);
        }
        return (H) elements[i];
    }
    public static class MyListTest{
        public static void main(String[] args) {
            MyList<Integer> listInteger= new MyList<Integer>();
            listInteger.add(1);
            listInteger.add(2);
            listInteger.add(3);
            listInteger.add(3);
            listInteger.add(4);

            System.out.println("element 4:" +listInteger.get(4));
            System.out.println("element 1:"+listInteger.get(1));

            listInteger.get(6);
            System.out.println("element 6:" + listInteger.get(6));

            listInteger.get(-1);
            System.out.println("element -1:"+listInteger.get(-1));

        }
    }
}
