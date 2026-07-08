package com.ss.bytertc.engine.utils;

import X.C786410Ut5;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class AppMonitor implements Application.ActivityLifecycleCallbacks {
    public static volatile AppMonitor INSTANCE;
    public List<Callback> mCallbacks = new CopyOnWriteArrayList();

    public interface Callback {
        void callback(int i);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public AppMonitor(Context context) {
        registerLifecycle(context);
    }

    public static AppMonitor get(Context context) {
        if (INSTANCE == null) {
            synchronized (AppMonitor.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = new AppMonitor(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return INSTANCE;
    }

    private void registerLifecycle(Context context) {
        ((Application) C786410Ut5.N3(context)).registerActivityLifecycleCallbacks(this);
    }

    public void notifyCallback(int i) {
        Iterator<Callback> it2 = this.mCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().callback(i);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        notifyCallback(0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        notifyCallback(1);
    }

    public boolean release(Context context) {
        if (context != null) {
            ((Application) C786410Ut5.N3(context)).unregisterActivityLifecycleCallbacks(this);
            this.mCallbacks.clear();
            INSTANCE = null;
            return true;
        }
        return false;
    }

    public AppMonitor unRegister(Callback callback) {
        if (!this.mCallbacks.contains(callback)) {
            return this;
        }
        this.mCallbacks.remove(callback);
        return this;
    }

    public AppMonitor register(Context context, Callback callback) {
        if (!this.mCallbacks.contains(callback)) {
            this.mCallbacks.add(callback);
        }
        notifyCallback(CommonUtils.isInForeground(context) ? 1 : 0);
        return this;
    }
}
