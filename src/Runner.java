/**Mir Shahiduzzaman*/

public class Runner
{
    public static void main(String args[])
    {
        String[][] face = new String[6][12];
        String[][] face2 = new String[8][12];

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

        /**Other Pumpkin*/
        //makes JackOLantern object filled with X's
        JackOLantern pump2 = new JackOLantern(face2);
        pump2.fill("X");

        //clears corners
        pump2.edit(" ",0,0);
        pump2.edit(" ",7,0);
        pump2.edit(" ",0,11);
        pump2.edit(" ",7,11);

        //creates forehead
        pump2.edit(" ",1,1);
        pump2.edit(" ",1,2);
        pump2.edit(" ",1,3);
        pump2.edit(" ",1,4);
        pump2.edit(" ",1,5);
        pump2.edit(" ",1,6);
        pump2.edit(" ",1,7);
        pump2.edit(" ",1,8);
        pump2.edit(" ",1,9);
        pump2.edit(" ",1,10);

        //makes space for eyebrows
        pump2.edit(" ",2,1);
        pump2.edit(" ",2,5);
        pump2.edit(" ",2,6);
        pump2.edit(" ",2,10);

        //makes spaces for eyes
        pump2.edit(" ",3,1);
        pump2.edit(" ",3,2);
        pump2.edit(" ",3,4);
        pump2.edit(" ",3,5);
        pump2.edit(" ",3,6);
        pump2.edit(" ",3,7);
        pump2.edit(" ",3,9);
        pump2.edit(" ",3,10);

        //Makes space for mouth
        pump2.edit(" ", 4,1);
        pump2.edit(" ", 4,10);
        pump2.edit(" ", 5,1);
        pump2.edit(" ", 5,10);

        //clears row index 6
        pump2.edit(" ", 6,1);
        pump2.edit(" ", 6,2);
        pump2.edit(" ", 6,3);
        pump2.edit(" ", 6,4);
        pump2.edit(" ", 6,5);
        pump2.edit(" ", 6,6);
        pump2.edit(" ", 6,7);
        pump2.edit(" ", 6,8);
        pump2.edit(" ", 6,9);
        pump2.edit(" ", 6,10);

        //mouth of pumpkin
        pump2.edit("-", 4, 3);
        pump2.edit("-", 4, 4);
        pump2.edit("-", 4, 5);
        pump2.edit("-", 4, 6);
        pump2.edit("-", 4, 7);
        pump2.edit("-", 4, 8);
        pump2.edit("|", 4, 2);
        pump2.edit("|", 4, 9);
        pump2.edit("-", 6, 3);
        pump2.edit("-", 6, 4);
        pump2.edit("-", 6, 5);
        pump2.edit("-", 6, 6);
        pump2.edit("-", 6, 7);
        pump2.edit("-", 6, 8);
        pump2.edit("|", 6, 2);
        pump2.edit("|", 6, 9);
        pump2.edit("|", 5, 2);
        pump2.edit(" ", 5, 3);
        pump2.edit(" ", 5, 4);
        pump2.edit(" ", 5, 5);
        pump2.edit(" ", 5, 6);
        pump2.edit(" ", 5, 7);
        pump2.edit(" ", 5, 8);
        pump2.edit("|", 5, 9);

        //pumpkin's eyebrows
        pump2.edit("-",2,2);
        pump2.edit("-",2,3);
        pump2.edit("-",2,4);
        pump2.edit("-",2,7);
        pump2.edit("-",2,8);
        pump2.edit("-",2,9);

        //eyes of pumpkin
        pump2.edit("O",3,3);
        pump2.edit("O",3,8);

        System.out.println(pump2);
    }
}
