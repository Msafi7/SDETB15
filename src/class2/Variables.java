package class2;

public class Variables {
    /*
    below box is reserving a box in computer's memory,
    we are calling it box 1, if we need the information tha we are storing inside this box, we can
    simply say to the computer.
    int=> type of data
    Box1=> is the name of the box

     */
    public static void main(String[] args) {
        int box1=10;
        //if we are printing somethig from a box we don't need " ". it requires when we are directly printing
        System.out.println(box1);
        byte box2=127;// accept number-128 to 127.
        System.out.println(box1+box2);
        byte box3=-128;
        System.out.println(box3-box2);
        short box4=-32768; // this shall not be more -32768 or the sytem will not accept.
        short box5=32767;// shall not be more 32767 or the sytem will not accept.
        int box6=123456484;
        long box7=15176759879l;








    }
}
