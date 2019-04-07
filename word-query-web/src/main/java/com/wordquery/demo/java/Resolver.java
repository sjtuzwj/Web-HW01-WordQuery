package com.wordquery.demo.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Resolver {

    public static String resolveWord(String word)
    /**
     * 本函数将单词解析为删除单词末尾的非数字字母字符的单词
     *
     * @param  word String 待处理的未处理单词
     * @return String 解析后的单词
     */
    {
        int size = word.length();
        int i = size - 1;
        for (; i >0; i--)
        {
            if (Character.isLetterOrDigit(word.charAt(i))) return word.substring(0,i+1);
            else continue;
        }
        return word.substring(0, i+1);
    }

    public static void readFromText(ArrayList<ArrayList<ArrayList<String>>> global, String filename)
    /**
     * 本函数将从文件中读取每一个单词/行/文章，以三维数组形式存储
     *
     * @param  global ArrayList<ArrayList<ArrayList<String>>> 存储结果的三维数组
     * @param filename String 待读取的文件名
     */
    {
        String line;
        ArrayList<ArrayList<String>> cur=new ArrayList<>();
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader bf = new BufferedReader(fr);
            while ((line = bf.readLine()) != null) {
                if (!resolveLine(cur,line))
                {
                    global.add(cur);
                    cur.clear();
                }
            }
            global.add(cur);
            bf.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean resolveLine(ArrayList<ArrayList<String>> lines, String line)
    /**
     * 本函数将行String解析为单词String列表，插入原存储的二维数组中，在遇到新文章时将返回false
     *
     * @param  lines ArrayList<ArrayList<String>> 存储结果的二维数组
     * @param line String 待解析的行
     * @return boolean true:无新文章
     */
    {
        //泛型实例化类型自动推断
        ArrayList<String> newline= new ArrayList<>();
        String[] words= line.split("\\s+");
        for(String tmp : words)
        {
            tmp=resolveWord(tmp);
            newline.add(tmp);//resolve into slices
            if (newline.size() == 1 && Judger.isNew( newline.get(0)) && !lines.isEmpty())
                return false;//restart
        }
        lines.add(newline);
        return true;
    }

}
