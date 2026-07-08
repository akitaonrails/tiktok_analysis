package ttpobfuscated;

import X.AbstractC842510X3h;
import X.C098200Yq;
import X.C0X0P;
import X.C0X0W;
import X.C0XLX;
import X.C0XLY;
import X.C189200o6;
import X.EnumC847200XLi;
import X.InterfaceC836900WsK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ttp.orbu.sdk.constants.TTPErrorCode;

/* JADX INFO: loaded from: classes14.dex */
public abstract class gg implements InterfaceC836900WsK {
    public abstract C0XLY a(C0X0W c0x0w);

    @Override // X.InterfaceC836900WsK
    public final C0XLY intercept(C0X0W c0x0w) {
        Object c098200Yq;
        try {
            c098200Yq = a(c0x0w);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C0XLX c0xlx = new C0XLX();
            c0xlx.LIZJ = TTPErrorCode.InterceptorException.getValue();
            c0xlx.LIZIZ = EnumC847200XLi.HTTP_2;
            c0xlx.LIZLLL = "InterceptorException";
            c0xlx.LIZ = c0x0w.request();
            c0xlx.LJI = AbstractC842510X3h.create((C0X0P) null, "");
            c098200Yq = c0xlx.LIZ();
        }
        return (C0XLY) c098200Yq;
    }
}
