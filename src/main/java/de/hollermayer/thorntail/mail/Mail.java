package de.hollermayer.thorntail.mail;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Mail {

    private String recipient;
    private String subject;
    private String text;

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
