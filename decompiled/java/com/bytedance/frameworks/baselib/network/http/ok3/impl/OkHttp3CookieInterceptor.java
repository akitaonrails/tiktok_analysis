package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import X.C0X0W;
import X.C0X1V;
import X.C0X33;
import X.C0XLY;
import X.C1495400p18;
import X.C2089108Gj;
import X.C2109008Oa;
import X.InterfaceC836900WsK;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.Request;

/* JADX INFO: loaded from: classes14.dex */
public class OkHttp3CookieInterceptor implements InterfaceC836900WsK {
    @Override // X.InterfaceC836900WsK
    public final C0XLY intercept(C0X0W c0x0w) {
        URI uriLIZ;
        Set<String> setLJFF;
        boolean zEquals;
        Map<String, List<String>> map;
        Set<String> setLJFF2;
        C1495400p18 c1495400p18 = (C1495400p18) c0x0w;
        Request requestLIZIZ = c1495400p18.LJFF;
        if (requestLIZIZ != null && requestLIZIZ.headers() != null && CardStruct.IStatusCode.DEFAULT.equals(requestLIZIZ.header("x-ttnet-bypass-cookie"))) {
            C0X33 c0x33NewBuilder = requestLIZIZ.newBuilder();
            c0x33NewBuilder.LJFF("x-ttnet-bypass-cookie");
            return c1495400p18.LIZ(c0x33NewBuilder.LIZIZ());
        }
        try {
            uriLIZ = requestLIZIZ.url().LJIL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            uriLIZ = C2089108Gj.LIZ(requestLIZIZ.url().LJIIIIZZ);
        }
        C0X33 c0x33NewBuilder2 = requestLIZIZ.newBuilder();
        CookieHandler cookieHandler = CookieHandler.getDefault();
        C0X1V c0x1vHeaders = requestLIZIZ.headers();
        String strReplaceFirst = null;
        if (uriLIZ != null) {
            String string = uriLIZ.toString();
            if (C2109008Oa.LIZJ && C2109008Oa.LIZLLL && string != null && string.contains(C2109008Oa.LIZ)) {
                String scheme = UriProtector.parse(string).getScheme();
                if ("http".equals(scheme)) {
                    string = string.replaceFirst("http", "https");
                } else if ("ws".equals(scheme)) {
                    string = string.replaceFirst("ws", "wss");
                }
                strReplaceFirst = string.replaceFirst(C2109008Oa.LIZ, "");
            }
        }
        try {
            HashMap map2 = new HashMap();
            if (c0x1vHeaders != null && (setLJFF2 = c0x1vHeaders.LJFF()) != null && !setLJFF2.isEmpty()) {
                for (String str : setLJFF2) {
                    map2.put(str, c0x1vHeaders.LJIIJJI(str));
                }
            }
            if (requestLIZIZ.headers() != null) {
                zEquals = "1".equals(requestLIZIZ.header("x-metasec-bypass-okhttp-cookie"));
                if ("1".equals(requestLIZIZ.header("x-metasec-ok-bypass-downgrade-cookie"))) {
                    zEquals = true;
                }
            } else {
                zEquals = false;
            }
            if (cookieHandler != null && !zEquals) {
                try {
                    if (strReplaceFirst != null) {
                        map = cookieHandler.get(new URI(strReplaceFirst), map2);
                    } else {
                        map = cookieHandler.get(uriLIZ, map2);
                    }
                    if (map != null && map.size() > 0) {
                        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                            String key = entry.getKey();
                            StringBuilder sb = new StringBuilder();
                            if ("X-SS-Cookie".equalsIgnoreCase(key) || "Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                                if (!entry.getValue().isEmpty()) {
                                    int i = 0;
                                    for (String str2 : entry.getValue()) {
                                        if (i > 0) {
                                            sb.append("; ");
                                        }
                                        sb.append(str2);
                                        i++;
                                    }
                                    c0x33NewBuilder2.LIZ(key, sb.toString());
                                }
                            }
                        }
                    }
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            requestLIZIZ = c0x33NewBuilder2.LIZIZ();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        C0XLY c0xlyLIZ = c1495400p18.LIZ(requestLIZIZ);
        HashMap map3 = new HashMap();
        C0X1V c0x1v = c0xlyLIZ.LLILZLL;
        if (c0x1v != null && (setLJFF = c0x1v.LJFF()) != null && !setLJFF.isEmpty()) {
            for (String str3 : setLJFF) {
                map3.put(str3, c0x1v.LJIIJJI(str3));
            }
        }
        if (cookieHandler != null) {
            try {
                if (strReplaceFirst != null) {
                    cookieHandler.put(new URI(strReplaceFirst), map3);
                    return c0xlyLIZ;
                }
                cookieHandler.put(uriLIZ, map3);
                return c0xlyLIZ;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        return c0xlyLIZ;
    }
}
