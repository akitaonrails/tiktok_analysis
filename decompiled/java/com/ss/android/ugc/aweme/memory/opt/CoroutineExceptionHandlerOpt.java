package com.ss.android.ugc.aweme.memory.opt;

import X.C08Q0;
import X.C098200Yq;
import X.C189200o6;
import X.C1BWL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class CoroutineExceptionHandlerOpt {
    public static CoroutineExceptionHandler impl;

    static {
        new CoroutineExceptionHandlerOpt();
        init();
    }

    public static final void init() {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C08Q0.LJ(C1BWL.LIZ(), "coroutine_exception_opt", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        if (((Boolean) c098200Yq).booleanValue()) {
            try {
                impl = (CoroutineExceptionHandler) Class.forName("okp.b").newInstance();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }
}
