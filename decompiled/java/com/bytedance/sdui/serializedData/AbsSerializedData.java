package com.bytedance.sdui.serializedData;

import X.C098200Yq;
import X.C189200o6;
import X.InterfaceC1298970juJ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public class AbsSerializedData {
    public final void LIZ(OutputStream outputStream) {
        Object c098200Yq;
        Object c098200Yq2;
        InterfaceC1298970juJ interfaceC1298970juJ;
        String canonicalName = getClass().getCanonicalName();
        if (canonicalName == null) {
            return;
        }
        try {
            c098200Yq = Class.forName(Intrinsics.LJIIJJI("$$Builder", canonicalName));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            try {
                Object objNewInstance = ((Class) c098200Yq).newInstance();
                if (objNewInstance instanceof InterfaceC1298970juJ) {
                    c098200Yq2 = (InterfaceC1298970juJ) objNewInstance;
                } else {
                    c098200Yq2 = null;
                }
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) == null && (interfaceC1298970juJ = (InterfaceC1298970juJ) c098200Yq2) != null) {
                interfaceC1298970juJ.LIZ(this, outputStream);
            }
        }
    }
}
