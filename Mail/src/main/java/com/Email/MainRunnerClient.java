package com.Email;

public class MainRunnerClient {

    static SMTPServer hipek = new SMTPServer();
    static GenericEmail gabi = new GenericEmail();
    static WelcomeEmail magda = new WelcomeEmail();
    static ConfirmEmail kamil = new ConfirmEmail();

    public static void main(String[] args) {
        hipek.addEmail(gabi);
        hipek.sendAllEmails();
    }
}
