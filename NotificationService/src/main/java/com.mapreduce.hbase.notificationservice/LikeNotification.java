package com.mapreduce.hbase.notificationservice;

import com.mapreduce.hbase.notificationservice.Column;
import com.mapreduce.hbase.notificationservice.Notification;

public class LikeNotification extends Notification {

    NotificationType type = NotificationType.LIKE;


    public LikeNotification(String fromUser, String user,
                            ResourceType likesres, String likedurl)
    {
        this.columns.add(new Column("attributes","type",this.type.toString()));
        this.columns.add(new Column("attributes","from_user",fromUser));
        this.columns.add(new Column("attributes","for_user",user));
        this.columns.add(new Column("attributes","liked",likesres.toString()));
        this.columns.add(new Column("attributes","url",likedurl));

    }

    public String toString() {
        return this.columns.get(1).value + " Liked your "+
                this.columns.get(3).value ;
    }
}
