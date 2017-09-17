package lucassoares.com.menudrawer.Service;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;
import lucassoares.com.menudrawer.MainActivity;
import lucassoares.com.menudrawer.R;

public class myNotification {
    private Context notificationContext;

    public myNotification(Context notificationContext) {
        this.notificationContext = notificationContext;
    }

    public void notificationBuilder(String title, String text){
        NotificationCompat.Builder builder = (NotificationCompat.Builder) new NotificationCompat.Builder(notificationContext)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(title)
                .setContentText(text)
                .setAutoCancel(true);
        Intent intent = new Intent(notificationContext, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(notificationContext,0,intent,0);
        builder.setContentIntent(pendingIntent);

        NotificationManager notificationManager = (NotificationManager) notificationContext.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, builder.build());
    }
}
