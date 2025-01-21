import java.util.*;

class Message {

    private String sender;
    private String content;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public String toString() {
        return this.sender + ": " + this.content;
    }

    // created using the "insert code" feature of NetBeans
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Message other = (Message) obj;
        if (!Objects.equals(this.sender, other.sender)) {
            return false;
        }
        if (!Objects.equals(this.content, other.content)) {
            return false;
        }
        return true;
    }

}

class MessagingService
{
    private ArrayList<Message> value;
    public MessagingService()
    {
        this.value = new ArrayList<>();
    }
    public void add(Message message)
    {
        if(message.getContent().length() <= 280)
        {
            this.value.add(message); 
        }
    }
    public ArrayList<Message> getMessages()
    {
        return value; 
    }
    public static void main(String[] args) {
        Message mess = new Message("John","Marathonner");
        MessagingService mess_value = new MessagingService(); 
        mess_value.add(mess);
        System.out.println(mess_value.getMessages()); 
    }
}
