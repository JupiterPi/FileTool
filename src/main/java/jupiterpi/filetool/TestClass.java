package jupiterpi.filetool;

import javax.swing.*;

public class TestClass
{
    private static void say (String text)
    {
        System.out.println (text);
    }
    public static void main (String[] args)
    {
        FileTool File = new FileTool ("c:\\Users\\jupit\\OneDrive\\Projekte (JAVA)\\FileTool\\target\\text.txt");
        say ("getFile() \n" + File.getFile());
        say("getFileForOutput \n" + File.getFileForOutput());
        say("getLine(2) \n" + File.getLine (2));
        File.setLine (2, "das ist die geaenderte Zeile");
        say("setLine(2, 'das ist die geaenderte Zeile') \ngetLine (2)" + File.getLine(2));
        File.writeToLine (2, " plus das anhaengsel");
        say("writeToLine (2, ' plus das anhaengsel') \ngetLine (2)" + File.getLine(2));
        File.saveFile();
        say("saveFile()");
        say("Jetzt kannst du dir die Datei mal im Editor anschauen. ");
    }
}