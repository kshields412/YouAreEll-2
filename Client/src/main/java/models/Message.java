package models;

/* 
 * POJO for an Message object
 */
public class Message {
    private String message;
    private String fromid;
    private String toid;
    private String sequence;
    private String timestamp;

    public Message(String message, String fromid, String toid, String sequence, String timestamp){
        this.message = message;
        this.fromid = fromid;
        this.toid = toid;
        this.sequence = sequence;
        this.timestamp = timestamp;
    }

    private Message(){}
    //looks like this isnt used but required for object mapper

    public Message(String message, String fromid, String toid){
        this(message, fromid, toid, "-", null);
    }

    public Message(Message message){
        this(message.getMessage(), message.getfromid(), message.gettoid(), message.getSequence(), message.getTimestamp());
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    //    public Message (String message, String fromId, String toId) {
//
//    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getfromid() {
        return fromid;
    }

    public void setfromid(String fromid) {
        this.fromid = fromid;
    }

    public String gettoid() {
        return toid;
    }

    public void settoid(String toid) {
        this.toid = toid;
    }

}