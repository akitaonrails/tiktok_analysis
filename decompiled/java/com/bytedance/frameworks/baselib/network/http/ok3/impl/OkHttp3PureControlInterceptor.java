package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import X.C0X0W;
import X.C0X33;
import X.C0XLY;
import X.C1495400p18;
import X.InterfaceC836900WsK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.Request;

/* JADX INFO: loaded from: classes14.dex */
public class OkHttp3PureControlInterceptor implements InterfaceC836900WsK {
    @Override // X.InterfaceC836900WsK
    public final C0XLY intercept(C0X0W c0x0w) {
        boolean zEquals;
        C1495400p18 c1495400p18 = (C1495400p18) c0x0w;
        Request requestLIZIZ = c1495400p18.LJFF;
        if (requestLIZIZ != null && requestLIZIZ.headers() != null && requestLIZIZ.headers().LIZLLL("x-metasec-bypass-ttnet-features") != null) {
            zEquals = "1".equals(requestLIZIZ.headers().LIZLLL("x-metasec-bypass-ttnet-features"));
        } else {
            zEquals = false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((TreeMap) requestLIZIZ.headers().LJIIIZ()).entrySet().iterator();
        while (it2.hasNext()) {
            String str = (String) ((Map.Entry) it2.next()).getKey();
            if ((str.equals("x-tt-bypass-dp") && zEquals) || str.startsWith("x-metasec")) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() > 0) {
            C0X33 c0x33NewBuilder = requestLIZIZ.newBuilder();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                c0x33NewBuilder.LJFF((String) it3.next());
            }
            requestLIZIZ = c0x33NewBuilder.LIZIZ();
        }
        return c1495400p18.LIZ(requestLIZIZ);
    }
}
