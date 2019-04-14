package com.wordquery.demo.java;

import java.util.ArrayList;
import java.util.Scanner;

public class WordQuery {
    private static ArrayList<ArrayList<ArrayList<String>>> global;
    public static QueryResult interact(String input)
    /**
     * 本函数为交互部分，根据用户输入的单词输出单词在文章中的行号、前置后置单词、与合集中出现数目。
     * 重构后使用对象保存便于序列化
     */
    {
        int time=0;
        QueryResult tmp=new QueryResult(input);
        String pre="",suc="";
        for (ArrayList<ArrayList<String>> article : global) {
            for(int i=0;i<article.size();i++)//line
            {
                for (int j = 0; j<article.get(i).size(); j++)//word
                {
                    if (input.equals(article.get(i).get(j)))
                    {

                        if (j!=0) {
                            pre=article.get(i).get(j-1);
                        }
                        else pre="";
                        if (j+1<article.get(i).size())
                        {
                            suc=article.get(i).get(j+1);
                        }
                        else suc="";
                        time++;
                        tmp.result.add(new QueryResultItem(i,pre,input,suc)) ;
                    }
                }
            }
        }
        tmp.time=time;
        return tmp;
    }

    public WordQuery(String filename)
    {
        global=ParseArticle(filename);
    }


    public static ArrayList<ArrayList<ArrayList<String>>> ParseArticle(String filename)
    /**
     * 本函数进行了对文件的解析并返回解析结果
     *
     * @param  filename String 待解析的文件
     */
    {
        ArrayList<ArrayList<ArrayList<String>>> global = new ArrayList<>();
        Resolver.readFromText(global, filename);
        return global;
    }
}
