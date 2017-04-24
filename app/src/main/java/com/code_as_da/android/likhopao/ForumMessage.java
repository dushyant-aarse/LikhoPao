package com.code_as_da.android.likhopao;

/**
 * Created by Dushyant Arse on 23-04-2017.
 */

public class ForumMessage {

    private String year;
    private String subject;
    private String text;
    private String name;
    private String photoUrl;
    private String documentUrl;

    public ForumMessage() {}

    public ForumMessage(String year, String subject, String text, String name, String photoUrl, String documentUrl) {
        this.year = year;
        this.subject = subject;
        this.name = name;
        this.text = text;
        this.photoUrl = photoUrl;
        this.documentUrl = documentUrl;
    }

    public String getYear() { return year; }

    public void setYear(String year) { this.year = year; }

    public String getSubject() { return subject; }

    public void setSubject(String subject) { this.subject = subject; }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getDocumentUrl() { return documentUrl; }

    public void setDocumentUrl(String documentUrl) { this.documentUrl = documentUrl; }
}
