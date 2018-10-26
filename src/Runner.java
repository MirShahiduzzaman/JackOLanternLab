public class Runner
{
    public static void main(String args[])
    {
        String[][] face = new String[5][8];

        JackOLantern pump = new JackOLantern(face);
        pump.fill("X");

        pump.edit("",0,0);
        pump.edit("",1,0);
        pump.edit("",3,0);
        pump.edit("",4,0);
        pump.edit("",0,7);
        pump.edit("",1,7);
        pump.edit("",3,7);
        pump.edit("",4,7);

        System.out.println(pump);
    }
}
