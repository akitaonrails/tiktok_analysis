package com.ss.android.ugc.aweme.net.monitor;

import X.C080U;
import X.C0X12;
import X.C0X52;
import X.C1494590ozp;
import X.C841860X0u;
import X.C841880X0w;
import X.EnumC841890X0x;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;
import java.util.Iterator;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class TTNetMonitorInterceptor implements InterfaceC1904907d9 {
    /* JADX WARN: Type inference failed for: r7v0, types: [R, X.0X52] */
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        RuntimeException runtimeException;
        String requestId;
        C0X12 c0x12;
        RuntimeException runtimeException2;
        C0X52<?> c0x52;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        C841880X0w<Request, C0X52<?>> c841880X0wLIZIZ = C841860X0u.LIZJ.LIZIZ(new C841880X0w<>(c1494590ozp.LIZJ, 62));
        EnumC841890X0x enumC841890X0x = c841880X0wLIZIZ.LIZLLL;
        if (enumC841890X0x == EnumC841890X0x.INTERCEPT && (c0x52 = c841880X0wLIZIZ.LIZIZ) != null) {
            return c0x52;
        }
        if (enumC841890X0x == EnumC841890X0x.EXCEPTION && (runtimeException2 = c841880X0wLIZIZ.LIZJ) != null) {
            throw runtimeException2;
        }
        ?? LIZ = c1494590ozp.LIZ(c841880X0wLIZIZ.LIZ);
        c841880X0wLIZIZ.LIZIZ = LIZ;
        T t = LIZ.LIZIZ;
        if (t instanceof C0X12) {
            String str = null;
            C0X12 c0x122 = (C0X12) t;
            if (c0x122 != null) {
                requestId = c0x122.getRequestId();
            } else {
                requestId = null;
            }
            if (TextUtils.isEmpty(requestId)) {
                List<C080U> list = LIZ.LIZ.LIZLLL;
                if (list != null) {
                    Iterator<C080U> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C080U next = it2.next();
                        if (u.LJIJI("X-Tt-Logid", next.LIZ, true)) {
                            str = next.LIZIZ;
                            break;
                        }
                    }
                }
                T t2 = LIZ.LIZIZ;
                if ((t2 instanceof C0X12) && (c0x12 = (C0X12) t2) != null) {
                    c0x12.setRequestId(str);
                }
            }
        }
        C841880X0w<Request, C0X52<?>> c841880X0wLJI = C841860X0u.LIZJ.LJI(c841880X0wLIZIZ);
        if (c841880X0wLJI.LIZLLL == EnumC841890X0x.EXCEPTION && (runtimeException = c841880X0wLJI.LIZJ) != null) {
            throw runtimeException;
        }
        return c841880X0wLJI.LIZIZ;
    }
}
