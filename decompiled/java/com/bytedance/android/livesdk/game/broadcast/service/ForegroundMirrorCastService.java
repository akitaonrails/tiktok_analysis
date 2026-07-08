package com.bytedance.android.livesdk.game.broadcast.service;

import X.C0IJT;
import X.C0TFE;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C11PQ;
import X.C1CC2;
import X.C20441214yg;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C294840Bh4;
import X.C474500IjA;
import X.C744020TGm;
import X.C788530UwV;
import X.C813610Vvr;
import X.C815520Vyw;
import X.C817700W5w;
import android.app.ForegroundServiceStartNotAllowedException;
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
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCast;
import com.bytedance.android.livesdk.livesetting.broadcast.GameCastRefactorEnableSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.io.PrintStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ForegroundMirrorCastService extends Service {
    public static C11PQ<Integer> statusNow = C11PQ.LJLLLLLL(0);
    public NotificationManager mNotificationManager;

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_bytedance_android_livesdk_game_broadcast_service_ForegroundMirrorCastService_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(this, context);
    }

    public void com_bytedance_android_livesdk_game_broadcast_service_ForegroundMirrorCastService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    public static boolean isCreate() {
        return statusNow.LJLZ().intValue() == 1;
    }

    private void startForegroundWrapper() {
        C20441214yg.LJIIIZ("ForegroundMirrorCastService", "ForegroundMirrorCastService startForeground");
        if (Build.VERSION.SDK_INT < 31) {
            startForegroundInternal(R.id.pdp, buildNotification(this));
            return;
        }
        try {
            startForegroundInternal(R.id.pdp, buildNotification(this));
        } catch (ForegroundServiceStartNotAllowedException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("ForegroundMirrorCastService", "ForegroundMirrorCastService startForeground Exception", e);
        } catch (SecurityException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF("ForegroundMirrorCastService", "ForegroundMirrorCastService startForeground SecurityException", e2);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        C20441214yg.LJIIIZ("ForegroundMirrorCastService", "ForegroundMirrorCastService onCreate");
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        C20441214yg.LJIIIZ("ForegroundMirrorCastService", "ForegroundMirrorCastService onDestroy");
        stopForeground(true);
        super.onDestroy();
        statusNow.onNext(0);
    }

    private Notification buildNotification(Context context) {
        C813610Vvr c813610Vvr;
        if (this.mNotificationManager == null) {
            this.mNotificationManager = (NotificationManager) getSystemService("notification");
        }
        boolean zLIZ = new C815520Vyw(context).LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForegroundMirrorCastService buildNotification: notificationsEnabled");
        sbLIZ.append(zLIZ);
        C20441214yg.LJIIIZ("ForegroundMirrorCastService", C2188811AlT.LIZIZ(sbLIZ));
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && this.mNotificationManager.getNotificationChannel("ForegroundMirrorCastService.notification") == null) {
            NotificationChannel notificationChannel = new NotificationChannel("ForegroundMirrorCastService.notification", "Cast", 3);
            notificationChannel.enableVibration(false);
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent();
        intent.putExtra("enter_from", "mirror_cast_notice");
        intent.putExtra("broadcast_type", 4);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        if (i >= 26) {
            c813610Vvr = new C813610Vvr(context, "ForegroundMirrorCastService.notification");
        } else {
            c813610Vvr = new C813610Vvr(context, null);
        }
        c813610Vvr.LJFF("Live");
        c813610Vvr.LJJIIZI.icon = R.drawable.enx;
        c813610Vvr.LJII(2, true);
        c813610Vvr.LJJIIZI.when = System.currentTimeMillis();
        c813610Vvr.LJI = activity;
        c813610Vvr.LJIJJ = "service";
        c813610Vvr.LJII(8, true);
        c813610Vvr.LJII(16, true);
        c813610Vvr.LJII(2, true);
        c813610Vvr.LJJ = 0;
        C20441214yg.LJIIIZ("ForegroundMirrorCastService", "ForegroundMirrorCastService buildNotification done");
        return c813610Vvr.LIZIZ();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/bytedance/android/livesdk/game/broadcast/service/ForegroundMirrorCastService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5O911mxbfewTIxcueNb1FkjFOR2mbqEBuIDKb3YuBhyNFbqI=", null)));
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
    public void onTaskRemoved(Intent intent) throws JSONException {
        C20441214yg.LJIIIZ("ForegroundMirrorCastService", "ForegroundMirrorCastService onTaskRemoved");
        GameCast gameCast = GameCast.LIZ;
        GameCast.LJIJ();
        C744020TGm.LJIIIZ(true);
        stopForeground(true);
        super.onTaskRemoved(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForegroundMirrorCastService onTrimMemory level = ");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("ForegroundMirrorCastService", C2188811AlT.LIZIZ(sbLIZ));
        super.onTrimMemory(i);
    }

    public static void com_bytedance_android_livesdk_game_broadcast_service_ForegroundMirrorCastService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(ForegroundMirrorCastService foregroundMirrorCastService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        foregroundMirrorCastService.com_bytedance_android_livesdk_game_broadcast_service_ForegroundMirrorCastService__attachBaseContext$___twin___(context);
    }

    public static void com_bytedance_android_livesdk_game_broadcast_service_ForegroundMirrorCastService_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(ForegroundMirrorCastService foregroundMirrorCastService, Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        com_bytedance_android_livesdk_game_broadcast_service_ForegroundMirrorCastService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(foregroundMirrorCastService, context);
    }

    private void startForegroundInternal(int i, Notification notification) {
        if (Build.VERSION.SDK_INT >= 29 && GameCastRefactorEnableSetting.INSTANCE.enable()) {
            startForeground(i, notification, 32);
            return;
        }
        if (C294840Bh4.LIZ()) {
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("service info---->:");
            sbLIZ.append(getClass().getCanonicalName());
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        }
        startForeground(i, notification);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) throws JSONException {
        C20441214yg.LJIIIZ("ForegroundMirrorCastService", "ForegroundMirrorCastService onStartCommand");
        startForegroundWrapper();
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("time_stamp", jCurrentTimeMillis);
        C0TFE.LIZ.getClass();
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, C0TFE.LIZIZ);
        C1CC2.LJIIIIZZ("ttlive_game_cast_foreground_start", 1, jSONObject);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cast_foreground_start");
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "time_stamp");
        c474500IjALIZ.LJJII(Long.valueOf(C0TFE.LIZIZ), FollowStatusChangeMethod.PARAM_UID);
        c474500IjALIZ.LIZ();
        statusNow.onNext(1);
        return super.onStartCommand(intent, i, i2);
    }
}
