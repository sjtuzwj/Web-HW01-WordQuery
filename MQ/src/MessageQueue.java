import java.util.*;

public class MessageQueue {
    List<Message> mq;
    int threshold;
    int timets;
    MessageQueue(int ts, int tts) {
        this.threshold = ts;
        this.timets = tts;
        this.mq = new LinkedList<Message>();
    }
    int Queuelen(){
        return this.mq.size();
    }
    int Earliest(){
        return mq.get(0).in_time;
    }
    private boolean isQueue(){
        return mq.size()<this.threshold;
    }
    void enqueue(Message ms){
        this.mq.add(ms);
    }
    Message dequeue(){
        if(this.isQueue())
            return this.mq.remove(0);
        else return this.mq.remove(this.Queuelen()-1);
    }
    void clear(int now){
        if(!this.mq.isEmpty()&&now-this.Earliest()>timets)
        {
            this.mq.remove(0);
            this.clear(now);
        }
    }
}
