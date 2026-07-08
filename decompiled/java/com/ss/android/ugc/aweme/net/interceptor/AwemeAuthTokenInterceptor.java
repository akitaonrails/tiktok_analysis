package com.ss.android.ugc.aweme.net.interceptor;

import X.C0X0W;
import X.C0X1U;
import X.C0X1V;
import X.C0X33;
import X.C0XLY;
import X.C1495400p18;
import X.C20667087t;
import X.C847400XMc;
import com.ss.android.ugc.aweme.net.INetReleaseInterceptor;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.Request;
import org.json.JSONException;

/* JADX INFO: loaded from: classes14.dex */
public class AwemeAuthTokenInterceptor implements INetReleaseInterceptor {
    @Override // X.InterfaceC836900WsK
    public final C0XLY intercept(C0X0W c0x0w) throws JSONException {
        ArrayList arrayList;
        C1495400p18 c1495400p18 = (C1495400p18) c0x0w;
        Request request = c1495400p18.LJFF;
        Map mapLIZJ = C847400XMc.LIZJ(request.url().LJIIIIZZ);
        C0X1V c0x1vHeaders = request.headers();
        if (mapLIZJ != null && !mapLIZJ.isEmpty()) {
            if (c0x1vHeaders == null) {
                String[] strArr = new String[mapLIZJ.size() * 2];
                int i = 0;
                for (Map.Entry entry : mapLIZJ.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        String strTrim = ((String) entry.getKey()).trim();
                        String strTrim2 = ((String) entry.getValue()).trim();
                        C0X1V.LIZIZ(strTrim);
                        C0X1V.LIZJ(strTrim2, strTrim);
                        strArr[i] = strTrim;
                        strArr[i + 1] = strTrim2;
                        i += 2;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null");
                    }
                }
                c0x1vHeaders = new C0X1V(strArr);
            } else {
                C0X1U c0x1uLJI = c0x1vHeaders.LJI();
                for (Map.Entry entry2 : mapLIZJ.entrySet()) {
                    c0x1uLJI.LIZ((String) entry2.getKey(), (String) entry2.getValue());
                }
                c0x1vHeaders = new C0X1V(c0x1uLJI);
            }
        }
        C0X33 c0x33NewBuilder = request.newBuilder();
        if (c0x1vHeaders == null) {
            c0x1vHeaders = request.headers();
        }
        c0x33NewBuilder.getClass();
        c0x33NewBuilder.LIZLLL = c0x1vHeaders.LJI();
        C0XLY c0xlyLIZ = c1495400p18.LIZ(c0x33NewBuilder.LIZIZ());
        C0X1V c0x1v = c0xlyLIZ.LLILZLL;
        if (c0x1v != null) {
            arrayList = new ArrayList();
            for (String str : c0x1v.LJFF()) {
                arrayList.add(new C20667087t(str, c0x1v.LIZLLL(str)));
            }
        } else {
            arrayList = null;
        }
        C847400XMc.LJIIL(request.url().LJIIIIZZ, null, null, arrayList);
        return c0xlyLIZ;
    }
}
