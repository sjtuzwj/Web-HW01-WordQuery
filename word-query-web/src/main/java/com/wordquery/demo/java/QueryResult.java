package com.wordquery.demo.java;


import java.util.ArrayList;

public class QueryResult {
    public QueryResult(String word){
        this.word=word;
        this.result=new ArrayList<QueryResultItem>();
    }
    public String word;
    public ArrayList<QueryResultItem> result;
    public int time;
}
