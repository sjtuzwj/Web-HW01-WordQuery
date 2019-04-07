package com.wordquery.demo.java;

import java.util.ArrayList;
import java.util.Scanner;

public class WordQuery {
    private  static ArrayList<ArrayList<ArrayList<String>>> global;
    public static String interact(String input)
    /**
     * 本函数为交互部分，根据用户输入的单词输出单词在文章中的行号、前置后置单词、与合集中出现数目。
     */
    {
        int time=0;
        String res="";
        for (ArrayList<ArrayList<String>> article : global) {
            for(int i=0;i<article.size();i++)//line
            {
                for (int j = 0; j<article.get(i).size(); j++)//word
                {
                    if (input.equals(article.get(i).get(j)))
                    {
                        res +="\nLine ";
                        res +=i;
                        if (j!=0) {
                            res+="\nPre ";
                            res+=article.get(i).get(j-1);
                        }
                        res+="\nCur ";
                        res+=article.get(i).get(j);
                        if (j+1<article.get(i).size())
                        {
                            res+="\nSuc ";
                            res+=article.get(i).get(j+1);
                        }
                        time++;
                    }
                }
            }
        }
        res+="\nTime ";
        res+=String.valueOf(time);
        return res;
    }

    public WordQuery(String filename)
    {
        global=ParseArticle(filename);
    }


    public static ArrayList<ArrayList<ArrayList<String>>> ParseArticle(String filename)
    /**
     * 本函数为进行了对文件的解析并返回解析结果
     *
     * @param  filename String 待解析的文件
     */
    {
        ArrayList<ArrayList<ArrayList<String>>> global = new ArrayList<>();
        Resolver.readFromText(global, filename);
        return global;
    }
}
