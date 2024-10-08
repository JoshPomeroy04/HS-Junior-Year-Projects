public class Mix3{
    int counter =0;
    public static void main(String[] args){
        int count = 0;
        Mix3 [] m3a = new Mix3[20];
        int x = 0;

        while(x < 7){
            m3a[x] = new Mix3();
            m3a[x].counter = m3a[x].counter +1;
            count = count +1;
            count = count + m3a[x].maybeNew(x);
            x = x + 1;
        }
        System.out.println(count + " " + m3a[1].counter);
    }

    public int maybeNew(int index){
        if(index < 7){
            Mix3 m3 = new Mix3();
            m3.counter = m3.counter + 1;
            return 1;
        }
        return 0;
    }
}

