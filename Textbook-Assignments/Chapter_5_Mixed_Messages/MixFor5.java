import java.io.*;

public class MixFor5{
    public static void main(String[] args){
        MixFor5A can1 = new MixFor5A();
        MixFor5B can2 = new MixFor5B();
        MixFor5C can3 = new MixFor5C();
        MixFor5D can4 = new MixFor5D();
        MixFor5E can5 = new MixFor5E();
        MixFor5F can6 = new MixFor5F();
        CliReader reader = new CliReader();
        String pair1, pair2, pair3, pair4, pair5, pair6;
        String[] outputs = {"A 45 6", "B 36 6", "C 54 6", "D 60 10", "E 18 6", "F 6 14", "G 12 14"};
        pair1 = can1.run1();
        pair2 = can2.run2();
        pair3 = can3.run3();
        pair4 = can4.run4();
        pair5 = can5.run5();
        pair6 = can6.run6();
        String[] answers = {pair1, pair2, pair3, pair4, pair5, pair6};
        for(String thing : outputs){
            String checkout = thing.substring(2);
            String printout = thing.substring(0, 1);
            for(String option : answers){
                //System.out.println(option);
                String checkans = option.substring(2);
                String printans = option.substring(0, 1);
                //System.out.println("1 " + checkout);
                //System.out.println("2 " + checkans);
                if(checkans.equals(checkout)){
                    System.out.println("Candidate " + printans + " matched with output " + printout);
                }
            }
        }
        String ask = reader.input("Would you like to show the output?");
        if(ask.equals("Yes")){
            System.out.println("Candidate " + pair1);
            System.out.println("Candidate " + pair2);
            System.out.println("Candidate " + pair3);
            System.out.println("Candidate " + pair4);
            System.out.println("Candidate " + pair5);
            System.out.println("Candidate " + pair6);
            System.out.println("End of program");
        }
        if(ask.equals("No")){
            System.out.println("End of program");
        }

    }
}

class CliReader{
    public String input(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in)
            );
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        }
        catch (IOException e){
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}
class MixFor5A{
    public String run1(){
        int x = 0;
        int y = 30;
        for(int outer = 0; outer < 3; outer++){
            for(int inner = 4; inner > 1; inner--){
                x = x + 3;
                y = y - 2;
                if(x == 6){
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        return("A " + x + " " + y);
    }
}
class MixFor5B{
    public String run2(){
        int x = 0;
        int y = 30;
        for(int outer = 0; outer < 3; outer++){
            for(int inner = 4; inner > 1; inner--){
                x = x + 6;
                y = y - 2;
                if(x == 6){
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        return("B " + x + " " + y);
    }
}
class MixFor5C{
    public String run3(){
        int x = 0;
        int y = 30;
        for(int outer = 0; outer < 3; outer++){
            for(int inner = 4; inner > 1; inner--){
                x = x + 2;
                y = y - 2;
                if(x == 6){
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        return("C " + x + " " + y);
    }
}
class MixFor5D{
    public String run4(){
        int x = 0;
        int y = 30;
        for(int outer = 0; outer < 3; outer++){
            for(int inner = 4; inner > 1; inner--){
                x++;
                y = y - 2;
                if(x == 6){
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        return("D " + x + " " + y);
    }
}
class MixFor5E{
    public String run5(){
        int x = 0;
        int y = 30;
        for(int outer = 0; outer < 3; outer++){
            for(int inner = 4; inner > 1; inner--){
                x--;
                y = y - 2;
                if(x == 6){
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        return("E " + x + " " + y);
    }
}
class MixFor5F{
    public String run6(){
        int x = 0;
        int y = 30;
        for(int outer = 0; outer < 3; outer++){
            for(int inner = 4; inner > 1; inner--){
                x = x + 0;
                y = y - 2;
                if(x == 6){
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        return("F " + x + " " + y);
    }
}


