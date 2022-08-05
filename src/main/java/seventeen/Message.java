package seventeen;

import java.time.LocalDateTime;
import java.util.Objects;


//public record Message(String body, Long id, LocalDateTime dateTime) {
//    public static final int IDENTIFIER = 10;
//}
public final class Message {
    public static final int IDENTIFIER = 10;
    private final String body;
    private final Long id;
    private final LocalDateTime dateTime;

    public Message(String body, Long id, LocalDateTime dateTime) {
        this.body = body;
        this.id = id;
        this.dateTime = dateTime;
    }

    public String body() {
        return body;
    }

    public Long id() {
        return id;
    }

    public LocalDateTime dateTime() {
        return dateTime;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Message) obj;
        return Objects.equals(this.body, that.body) &&
                Objects.equals(this.id, that.id) &&
                Objects.equals(this.dateTime, that.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, id, dateTime);
    }

    @Override
    public String toString() {
        return "Message[" +
                "body=" + body + ", " +
                "id=" + id + ", " +
                "dateTime=" + dateTime + ']';
    }

}
