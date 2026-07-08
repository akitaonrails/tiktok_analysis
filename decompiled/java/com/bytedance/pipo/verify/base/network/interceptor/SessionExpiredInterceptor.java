package com.bytedance.pipo.verify.base.network.interceptor;

import X.C0X52;
import X.C1494590ozp;
import X.C1713530ugx;
import X.C1713570uh1;
import X.C1713600uh4;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SessionExpiredInterceptor implements InterfaceC1904907d9 {
    public final String LL;

    public SessionExpiredInterceptor(String str) {
        this.LL = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        BaseResponse baseResponse;
        C1713570uh1 c1713570uh1LIZ;
        C1713530ugx c1713530ugxLJ;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        C0X52<?> c0x52LIZ = c1494590ozp.LIZ(c1494590ozp.LIZJ);
        try {
            T t = c0x52LIZ.LIZIZ;
            if ((t instanceof BaseResponse) && (baseResponse = (BaseResponse) t) != null && Intrinsics.LJFF(baseResponse.errorCode, "LOGIN_STATUS_EXPIRED") && (c1713570uh1LIZ = C1713600uh4.LIZ(this.LL)) != null && (c1713530ugxLJ = c1713570uh1LIZ.LJ()) != null) {
                c1713530ugxLJ.LJI.set(true);
                return c0x52LIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1713600uh4.LIZIZ(th);
        }
        return c0x52LIZ;
    }
}
