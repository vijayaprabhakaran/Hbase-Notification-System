package com.mapreduce.hbase.notificationservice;

import com.mapreduce.hbase.notificationservice.Column;
import com.mapreduce.hbase.notificationservice.Notification;

public class PMNotification extends Notification {

    NotificationType type = NotificationType.PERSONAL_MESSAGE;


    public PMNotification(String fromUser, String user, String prMessage )
    {
        this.columns.add(new Column("attributes","type",this.type.toString()));
        this.columns.add(new Column("attributes","from_user",fromUser));
        this.columns.add(new Column("attributes","for_user",user));
        this.columns.add(new Column("attributes","text",prMessage));

    }

    public String toString() {
        return " You have a private message from " + this.columns.get(1).value + " ' "+
                this.columns.get(3) + " '";
    }
}
