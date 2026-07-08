package com.bytedance.otis.perf.monitor.message;

import X.C082S;
import X.C0N9G;
import X.C0N9H;
import X.C0N9I;
import X.C0N9J;
import X.C0N9K;
import X.C0N9L;
import X.C13LP;
import X.C1958607lo;
import X.C1C7U;
import X.C786410Ut5;
import Y.AComparatorS28S0000000_9;
import Y.ARunnableS14S1200000_9;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import com.android.internal.os.LooperStats;
import com.bytedance.otis.perf.monitor.message.MessageMonitorManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageMonitorManager {
    public static Field fieldsObserver;
    public static boolean isStart;
    public static Printer myPrinter;
    public static Object sOriginObserver;
    public static Printer sOriginPrinter;
    public static final MessageMonitorManager INSTANCE = new MessageMonitorManager();
    public static final ExecutorService executor = C786410Ut5.h4();
    public static C082S observerWrapper = new LooperStats() { // from class: X.082S
        public static boolean LIZIZ = true;
        public long LIZ;

        @Override // com.android.internal.os.LooperStats
        public final Object messageDispatchStarting() {
            Object objMessageDispatchStarting;
            if (LIZIZ) {
                try {
                    objMessageDispatchStarting = super.messageDispatchStarting();
                } catch (NoSuchMethodError e) {
                    TryCatchGuardChecker.doCheck(e);
                    LIZIZ = false;
                    objMessageDispatchStarting = null;
                }
            } else {
                objMessageDispatchStarting = null;
            }
            MessageMonitorManager messageMonitorManager = MessageMonitorManager.INSTANCE;
            if (messageMonitorManager.getSOriginObserver() instanceof LooperStats) {
                ((LooperStats) messageMonitorManager.getSOriginObserver()).messageDispatchStarting();
            }
            this.LIZ = System.nanoTime();
            return objMessageDispatchStarting;
        }

        @Override // com.android.internal.os.LooperStats
        public final void messageDispatched(Object obj, Message message) {
            if (LIZIZ) {
                try {
                    super.messageDispatched(obj, message);
                } catch (NoSuchMethodError e) {
                    TryCatchGuardChecker.doCheck(e);
                    LIZIZ = false;
                }
            }
            MessageMonitorManager messageMonitorManager = MessageMonitorManager.INSTANCE;
            if (messageMonitorManager.getSOriginObserver() instanceof LooperStats) {
                ((LooperStats) messageMonitorManager.getSOriginObserver()).messageDispatched(obj, message);
            }
            MessageMonitorManager.recordMessageInfo(this.LIZ, System.nanoTime(), message);
        }

        @Override // com.android.internal.os.LooperStats
        public final void dispatchingThrewException(Object obj, Message message, Exception exc) {
            super.dispatchingThrewException(obj, message, exc);
            MessageMonitorManager messageMonitorManager = MessageMonitorManager.INSTANCE;
            if (messageMonitorManager.getSOriginObserver() instanceof LooperStats) {
                ((LooperStats) messageMonitorManager.getSOriginObserver()).dispatchingThrewException(obj, message, exc);
            }
        }
    };
    public static List<C0N9K> syncMessageList = Collections.synchronizedList(new ArrayList());
    public static ConcurrentHashMap<String, C0N9L> stageMap = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, Set<String>> sceneMap = new ConcurrentHashMap<>();
    public static long startTime = System.nanoTime();

    /* JADX INFO: renamed from: lambda$semisugar$endMonitor$lambda-2$0, reason: not valid java name */
    public static /* synthetic */ void m139lambda$semisugar$endMonitor$lambda2$0(C0N9H c0n9h, String str, Set set) {
        C1C7U.LIZ("MessageMonitorManager@99f6.endMonitor$1L");
        m138endMonitor$lambda2(c0n9h, str, set);
        C1C7U.LIZIZ("MessageMonitorManager@99f6.endMonitor$1L");
    }

    private final void hookByLooperObserver() {
        try {
            if (Build.VERSION.SDK_INT > 28) {
                if (fieldsObserver == null) {
                    fieldsObserver = C1958607lo.LIZ(Looper.class, "sObserver");
                }
                if (sOriginObserver == null) {
                    Field field = fieldsObserver;
                    sOriginObserver = field != null ? field.get(null) : null;
                }
                Field field2 = fieldsObserver;
                if (field2 != null) {
                    field2.set(null, observerWrapper);
                }
                isStart = true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    private final boolean isHigherAndroid10() {
        return Build.VERSION.SDK_INT > 28;
    }

    private final void stopLooperPrintln() {
        if (sOriginPrinter != null) {
            C786410Ut5.LJIIZILJ(Looper.getMainLooper(), sOriginPrinter);
        } else {
            C786410Ut5.LJIIZILJ(Looper.getMainLooper(), null);
        }
    }

    private final void stopObserver() {
        if (isStart) {
            if (isHigherAndroid10()) {
                stopLooperObserver();
            } else {
                stopLooperPrintln();
            }
            isStart = false;
        }
    }

    private final void tryInitMessageMonitor() {
        if (isStart) {
            return;
        }
        if (Build.VERSION.SDK_INT > 28) {
            hookByLooperObserver();
        } else {
            hookByLooperPrintln();
        }
    }

    private final void hookByLooperPrintln() {
        Printer printer;
        try {
            Looper mainLooper = Looper.getMainLooper();
            Object obj = null;
            try {
                obj = C1958607lo.LIZ(mainLooper.getClass(), "mLogging").get(mainLooper);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if ((obj instanceof Printer) && (printer = (Printer) obj) != null && !(printer instanceof C0N9J)) {
                sOriginPrinter = printer;
            }
            if (myPrinter == null) {
                myPrinter = new Printer() { // from class: X.0N9J
                    @Override // android.util.Printer
                    public final void println(String str) {
                        if (str != null && str.length() != 0) {
                            if (a0.LJJLIIIJJIZ(str, '>')) {
                                MessageMonitorManager messageMonitorManager = MessageMonitorManager.INSTANCE;
                                MessageMonitorManager.startTime = System.nanoTime();
                            } else {
                                MessageMonitorManager.recordMessageInfo(MessageMonitorManager.startTime, System.nanoTime());
                            }
                            Printer printer2 = MessageMonitorManager.sOriginPrinter;
                            if (printer2 != null) {
                                printer2.println(str);
                            }
                        }
                    }
                };
            }
            C786410Ut5.LJIIZILJ(Looper.getMainLooper(), myPrinter);
            isStart = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    private final void stopLooperObserver() {
        try {
            if (isHigherAndroid10()) {
                Object obj = sOriginObserver;
                if (obj != null) {
                    Field field = fieldsObserver;
                    if (field != null) {
                        field.set(null, obj);
                        return;
                    }
                    return;
                }
                Field field2 = fieldsObserver;
                if (field2 != null) {
                    field2.set(null, null);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final Object getSOriginObserver() {
        return sOriginObserver;
    }

    public final void endStage(String str) {
        C0N9L c0n9l;
        if (str == null || !isStart || (c0n9l = stageMap.get(str)) == null) {
            return;
        }
        c0n9l.LIZJ = System.nanoTime();
    }

    public final void setSOriginObserver(Object obj) {
        sOriginObserver = obj;
    }

    public final void startMonitor(String str) {
        if (str == null) {
            return;
        }
        tryInitMessageMonitor();
        ConcurrentHashMap<String, C0N9L> concurrentHashMap = stageMap;
        C0N9L c0n9l = new C0N9L();
        c0n9l.LIZ = str;
        c0n9l.LIZIZ = System.nanoTime();
        concurrentHashMap.put(str, c0n9l);
        if (!sceneMap.containsKey(str)) {
            sceneMap.put(str, new LinkedHashSet());
        }
    }

    private final List<C0N9G> generateResult(String str, Set<String> set) {
        int i;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(str);
        if (set != null) {
            linkedHashSet.addAll(set);
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            C0N9L c0n9lRemove = stageMap.remove(it2.next());
            if (c0n9lRemove != null) {
                List<C0N9K> list = syncMessageList;
                ArrayList<C0N9K> arrayList = new ArrayList();
                Iterator<C0N9K> it3 = list.iterator();
                while (true) {
                    i = 0;
                    if (!it3.hasNext()) {
                        break;
                    }
                    C0N9K next = it3.next();
                    C0N9K c0n9k = next;
                    if (c0n9k.LIZ > c0n9lRemove.LIZIZ && c0n9k.LIZIZ < c0n9lRemove.LIZJ) {
                        arrayList.add(next);
                    }
                }
                C0N9G c0n9g = new C0N9G();
                c0n9g.LJI = c0n9lRemove.LIZ;
                c0n9g.LIZ = arrayList.size();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    C0N9K c0n9k2 = (C0N9K) obj;
                    long j = (c0n9k2.LIZIZ - c0n9k2.LIZ) / ((long) 1000000);
                    if (3 <= j && j < 8) {
                        arrayList2.add(obj);
                    }
                }
                c0n9g.LIZIZ = arrayList2.size();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    C0N9K c0n9k3 = (C0N9K) obj2;
                    long j2 = (c0n9k3.LIZIZ - c0n9k3.LIZ) / ((long) 1000000);
                    if (7 <= j2 && j2 < 15) {
                        arrayList3.add(obj2);
                    }
                }
                c0n9g.LIZJ = arrayList3.size();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList) {
                    C0N9K c0n9k4 = (C0N9K) obj3;
                    if ((c0n9k4.LIZIZ - c0n9k4.LIZ) / ((long) 1000000) > 14) {
                        arrayList4.add(obj3);
                    }
                }
                c0n9g.LIZLLL = arrayList4.size();
                if (c0n9g.LIZ != 0) {
                    for (C0N9K c0n9k5 : arrayList) {
                        i += ((int) (c0n9k5.LIZIZ - c0n9k5.LIZ)) / 1000000;
                    }
                    c0n9g.LJ = i / c0n9g.LIZ;
                }
                CopyOnWriteArrayList<C0N9I> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                for (C0N9K c0n9k6 : C13LP.LL(C13LP.LJLLLL(new AComparatorS28S0000000_9(4), arrayList), 3)) {
                    C0N9I c0n9i = new C0N9I();
                    c0n9i.LIZ = c0n9k6.LIZJ;
                    c0n9i.LIZIZ = (c0n9k6.LIZIZ - c0n9k6.LIZ) / ((long) 1000000);
                    copyOnWriteArrayList2.add(c0n9i);
                }
                c0n9g.LJFF = copyOnWriteArrayList2;
                copyOnWriteArrayList.add(c0n9g);
            }
        }
        return copyOnWriteArrayList;
    }

    public static final void recordMessageInfo(long j, long j2) {
        List<C0N9K> list = syncMessageList;
        C0N9K c0n9k = new C0N9K();
        c0n9k.LIZ = j;
        c0n9k.LIZIZ = j2;
        list.add(c0n9k);
    }

    public final void beginStage(String str, String str2) {
        if (str == null || str2 == null || !isStart || !sceneMap.containsKey(str2)) {
            return;
        }
        if (stageMap.get(str) == null) {
            ConcurrentHashMap<String, C0N9L> concurrentHashMap = stageMap;
            C0N9L c0n9l = new C0N9L();
            c0n9l.LIZIZ = System.nanoTime();
            c0n9l.LIZ = str;
            concurrentHashMap.put(str, c0n9l);
        }
        Set<String> set = sceneMap.get(str2);
        if (set != null) {
            set.add(str);
        }
    }

    public final void endMonitor(String str, C0N9H c0n9h) {
        C0N9L c0n9lRemove;
        if (str == null || (c0n9lRemove = stageMap.remove(str)) == null) {
            return;
        }
        c0n9lRemove.LIZJ = System.nanoTime();
        Set<String> setRemove = sceneMap.remove(str);
        if (sceneMap.isEmpty()) {
            stopObserver();
        }
        executor.submit(new ARunnableS14S1200000_9(c0n9h, setRemove, str, 14));
    }

    /* JADX INFO: renamed from: endMonitor$lambda-2, reason: not valid java name */
    public static final void m138endMonitor$lambda2(C0N9H c0n9h, String str, Set set) {
        if (c0n9h != null) {
            c0n9h.LIZ(INSTANCE.generateResult(str, set));
        }
    }

    public static final void recordMessageInfo(long j, long j2, Message message) {
        List<C0N9K> list = syncMessageList;
        C0N9K c0n9k = new C0N9K();
        c0n9k.LIZ = j;
        c0n9k.LIZIZ = j2;
        c0n9k.LIZJ = message.getTarget().getClass().getCanonicalName();
        list.add(c0n9k);
    }
}
