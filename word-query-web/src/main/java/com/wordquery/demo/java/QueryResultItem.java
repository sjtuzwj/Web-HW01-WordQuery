package com.wordquery.demo.java;


public class QueryResultItem {
    public QueryResultItem(int line,String pre,String cur,String suc){
        this.line=line;
        this.Pre=pre;
        this.Cur=cur;
        this.Suc=suc;
    }
    public int line;
    public String Pre;
    public String Cur;
    public String Suc;
};
