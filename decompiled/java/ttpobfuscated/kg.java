package ttpobfuscated;

import X.C098200Yq;
import X.C189200o6;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ttp.orbu.sdk.init.TTPOrbuContext;
import ttpobfuscated.q3;
import ttpobfuscated.sg;

/* JADX INFO: loaded from: classes24.dex */
public final class kg implements sg {
    public final TTPOrbuContext a;

    public kg(TTPOrbuContext tTPOrbuContext) {
        this.a = tTPOrbuContext;
    }

    @Override // ttpobfuscated.sg
    public Object a(InterfaceC1364105Vn<? super rg> interfaceC1364105Vn) throws sg.a.C0072a {
        Object c098200Yq;
        try {
            c098200Yq = new rg(this.a.getRegion(), this.a.getUserId(), this.a.getDeviceId(), this.a.getUserAction(), b8.a(this.a.getExtraInfo()));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return c098200Yq;
        }
        q3.a aVar = q3.a;
        String str = lg.a;
        aVar.getClass();
        q3.a.c.b("Get user context error", str, thM5exceptionOrNullimpl);
        throw new sg.a.C0072a(thM5exceptionOrNullimpl);
    }
}
