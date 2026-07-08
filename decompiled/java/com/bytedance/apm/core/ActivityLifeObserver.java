package com.bytedance.apm.core;

import X.C2188811AlT;
import X.InterfaceC792700V7s;
import X.InterfaceC792710V7t;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.services.apm.api.IActivityLifeManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class ActivityLifeObserver implements Application.ActivityLifecycleCallbacks, IActivityLifeManager {
    public static final ActivityLifeObserver mInstance = new ActivityLifeObserver();
    public boolean mChangingConfigActivity;
    public String mCurActivityHash;
    public int mFrontActivityCount;
    public boolean mIsFrontV2;
    public WeakReference<Activity> mTopActivityRef;
    public ArrayList<InterfaceC792700V7s> mObservers = new ArrayList<>(8);
    public ArrayList<InterfaceC792710V7t> mLifecycleObservers = new ArrayList<>(8);
    public String mTopActivityClassName = null;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    private Object[] collectObservers() {
        Object[] array;
        synchronized (this.mObservers) {
            try {
                array = this.mObservers.size() > 0 ? this.mObservers.toArray() : null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return array == null ? new Object[0] : array;
    }

    public String getTopActivityClassName() {
        WeakReference<Activity> weakReference = this.mTopActivityRef;
        String str = "";
        if (weakReference == null) {
            return "";
        }
        Activity activity = weakReference.get();
        return (activity == null || (str = this.mTopActivityClassName) != null) ? str : activity.getClass().getName();
    }

    public static ActivityLifeObserver getInstance() {
        return mInstance;
    }

    public WeakReference<Activity> getTopActivityRef() {
        return this.mTopActivityRef;
    }

    @Override // com.bytedance.services.apm.api.IActivityLifeManager
    public boolean isForeground() {
        return this.mIsFrontV2;
    }

    public boolean isV2Foreground() {
        return this.mIsFrontV2;
    }

    private String getActivityHash(Activity activity) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(activity.getClass().getName());
        sbLIZ.append(activity.hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void init(Application application) {
        mInstance.initWithApp(application);
    }

    private void initWithApp(Application application) {
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    private void notifyBackground(Activity activity) {
        for (Object obj : collectObservers()) {
            ((InterfaceC792700V7s) obj).LJII(activity);
        }
        Iterator<InterfaceC792710V7t> it2 = this.mLifecycleObservers.iterator();
        while (it2.hasNext()) {
            it2.next().onBackground();
        }
    }

    private void notifyFront(Activity activity) {
        for (Object obj : collectObservers()) {
            ((InterfaceC792700V7s) obj).LIZLLL(activity);
        }
        Iterator<InterfaceC792710V7t> it2 = this.mLifecycleObservers.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (getActivityHash(activity).equals(this.mCurActivityHash)) {
            this.mCurActivityHash = null;
        }
        Iterator<InterfaceC792710V7t> it2 = this.mLifecycleObservers.iterator();
        while (it2.hasNext()) {
            it2.next().onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        boolean zLJI = MethodIDManager.LJI(71211);
        for (Object obj : collectObservers()) {
            ((InterfaceC792700V7s) obj).LJIIJ(activity);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.mTopActivityRef = new WeakReference<>(activity);
        this.mTopActivityClassName = null;
        Object[] objArrCollectObservers = collectObservers();
        for (Object obj : objArrCollectObservers) {
            ((InterfaceC792700V7s) obj).LJ();
        }
        String activityHash = getActivityHash(activity);
        if (!activityHash.equals(this.mCurActivityHash)) {
            for (Object obj2 : objArrCollectObservers) {
                ((InterfaceC792700V7s) obj2).LJIIIIZZ();
            }
            this.mCurActivityHash = activityHash;
        }
        Iterator<InterfaceC792710V7t> it2 = this.mLifecycleObservers.iterator();
        while (it2.hasNext()) {
            it2.next().onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        for (Object obj : collectObservers()) {
            ((InterfaceC792700V7s) obj).onActivityStarted(activity);
        }
        if (this.mChangingConfigActivity) {
            this.mChangingConfigActivity = false;
            return;
        }
        int i = this.mFrontActivityCount + 1;
        this.mFrontActivityCount = i;
        if (i == 1) {
            this.mIsFrontV2 = true;
            notifyFront(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.mChangingConfigActivity = true;
            return;
        }
        int i = this.mFrontActivityCount - 1;
        this.mFrontActivityCount = i;
        if (i == 0) {
            this.mIsFrontV2 = false;
            notifyBackground(activity);
        }
    }

    @Override // com.bytedance.services.apm.api.IActivityLifeManager
    public void register(InterfaceC792700V7s interfaceC792700V7s) {
        ArrayList<InterfaceC792700V7s> arrayList = this.mObservers;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mObservers.add(interfaceC792700V7s);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.bytedance.services.apm.api.IActivityLifeManager
    public void unregister(InterfaceC792700V7s interfaceC792700V7s) {
        ArrayList<InterfaceC792700V7s> arrayList = this.mObservers;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mObservers.remove(interfaceC792700V7s);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public void register(InterfaceC792710V7t interfaceC792710V7t) {
        ArrayList<InterfaceC792710V7t> arrayList = this.mLifecycleObservers;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mLifecycleObservers.add(interfaceC792710V7t);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public void unregister(InterfaceC792710V7t interfaceC792710V7t) {
        ArrayList<InterfaceC792710V7t> arrayList = this.mLifecycleObservers;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mLifecycleObservers.remove(interfaceC792710V7t);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (Object obj : collectObservers()) {
            ((InterfaceC792700V7s) obj).onActivityCreated(activity, bundle);
        }
        Iterator<InterfaceC792710V7t> it2 = this.mLifecycleObservers.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(activity);
        }
    }
}
