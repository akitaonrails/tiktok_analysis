package com.bytedance.apm.agent.instrumentation.interceptor;

import X.C0X0W;
import X.C0X33;
import X.C0XLY;
import X.C787960Uva;
import X.C792720V7u;
import X.InterfaceC836900WsK;
import android.text.TextUtils;
import okhttp3.Request;

/* JADX INFO: loaded from: classes14.dex */
public class AddHeaderInterceptor implements InterfaceC836900WsK {
    @Override // X.InterfaceC836900WsK
    public C0XLY intercept(C0X0W c0x0w) {
        Request request = c0x0w.request();
        C0X33 c0x33NewBuilder = request.newBuilder();
        if (TextUtils.isEmpty(request.header("x-tt-trace-log"))) {
            C792720V7u c792720V7u = C787960Uva.LIZ;
            if (c792720V7u.LLJJJ) {
                if (c792720V7u.LJIILJJIL() && c792720V7u.LLJI) {
                    c0x33NewBuilder.LIZ("x-tt-trace-log", "01");
                } else if (c792720V7u.LLJ == 1 && c792720V7u.LLJI) {
                    c0x33NewBuilder.LIZ("x-tt-trace-log", "02");
                }
            }
        }
        return c0x0w.LIZ(c0x33NewBuilder.LIZIZ());
    }
}
