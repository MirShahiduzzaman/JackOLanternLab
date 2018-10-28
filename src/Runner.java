/**Mir Shahiduzzaman*/

public class Runner
{
    public static void main(String args[])
    {
        String[][] face = new String[6][12];

        //makes JackOLantern object filled with X's
        JackOLantern pump = new JackOLantern(face);
        pump.fill("X");

        //makes left bolt
        pump.edit(" ",0,0);
        pump.edit(" ",1,0);
        pump.edit(" ",3,0);
        pump.edit(" ",4,0);
        pump.edit(" ",5,0);

        //makes right bolt
        pump.edit(" ",0,11);
        pump.edit(" ",1,11);
        pump.edit(" ",3,11);
        pump.edit(" ",4,11);
        pump.edit(" ",5,11);

        //creates forehead
        pump.edit(" ",1,2);
        pump.edit(" ",1,3);
        pump.edit(" ",1,4);
        pump.edit(" ",1,5);
        pump.edit(" ",1,6);
        pump.edit(" ",1,7);
        pump.edit(" ",1,8);
        pump.edit(" ",1,9);

        //makes spaces for eyes
        pump.edit(" ",3,2);
        pump.edit(" ",3,3);
        pump.edit(" ",3,5);
        pump.edit(" ",3,6);
        pump.edit(" ",3,8);
        pump.edit(" ",3,9);

        //makes space for mouth
        pump.edit(" ",4,2);
        pump.edit(" ",4,9);

        //mouth of pumpkin
        pump.edit("-",4,3);
        pump.edit("-",4,4);
        pump.edit("-",4,5);
        pump.edit("-",4,6);
        pump.edit("-",4,7);
        pump.edit("-",4,8);

        //eyes of pumpkin
        pump.edit("O",3,4);
        pump.edit("O",3,7);

        System.out.println(pump);
    }
}
