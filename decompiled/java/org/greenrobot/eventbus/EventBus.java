package org.greenrobot.eventbus;

import X.C09G0;
import X.C14EM;
import X.C14EN;
import X.C14EO;
import X.C14EP;
import X.C14EQ;
import X.C14ER;
import X.C14ES;
import X.C14EW;
import X.C14EX;
import X.C14EY;
import X.C14EZ;
import X.C199575136v;
import X.C1AF0;
import X.C20231214Ec;
import X.C20231314Ed;
import X.C2188811AlT;
import X.C2213981Bky;
import X.C803800Vg2;
import X.InterfaceC20231014Ea;
import X.InterfaceC20231114Eb;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public class EventBus {
    public static volatile EventBus LIZJ;
    public static int optType;
    public static volatile boolean sEnableClearRecycledSubscribers;
    public static volatile boolean sIsDisableUnRegister;
    public static volatile boolean sIsOptEnable;
    public static volatile boolean sReusingSubscriberWeakWrapper;
    public final ExecutorService LIZ;
    public final C09G0 LIZIZ;
    public final C14EN asyncPoster;
    public final C14EM backgroundPoster;
    public final ThreadLocal<C14ES> currentPostingThreadState;
    public final boolean eventInheritance;
    public final int indexCount;
    public final boolean logNoSubscriberMessages;
    public final boolean logSubscriberExceptions;
    public final InterfaceC20231114Eb mainThreadPoster;
    public final InterfaceC20231014Ea mainThreadSupport;
    public final Map<Object, List<Class<?>>> oriTypesBySubscriber;
    public final ReferenceQueue<C14ER> recycledSubscribersQueue;
    public Map<Integer, C14ER> reusableSubscriberWeakWrapperMap;
    public final boolean sendNoSubscriberEvent;
    public final boolean sendSubscriberExceptionEvent;
    public final Map<Class<?>, Object> stickyEvents;
    public final C199575136v subscriberMethodFinder;
    public final Map<Class<?>, CopyOnWriteArrayList<C14EP>> subscriptionsByEventType;
    public final boolean throwSubscriberException;
    public final Map<C14ER, List<Class<?>>> weakTypesBySubscriber;
    public static final C14EX DEFAULT_BUILDER = new C14EX();
    public static final Map<Class<?>, List<Class<?>>> eventTypesCache = new HashMap();

    static {
        sIsOptEnable = false;
        sIsDisableUnRegister = false;
        sReusingSubscriberWeakWrapper = false;
        sEnableClearRecycledSubscribers = false;
        int i = C803800Vg2.LIZ;
        optType = i;
        sIsOptEnable = (i & 1) != 0;
        if (sIsOptEnable) {
            sIsDisableUnRegister = (optType & 2) != 0;
            sReusingSubscriberWeakWrapper = (optType & 4) != 0;
            sEnableClearRecycledSubscribers = (optType & 8) != 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EventBus() {
        /*
            r4 = this;
            X.14EX r2 = org.greenrobot.eventbus.EventBus.DEFAULT_BUILDER
            r4.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.reusableSubscriberWeakWrapperMap = r0
            java.lang.ref.ReferenceQueue r0 = new java.lang.ref.ReferenceQueue
            r0.<init>()
            r4.recycledSubscribersQueue = r0
            X.14EV r0 = new X.14EV
            r0.<init>()
            r4.currentPostingThreadState = r0
            r2.getClass()
            boolean r1 = X.C2342909Fz.LIZ
            r3 = 0
            if (r1 == 0) goto L2d
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.RuntimeException -> L29
            if (r0 == 0) goto L2d
            goto L33
        L29:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2d:
            X.09Fy r0 = new X.09Fy
            r0.<init>()
            goto L38
        L33:
            X.09Fz r0 = new X.09Fz
            r0.<init>()
        L38:
            r4.LIZIZ = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.subscriptionsByEventType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.weakTypesBySubscriber = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.oriTypesBySubscriber = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.stickyEvents = r0
            if (r1 == 0) goto L63
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.RuntimeException -> L5f
            if (r1 == 0) goto L63
            goto L65
        L5f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L63:
            r0 = r3
            goto L6a
        L65:
            X.14EY r0 = new X.14EY
            r0.<init>(r1)
        L6a:
            r4.mainThreadSupport = r0
            if (r0 == 0) goto L75
            org.greenrobot.eventbus.HandlerPoster r3 = new org.greenrobot.eventbus.HandlerPoster
            android.os.Looper r0 = r0.LIZ
            r3.<init>(r4, r0)
        L75:
            r4.mainThreadPoster = r3
            X.14EM r0 = new X.14EM
            r0.<init>(r4)
            r4.backgroundPoster = r0
            X.14EN r0 = new X.14EN
            r0.<init>(r4)
            r4.asyncPoster = r0
            r1 = 0
            r4.indexCount = r1
            X.136v r0 = new X.136v
            r0.<init>()
            r4.subscriberMethodFinder = r0
            r0 = 1
            r4.logSubscriberExceptions = r0
            r4.logNoSubscriberMessages = r0
            r4.sendSubscriberExceptionEvent = r0
            r4.sendNoSubscriberEvent = r0
            r4.throwSubscriberException = r1
            r4.eventInheritance = r0
            java.util.concurrent.ExecutorService r0 = r2.LIZ
            r4.LIZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.EventBus.<init>():void");
    }

    public static EventBus LIZLLL() {
        if (LIZJ == null) {
            synchronized (EventBus.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new EventBus();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final void LIZJ() {
        while (true) {
            C14ER c14er = (C14ER) this.recycledSubscribersQueue.poll();
            if (c14er == null) {
                return;
            }
            List<Class<?>> list = this.weakTypesBySubscriber.get(c14er);
            if (list != null) {
                Iterator<Class<?>> it2 = list.iterator();
                while (it2.hasNext()) {
                    LJJIFFI(c14er, it2.next());
                }
                this.weakTypesBySubscriber.remove(c14er);
                if (sReusingSubscriberWeakWrapper) {
                    this.reusableSubscriberWeakWrapperMap.remove(Integer.valueOf(c14er.LIZ));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EventBus[indexCount=");
        sbLIZ.append(this.indexCount);
        sbLIZ.append(", eventInheritance=");
        sbLIZ.append(this.eventInheritance);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJ() {
        return sIsOptEnable;
    }

    public static List<Class<?>> LJIIJJI(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = eventTypesCache;
        synchronized (map) {
            try {
                List<Class<?>> list2 = map.get(cls);
                list = list2;
                if (list2 == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        LIZ(arrayList, superclass.getInterfaces());
                    }
                    eventTypesCache.put(cls, arrayList);
                    list = arrayList;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return list;
    }

    public final void LIZIZ(Object obj) {
        C14ES c14es = this.currentPostingThreadState.get();
        if (c14es.LIZIZ) {
            if (obj != null) {
                if (c14es.LJ == obj) {
                    if (c14es.LIZLLL.LIZJ.LIZIZ == ThreadMode.POSTING) {
                        c14es.LJFF = true;
                        return;
                    }
                    throw new C14EW(" event handlers may only abort the incoming event");
                }
                throw new C14EW("Only the currently handled event may be aborted");
            }
            throw new C14EW("Event may not be null");
        }
        throw new C14EW("This method may only be called from inside event handling methods on the posting thread");
    }

    public final <T> T LJFF(Class<T> cls) {
        T tCast;
        synchronized (this.stickyEvents) {
            try {
                tCast = cls.cast(this.stickyEvents.get(cls));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tCast;
    }

    public final C14ER LJI(Object obj) {
        C14ER c14er;
        if (!sReusingSubscriberWeakWrapper) {
            return new C14ER(obj, this.recycledSubscribersQueue);
        }
        Map<Integer, C14ER> map = this.reusableSubscriberWeakWrapperMap;
        if (map != null && !map.isEmpty() && (c14er = this.reusableSubscriberWeakWrapperMap.get(Integer.valueOf(System.identityHashCode(obj)))) != null && c14er.get() != 0) {
            return c14er;
        }
        C14ER c14er2 = new C14ER(obj, this.recycledSubscribersQueue);
        this.reusableSubscriberWeakWrapperMap.put(Integer.valueOf(c14er2.LIZ), c14er2);
        return c14er2;
    }

    public final boolean LJII(Class<?> cls) {
        CopyOnWriteArrayList<C14EP> copyOnWriteArrayList;
        List<Class<?>> listLJIIJJI = LJIIJJI(cls);
        int size = listLJIIJJI.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(listLJIIJJI, i);
            synchronized (this) {
                try {
                    copyOnWriteArrayList = this.subscriptionsByEventType.get(obj);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void LJIIIZ(C14EQ c14eq) {
        Object obj = c14eq.LIZ;
        C14EP c14ep = c14eq.LIZIZ;
        c14eq.LIZ = null;
        c14eq.LIZIZ = null;
        c14eq.LIZJ = null;
        List<C14EQ> list = C14EQ.LIZLLL;
        synchronized (list) {
            try {
                if (((ArrayList) list).size() < 10000) {
                    ((ArrayList) list).add(c14eq);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c14ep.LIZLLL) {
            LJIIIIZZ(obj, c14ep);
        }
    }

    public final synchronized boolean LJIIJ(Object obj) {
        if (sIsOptEnable) {
            if (sEnableClearRecycledSubscribers) {
                LIZJ();
            }
            C14ER c14erLJI = LJI(obj);
            if (c14erLJI.get() != 0) {
                return this.weakTypesBySubscriber.containsKey(c14erLJI);
            }
            return false;
        }
        return this.oriTypesBySubscriber.containsKey(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.EventBus.LJIIL(java.lang.Object):void");
    }

    public final synchronized void LJIILIIL(Object obj) {
        if (sIsOptEnable) {
            if (sEnableClearRecycledSubscribers) {
                LIZJ();
            }
            if (!sIsDisableUnRegister) {
                C14ER c14erLJI = LJI(obj);
                List<Class<?>> list = this.weakTypesBySubscriber.get(c14erLJI);
                if (list != null) {
                    Iterator<Class<?>> it2 = list.iterator();
                    while (it2.hasNext()) {
                        LJJIFFI(c14erLJI, it2.next());
                    }
                    this.weakTypesBySubscriber.remove(c14erLJI);
                    if (sReusingSubscriberWeakWrapper) {
                        this.reusableSubscriberWeakWrapperMap.remove(Integer.valueOf(c14erLJI.LIZ));
                    }
                } else {
                    C09G0 c09g0 = this.LIZIZ;
                    Level level = Level.WARNING;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Subscriber to unregister was not registered before: ");
                    sbLIZ.append(obj.getClass());
                    c09g0.LIZIZ(level, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        } else {
            List<Class<?>> list2 = this.oriTypesBySubscriber.get(obj);
            if (list2 != null) {
                Iterator<Class<?>> it3 = list2.iterator();
                while (it3.hasNext()) {
                    CopyOnWriteArrayList<C14EP> copyOnWriteArrayList = this.subscriptionsByEventType.get(it3.next());
                    if (copyOnWriteArrayList != null) {
                        int size = copyOnWriteArrayList.size();
                        int i = 0;
                        while (i < size) {
                            C14EP c14ep = (C14EP) ListProtector.get(copyOnWriteArrayList, i);
                            if (c14ep.LIZIZ == obj) {
                                c14ep.LIZLLL = false;
                                ListProtector.remove(copyOnWriteArrayList, i);
                                i--;
                                size--;
                            }
                            i++;
                        }
                    }
                }
                this.oriTypesBySubscriber.remove(obj);
            } else {
                C09G0 c09g02 = this.LIZIZ;
                Level level2 = Level.WARNING;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Subscriber to unregister was not registered before: ");
                sbLIZ2.append(obj.getClass());
                c09g02.LIZIZ(level2, C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public final void LJIILL(Object obj) {
        boolean z;
        C14ES c14es = this.currentPostingThreadState.get();
        ArrayList arrayList = (ArrayList) c14es.LIZ;
        arrayList.add(obj);
        if (!c14es.LIZIZ) {
            InterfaceC20231014Ea interfaceC20231014Ea = this.mainThreadSupport;
            if (interfaceC20231014Ea != null && ((C14EY) interfaceC20231014Ea).LIZ != Looper.myLooper()) {
                z = false;
            } else {
                z = true;
            }
            c14es.LIZJ = z;
            c14es.LIZIZ = true;
            if (c14es.LJFF) {
                throw new C14EW("Internal error. Abort state was not reset");
            }
            while (!arrayList.isEmpty()) {
                try {
                    LJIILLIIL(arrayList.remove(0), c14es);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c14es.LIZIZ = false;
                    c14es.LIZJ = false;
                    throw th;
                }
            }
            c14es.LIZIZ = false;
            c14es.LIZJ = false;
        }
    }

    public final void LJIJ(Object obj) {
        synchronized (this.stickyEvents) {
            try {
                this.stickyEvents.put(obj.getClass(), obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJIILL(obj);
    }

    public final void LJIJJ(Object obj) {
        if (!LIZLLL().LJIIJ(obj)) {
            try {
                LJIIL(obj);
            } catch (C14EW e) {
                TryCatchGuardChecker.doCheck(e);
                if (!C2213981Bky.LIZIZ.LIZLLL()) {
                    C1AF0.LJ(e);
                    return;
                }
                throw e;
            }
        }
    }

    public final <T> T LJIJJLI(Class<T> cls) {
        T tCast;
        synchronized (this.stickyEvents) {
            try {
                tCast = cls.cast(this.stickyEvents.remove(cls));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tCast;
    }

    public final void LJIL(Object obj) {
        synchronized (this.stickyEvents) {
            try {
                Class<?> cls = obj.getClass();
                if (obj.equals(this.stickyEvents.get(cls))) {
                    this.stickyEvents.remove(cls);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final synchronized void LJJI(Object obj) {
        if (LIZLLL().LJIIJ(obj)) {
            try {
                LJIILIIL(obj);
            } catch (C14EW e) {
                TryCatchGuardChecker.doCheck(e);
                if (!C2213981Bky.LIZIZ.LIZLLL()) {
                    C1AF0.LJ(e);
                } else {
                    throw e;
                }
            }
        }
    }

    public static void LIZ(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.contains(cls)) {
                arrayList.add(cls);
                LIZ(list, cls.getInterfaces());
            }
        }
    }

    public final void LJIIIIZZ(Object obj, C14EP c14ep) {
        try {
            if (sIsOptEnable) {
                Object obj2 = c14ep.LIZ.get();
                if (obj2 != null) {
                    c14ep.LIZJ.LIZ.invoke(obj2, obj);
                    return;
                }
                return;
            }
            c14ep.LIZJ.LIZ.invoke(c14ep.LIZIZ, obj);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
            Throwable cause = e2.getCause();
            if (sIsOptEnable) {
                if (obj instanceof C14EZ) {
                    if (this.logSubscriberExceptions) {
                        C09G0 c09g0 = this.LIZIZ;
                        Level level = Level.SEVERE;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SubscriberExceptionEvent subscriber ");
                        sbLIZ.append(c14ep.LIZ.LIZIZ);
                        sbLIZ.append(" threw an exception");
                        c09g0.LIZ(level, C2188811AlT.LIZIZ(sbLIZ), cause);
                        C14EZ c14ez = (C14EZ) obj;
                        C09G0 c09g02 = this.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Initial event ");
                        sbLIZ2.append(c14ez.LIZIZ);
                        sbLIZ2.append(" caused exception in ");
                        sbLIZ2.append(c14ez.LIZJ);
                        c09g02.LIZ(level, C2188811AlT.LIZIZ(sbLIZ2), c14ez.LIZ);
                        return;
                    }
                    return;
                }
                if (!this.throwSubscriberException) {
                    if (this.logSubscriberExceptions) {
                        C09G0 c09g03 = this.LIZIZ;
                        Level level2 = Level.SEVERE;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Could not dispatch event: ");
                        sbLIZ3.append(obj.getClass());
                        sbLIZ3.append(" to subscribing class ");
                        sbLIZ3.append(c14ep.LIZ.LIZIZ);
                        c09g03.LIZ(level2, C2188811AlT.LIZIZ(sbLIZ3), cause);
                    }
                    if (!this.sendSubscriberExceptionEvent) {
                        return;
                    }
                    LJIILL(new C14EZ(cause, obj, c14ep.LIZ.get()));
                    return;
                }
                throw new C14EW("Invoking subscriber failed", cause);
            }
            if (obj instanceof C14EZ) {
                if (!this.logSubscriberExceptions) {
                    return;
                }
                C09G0 c09g04 = this.LIZIZ;
                Level level3 = Level.SEVERE;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("SubscriberExceptionEvent subscriber ");
                sbLIZ4.append(c14ep.LIZIZ.getClass());
                sbLIZ4.append(" threw an exception");
                c09g04.LIZ(level3, C2188811AlT.LIZIZ(sbLIZ4), cause);
                C14EZ c14ez2 = (C14EZ) obj;
                C09G0 c09g05 = this.LIZIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Initial event ");
                sbLIZ5.append(c14ez2.LIZIZ);
                sbLIZ5.append(" caused exception in ");
                sbLIZ5.append(c14ez2.LIZJ);
                c09g05.LIZ(level3, C2188811AlT.LIZIZ(sbLIZ5), c14ez2.LIZ);
                return;
            }
            if (!this.throwSubscriberException) {
                if (this.logSubscriberExceptions) {
                    C09G0 c09g06 = this.LIZIZ;
                    Level level4 = Level.SEVERE;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("Could not dispatch event: ");
                    sbLIZ6.append(obj.getClass());
                    sbLIZ6.append(" to subscribing class ");
                    sbLIZ6.append(c14ep.LIZIZ.getClass());
                    c09g06.LIZ(level4, C2188811AlT.LIZIZ(sbLIZ6), cause);
                }
                if (!this.sendSubscriberExceptionEvent) {
                    return;
                }
                LJIILL(new C14EZ(cause, obj, c14ep.LIZIZ));
                return;
            }
            throw new C14EW("Invoking subscriber failed", cause);
        }
    }

    public final void LJIILJJIL(Object obj, C14EO c14eo) {
        Object value;
        boolean z;
        Class<?> cls = c14eo.LIZJ;
        C14EP c14ep = new C14EP(obj, c14eo);
        CopyOnWriteArrayList<C14EP> copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.subscriptionsByEventType.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(c14ep)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Subscriber ");
            sbLIZ.append(obj.getClass());
            sbLIZ.append(" already registered to event ");
            sbLIZ.append(cls);
            throw new C14EW(C2188811AlT.LIZIZ(sbLIZ));
        }
        int size = copyOnWriteArrayList.size();
        boolean z2 = false;
        for (int i = 0; i <= size; i++) {
            if (i == size || c14eo.LIZLLL > copyOnWriteArrayList.get(i).LIZJ.LIZLLL) {
                copyOnWriteArrayList.add(i, c14ep);
                break;
            }
        }
        List<Class<?>> arrayList = this.oriTypesBySubscriber.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.oriTypesBySubscriber.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (c14eo.LJ) {
            if (this.eventInheritance) {
                for (Map.Entry<Class<?>, Object> entry : this.stickyEvents.entrySet()) {
                    if (cls.isAssignableFrom(entry.getKey()) && (value = entry.getValue()) != null) {
                        InterfaceC20231014Ea interfaceC20231014Ea = this.mainThreadSupport;
                        if (interfaceC20231014Ea != null && ((C14EY) interfaceC20231014Ea).LIZ != Looper.myLooper()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        LJIJI(c14ep, value, z);
                    }
                }
                return;
            }
            Object obj2 = this.stickyEvents.get(cls);
            if (obj2 != null) {
                InterfaceC20231014Ea interfaceC20231014Ea2 = this.mainThreadSupport;
                if (interfaceC20231014Ea2 == null || ((C14EY) interfaceC20231014Ea2).LIZ == Looper.myLooper()) {
                    z2 = true;
                }
                LJIJI(c14ep, obj2, z2);
            }
        }
    }

    public final void LJIILLIIL(final Object obj, C14ES c14es) {
        boolean zLJIIZILJ;
        Class<?> cls = obj.getClass();
        if (this.eventInheritance) {
            List<Class<?>> listLJIIJJI = LJIIJJI(cls);
            int size = listLJIIJJI.size();
            zLJIIZILJ = false;
            for (int i = 0; i < size; i++) {
                zLJIIZILJ |= LJIIZILJ(obj, c14es, (Class) ListProtector.get(listLJIIJJI, i));
            }
        } else {
            zLJIIZILJ = LJIIZILJ(obj, c14es, cls);
        }
        if (!zLJIIZILJ) {
            if (this.logNoSubscriberMessages) {
                C09G0 c09g0 = this.LIZIZ;
                Level level = Level.FINE;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("No subscribers registered for event ");
                sbLIZ.append(cls);
                c09g0.LIZIZ(level, C2188811AlT.LIZIZ(sbLIZ));
            }
            if (this.sendNoSubscriberEvent && cls != C20231214Ec.class && cls != C14EZ.class) {
                LJIILL(new Object(obj) { // from class: X.14Ec
                    public final Object LIZ;

                    {
                        this.LIZ = obj;
                    }
                });
            }
        }
    }

    public final void LJJ(C14ER c14er, C14EO c14eo) {
        Object value;
        boolean z;
        Class<?> cls = c14eo.LIZJ;
        C14EP c14ep = new C14EP(c14er, c14eo);
        CopyOnWriteArrayList<C14EP> copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.subscriptionsByEventType.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(c14ep)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Subscriber ");
            sbLIZ.append(c14er.LIZIZ);
            sbLIZ.append(" already registered to event ");
            sbLIZ.append(cls);
            throw new C14EW(C2188811AlT.LIZIZ(sbLIZ));
        }
        int size = copyOnWriteArrayList.size();
        boolean z2 = false;
        for (int i = 0; i <= size; i++) {
            if (i == size || c14eo.LIZLLL > copyOnWriteArrayList.get(i).LIZJ.LIZLLL) {
                copyOnWriteArrayList.add(i, c14ep);
                break;
            }
        }
        List<Class<?>> arrayList = this.weakTypesBySubscriber.get(c14er);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.weakTypesBySubscriber.put(c14er, arrayList);
        }
        arrayList.add(cls);
        if (c14eo.LJ) {
            if (this.eventInheritance) {
                for (Map.Entry<Class<?>, Object> entry : this.stickyEvents.entrySet()) {
                    if (cls.isAssignableFrom(entry.getKey()) && (value = entry.getValue()) != null) {
                        InterfaceC20231014Ea interfaceC20231014Ea = this.mainThreadSupport;
                        if (interfaceC20231014Ea != null && ((C14EY) interfaceC20231014Ea).LIZ != Looper.myLooper()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        LJIJI(c14ep, value, z);
                    }
                }
                return;
            }
            Object obj = this.stickyEvents.get(cls);
            if (obj != null) {
                InterfaceC20231014Ea interfaceC20231014Ea2 = this.mainThreadSupport;
                if (interfaceC20231014Ea2 == null || ((C14EY) interfaceC20231014Ea2).LIZ == Looper.myLooper()) {
                    z2 = true;
                }
                LJIJI(c14ep, obj, z2);
            }
        }
    }

    public final void LJJIFFI(C14ER c14er, Class<?> cls) {
        CopyOnWriteArrayList<C14EP> copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i = 0;
            while (i < size) {
                C14EP c14ep = (C14EP) ListProtector.get(copyOnWriteArrayList, i);
                if (c14ep.LIZ.equals(c14er)) {
                    c14ep.LIZLLL = false;
                    ListProtector.remove(copyOnWriteArrayList, i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    public final boolean LJIIZILJ(Object obj, C14ES c14es, Class<?> cls) {
        CopyOnWriteArrayList<C14EP> copyOnWriteArrayList;
        synchronized (this) {
            try {
                copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (C14EP c14ep : copyOnWriteArrayList) {
            c14es.LJ = obj;
            c14es.LIZLLL = c14ep;
            try {
                LJIJI(c14ep, obj, c14es.LIZJ);
                boolean z = c14es.LJFF;
                c14es.LJ = null;
                c14es.LIZLLL = null;
                c14es.LJFF = false;
                if (z) {
                    return true;
                }
            } catch (Throwable th) {
                c14es.LJ = null;
                c14es.LIZLLL = null;
                c14es.LJFF = false;
                throw th;
            }
        }
        return true;
    }

    public final void LJIJI(C14EP c14ep, Object obj, boolean z) {
        int i = C20231314Ed.LIZ[c14ep.LIZJ.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            this.asyncPoster.LIZJ(obj, c14ep);
                            return;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unknown thread mode: ");
                        sbLIZ.append(c14ep.LIZJ.LIZIZ);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (z) {
                        this.backgroundPoster.LIZJ(obj, c14ep);
                        return;
                    } else {
                        LJIIIIZZ(obj, c14ep);
                        return;
                    }
                }
                InterfaceC20231114Eb interfaceC20231114Eb = this.mainThreadPoster;
                if (interfaceC20231114Eb != null) {
                    interfaceC20231114Eb.LIZJ(obj, c14ep);
                    return;
                } else {
                    LJIIIIZZ(obj, c14ep);
                    return;
                }
            }
            if (z) {
                LJIIIIZZ(obj, c14ep);
                return;
            } else {
                this.mainThreadPoster.LIZJ(obj, c14ep);
                return;
            }
        }
        LJIIIIZZ(obj, c14ep);
    }
}
