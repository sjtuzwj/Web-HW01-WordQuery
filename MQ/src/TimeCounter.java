public class TimeCounter {
    public static void main(String argv[]){
        MessageQueue mq= new MessageQueue(10,10);
        int now=0;
        Consumer[] c={new Consumer(),new Consumer(), new Consumer(),new Consumer()};
        Producer[] p={new Producer(),new Producer(), new Producer()};
        for(; now<10000; now++) {
            for (int i = 0; i < 3; i++)
                mq.enqueue(p[i].produce(now));
            for (int i = 0; i < 4; i++) {
                if (c[i].isLazy() && !mq.mq.isEmpty())
                    c[i].consume(mq.dequeue());
                c[i].update();
            }
            mq.clear(now);
            System.out.println(mq.Queuelen());
        }
    }
}
