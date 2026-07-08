package com.bytedance.applog.params;

import X.C08UT;
import X.C2192091Aql;
import X.C2209551Bdp;
import X.C2209791BeD;
import X.InterfaceC2192111Aqn;
import X.InterfaceC2192181Aqu;
import X.InterfaceC2211321Bgg;
import com.bytedance.applog.log.NativeLogWrapper;
import com.bytedance.applog.params.CommonParamsWrapper;
import com.bytedance.applog.params.lifecycle.LifecycleValueObserver;
import com.bytedance.applog.priority.PriorityWrapper;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes35.dex */
public final class CommonParamsWrapper implements InterfaceC2192111Aqn, InterfaceC2192181Aqu {
    public final String LIZ;
    public final List<String> LIZIZ = Collections.singletonList("CommonParamsWrapper");
    public final AtomicBoolean LIZJ = new AtomicBoolean(true);
    public final HashMap<String, InterfaceC2211321Bgg> LIZLLL = new HashMap<>();
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, LifecycleValueObserver>> LJ = new ConcurrentHashMap<>();
    public final C2192091Aql LJFF = new C08UT<Boolean>() { // from class: X.1Aql
        @Override // X.C08UT
        public final Object LIZ() {
            PriorityWrapper.LJIIIZ.LIZIZ(new Object[0]);
            CommonParamsWrapper commonParamsWrapper = this.LIZIZ;
            commonParamsWrapper.nativeInit(commonParamsWrapper.LIZ);
            return Boolean.TRUE;
        }
    };

    private final native String nativeHandleEvent(String str, String str2, String str3);

    public final native void nativeBizClear(String str, String str2);

    public final native String nativeBizGet(String str, String str2, String str3);

    public final native int nativeBizRemove(String str, String str2, String str3);

    public final native void nativeBizSet(String str, String str2, String str3, String str4);

    public final native void nativeBizSetCacheCapability(String str, String str2, int i);

    public final native int nativeInit(String str);

    public final native int nativeSetRuleConfig(String str, String str2, String str3);

    @Override // X.InterfaceC2192181Aqu
    public final void LIZIZ() {
        LIZIZ(new Object[0]);
        NativeLogWrapper.LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1Aql] */
    public CommonParamsWrapper(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC2192181Aqu
    public final String LIZ(String str, C2209551Bdp c2209551Bdp) {
        String str2 = "";
        if (this.LIZJ.get()) {
            return "";
        }
        String str3 = this.LIZ;
        String str4 = (String) c2209551Bdp.load();
        if (str4 != null) {
            str2 = str4;
        }
        String strNativeHandleEvent = nativeHandleEvent(str3, str, str2);
        if (strNativeHandleEvent.length() > 0) {
            C2209791BeD.LJIJJ().LJI(this.LIZIZ, "event:{} had append some params!!", str);
        }
        return strNativeHandleEvent;
    }
}
