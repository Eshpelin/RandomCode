// Java regular expression program that extracts the selected elements from the entered string:

import java.util.regex.*;

class Main
{
  public static void main(String[] args)
  {
    String txt="Yes Ha Y Ye Ya Yuh Hmm ok Okay definitely start go";

    String re1="(Yes)"; // Word 1
    String re2=".*?"; // Non-greedy match on filler
    String re3="(Ya)"; // Word 2
    String re4=".*?"; // Non-greedy match on filler
    String re5="(ok)"; // Word 3
    String re6=".*?"; // Non-greedy match on filler
    String re7="(start)"; // Word 4
    String re8=".*?"; // Non-greedy match on filler
    String re9="(go)"; // Word 5

    Pattern p = Pattern.compile(re1+re2+re3+re4+re5+re6+re7+re8+re9,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    Matcher m = p.matcher(txt);
    if (m.find())
    {
        String word1=m.group(1);
        String word2=m.group(2);
        String word3=m.group(3);
        String word4=m.group(4);
        String word5=m.group(5);
        System.out.print("("+word1.toString()+")"+"("+word2.toString()+")"+"("+word3.toString()+")"+"("+word4.toString()+")"+"("+word5.toString()+")"+"\n");
    }
  }
}