package br.com.learnspringemail.services;

import br.com.learnspringemail.inputs.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void send(Email email) {
        MimeMessagePreparator messagePreparator = mimeMessage -> {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage) {{
                setTo(email.getTo());
                setSubject(email.getSubject());
                setText(email.getBody(), email.isHthml());
            }};
        };

        mailSender.send(messagePreparator);
    }

}
