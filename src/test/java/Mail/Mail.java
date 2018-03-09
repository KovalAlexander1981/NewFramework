package Mail;

/**
 */
public class Mail {
    String filedTo;
    String mailSubject;
    String textMessage;

    public Mail(String filedTo, String mailSubject, String textMessage) {
        this.filedTo = filedTo;
        this.mailSubject = mailSubject;
        this.textMessage = textMessage;
    }

    public String getFiledTo() {
        return filedTo;
    }

    public void setFiledTo(String filedTo) {
        this.filedTo = filedTo;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mail mail = (Mail) o;

        if (filedTo != null ? !filedTo.equals(mail.filedTo) : mail.filedTo != null) return false;
        if (mailSubject != null ? !mailSubject.equals(mail.mailSubject) : mail.mailSubject != null) return false;
        return textMessage != null ? textMessage.equals(mail.textMessage) : mail.textMessage == null;

    }

    @Override
    public int hashCode() {
        int result = filedTo != null ? filedTo.hashCode() : 0;
        result = 31 * result + (mailSubject != null ? mailSubject.hashCode() : 0);
        result = 31 * result + (textMessage != null ? textMessage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "filedTo='" + filedTo + '\'' +
                ", mailSubject='" + mailSubject + '\'' +
                ", textMessage='" + textMessage + '\'' +
                '}';
    }


}
