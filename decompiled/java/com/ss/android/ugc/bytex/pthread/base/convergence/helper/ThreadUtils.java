package com.ss.android.ugc.bytex.pthread.base.convergence.helper;

import X.C786410Ut5;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.SuperThreadPool;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class ThreadUtils {
    public static Field groupField = null;
    public static Thread mainThread = null;
    public static ThreadGroup mainThreadGroup = null;
    public static boolean threadGroupFetchable = true;

    public static ThreadGroup getThreadGroup(Thread thread, boolean z) {
        if (z) {
            ThreadGroup threadGroup = mainThreadGroup;
            if (threadGroup != null) {
                return threadGroup;
            }
            ThreadGroup threadGroup2 = thread.getThreadGroup();
            mainThreadGroup = threadGroup2;
            return threadGroup2;
        }
        if (threadGroupFetchable) {
            if (groupField == null) {
                try {
                    Field declaredField = Thread.class.getDeclaredField("group");
                    declaredField.setAccessible(true);
                    groupField = declaredField;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    threadGroupFetchable = false;
                }
            }
            return (ThreadGroup) groupField.get(thread);
        }
        return thread.getThreadGroup();
    }

    public static ThreadGroup getThreadInitGroup() {
        return getThreadInitGroup(null);
    }

    public static ThreadGroup getThreadInitGroup(ThreadGroup threadGroup) {
        if (SuperThreadPool.INSTANCE.getEnableThreadGroupOptType() <= 0 || threadGroup != null) {
            return threadGroup;
        }
        Thread threadU3 = C786410Ut5.u3();
        return getThreadGroup(threadU3, isMainThread(threadU3));
    }

    public static boolean isMainThread() {
        return isMainThread(C786410Ut5.u3());
    }

    public static boolean isMainThread(Thread thread) {
        Thread thread2 = mainThread;
        if (thread2 == null) {
            thread2 = Looper.getMainLooper().getThread();
            mainThread = thread2;
        }
        return thread2 == thread;
    }
}
