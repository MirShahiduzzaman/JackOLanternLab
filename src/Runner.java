public class Runner
{
    public static void main(String args[])
    {
        String[][] face = new String[6][10];

        JackOLantern pump = new JackOLantern(face);
        pump.fill("X");

        pump.edit(" ",0,0);
        pump.edit(" ",1,0);
        pump.edit(" ",3,0);
        pump.edit(" ",4,0);
        pump.edit(" ",5,0);

        pump.edit(" ",0,9);
        pump.edit(" ",1,9);
        pump.edit(" ",3,9);
        pump.edit(" ",4,9);
        pump.edit(" ",5,9);

        pump.edit(" ",1,2);
        pump.edit(" ",1,3);
        pump.edit(" ",1,4);
        pump.edit(" ",1,5);
        pump.edit(" ",1,6);
        pump.edit(" ",1,7);


        pump.edit(" ",3,2);
        pump.edit(" ",3,4);
        pump.edit(" ",3,5);
        pump.edit(" ",3,7);

        pump.edit(" ",4,2);
        pump.edit(" ",4,7);

        pump.edit("-",4,3);
        pump.edit("-",4,4);
        pump.edit("-",4,5);
        pump.edit("-",4,6);

        pump.edit("O",3,3);
        pump.edit("O",3,6);

        System.out.println(pump);
    }
}
