import java.util.ArrayList;
import java.util.Scanner;
public class EP1 {
   public static void input(ArrayList<ArrayList<ArrayList<String>>> global,String input)
   /**
    * 本函数为输入部分，根据用户输入的单词输出单词在文章中的行号、前置后置单词、与合集中出现数目。
    */
   {
        int time=0;
        for (ArrayList<ArrayList<String>> article : global) {
            for(int i=0;i<article.size();i++)//line
            {
                for (int j = 0; j<article.get(i).size(); j++)//word
                {
                    if (input.equals(article.get(i).get(j)))
                    {
                        System.out.print("Line ");
                        System.out.println(i);
                        if (j!=0) {
                            System.out.print("Pre ");
                            System.out.println(article.get(i).get(j-1));
                        }
                        System.out.print("Cur ");
                        System.out.println(article.get(i).get(j));
                        if (j+1<article.get(i).size())
                        {
                            System.out.print("Suc ");
                            System.out.println(article.get(i).get(j+1));
                        }
                        time++;
                    }
                }
            }
        }
        System.out.print("Time ");
        System.out.println(time);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String filename =in.next();
        ArrayList<ArrayList<ArrayList<String>>> global=ParseArticle(filename);
        String input;
        Scanner in = new Scanner(System.in);
        while (true)
        {
            input = in.next();
            input(global,input);
        }
    }


    public static ArrayList<ArrayList<ArrayList<String>>> ParseArticle(String filename)
    /**
     * 本函数为进行了对文件的解析并返回解析结果
     *
     * @param  filename String 待解析的文件
     */
    {
        ArrayList<ArrayList<ArrayList<String>>> global = new ArrayList<ArrayList<ArrayList<String>>>();
        Resolver.readFromText(global, filename);
        return global;
    }
}
