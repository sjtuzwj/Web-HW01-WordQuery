package com.wordquery.demo.java;

public class Judger {
    public static boolean isNum(String word)
    /**
     * 本函数将判断单词是否为数字
     *
     * @param  word String 待处理的未处理单词
     * @return boolean 单词是否为数字
     */
    {
        int size = word.length();
        for (int i = 0; i < size; i++)
        {
            if (!Character.isDigit(word.charAt(i)))return false;
        }
        return true;
    }

    public static boolean isNew(String word)
    /**
     * 本函数将判断此行是否为年份，从而判断是否出现新文章
     *
     * @param  word String 待处理的未处理单词
     * @return boolean 是否为新文章
     */
    {
        if (!isNum(word))return false;
        if (word.length()==4)return true;
        else return false;
    }
}
