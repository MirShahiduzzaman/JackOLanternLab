/**Mir Shahiduzzaman*/

public class JackOLantern extends java.lang.Object
{
    private String[][] faceFeatures;

    /**
     * Constructor method to fill in private array faceFeatures with parameter faceFeatures
     * @param faceFeatures 2D array replacing the private 2D array faceFeatures
     */
    public JackOLantern(java.lang.String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }

    /**
     * replaces a chosen space with a character
     * @param replace the character that will replace the chosen space
     * @param row row to replace
     * @param column column to replace
     */
    public void edit(java.lang.String replace, int row, int column)
    {
        faceFeatures[row][column] = replace;
    }

    /**
     * fills in the private array faceFeatures with a string
     * @param str string that will fill in all spaces in faceFeatures
     */
    public void fill(java.lang.String str)
    {
        for(int i = 0;i<this.faceFeatures.length;i++)
        {
            for(int a = 0;a<this.faceFeatures[i].length;a++)
            {
                faceFeatures[i][a] = str;
            }
        }
    }

    /**
     * overrides the default toString() method to return a String concatenation of the faceFeatures array
     * @return a string with the concatenation of the private faceFeatures array
     */
    @Override
    public String toString()
    {
        String faceShape = "";

        for(int i = 0;i<this.faceFeatures.length;i++)
        {
            for(int a = 0;a<this.faceFeatures[i].length;a++)
            {
                faceShape += this.faceFeatures[i][a];
            }
            faceShape += "\n";
        }
        return(faceShape);
    }
}
