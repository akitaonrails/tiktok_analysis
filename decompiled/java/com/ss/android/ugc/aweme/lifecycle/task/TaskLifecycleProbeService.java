package com.ss.android.ugc.aweme.lifecycle.task;

import X.C0C64;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2455309jj;
import X.C2455909jp;
import X.C788530UwV;
import X.C817700W5w;
import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.lifecycle.LifecycleActiveReceiver;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class TaskLifecycleProbeService extends Service {
    public static final AtomicInteger LL = new AtomicInteger(0);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/ugc/aweme/lifecycle/task/TaskLifecycleProbeService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahZZrNxTHwdyqQgKeRO69xc9+EsYCaZelc+gS/uGbypKUZqYKHdjU=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
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
    public final void onTaskRemoved(Intent intent) {
        List<ActivityManager.AppTask> appTasks;
        boolean z;
        ActivityManager activityManager = (ActivityManager) getSystemService(ActivityManager.class);
        if (activityManager != null && (appTasks = activityManager.getAppTasks()) != null && appTasks.isEmpty()) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "4590_lifecycle_task_probe_require_session_terminate", true) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z && Keva.getRepo("perf_job_keep_warm").getLong("terminate_utc_day", 0L) != System.currentTimeMillis() / C2455909jp.LIZ) {
                return;
            }
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "4500_lifecycle_max_active_count", true);
            int iIncrementAndGet = LL.incrementAndGet();
            if (iLJIJ > 0 && iIncrementAndGet > iLJIJ) {
                return;
            }
            int iLIZIZ = C2455309jj.LIZIZ();
            long jLIZ = C2455309jj.LIZ();
            if (iLIZIZ > 0 && jLIZ > 0 && LifecycleActiveReceiver.LIZ(this)) {
                LifecycleActiveReceiver.LIZLLL(iLIZIZ, iLIZIZ, false);
            }
        }
    }
}
