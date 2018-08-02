package de.hollermayer.thorntail.mail;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("mail")
@Stateless
public class MailEndpoint {

    @Resource(name = "java:thorntail/mail/whatever")
    private Session session;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response sendMail(Mail mail) throws MessagingException{

        Message message = new MimeMessage(session);
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mail.getRecipient()));
        message.setSubject(mail.getSubject());
        message.setText(mail.getText());

        Transport.send(message);

        return Response.ok().build();
    }
}
