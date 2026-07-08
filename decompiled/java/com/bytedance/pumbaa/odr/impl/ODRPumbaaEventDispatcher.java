package com.bytedance.pumbaa.odr.impl;

import X.C098200Yq;
import X.C189200o6;
import X.C800770Vb9;
import X.C800800VbC;
import X.C823280WRi;
import com.bytedance.pumbaa.odr.api.IODREventDispatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class ODRPumbaaEventDispatcher implements IODREventDispatcher {
    public final C800770Vb9 LIZ = new C800770Vb9();

    @Override // com.bytedance.pumbaa.odr.api.IODREventDispatcher
    public final void LIZ(C800800VbC c800800VbC) {
        Object c098200Yq;
        try {
            this.LIZ.getClass();
            C800770Vb9.LIZ(c800800VbC);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }
}
