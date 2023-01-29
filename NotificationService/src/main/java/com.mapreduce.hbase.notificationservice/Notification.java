package com.mapreduce.hbase.notificationservice;

import java.util.ArrayList;
import java.util.List;

public class Notification {

    public enum NotificationType
    {
        LIKE,
        COMMENT,
        PERSONAL_MESSAGE,
        FRIEND_REQUEST

    }

    public enum ResourceType
    {
        PHOTO,
        LINK

    }

    public NotificationType type;
    public List<Column> columns= new ArrayList<>();

    public NotificationType getType() {
        return type;
    }

    public List<Column> getColumns() {
        return columns;
    }





}
