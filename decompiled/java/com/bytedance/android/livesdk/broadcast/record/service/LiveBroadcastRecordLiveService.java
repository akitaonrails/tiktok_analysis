package com.bytedance.android.livesdk.broadcast.record.service;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C20441214yg;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C294840Bh4;
import X.C497740JfY;
import X.C788530UwV;
import X.C813610Vvr;
import X.C813670Vvx;
import X.C815520Vyw;
import X.C817700W5w;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.zhiliaoapp.musically.R;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes14.dex */
public final class LiveBroadcastRecordLiveService extends Service {
    public static final C813670Vvx Companion = new Object() { // from class: X.0Vvx
    };

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_bytedance_android_livesdk_broadcast_record_service_LiveBroadcastRecordLiveService_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(this, context);
    }

    public void com_bytedance_android_livesdk_broadcast_record_service_LiveBroadcastRecordLiveService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public void onCreate() {
        NotificationManager notificationManager;
        C20441214yg.LIZIZ("LiveRecord", "LiveBroadcastRecordLiveService onCreate");
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        Object systemService = getSystemService("notification");
        if (!(systemService instanceof NotificationManager) || (notificationManager = (NotificationManager) systemService) == null) {
            return;
        }
        if (i >= 34) {
            try {
                startForeground(R.id.pec, buildNotification(this, notificationManager), 32);
                return;
            } catch (SecurityException e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("LiveRecord", "LiveBroadcastRecordLiveService startForeground SecurityException", e);
                return;
            }
        }
        Notification notificationBuildNotification = buildNotification(this, notificationManager);
        if (C294840Bh4.LIZ()) {
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("service info---->:");
            sbLIZ.append(LiveBroadcastRecordLiveService.class.getCanonicalName());
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        }
        startForeground(R.id.pec, notificationBuildNotification);
    }

    @Override // android.app.Service
    public void onDestroy() {
        C20441214yg.LIZIZ("LiveRecord", "LiveBroadcastRecordLiveService onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/bytedance/android/livesdk/broadcast/record/service/LiveBroadcastRecordLiveService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+4DkP96fV6w6fcrExcn+ZvCvJORbk3LViUD4dLN2sInHdTX6nL1nv6uiwTAqg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return new Binder();
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        C20441214yg.LIZIZ("LiveRecord", "LiveBroadcastRecordLiveService onTaskRemoved");
        stopForeground(true);
        super.onTaskRemoved(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveBroadcastRecordLiveService onTrimMemory level = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("LiveRecord", C2188811AlT.LIZIZ(sbLIZ));
        super.onTrimMemory(i);
    }

    private final Notification buildNotification(Context context, NotificationManager notificationManager) {
        C813610Vvr c813610Vvr;
        boolean zLIZ = new C815520Vyw(context).LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveBroadcastRecordLiveService buildNotification, notificationsEnabled: ");
        sbLIZ.append(zLIZ);
        C20441214yg.LIZIZ("LiveRecord", C2188811AlT.LIZIZ(sbLIZ));
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && notificationManager.getNotificationChannel("LiveBroadcastRecordLiveService.notification") == null) {
            NotificationChannel notificationChannel = new NotificationChannel("LiveBroadcastRecordLiveService.notification", C497740JfY.LJIJI(2131855973), 3);
            notificationChannel.enableVibration(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(), 201326592);
        if (i >= 26) {
            c813610Vvr = new C813610Vvr(context, "LiveBroadcastRecordLiveService.notification");
        } else {
            c813610Vvr = new C813610Vvr(context, null);
        }
        c813610Vvr.LJFF(C497740JfY.LJIJI(2131855979));
        c813610Vvr.LJJIIZI.icon = R.drawable.eoe;
        c813610Vvr.LJII(2, true);
        c813610Vvr.LJJIIZI.when = System.currentTimeMillis();
        c813610Vvr.LJI = activity;
        c813610Vvr.LJIJJ = "service";
        c813610Vvr.LJII(8, true);
        c813610Vvr.LJII(16, true);
        c813610Vvr.LJII(2, true);
        c813610Vvr.LJJ = 0;
        C20441214yg.LJIIIZ("LiveRecord", "LiveBroadcastRecordLiveService buildNotification done");
        return c813610Vvr.LIZIZ();
    }

    public static void com_bytedance_android_livesdk_broadcast_record_service_LiveBroadcastRecordLiveService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(LiveBroadcastRecordLiveService liveBroadcastRecordLiveService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        liveBroadcastRecordLiveService.com_bytedance_android_livesdk_broadcast_record_service_LiveBroadcastRecordLiveService__attachBaseContext$___twin___(context);
    }

    public static void com_bytedance_android_livesdk_broadcast_record_service_LiveBroadcastRecordLiveService_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(LiveBroadcastRecordLiveService liveBroadcastRecordLiveService, Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        com_bytedance_android_livesdk_broadcast_record_service_LiveBroadcastRecordLiveService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(liveBroadcastRecordLiveService, context);
    }
}
