# Sending mails using io.thorntail.mail

This example is a minimal implementation for sending e-mail messages with Thorntail 2.0.0.Final and its [mail fraction](http://docs.wildfly-swarm.io/2.0.0.Final/#_mail).


To run this application you must have a SMTP server (e.g. [FakeSMTP](https://github.com/Nilhcem/FakeSMTP)) running at port 25 on localhost.

Build and deploy the artifact with the following commands:

```
mvn package && java -jar ./target/mail-thorntail.jar
```

And trigger e-mail sending with a POST request to http://127.0.0.1:8080/api/mail

```json
{
	"recipient": "thorntail@example.com",
	"subject": "Lorem ipsum",
	"text": "dolor sit amet"
}
```