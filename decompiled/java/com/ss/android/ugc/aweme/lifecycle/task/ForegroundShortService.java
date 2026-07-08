package com.ss.android.ugc.aweme.lifecycle.task;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C786410Ut5;
import X.C788530UwV;
import X.C817700W5w;
import Y.ARunnableS113S0100000_13;
import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ForegroundShortService extends Service {
    public static final /* synthetic */ int LLILLL = 0;
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());
    public long LLILLJJLI = 0;

    public final void LIZIZ() {
        try {
            stopForeground(true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (this.LLILLJJLI > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILLJJLI;
            this.LLILLJJLI = 0L;
            if (jElapsedRealtime > 10000) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("cost", String.valueOf(jElapsedRealtime));
                    AppLogNewUtils.onEventV3("foreground_short_service_timeout", jSONObject);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
        try {
            stopSelf();
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/ugc/aweme/lifecycle/task/ForegroundShortService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahZZrNxTHwdyqQgKeRO71/ctGvqomK1yjBuYLyF4reGC798MQ=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return null;
    }

    public final void LIZ() {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT < 26 || (notificationManager = (NotificationManager) getSystemService("notification")) == null || notificationManager.getNotificationChannel("perf_fgs_silent") != null) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel("perf_fgs_silent", "sync", 0);
        notificationChannel.setDescription("Used for background process sync");
        notificationChannel.setShowBadge(false);
        notificationChannel.enableLights(false);
        notificationChannel.enableVibration(false);
        notificationChannel.setSound(null, null);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.LL.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        LIZIZ();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (Build.VERSION.SDK_INT < 31) {
            stopSelf();
            return 2;
        }
        int intExtra = 7;
        if (intent != null) {
            intExtra = intent.getIntExtra("duration_sec", 7);
        }
        try {
            LIZ();
            Notification notificationBuild = new Notification.Builder(this, "perf_fgs_silent").setContentTitle("Syncing").setContentText("").setSmallIcon(R.drawable.ic_popup_sync).setForegroundServiceBehavior(2).build();
            this.LLILLJJLI = SystemClock.elapsedRealtime();
            startForeground(1991160918, notificationBuild, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
            C786410Ut5.LJLIIL(((long) intExtra) * 1000, this.LL, new ARunnableS113S0100000_13((Object) this, 141));
            return 2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            stopSelf();
            return 2;
        }
    }
}
