package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1161920gLG;
import X.C11PQ;
import X.C20441214yg;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C504210Jpz;
import X.C521490Kcl;
import X.C769530UGp;
import X.C786410Ut5;
import X.C788530UwV;
import X.C813610Vvr;
import X.C814770Vxj;
import X.C817700W5w;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.android.livesdk.livesetting.broadcast.GameNotificationSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$drawable;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes14.dex */
public class BgBroadcastService extends Service {
    public static C11PQ<Integer> statusNow = C11PQ.LJLLLLLL(0);
    public NotificationManager mNotificationManager;
    public final BroadcastReceiver mPostNotificationPermissionResultReceiver = new C521490Kcl(this, 2);

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_ss_android_ugc_aweme_live_livehostimpl_BgBroadcastService_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(this, context);
    }

    public void com_ss_android_ugc_aweme_live_livehostimpl_BgBroadcastService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    public static boolean isCreate() {
        return statusNow.LJLZ().intValue() == 1;
    }

    @Override // android.app.Service
    public void onDestroy() {
        C20441214yg.LJIIIZ("BgBroadcastService", "BgBroadcastService onDestroy");
        stopForeground(true);
        if (Build.VERSION.SDK_INT >= 33) {
            LocalBroadcastManager.LIZ(this).LIZLLL(this.mPostNotificationPermissionResultReceiver);
        }
        super.onDestroy();
        statusNow.onNext(0);
    }

    public void startForegroundWrapper() {
        C20441214yg.LJIIIZ("BgBroadcastService", "BgBroadcastService startForeground");
        if (Build.VERSION.SDK_INT < 31) {
            C786410Ut5.r3(this, buildNotification(this));
            return;
        }
        try {
            C786410Ut5.r3(this, buildNotification(this));
        } catch (ForegroundServiceStartNotAllowedException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("BgBroadcastService", "BgBroadcastService startForeground exception", e);
        } catch (SecurityException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF("BgBroadcastService", "BgBroadcastService startForeground SecurityException", e2);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C20441214yg.LJIIIZ("BgBroadcastService", "BgBroadcastService onCreate");
        if (Build.VERSION.SDK_INT >= 33) {
            LocalBroadcastManager.LIZ(this).LIZIZ(this.mPostNotificationPermissionResultReceiver, new IntentFilter("bytedance.android.livesdk.chatroom.ui.intent.filter.SERVICE_REQUEST_POST_NOTIFICATION_END"));
        }
    }

    private Notification buildNotification(Context context) {
        String str;
        C813610Vvr c813610Vvr;
        int i;
        if (this.mNotificationManager == null) {
            this.mNotificationManager = (NotificationManager) getSystemService("notification");
        }
        GameNotificationSetting gameNotificationSetting = GameNotificationSetting.INSTANCE;
        if (gameNotificationSetting.getValue()) {
            str = "BgBroadcastService.notification.v2";
        } else {
            str = "BgBroadcastService.notification";
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && this.mNotificationManager.getNotificationChannel(str) == null) {
            String string = getString(2131836673);
            if (gameNotificationSetting.getValue()) {
                C20441214yg.LIZIZ("GameBgServiceHelper", "set notification importance high");
            }
            if (gameNotificationSetting.getValue()) {
                i = 4;
            } else {
                i = 3;
            }
            NotificationChannel notificationChannel = new NotificationChannel(str, string, i);
            notificationChannel.enableVibration(false);
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent();
        if (C504210Jpz.LIZ && context != null) {
            intent = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostSingleActivityIntent(context, 6);
        } else if (C769530UGp.LIZ) {
            intent.setClassName(context, "com.ss.android.ugc.aweme.live.LiveBroadcastBgSceneWrapperActivity");
        } else {
            intent.setClassName(context, "com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity");
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        if (i2 >= 26) {
            c813610Vvr = new C813610Vvr(context, str);
        } else {
            c813610Vvr = new C813610Vvr(context, null);
            if (gameNotificationSetting.getValue()) {
                C20441214yg.LIZIZ("GameBgServiceHelper", "low sdk version set priority max");
                c813610Vvr.LJIIJ = 2;
            }
        }
        c813610Vvr.LJFF(getString(2131836697));
        c813610Vvr.LJJIIZI.icon = R$drawable.icon;
        c813610Vvr.LJII(2, true);
        c813610Vvr.LJJIIZI.when = System.currentTimeMillis();
        c813610Vvr.LJI = activity;
        c813610Vvr.LJIJJ = "service";
        c813610Vvr.LJII(8, true);
        c813610Vvr.LJII(16, true);
        c813610Vvr.LJII(2, true);
        c813610Vvr.LJJ = 1;
        if (gameNotificationSetting.getValue()) {
            C20441214yg.LIZIZ("GameBgServiceHelper", "set notification style mediaStyle");
            c813610Vvr.LJIIJ(new C814770Vxj());
        }
        return c813610Vvr.LIZIZ();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/ugc/aweme/live/livehostimpl/BgBroadcastService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UBgkyrexZOqs+k+kFhA62sZ8+w==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        C20441214yg.LJIIIZ("BgBroadcastService", "BgBroadcastService onBind");
        return new Binder();
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        C20441214yg.LJIIIZ("BgBroadcastService", "BgBroadcastService onTaskRemoved");
        super.onTaskRemoved(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BgBroadcastService onTrimMemory level = ");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("BgBroadcastService", C2188811AlT.LIZIZ(sbLIZ));
        super.onTrimMemory(i);
    }

    public static void com_ss_android_ugc_aweme_live_livehostimpl_BgBroadcastService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(BgBroadcastService bgBroadcastService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        bgBroadcastService.com_ss_android_ugc_aweme_live_livehostimpl_BgBroadcastService__attachBaseContext$___twin___(context);
    }

    public static void com_ss_android_ugc_aweme_live_livehostimpl_BgBroadcastService_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(BgBroadcastService bgBroadcastService, Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        com_ss_android_ugc_aweme_live_livehostimpl_BgBroadcastService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(bgBroadcastService, context);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C20441214yg.LJIIIIZZ("BgBroadcastService onStartCommand");
        startForegroundWrapper();
        statusNow.onNext(1);
        statusNow.onNext(1);
        return super.onStartCommand(intent, i, i2);
    }
}
