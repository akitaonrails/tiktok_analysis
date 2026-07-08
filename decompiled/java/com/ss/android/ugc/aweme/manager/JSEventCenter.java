package com.ss.android.ugc.aweme.manager;

import X.C1323820kYO;
import X.C1548820qPI;
import X.C262100zr;
import X.C397901gf;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class JSEventCenter implements InterfaceC1141530foN, GenericLifecycleObserver {
    public final boolean LL;
    public boolean LLILLJJLI;
    public final Map<String, Function1<InterfaceC1107590evd, Unit>> LLILLL;

    public JSEventCenter() {
        this(true);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        this.LLILLJJLI = true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        } else if (event == Lifecycle.Event.ON_START) {
            onStart();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.LLILLJJLI = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Iterator it2 = ((LinkedHashMap) this.LLILLL).entrySet().iterator();
        while (it2.hasNext()) {
            C1548820qPI.LJIIIIZZ((String) ((Map.Entry) it2.next()).getKey(), this);
        }
        ((LinkedHashMap) this.LLILLL).clear();
    }

    public JSEventCenter(boolean z) {
        this.LL = z;
        this.LLILLJJLI = true;
        this.LLILLL = new LinkedHashMap();
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (this.LL && !this.LLILLJJLI) {
            return;
        }
        Function1 function1 = (Function1) ((LinkedHashMap) this.LLILLL).get(c262100zr.LIZ);
        if (function1 != null) {
            function1.invoke(c262100zr.LIZIZ);
        }
    }

    public final void JG1(String str, JSONObject jSONObject) {
        C1323820kYO c1323820kYO;
        if (jSONObject != null) {
            c1323820kYO = new C1323820kYO(jSONObject);
        } else {
            c1323820kYO = null;
        }
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), c1323820kYO, str));
    }

    public final void LIZ(String str, Function1 function1) {
        if (this.LLILLL.containsKey(str)) {
            return;
        }
        this.LLILLL.put(str, function1);
        C1548820qPI.LIZLLL(str, this);
    }
}
