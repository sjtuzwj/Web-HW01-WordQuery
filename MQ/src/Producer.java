public class Producer {
    Producer(){}
    Message produce(int now){
        return new Message(2,now);
    }
}
