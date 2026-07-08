package com.bytedance.realx;

import X.C0WZX;
import X.C1C7U;
import X.C2204961BRm;
import X.C786410Ut5;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class RXAppStateMonitorAndroid implements Application.ActivityLifecycleCallbacks {
    public Context mContext;
    public Handler mHandler;
    public boolean mIsBackground;
    public HandlerThread mThread;
    public long nativeMonitor;
    public final String TAG = "ASMonitorAndroid";
    public final Set<Integer> mStartedActivitySet = new HashSet();
    public final Set<Integer> mPausedActivitySet = new HashSet();

    private synchronized boolean getState() {
        return this.mIsBackground;
    }

    private native void nativeOnStateChange(long j, boolean z);

    private synchronized void reset() {
        Context context = this.mContext;
        if (context != null && (context instanceof Application)) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this);
        }
        this.nativeMonitor = 0L;
        this.mHandler = null;
        HandlerThread handlerThread = this.mThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.mThread = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStateChange$0() {
        C1C7U.LIZ("RXAppStateMonitorAndroid@fa3.onStateChange$1L");
        synchronized (this) {
            try {
                long j = this.nativeMonitor;
                if (j == 0) {
                    Logging.e("ASMonitorAndroid", "state monitor is reset.");
                    C1C7U.LIZIZ("RXAppStateMonitorAndroid@fa3.onStateChange$1L");
                } else {
                    nativeOnStateChange(j, this.mIsBackground);
                    C1C7U.LIZIZ("RXAppStateMonitorAndroid@fa3.onStateChange$1L");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public RXAppStateMonitorAndroid(long j) {
        this.nativeMonitor = 0L;
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mContext = applicationContext;
        if (applicationContext == null) {
            Logging.e("ASMonitorAndroid", "context is null.");
            return;
        }
        Context contextN3 = C786410Ut5.N3(applicationContext);
        this.mContext = contextN3;
        this.nativeMonitor = j;
        if (contextN3 instanceof Application) {
            ((Application) contextN3).registerActivityLifecycleCallbacks(this);
        } else {
            Logging.e("ASMonitorAndroid", "context not a Application obj.");
        }
        this.mIsBackground = checkBackground(this.mContext);
        HandlerThread handlerThread = new HandlerThread("appStatePoster");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mHandler = new BPEAHandler(C786410Ut5.W2(this.mThread));
    }

    private boolean checkBackground(Context context) throws Throwable {
        try {
            ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(context, "activity");
            if (activityManager == null) {
                Logging.e("ASMonitorAndroid", "activityManager is null.");
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> listLJII = C2204961BRm.LJII(activityManager, new C0WZX("dzBzEgAjS8/YVFkiQFyWY7qJUjhVYreYrKNnktyBGVyrulKI1PHre5RvHm0=", null));
            if (listLJII == null) {
                Logging.e("ASMonitorAndroid", "processInfoList is null.");
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : listLJII) {
                if (runningAppProcessInfo.importance == 100 && context.getPackageName().equals(runningAppProcessInfo.processName)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logging.e("ASMonitorAndroid", "Get App background state failed. " + e);
            return false;
        }
    }

    private synchronized void onStateChange(boolean z) {
        if (z == this.mIsBackground) {
            return;
        }
        this.mIsBackground = z;
        if (this.nativeMonitor == 0) {
            return;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.08Mo
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$onStateChange$0();
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.mPausedActivitySet.add(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.mStartedActivitySet.add(Integer.valueOf(activity.hashCode()));
        onStateChange(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.mStartedActivitySet.add(Integer.valueOf(activity.hashCode()));
        onStateChange(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityStopped(android.app.Activity r5) {
        /*
            r4 = this;
            int r3 = r5.hashCode()
            boolean r2 = r4.mIsBackground
            java.util.Set<java.lang.Integer> r1 = r4.mStartedActivitySet
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L31
            java.util.Set<java.lang.Integer> r1 = r4.mStartedActivitySet
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.remove(r0)
            java.util.Set<java.lang.Integer> r0 = r4.mStartedActivitySet
            int r0 = r0.size()
            if (r0 != 0) goto L5b
        L23:
            r2 = 1
        L24:
            r4.onStateChange(r2)
            java.util.Set<java.lang.Integer> r1 = r4.mPausedActivitySet
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.remove(r0)
            return
        L31:
            java.util.Set<java.lang.Integer> r0 = r4.mStartedActivitySet
            int r0 = r0.size()
            if (r0 != 0) goto L5b
            java.util.Set<java.lang.Integer> r1 = r4.mPausedActivitySet
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L23
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "started set not contain activity"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "ASMonitorAndroid"
            com.bytedance.realx.base.Logging.w(r0, r1)
            goto L24
        L5b:
            r2 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.RXAppStateMonitorAndroid.onActivityStopped(android.app.Activity):void");
    }
}
