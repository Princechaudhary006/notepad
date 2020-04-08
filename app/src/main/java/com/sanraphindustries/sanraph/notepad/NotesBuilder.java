package com.sanraphindustries.sanraph.notepad;

public class NotesBuilder {
    private String title;
    String content;
    public NotesBuilder(){}

    public NotesBuilder(String title, String content){
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

}
