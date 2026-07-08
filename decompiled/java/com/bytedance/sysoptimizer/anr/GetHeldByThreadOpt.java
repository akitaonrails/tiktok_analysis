package com.bytedance.sysoptimizer.anr;

import X.C08PL;
import X.C2112108Pf;
import X.C786410Ut5;
import android.content.Context;
import android.os.Build;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.sysoptimizer.SysOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class GetHeldByThreadOpt {
    public static String TAG = "GetHeldByThreadOpt";
    public static boolean sShadowHookInited;

    public static class ThreadData {
        public boolean deadLock;
        public Thread thread;
        public int threadid;
        public int tid;
    }

    public static native int getHeldByThreadId(Thread thread, int i);

    public static native int nativePeer2ThreadTid(Thread thread, int i);

    public static native int nativePeer2Threadid(Thread thread, int i);

    public static boolean Init(Context context) {
        if (sShadowHookInited) {
            return true;
        }
        try {
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                C2112108Pf c2112108Pf = new C2112108Pf();
                c2112108Pf.LIZ = C08PL.SHARED.value;
                c2112108Pf.LIZIZ = true;
                ShadowHook.init(c2112108Pf.LIZ());
                sShadowHookInited = true;
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static Thread getHeldByThread(int i) {
        ThreadGroup threadGroup = C786410Ut5.u3().getThreadGroup();
        int iActiveCount = Thread.activeCount();
        Thread[] threadArr = new Thread[iActiveCount];
        threadGroup.enumerate(threadArr);
        Thread thread = null;
        for (int i2 = 0; i2 < iActiveCount; i2++) {
            Thread thread2 = threadArr[i2];
            if (nativePeer2Threadid(thread2, Build.VERSION.SDK_INT) == i) {
                thread = thread2;
            }
        }
        return thread;
    }

    public static ThreadData getThreadDataForLockMonitor(Thread thread) {
        return getThreadDataForLockMonitor(thread, thread, new HashSet(), 0);
    }

    public static ThreadData getThreadDataForLockMonitor(Thread thread, Thread thread2, Set<Thread> set, int i) {
        ThreadData threadData = new ThreadData();
        if (i >= 256) {
            threadData.deadLock = true;
            threadData.thread = thread2;
            threadData.tid = nativePeer2ThreadTid(thread2, Build.VERSION.SDK_INT);
            return threadData;
        }
        if (!set.add(thread2)) {
            threadData.deadLock = true;
            threadData.thread = thread2;
            threadData.tid = nativePeer2ThreadTid(thread2, Build.VERSION.SDK_INT);
            return threadData;
        }
        if (ThreadMethodProxy.getState(thread2) == Thread.State.BLOCKED) {
            int i2 = Build.VERSION.SDK_INT;
            int heldByThreadId = getHeldByThreadId(thread2, i2);
            if (heldByThreadId <= 0) {
                threadData.thread = null;
                return threadData;
            }
            Thread heldByThread = getHeldByThread(heldByThreadId);
            if (heldByThread != null) {
                int iNativePeer2ThreadTid = nativePeer2ThreadTid(heldByThread, i2);
                threadData.thread = heldByThread;
                threadData.tid = iNativePeer2ThreadTid;
                threadData.threadid = heldByThreadId;
                if (thread2 == heldByThread) {
                    return threadData;
                }
                if (thread != heldByThread) {
                    ThreadData threadDataForLockMonitor = getThreadDataForLockMonitor(thread, heldByThread, set, i + 1);
                    if ((threadDataForLockMonitor.thread != null && !threadDataForLockMonitor.deadLock) || threadDataForLockMonitor.deadLock) {
                        return threadDataForLockMonitor;
                    }
                    return threadData;
                }
                threadData.deadLock = true;
                threadData.thread = thread2;
                threadData.tid = nativePeer2ThreadTid(thread2, i2);
                threadData.threadid = getHeldByThreadId(thread2, i2);
                return threadData;
            }
        }
        threadData.thread = null;
        return threadData;
    }
}
