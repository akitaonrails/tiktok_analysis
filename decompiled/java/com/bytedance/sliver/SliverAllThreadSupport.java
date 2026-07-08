package com.bytedance.sliver;

import X.C2188811AlT;
import X.C786410Ut5;
import X.C790920V0w;
import X.C794210VDn;
import X.EnumC795650VJb;
import X.InterfaceC790940V0y;
import X.RunnableC790910V0v;
import Y.ARunnableS8S1000000_13;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class SliverAllThreadSupport {
    public static InterfaceC790940V0y filter;
    public static final List<C790920V0w> threadGroups = new LinkedList();
    public static final Thread mainThread = Looper.getMainLooper().getThread();
    public static volatile boolean isStart = false;
    public static volatile boolean isRunning = false;
    public static int samplingRateMs = 10;
    public static Handler threadHandler = null;
    public static ThreadGroup systemThreadGroup = null;

    public static boolean initSystemThreadGroup() {
        try {
            if (systemThreadGroup == null) {
                Field declaredField = ThreadGroup.class.getDeclaredField("systemThreadGroup");
                declaredField.setAccessible(true);
                systemThreadGroup = (ThreadGroup) declaredField.get(null);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return systemThreadGroup != null;
    }

    public static native void nClearSliverGroup(long j);

    public static native void nDumpSliverGroup(long j, String str);

    public static native int nGetThreadId(long j);

    public static native void nNotifySliverGroup(long j, Thread[] threadArr, long[] jArr);

    public static native void nPauseSliverGroup(long j);

    public static native void nResumeSliverGroup(long j);

    public static native long nStartSliverGroup(int i, int i2, int i3, int i4);

    public static native void nStopSliverGroup(long j);

    public static boolean clearAll() {
        if (!isStart) {
            return false;
        }
        for (C790920V0w c790920V0w : threadGroups) {
            synchronized (c790920V0w) {
                nClearSliverGroup(c790920V0w.LIZLLL);
            }
        }
        return true;
    }

    public static synchronized void deleteThreadHandler() {
        Handler handler = threadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            threadHandler.getLooper().quitSafely();
            threadHandler = null;
        }
    }

    public static List<Thread> getAllThread() {
        int iActiveCount = systemThreadGroup.activeCount();
        Thread[] threadArr = new Thread[iActiveCount + (iActiveCount / 2)];
        int iEnumerate = systemThreadGroup.enumerate(threadArr);
        ArrayList arrayList = new ArrayList(iEnumerate);
        for (int i = 0; i < iEnumerate; i++) {
            Thread thread = threadArr[i];
            if (thread != mainThread && !thread.getName().contains("sliver")) {
                arrayList.add(threadArr[i]);
            }
        }
        return arrayList;
    }

    public static synchronized Handler newThreadHandler() {
        if (threadHandler == null) {
            HandlerThread handlerThread = new HandlerThread("sliver_check_thread");
            handlerThread.start();
            threadHandler = new BPEAHandler(C786410Ut5.W2(handlerThread));
        }
        return threadHandler;
    }

    public static boolean pauseAll() {
        if (!isStart || !isRunning) {
            return false;
        }
        for (C790920V0w c790920V0w : threadGroups) {
            synchronized (c790920V0w) {
                nPauseSliverGroup(c790920V0w.LIZLLL);
            }
        }
        deleteThreadHandler();
        isRunning = false;
        return true;
    }

    public static boolean resumeAll() {
        if (!isStart || isRunning) {
            return false;
        }
        for (C790920V0w c790920V0w : threadGroups) {
            synchronized (c790920V0w) {
                nResumeSliverGroup(c790920V0w.LIZLLL);
            }
        }
        C786410Ut5.LJJZZIII(newThreadHandler(), new RunnableC790910V0v(samplingRateMs));
        isRunning = true;
        return true;
    }

    public static boolean stopAll() {
        if (!isStart) {
            return false;
        }
        for (C790920V0w c790920V0w : threadGroups) {
            synchronized (c790920V0w) {
                if (c790920V0w.LIZLLL != 0) {
                    nStopSliverGroup(c790920V0w.LIZLLL);
                }
            }
        }
        threadGroups.clear();
        deleteThreadHandler();
        isStart = false;
        isRunning = false;
        return true;
    }

    public static boolean isStart() {
        return isStart;
    }

    public static boolean dumpHeader(String str) {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new C794210VDn(str));
            try {
                bufferedWriter2.write("# sliver\n");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("# pid:");
                sbLIZ.append(Process.myPid());
                sbLIZ.append("\n");
                bufferedWriter2.write(C2188811AlT.LIZIZ(sbLIZ));
                bufferedWriter2.flush();
                try {
                    bufferedWriter2.close();
                    return true;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return true;
                }
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                            return false;
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return false;
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                            throw th2;
                        } catch (IOException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw th2;
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean dumpAll(String str, boolean z) {
        if (!isStart) {
            return false;
        }
        ARunnableS8S1000000_13 aRunnableS8S1000000_13 = new ARunnableS8S1000000_13(str, 5);
        if (z) {
            aRunnableS8S1000000_13.run();
            return true;
        }
        C786410Ut5.LJJZZIII(newThreadHandler(), aRunnableS8S1000000_13);
        return true;
    }

    public static boolean startAll(int i, int i2, int i3, EnumC795650VJb enumC795650VJb, InterfaceC790940V0y interfaceC790940V0y) {
        if (Build.VERSION.SDK_INT > 31 || isStart || !initSystemThreadGroup()) {
            return false;
        }
        samplingRateMs = i2;
        List<C790920V0w> list = threadGroups;
        list.clear();
        int iMax = Math.max(i, 2);
        C790920V0w c790920V0w = new C790920V0w(0, i2, i3, enumC795650VJb);
        Thread thread = mainThread;
        synchronized (c790920V0w) {
            c790920V0w.LIZJ.add(thread);
            c790920V0w.LJI = true;
        }
        c790920V0w.LIZIZ();
        list.add(c790920V0w);
        for (int i4 = 1; i4 < iMax; i4++) {
            threadGroups.add(new C790920V0w(i4, i2, i3, enumC795650VJb));
        }
        C786410Ut5.LJJZZIII(newThreadHandler(), new RunnableC790910V0v(i2 * 5));
        isStart = true;
        isRunning = true;
        return true;
    }
}
