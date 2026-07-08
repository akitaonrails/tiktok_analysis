package com.bytedance.nita.memory;

import X.AbstractC21264818Jq;
import X.C01GW;
import X.C0C9M;
import X.C0N6V;
import X.C0W08;
import X.C1C7U;
import X.C20115913nJ;
import X.C202094145s;
import X.C20278414Wg;
import X.C20673215v0;
import X.C21265018Js;
import X.C21265218Ju;
import X.C2188811AlT;
import X.C2456309jt;
import X.C2481909o1;
import X.C2482109o3;
import X.C292700Bdc;
import X.C452501pT;
import X.C838590Wv3;
import X.InterfaceC21265418Jw;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.nita.memory.MemoryManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes33.dex */
public final class MemoryManager extends BPEAHandler {
    public static final MemoryManager LLJIJIL = new MemoryManager();
    public static final C01GW LL = C452501pT.LIZIZ(new C0C9M());
    public static final ConcurrentHashMap<String, ConcurrentHashMap<Integer, SparseArray<List<InterfaceC21265418Jw>>>> LLILLJJLI = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, ArrayList<String>> LLILLL = new ConcurrentHashMap<>();
    public static final ArrayList<String> LLILZ = new ArrayList<>();
    public static final ConcurrentHashMap<String, Integer> LLILZIL = new ConcurrentHashMap<>();
    public static int LLILZLL = -1;
    public static final Object LLIZ = new Object();
    public static final ConcurrentHashMap<Integer, LifecycleObserver> LLIZLLLIL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, CopyOnWriteArrayList<String>> LLJ = new ConcurrentHashMap<>();
    public static final C0N6V LLJI = new Application.ActivityLifecycleCallbacks() { // from class: X.0N6V
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            synchronized (this) {
                try {
                    ArrayList<String> arrayListRemove = MemoryManager.LLILLL.remove(Integer.valueOf(activity.hashCode()));
                    if (arrayListRemove != null) {
                        for (String str : arrayListRemove) {
                            MemoryManager.LLJIJIL.getClass();
                            MemoryManager.LJIIIZ(activity, str);
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
            MemoryManager.LLILLL.put(Integer.valueOf(activity.hashCode()), new ArrayList<>());
        }
    };

    public static final class MemoryLifecycleObserver implements GenericLifecycleObserver {
        public final int LL;
        public final Context LLILLJJLI;

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        private final void onDestroy() {
            MemoryManager memoryManager = MemoryManager.LLJIJIL;
            int i = this.LL;
            Context context = this.LLILLJJLI;
            memoryManager.getClass();
            MemoryManager.LJIIJ(i, context);
        }

        public MemoryLifecycleObserver(int i, Context context) {
            this.LL = i;
            this.LLILLJJLI = context;
        }
    }

    public static final class MemoryLifecycleObserverV2 implements GenericLifecycleObserver {
        public final int LL;

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        private final void onDestroy() {
            MemoryManager memoryManager = MemoryManager.LLJIJIL;
            int i = this.LL;
            memoryManager.getClass();
            MemoryManager.LJIIJ(i, null);
        }

        public MemoryLifecycleObserverV2(int i) {
            this.LL = i;
        }
    }

    public MemoryManager() {
        super(Looper.getMainLooper());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        SparseArray<List<InterfaceC21265418Jw>> sparseArray;
        C1C7U.LIZ("MemoryManager@d3f5.handleMessage");
        Object messageObj = HandlerHook.getMessageObj(message.obj);
        if (messageObj != null) {
            int i = message.arg1;
            int i2 = message.what;
            ConcurrentHashMap<Integer, SparseArray<List<InterfaceC21265418Jw>>> concurrentHashMap = LLILLJJLI.get(messageObj);
            if (concurrentHashMap != null) {
                synchronized (concurrentHashMap) {
                    try {
                        sparseArray = concurrentHashMap.get(Integer.valueOf(i));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (sparseArray != null) {
                    synchronized (sparseArray) {
                        try {
                            sparseArray.remove(i2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                    C1C7U.LIZIZ("MemoryManager@d3f5.handleMessage");
                    return;
                }
                C1C7U.LIZIZ("MemoryManager@d3f5.handleMessage");
                return;
            }
            C1C7U.LIZIZ("MemoryManager@d3f5.handleMessage");
            return;
        }
        throw new C2482109o3("null cannot be cast to non-null type kotlin.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:23:0x0047, B:25:0x0057, B:26:0x0063, B:27:0x006a, B:29:0x0076, B:31:0x007c, B:32:0x0081, B:34:0x00a0, B:39:0x00b7, B:35:0x00a4, B:36:0x00aa), top: B:48:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(android.content.Context r5, X.InterfaceC21263418Jc r6) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.nita.memory.MemoryManager.LJFF(android.content.Context, X.18Jc):void");
    }

    public static void LJIIIZ(Context context, String str) {
        String name;
        ConcurrentHashMap<Integer, SparseArray<List<InterfaceC21265418Jw>>> concurrentHashMap = LLILLJJLI.get(str);
        if (concurrentHashMap != null) {
            synchronized (concurrentHashMap) {
                try {
                    concurrentHashMap.remove(Integer.valueOf(LLJIJIL.LJIIZILJ(context, str, false)));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clear ");
            sbLIZ.append(str);
            sbLIZ.append(" ");
            if (context != null) {
                name = context.getClass().getName();
            } else {
                name = null;
            }
            sbLIZ.append(name);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LJIIJ(int i, Context context) {
        int iLJIIZILJ;
        synchronized (LLJI) {
            try {
                LLIZLLLIL.remove(Integer.valueOf(i));
                CopyOnWriteArrayList<String> copyOnWriteArrayListRemove = LLJ.remove(Integer.valueOf(i));
                if (copyOnWriteArrayListRemove != null) {
                    for (String str : copyOnWriteArrayListRemove) {
                        ConcurrentHashMap<Integer, SparseArray<List<InterfaceC21265418Jw>>> concurrentHashMap = LLILLJJLI.get(str);
                        if (concurrentHashMap != null) {
                            synchronized (concurrentHashMap) {
                                if (context == null) {
                                    iLJIIZILJ = i;
                                } else {
                                    try {
                                        iLJIIZILJ = LLJIJIL.LJIIZILJ(context, str, false);
                                    } finally {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                                concurrentHashMap.remove(Integer.valueOf(iLJIIZILJ));
                            }
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void LJIJ(int i, String str) {
        ConcurrentHashMap<Integer, SparseArray<List<InterfaceC21265418Jw>>> concurrentHashMap = LLILLJJLI.get(str);
        if (concurrentHashMap != null) {
            synchronized (concurrentHashMap) {
                try {
                    Iterator<Map.Entry<Integer, SparseArray<List<InterfaceC21265418Jw>>>> it2 = concurrentHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        List<InterfaceC21265418Jw> list = it2.next().getValue().get(i);
                        if (list != null) {
                            synchronized (list) {
                                try {
                                    list.clear();
                                } finally {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final View LJ(Context context, int i, String str) {
        C21265018Js c21265018Js = C20673215v0.LIZ;
        if (c21265018Js != null && c21265018Js.LJI && context != null) {
            View viewLJIIL = LJIIL(context, LJIIZILJ(context, str, false), i, str);
            if (viewLJIIL != null) {
                return viewLJIIL;
            }
            return LJIIL(context, LJIIZILJ(context, str, true), i, str);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.18Ju, java.lang.Object] */
    public final C21265218Ju LJII(Context context, int i, final String str) {
        Configuration configuration;
        final String strLIZ;
        DisplayMetrics displayMetrics;
        Integer numLIZ = C20115913nJ.LIZ(context);
        if (numLIZ != null) {
            final int iIntValue = numLIZ.intValue();
            Resources resources = context.getResources();
            if (resources != null && (configuration = resources.getConfiguration()) != null && (strLIZ = C838590Wv3.LIZ(configuration)) != null) {
                final int i2 = configuration.orientation;
                final int i3 = configuration.uiMode;
                final int i4 = configuration.screenWidthDp;
                final int i5 = configuration.screenHeightDp;
                final int i6 = configuration.smallestScreenWidthDp;
                Resources resources2 = context.getResources();
                if (resources2 != null && (displayMetrics = resources2.getDisplayMetrics()) != null) {
                    final float f = displayMetrics.density;
                    final int i7 = displayMetrics.densityDpi;
                    final float f2 = displayMetrics.scaledDensity;
                    final int i8 = configuration.densityDpi;
                    ?? r2 = new AbstractC21264818Jq(str, iIntValue, strLIZ, i2, i3, i4, i5, i6, i8, f, i7, f2) { // from class: X.18Ju
                        public final int LJIIJJI;

                        @Override // X.AbstractC21264818Jq, X.InterfaceC21265418Jw
                        public final boolean LIZ(Context context2) {
                            Resources resources3;
                            Configuration configuration2;
                            if (!super.LIZ(context2) || (resources3 = context2.getResources()) == null || (configuration2 = resources3.getConfiguration()) == null || configuration2.densityDpi != this.LJIIJJI) {
                                return false;
                            }
                            return true;
                        }

                        {
                            this.LJIIJJI = i8;
                        }
                    };
                    List listLJIILIIL = LJIILIIL(context, i, str);
                    synchronized (listLJIILIIL) {
                        try {
                            listLJIILIIL.add(r2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    return r2;
                }
            }
        }
        return null;
    }

    public final List LJIILIIL(Context context, int i, String str) {
        List<InterfaceC21265418Jw> arrayList;
        ConcurrentHashMap<String, ConcurrentHashMap<Integer, SparseArray<List<InterfaceC21265418Jw>>>> concurrentHashMap = LLILLJJLI;
        ConcurrentHashMap<Integer, SparseArray<List<InterfaceC21265418Jw>>> concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 == null) {
            synchronized (this) {
                try {
                    concurrentHashMap2 = concurrentHashMap.get(str);
                    if (concurrentHashMap2 == null) {
                        concurrentHashMap2 = new ConcurrentHashMap<>();
                        concurrentHashMap.put(str, concurrentHashMap2);
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        int iLJIIZILJ = LJIIZILJ(context, str, false);
        SparseArray<List<InterfaceC21265418Jw>> sparseArray = concurrentHashMap2.get(Integer.valueOf(iLJIIZILJ));
        if (sparseArray == null) {
            synchronized (concurrentHashMap2) {
                try {
                    sparseArray = concurrentHashMap2.get(Integer.valueOf(iLJIIZILJ));
                    if (sparseArray == null) {
                        sparseArray = new SparseArray<>();
                        concurrentHashMap2.put(Integer.valueOf(iLJIIZILJ), sparseArray);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C21265018Js c21265018Js = C20673215v0.LIZ;
        if (c21265018Js != null && c21265018Js.LJIIIZ) {
            synchronized (sparseArray) {
                try {
                    arrayList = sparseArray.get(i);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            arrayList = sparseArray.get(i);
        }
        if (arrayList == null) {
            synchronized (sparseArray) {
                try {
                    arrayList = sparseArray.get(i);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        sparseArray.append(i, arrayList);
                    }
                } catch (Throwable th22) {
                    throw th22;
                }
            }
        }
        return arrayList;
    }

    public final int LJIIZILJ(Context context, String str, boolean z) {
        int iIntValue;
        if (!(context instanceof C2481909o1) && context != null && !z && !(context instanceof Application)) {
            return context.hashCode();
        }
        synchronized (this) {
            try {
                ConcurrentHashMap<String, Integer> concurrentHashMap = LLILZIL;
                Integer numValueOf = concurrentHashMap.get(str);
                if (numValueOf == null) {
                    int i = LLILZLL - 1;
                    LLILZLL = i;
                    numValueOf = Integer.valueOf(i);
                    concurrentHashMap.put(str, numValueOf);
                }
                iIntValue = numValueOf.intValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iIntValue;
    }

    public static View LJIIJJI(Context context, int i, int i2, String str) {
        SparseArray<List<InterfaceC21265418Jw>> sparseArray;
        List<InterfaceC21265418Jw> list;
        ConcurrentHashMap<Integer, SparseArray<List<InterfaceC21265418Jw>>> concurrentHashMap = LLILLJJLI.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        synchronized (concurrentHashMap) {
            try {
                sparseArray = concurrentHashMap.get(Integer.valueOf(i));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (sparseArray == null) {
            return null;
        }
        synchronized (sparseArray) {
            try {
                list = sparseArray.get(i2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (list == null) {
            return null;
        }
        synchronized (list) {
            try {
                ListIterator<InterfaceC21265418Jw> listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    InterfaceC21265418Jw next = listIterator.next();
                    View view = next.getView();
                    if (view != null && next.LIZ(context)) {
                        listIterator.remove();
                        return view;
                    }
                }
                return null;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
    }

    public static View LJIIL(Context context, int i, int i2, String str) {
        if (C292700Bdc.LIZJ > 0) {
            View viewLJIIJJI = LJIIJJI(context, i, i2, str);
            if (viewLJIIJJI != null && SystemClock.elapsedRealtime() - C202094145s.LJIIIZ < C292700Bdc.LIZLLL && C2456309jt.LIZIZ()) {
                C20278414Wg.LIZIZ(str);
            }
            return viewLJIIJJI;
        }
        return LJIIJJI(context, i, i2, str);
    }

    public static boolean LJIILJJIL(Context context, int i, int i2, String str) {
        SparseArray<List<InterfaceC21265418Jw>> sparseArray;
        List<InterfaceC21265418Jw> list;
        ConcurrentHashMap<Integer, SparseArray<List<InterfaceC21265418Jw>>> concurrentHashMap = LLILLJJLI.get(str);
        boolean z = false;
        if (concurrentHashMap == null) {
            return false;
        }
        synchronized (concurrentHashMap) {
            try {
                sparseArray = concurrentHashMap.get(Integer.valueOf(i));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (sparseArray == null) {
            return false;
        }
        synchronized (sparseArray) {
            try {
                list = sparseArray.get(i2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (list == null) {
            return false;
        }
        synchronized (list) {
            try {
                Iterator<InterfaceC21265418Jw> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC21265418Jw next = it2.next();
                    InterfaceC21265418Jw interfaceC21265418Jw = next;
                    if (interfaceC21265418Jw.getView() != null && interfaceC21265418Jw.LIZ(context)) {
                        if (next != null) {
                            z = true;
                        }
                    }
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
        return z;
    }

    public final void LJIIIIZZ(View view, String str, int i, C21265218Ju c21265218Ju) {
        Context context = view.getContext();
        if (!C0W08.LIZ(context)) {
            return;
        }
        if (c21265218Ju.LIZ(context)) {
            c21265218Ju.LIZIZ(view);
            return;
        }
        List listLJIILIIL = LJIILIIL(context, i, str);
        synchronized (listLJIILIIL) {
            try {
                listLJIILIIL.remove(c21265218Ju);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
