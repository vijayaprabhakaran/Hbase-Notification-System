package com.mapreduce.hbase.notificationservice;

public class CommentNotification extends Notification {

    NotificationType type = NotificationType.COMMENT;


    public CommentNotification(String fromUser,String user,String commentedText,
                               ResourceType commentedOn,String commentedOnURL)
    {
        this.columns.add(new Column("attributes","type",this.type.toString()));
        this.columns.add(new Column("attributes","from_user",fromUser));
        this.columns.add(new Column("attributes","for_user",user));
        this.columns.add(new Column("attributes","commentedOn",commentedOn.toString()));
        this.columns.add(new Column("attributes","text",commentedText));
        this.columns.add(new Column("attributes","url",commentedOnURL));

    }

    public String toString() {
        return this.columns.get(1).value + " commented on your "+
                this.columns.get(3).value + " ' " +
                this.columns.get(4).value+ " ' ";
    }
}
