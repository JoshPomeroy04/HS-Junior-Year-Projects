public class Mix2{
    int counter =0;
    public static void main(String[] args){
        int count = 0;
        Mix2 [] m2a = new Mix2[20];
        int x = 0;

        while(x < 20){
            m2a[x] = new Mix2();
            m2a[x].counter = m2a[x].counter +1;
            count = count +1;
            count = count + m2a[x].maybeNew(x);
            x = x + 1;
        }
        System.out.println(count + " " + m2a[1].counter);
    }

    public int maybeNew(int index){
        if(index < 5){
            Mix2 m2 = new Mix2();
            m2.counter = m2.counter + 1;
            return 1;
        }
        return 0;
    }
}

