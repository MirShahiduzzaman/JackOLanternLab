public class JackOLantern extends java.lang.Object
{
    private String[][] faceFeatures;

    public JackOLantern(java.lang.String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }

    public void edit(java.lang.String replace, int row, int column)
    {
        faceFeatures[row][column] = replace;
    }

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
