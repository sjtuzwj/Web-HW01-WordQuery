public class Consumer {
    Message cur;
    Consumer()
    {
        this.cur=null;
    }
    void consume(Message message){
        this.cur=message;
    }
    void update(){
        if(this.cur!=null){
            this.cur.cost_time-=1;
            if(this.cur.cost_time==0)
                this.cur=null;
        }
    }
    boolean isLazy(){
        return this.cur==null;
    }
}
