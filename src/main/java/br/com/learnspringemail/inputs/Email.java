package br.com.learnspringemail.inputs;

public class Email {
	private String to;
	private String subject;
	private String body;
	private boolean isHthml;

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public boolean isHthml() {
		return isHthml;
	}

	public void setHthml(boolean hthml) {
		isHthml = hthml;
	}
}