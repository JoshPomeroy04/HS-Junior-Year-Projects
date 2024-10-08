class TestArrays{
    public static void main(String[] args){
        int y = 0;
        int ref;
        int [] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        String [] islands = new String[4];
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";
        String [] size = new String[4];
        size[0] = "20.5 sq mi";
        size[1] = "7056 sq mi";
        size[2] = "908 sq mi";
        size[3] = "400.2 sq mi";

        while (y < 4){
            ref = index[y];
            System.out.print("island = ");
            System.out.print(islands[ref]);
            System.out.print(",");
            System.out.print(" size = ");
            System.out.println(size[ref]);
            y = y + 1;
        }
    }
}


