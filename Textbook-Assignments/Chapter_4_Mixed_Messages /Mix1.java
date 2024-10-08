public class Mix1{
    int counter =0;
    public static void main(String[] args){
        int count = 0;
        Mix1 [] m1a = new Mix1[20];
        int x = 0;

        while(x < 9){
            m1a[x] = new Mix1();
            m1a[x].counter = m1a[x].counter +1;
            count = count +1;
            count = count + m1a[x].maybeNew(x);
            x = x + 1;
        }
        System.out.println(count + " " + m1a[1].counter);
    }

    public int maybeNew(int index){
        if(index < 5){
            Mix1 m1 = new Mix1();
            m1.counter = m1.counter + 1;
            return 1;
        }
        return 0;
    }
}
