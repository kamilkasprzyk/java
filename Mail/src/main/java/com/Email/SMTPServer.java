package com.Email;

import java.util.ArrayList;
import java.util.List;

public class SMTPServer {
    private List<GenericEmail> genericEmails = new ArrayList<>();
    private List<WelcomeEmail> welcomeEmails = new ArrayList<>();
    private List<ConfirmEmail> confirmEmails = new ArrayList<>();

    public void addEmail(GenericEmail genericEmail) {
        this.genericEmails.add(genericEmail);
    }

    public void addEmail(WelcomeEmail welcomeEmail) {
        this.welcomeEmails.add(welcomeEmail);
    }

    public void addEmail(ConfirmEmail confirmEmail) {
        this.confirmEmails.add(confirmEmail);
    }

    public void removeEmail(GenericEmail genericEmail) {
        this.genericEmails.remove(genericEmail);
    }

    public void removeEmail(WelcomeEmail welcomeEmail) {
        this.welcomeEmails.remove(welcomeEmail);
    }

    public void removeEmail(ConfirmEmail confirmEmail) {
        this.confirmEmails.remove(confirmEmail);
    }

    public void sendAllEmails() {
        genericEmails.forEach(email -> email.sendEmail());
        confirmEmails.forEach(email -> email.sendEmail());
        welcomeEmails.forEach(email -> email.sendEmail());
    }
}
