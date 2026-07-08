package com.bytedance.apm.trace.model.cross;

import X.C794620VFc;
import X.InterfaceC794710VFl;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class TracingCrossManager {
    public static Map<String, C794620VFc> sCrossTracingContext = new ConcurrentHashMap();

    public static void unRegisterCross(String str) {
        sCrossTracingContext.remove(str);
    }

    public static void registerCross(String str, C794620VFc c794620VFc) {
        sCrossTracingContext.put(str, c794620VFc);
    }

    public static void onPassBackAsChild(String str, String str2, ArrayList<NativeSpan> arrayList) {
        InterfaceC794710VFl toSpan;
        C794620VFc c794620VFc = sCrossTracingContext.get(str);
        if (c794620VFc != null) {
            sCrossTracingContext.remove(str);
            synchronized (c794620VFc) {
                if (!c794620VFc.LJII && c794620VFc.LJI) {
                    boolean z = true;
                    for (NativeSpan nativeSpan : arrayList) {
                        if (nativeSpan != null && (toSpan = nativeSpan.parseToSpan(c794620VFc.LJ)) != null) {
                            if (z) {
                                toSpan.LJFF(str2);
                            }
                            toSpan.LIZ(nativeSpan.getStartTime(), nativeSpan.getFinishTime());
                            z = false;
                        }
                    }
                }
            }
        }
    }

    public static void onPassBackAsReference(String str, String str2, ArrayList<NativeSpan> arrayList) {
        InterfaceC794710VFl toSpan;
        C794620VFc c794620VFc = sCrossTracingContext.get(str);
        if (c794620VFc != null) {
            sCrossTracingContext.remove(str);
            synchronized (c794620VFc) {
                if (!c794620VFc.LJII && c794620VFc.LJI) {
                    boolean z = true;
                    for (NativeSpan nativeSpan : arrayList) {
                        if (nativeSpan != null && (toSpan = nativeSpan.parseToSpan(c794620VFc.LJ)) != null) {
                            if (z) {
                                toSpan.LIZLLL(str2);
                            }
                            toSpan.LIZ(nativeSpan.getStartTime(), nativeSpan.getFinishTime());
                            z = false;
                        }
                    }
                }
            }
        }
    }
}
