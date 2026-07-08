package com.ss.android.ugc.aweme.utils;

import X.C0R1H;
import X.C1519760peQ;
import X.C18ZN;
import X.InterfaceC1390750mIL;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class ActivityStack {
    public static LinkedList<Activity> sActivityStack = new LinkedList<>();
    public static C1519760peQ<Activity> sStartedActivities = new C1519760peQ<>();
    public static boolean sAppBackGround = true;
    public static Application.ActivityLifecycleCallbacks lifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: X.18ZM
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public static List LIZ() {
            ArrayList arrayList = new ArrayList(ActivityStack.nonWeakAppBackgroundListeners);
            for (C18ZN c18zn : ActivityStack.sAppBackgroundListeners) {
                if (c18zn != null) {
                    arrayList.add(c18zn);
                }
            }
            return arrayList;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            synchronized (ActivityStack.class) {
                try {
                    ActivityStack.sActivityStack.remove(activity);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            synchronized (ActivityStack.class) {
                try {
                    if (ActivityStack.sAppBackGround) {
                        ActivityStack.sAppBackGround = false;
                        Iterator it2 = ((ArrayList) LIZ()).iterator();
                        while (it2.hasNext()) {
                            ((C18ZN) it2.next()).onAppForeground();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            synchronized (ActivityStack.class) {
                try {
                    ActivityStack.sStartedActivities.LIZJ(activity);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            synchronized (ActivityStack.class) {
                try {
                    ActivityStack.sStartedActivities.LJ(activity);
                    if (!ActivityStack.sAppBackGround && ActivityStack.sStartedActivities.isEmpty()) {
                        ActivityStack.sAppBackGround = true;
                        Iterator it2 = ((ArrayList) LIZ()).iterator();
                        while (it2.hasNext()) {
                            ((C18ZN) it2.next()).onAppBackground();
                        }
                        ArrayList arrayList = new ArrayList(ActivityStack.nonWeakAppBackgroundMobListeners);
                        for (InterfaceC1390750mIL interfaceC1390750mIL : ActivityStack.sAppBackgroundMobListeners) {
                            if (interfaceC1390750mIL != null) {
                                arrayList.add(interfaceC1390750mIL);
                            }
                        }
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            ((InterfaceC1390750mIL) it3.next()).onAppBackground(activity);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            synchronized (ActivityStack.class) {
                try {
                    ActivityStack.sActivityStack.remove(activity);
                    ActivityStack.sActivityStack.add(activity);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            AppLog.onActivityCreate(activity);
        }
    };
    public static C1519760peQ<C18ZN> sAppBackgroundListeners = new C1519760peQ<>();
    public static C1519760peQ<InterfaceC1390750mIL> sAppBackgroundMobListeners = new C1519760peQ<>();
    public static final List<C18ZN> nonWeakAppBackgroundListeners = new ArrayList();
    public static final List<InterfaceC1390750mIL> nonWeakAppBackgroundMobListeners = new ArrayList();

    public static synchronized Activity[] getActivityStack() {
        return (Activity[]) sActivityStack.toArray(new Activity[sActivityStack.size()]);
    }

    public static synchronized Activity getPreviousActivity() {
        if (sActivityStack.size() < 2) {
            return null;
        }
        LinkedList<Activity> linkedList = sActivityStack;
        return linkedList.get(linkedList.size() - 2);
    }

    public static synchronized Activity getTopActivity() {
        return sActivityStack.isEmpty() ? null : sActivityStack.getLast();
    }

    public static synchronized Activity getValidTopActivity() {
        Activity topActivity;
        topActivity = getTopActivity();
        if (topActivity != null && C0R1H.LIZ(topActivity)) {
            sActivityStack.removeLast();
            topActivity = getValidTopActivity();
        }
        return topActivity;
    }

    public static boolean isAppBackGround() {
        return sAppBackGround;
    }

    public static synchronized void addAppBackGroundListener(C18ZN c18zn) {
        if (c18zn != null) {
            if (!sAppBackgroundListeners.contains(c18zn)) {
                sAppBackgroundListeners.LIZJ(c18zn);
            }
        }
    }

    public static synchronized void addAppBackGroundMobListener(InterfaceC1390750mIL interfaceC1390750mIL) {
        if (interfaceC1390750mIL != null) {
            if (!sAppBackgroundMobListeners.contains(interfaceC1390750mIL)) {
                sAppBackgroundMobListeners.LIZJ(interfaceC1390750mIL);
            }
        }
    }

    public static synchronized void addNonWeakAppBackGroundListener(C18ZN c18zn) {
        if (c18zn != null) {
            List<C18ZN> list = nonWeakAppBackgroundListeners;
            if (!list.contains(c18zn)) {
                list.add(c18zn);
            }
        }
    }

    public static synchronized void addNonWeakAppBackGroundMobListener(InterfaceC1390750mIL interfaceC1390750mIL) {
        if (interfaceC1390750mIL != null) {
            List<InterfaceC1390750mIL> list = nonWeakAppBackgroundMobListeners;
            if (!list.contains(interfaceC1390750mIL)) {
                list.add(interfaceC1390750mIL);
            }
        }
    }

    public static synchronized void removeAppBackGroundListener(C18ZN c18zn) {
        if (c18zn != null) {
            sAppBackgroundListeners.LJ(c18zn);
            nonWeakAppBackgroundListeners.remove(c18zn);
        }
    }

    public static synchronized void removeAppBackGroundMobListener(InterfaceC1390750mIL interfaceC1390750mIL) {
        if (interfaceC1390750mIL != null) {
            sAppBackgroundMobListeners.LJ(interfaceC1390750mIL);
            nonWeakAppBackgroundMobListeners.remove(interfaceC1390750mIL);
        }
    }
}
