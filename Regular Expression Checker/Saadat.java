import java.util.regex.*;

class Saadat
{
  public static void main(String[] args)
  {
    String txt="Is saadat a dickhead?";

    String re1=".*?"; // Non-greedy match on filler
    String re2="(dickhead)"; // Variable Name 1

    Pattern p = Pattern.compile(re1+re2,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    Matcher m = p.matcher(txt);
    if (m.find())
    {
        String var1=m.group(1);
        System.out.print("("+var1.toString()+")"+"\n");
    }
  }
}
