package com.ss.android.ugc.aweme.account.network.ttp;

import X.C01GW;
import X.C0W8M;
import X.C0X52;
import X.C0XH6;
import X.C1494590ozp;
import X.C452501pT;
import X.C847840XNu;
import X.C847850XNv;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.sdk.account.region.TTPInterceptor;

/* JADX INFO: loaded from: classes14.dex */
public final class TTPInterceptorWrapper implements InterfaceC1904907d9 {
    public final C0XH6 LL;
    public final C01GW LLILLJJLI;

    public TTPInterceptorWrapper() {
        this(C847850XNv.LIZ);
    }

    public TTPInterceptorWrapper(C0XH6 c0xh6) {
        this.LL = c0xh6;
        this.LLILLJJLI = C452501pT.LIZIZ(new C847840XNu(this));
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        if (!C0W8M.LIZJ("account/TTPInterceptorWrapper", c1494590ozp.LIZJ.getUrl())) {
            return c1494590ozp.LIZ(c1494590ozp.LIZJ);
        }
        return ((TTPInterceptor) this.LLILLJJLI.getValue()).intercept(interfaceC841770X0l);
    }
}
