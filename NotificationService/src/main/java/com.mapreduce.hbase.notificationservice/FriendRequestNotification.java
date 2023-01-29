package com.mapreduce.hbase.notificationservice;

import com.mapreduce.hbase.notificationservice.Column;
import com.mapreduce.hbase.notificationservice.Notification;

public class FriendRequestNotification extends Notification {

    NotificationType type = NotificationType.FRIEND_REQUEST;


    public FriendRequestNotification(String fromUser, String user)
    {
        this.columns.add(new Column("attributes","type",this.type.toString()));
        this.columns.add(new Column("attributes","from_user",fromUser));
        this.columns.add(new Column("attributes","for_user",user));

    }

    public String toString() {
        return "You have a friend reqeust from " + this.columns.get(1).value ;
    }
}
