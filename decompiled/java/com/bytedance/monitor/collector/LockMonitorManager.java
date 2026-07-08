package com.bytedance.monitor.collector;

import X.C0V1K;
import X.C0V1L;
import X.C0V1M;
import X.C0V1N;
import X.C0V3T;
import X.C2257208ss;
import X.C786410Ut5;
import X.C787900UvU;
import X.C791560V3i;
import X.C792400V6o;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS8S1000000_13;
import Y.ARunnableS92S0000000_13;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class LockMonitorManager {
    public static volatile String lastJavaStack;
    public static volatile boolean openFetchStack;
    public static int position;
    public static C0V1N[] lockInfoQueue = new C0V1N[100];
    public static final BlockingQueue<String> sStackBlockingQueue = new LinkedBlockingQueue();
    public static final List<C0V1M> sOnLockListenerList = new CopyOnWriteArrayList();
    public static ExecutorService sLockHandler = C786410Ut5.i4(new ThreadFactory() { // from class: X.0Uvz
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            BPEAThread bPEAThread = new BPEAThread(runnable);
            ThreadMethodProxy.setName(bPEAThread, "lock_handler_time");
            return bPEAThread;
        }
    });
    public static ExecutorService sStackFetcher = C786410Ut5.i4(new ThreadFactory() { // from class: X.0Uvy
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            BPEAThread bPEAThread = new BPEAThread(runnable);
            Process.setThreadPriority(-20);
            ThreadMethodProxy.setName(bPEAThread, "lock_stack_fetch");
            return bPEAThread;
        }
    });
    public static boolean isLockMonitoring = false;

    public static List<C0V1N> dumpLockInfo() {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 100; i++) {
            int i2 = (((position + 100) - i) - 1) % 100;
            C0V1N[] c0v1nArr = lockInfoQueue;
            C0V1N c0v1n = c0v1nArr[i2];
            c0v1nArr[i2] = null;
            if (c0v1n != null) {
                linkedList.add(c0v1n);
            }
        }
        return linkedList;
    }

    public static void nativeGetJavaStack() {
        if (openFetchStack) {
            sStackFetcher.execute(new ARunnableS92S0000000_13(14));
        }
    }

    public static void startLockDetect() {
        startLockDetect(30L);
    }

    public static void dumpLockInfo(C0V1L c0v1l) {
        C787900UvU.LIZ.LIZJ(new ARunnableS113S0100000_13(c0v1l, 73));
    }

    public static void endLockDetect(JSONObject jSONObject) {
        endLockDetect(jSONObject, true);
    }

    public static void enqueue(C0V1N c0v1n) {
        if (c0v1n == null) {
            return;
        }
        C0V1N[] c0v1nArr = lockInfoQueue;
        int i = position;
        c0v1nArr[i] = c0v1n;
        position = (i + 1) % 100;
    }

    public static void nativePut(String str) {
        sLockHandler.execute(new ARunnableS8S1000000_13(str, 4));
    }

    public static void registerOnLockListener(C0V1M c0v1m) {
        if (c0v1m != null) {
            List<C0V1M> list = sOnLockListenerList;
            if (!list.contains(c0v1m)) {
                list.add(c0v1m);
            }
        }
    }

    public static void reportLockInfo(JSONObject jSONObject) {
        dumpLockInfo(new C0V1K(jSONObject));
    }

    public static void setOpenFetchStack(boolean z) {
        openFetchStack = z;
        if (!z) {
            lastJavaStack = null;
        }
    }

    public static void startLockDetect(long j) {
        if (isLockMonitoring) {
            return;
        }
        isLockMonitoring = true;
        if (C792400V6o.LJIIJ()) {
            C791560V3i c791560V3iLIZLLL = C791560V3i.LIZLLL();
            if (c791560V3iLIZLLL.LIZIZ) {
                long j2 = c791560V3iLIZLLL.LJIIIZ.LJFF;
                if (c791560V3iLIZLLL.LIZIZ) {
                    if (c791560V3iLIZLLL.LJII == null) {
                        c791560V3iLIZLLL.LJII = new C0V3T(c791560V3iLIZLLL.LJIIIZ.LJI);
                    }
                    C0V3T c0v3t = c791560V3iLIZLLL.LJII;
                    c0v3t.getClass();
                    try {
                        if (C791560V3i.LJIIJJI) {
                            MonitorJni.doEnableAtrace(c0v3t.LIZJ, j2);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            C791560V3i c791560V3iLIZLLL2 = C791560V3i.LIZLLL();
            if (c791560V3iLIZLLL2.LIZIZ) {
                if (c791560V3iLIZLLL2.LJII == null) {
                    C0V3T c0v3t2 = new C0V3T(c791560V3iLIZLLL2.LJIIIZ.LJI);
                    c791560V3iLIZLLL2.LJII = c0v3t2;
                    long j3 = c791560V3iLIZLLL2.LJIIIZ.LJFF;
                    try {
                        if (C791560V3i.LJIIJJI) {
                            MonitorJni.doEnableAtrace(c0v3t2.LIZJ, j3);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                c791560V3iLIZLLL2.LJII.getClass();
                try {
                    if (C791560V3i.LJIIJJI) {
                        MonitorJni.doEnableLock();
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            }
            C791560V3i c791560V3iLIZLLL3 = C791560V3i.LIZLLL();
            synchronized (c791560V3iLIZLLL3) {
                if (c791560V3iLIZLLL3.LJ) {
                    return;
                }
                c791560V3iLIZLLL3.LJ = true;
                setOpenFetchStack(true);
                if (C791560V3i.LJIIJJI) {
                    try {
                        MonitorJni.doOpenLockStackTrace(j);
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                    }
                }
            }
        }
    }

    public static void unRegisterOnLockListener(C0V1M c0v1m) {
        sOnLockListenerList.remove(c0v1m);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String dumpLockInfo(long r9, long r11) {
        /*
            r7 = 100
            X.0V1N[] r6 = new X.C0V1N[r7]
            X.0V1N[] r0 = com.bytedance.monitor.collector.LockMonitorManager.lockInfoQueue
            r5 = 0
            java.lang.System.arraycopy(r0, r5, r6, r5, r7)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        Lf:
            int r0 = com.bytedance.monitor.collector.LockMonitorManager.position
            if (r0 < 0) goto L34
            int r0 = r0 + r5
            int r0 = r0 + 1
            int r0 = r0 % r7
            r8 = r6[r0]
            if (r8 == 0) goto L39
            long r2 = r8.LIZ
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 < 0) goto L28
            long r0 = r8.LIZIZ
            long r2 = r2 + r0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L2b
        L28:
            r4.add(r8)
        L2b:
            long r2 = r8.LIZ
            long r0 = r8.LIZIZ
            long r2 = r2 + r0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L39
        L34:
            java.lang.String r0 = r4.toString()
            return r0
        L39:
            int r5 = r5 + 1
            if (r5 >= r7) goto L34
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.monitor.collector.LockMonitorManager.dumpLockInfo(long, long):java.lang.String");
    }

    public static void endLockDetect(JSONObject jSONObject, boolean z) {
        if (!isLockMonitoring) {
            return;
        }
        try {
            jSONObject.put("is_lock", true);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        isLockMonitoring = false;
        if (C792400V6o.LJIIJ()) {
            if (z) {
                reportLockInfo(jSONObject);
            }
            C791560V3i c791560V3iLIZLLL = C791560V3i.LIZLLL();
            synchronized (c791560V3iLIZLLL) {
                if (c791560V3iLIZLLL.LJ) {
                    c791560V3iLIZLLL.LJ = false;
                    setOpenFetchStack(false);
                    if (C791560V3i.LJIIJJI) {
                        try {
                            MonitorJni.doCloseLockStackTrace();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            }
            C791560V3i c791560V3iLIZLLL2 = C791560V3i.LIZLLL();
            if (c791560V3iLIZLLL2.LIZIZ && c791560V3iLIZLLL2.LJII != null) {
                try {
                    if (C791560V3i.LJIIJJI) {
                        MonitorJni.doDisableAtrace();
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
    }

    public static JSONObject packJsonData(C0V1N c0v1n, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("timestamp", c0v1n.LIZ);
            jSONObject2.put("crash_time", c0v1n.LIZ);
            jSONObject2.put("is_main_process", C792400V6o.LJIIIZ());
            jSONObject2.put("process_name", C792400V6o.LIZIZ());
            jSONObject2.put("block_duration", c0v1n.LIZIZ);
            jSONObject2.put("raw_dump_info", c0v1n.LIZJ);
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(c0v1n.LJFF)) {
                sb.append(c0v1n.LJFF.replace("\t", ""));
                sb.append("\n");
            }
            sb.append("-OwnerThread: ");
            sb.append(c0v1n.LJII);
            sb.append("\n");
            sb.append("-OwnerStack: ");
            sb.append(c0v1n.LJI);
            sb.append("\n");
            sb.append("-WaiterStack: ");
            sb.append(c0v1n.LJ);
            sb.append("\n");
            sb.append("-RawAtrace: ");
            sb.append(c0v1n.LIZJ);
            sb.append("\n");
            if (c0v1n.LIZLLL != null) {
                sb.append("-Activity: ");
                sb.append(c0v1n.LIZLLL);
                sb.append("\n");
            }
            JSONObject jSONObjectLIZIZ = C2257208ss.LIZ().LIZIZ();
            jSONObjectLIZIZ.put("block_stack_type", "stack");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectLIZIZ.put(next, jSONObject.get(next));
            }
            jSONObject2.put("filters", jSONObjectLIZIZ);
            jSONObject2.put("stack", sb.toString());
            jSONObject2.put("event_type", "lag");
            return jSONObject2;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
