package com.ss.android.ugc.aweme.net.monitor;

import X.C0X0W;
import X.C0XLY;
import X.C1495400p18;
import X.C841860X0u;
import X.C841880X0w;
import X.EnumC841890X0x;
import X.InterfaceC836900WsK;
import okhttp3.Request;

/* JADX INFO: loaded from: classes14.dex */
public final class OkHttpMonitorInterceptor implements InterfaceC836900WsK {
    /* JADX WARN: Type inference failed for: r0v4, types: [R, X.0XLY] */
    @Override // X.InterfaceC836900WsK
    public final C0XLY intercept(C0X0W c0x0w) {
        RuntimeException runtimeException;
        RuntimeException runtimeException2;
        C0XLY c0xly;
        C1495400p18 c1495400p18 = (C1495400p18) c0x0w;
        Request request = c1495400p18.LJFF;
        C841860X0u c841860X0u = C841860X0u.LIZJ;
        C841880X0w<Request, C0XLY> c841880X0wLJFF = c841860X0u.LJFF(new C841880X0w<>(request, 62));
        EnumC841890X0x enumC841890X0x = c841880X0wLJFF.LIZLLL;
        if (enumC841890X0x == EnumC841890X0x.INTERCEPT && (c0xly = c841880X0wLJFF.LIZIZ) != null) {
            return c0xly;
        }
        EnumC841890X0x enumC841890X0x2 = EnumC841890X0x.EXCEPTION;
        if (enumC841890X0x == enumC841890X0x2 && (runtimeException2 = c841880X0wLJFF.LIZJ) != null) {
            throw runtimeException2;
        }
        c841880X0wLJFF.LIZIZ = c1495400p18.LIZ(c841880X0wLJFF.LIZ);
        C841880X0w<Request, C0XLY> c841880X0wLIZ = c841860X0u.LIZ(c841880X0wLJFF);
        if (c841880X0wLIZ.LIZLLL == enumC841890X0x2 && (runtimeException = c841880X0wLIZ.LIZJ) != null) {
            throw runtimeException;
        }
        return c841880X0wLIZ.LIZIZ;
    }
}
