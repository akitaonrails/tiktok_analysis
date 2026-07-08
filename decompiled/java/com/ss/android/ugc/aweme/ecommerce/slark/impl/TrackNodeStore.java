package com.ss.android.ugc.aweme.ecommerce.slark.impl;

import X.C0PEM;
import X.C1748730vbj;
import X.C1748760vbm;
import X.C1748770vbn;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C817503Hh;
import X.C960603pE;
import X.C960703pF;
import X.C993503uX;
import X.C993703uZ;
import X.C993803ua;
import X.ExecutorC10416045m;
import X.InterfaceC1748810vbr;
import Y.ARunnableS101S0100000_1;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TrackNodeStore {
    public static final ConcurrentHashMap<String, C993503uX> LIZ = new ConcurrentHashMap<>();
    public static final Map<LifecycleOwner, String> LIZIZ;
    public static final LifecycleObserver LIZJ;

    static {
        LIZIZ = ((Boolean) C993803ua.LIZ.getValue()).booleanValue() ? Collections.synchronizedMap(new WeakHashMap()) : new ConcurrentHashMap<>();
        LIZJ = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ConcurrentHashMap<String, C993503uX> concurrentHashMap;
                C993503uX c993503uXRemove;
                C993503uX c993503uX;
                String str;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ConcurrentHashMap<String, C993503uX> concurrentHashMap2 = TrackNodeStore.LIZ;
                    String str2 = TrackNodeStore.LIZIZ.get(lifecycleOwner);
                    if (str2 != null && (c993503uXRemove = (concurrentHashMap = TrackNodeStore.LIZ).remove(str2)) != null && c993503uXRemove.LLILZ) {
                        InterfaceC1748810vbr interfaceC1748810vbr = c993503uXRemove.LLILLL;
                        if ((interfaceC1748810vbr instanceof C993503uX) && (c993503uX = (C993503uX) interfaceC1748810vbr) != null && (str = c993503uX.LL) != null) {
                            concurrentHashMap.remove(str);
                        }
                    }
                    ExecutorC10416045m.LLILLJJLI.execute(new ARunnableS101S0100000_1(lifecycleOwner, 29));
                }
            }
        };
    }

    public static String LIZIZ(Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fn_");
        sbLIZ.append(obj.getClass().getName());
        sbLIZ.append("__");
        sbLIZ.append(obj.hashCode());
        sbLIZ.append("__");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fn_");
        sbLIZ.append(str);
        sbLIZ.append("__");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(String str, LifecycleOwner lifecycleOwner) {
        Map<LifecycleOwner, String> map = LIZIZ;
        if (map.get(lifecycleOwner) == null && lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycleOwner.getLifecycle().addObserver(LIZJ);
            map.put(lifecycleOwner, str);
        }
    }

    public static final C993503uX LIZLLL(String str, LifecycleOwner lifecycleOwner) {
        ConcurrentHashMap<String, C993503uX> concurrentHashMap = LIZ;
        if (str == null) {
            return null;
        }
        C993503uX c993503uX = concurrentHashMap.get(str);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            LIZ(str, lifecycleOwner);
            return c993503uX;
        }
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ.LLIILII(), null, new C960703pF(lifecycleOwner, str, null), 2);
        return c993503uX;
    }

    public static final C993503uX LJ(View view, Function1<? super C1748770vbn, Unit> function1) {
        InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view);
        Object obj = view;
        if (interfaceC1748810vbrLIZ != null) {
            obj = interfaceC1748810vbrLIZ;
        }
        String strLIZIZ = LIZIZ(obj);
        C993703uZ c993703uZ = new C993703uZ();
        InterfaceC1748810vbr interfaceC1748810vbrLIZJ = null;
        if (interfaceC1748810vbrLIZ != null) {
            C1748760vbm.LIZ(interfaceC1748810vbrLIZ, c993703uZ, true, null);
        }
        if (function1 != null) {
            function1.invoke(c993703uZ);
        }
        if (interfaceC1748810vbrLIZ != null) {
            interfaceC1748810vbrLIZJ = C960603pE.LIZJ(interfaceC1748810vbrLIZ);
        }
        C993503uX c993503uX = new C993503uX(strLIZIZ, c993703uZ, interfaceC1748810vbrLIZJ, false);
        LIZ.put(strLIZIZ, c993503uX);
        return c993503uX;
    }

    public static final C993503uX LJFF(InterfaceC1748810vbr interfaceC1748810vbr, Function1<? super C1748770vbn, Unit> function1) {
        String strLIZIZ = LIZIZ(interfaceC1748810vbr);
        C993703uZ c993703uZ = new C993703uZ();
        C1748760vbm.LIZ(interfaceC1748810vbr, c993703uZ, true, null);
        if (function1 != null) {
            function1.invoke(c993703uZ);
        }
        C993503uX c993503uX = new C993503uX(strLIZIZ, c993703uZ, C960603pE.LIZJ(interfaceC1748810vbr), false);
        ConcurrentHashMap<String, C993503uX> concurrentHashMap = LIZ;
        concurrentHashMap.put(strLIZIZ, c993503uX);
        if (interfaceC1748810vbr instanceof C993503uX) {
            concurrentHashMap.remove(((C993503uX) interfaceC1748810vbr).LL);
        }
        return c993503uX;
    }
}
