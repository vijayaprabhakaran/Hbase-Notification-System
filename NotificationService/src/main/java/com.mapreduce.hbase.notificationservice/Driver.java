package com.mapreduce.hbase.notificationservice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Driver {
    public static void main(String[] args) throws IOException,Exception {

        Map<String,String> pm = new HashMap<>();
        pm.put("from_user", "Swetha");
        pm.put("for_user", "Janani");
        pm.put("text", "How are you?");

        Map<String,String> fr = new HashMap<>();
        fr.put("from_user", "Vitthal");
        fr.put("for_user", "Janani");


        Map<String,String> like = new HashMap<>();
        like.put("from_user", "Navdeep");
        like.put("for_user", "Janani");
        like.put("liked", "LINK");
        like.put("url","");

        Map<String,String> comment = new HashMap<>();
        comment.put("from_user", "Viren");
        comment.put("for_user", "Janani");
        comment.put("text","Looking great!");
        comment.put("commentedOn", "PHOTO");
        comment.put("url","");

        NotificationManager manager = new NotificationManager();
        List<Notification> notifications = new ArrayList<>();

        notifications.add(manager.createNotification(Notification.NotificationType.PERSONAL_MESSAGE, pm));
        notifications.add(manager.createNotification(Notification.NotificationType.LIKE, like));
        notifications.add(manager.createNotification(Notification.NotificationType.COMMENT, comment));
        notifications.add(manager.createNotification(Notification.NotificationType.FRIEND_REQUEST, fr));

        for (Notification notification:notifications){
            manager.addNotification(notification);
        }

        List<Notification> jananiNotifications= manager.getNotification("Janani");

        for (Notification notification:jananiNotifications){
            System.out.println(notification.toString());
        }



    }
}
