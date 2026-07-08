package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net;

import X.C123100dR;
import X.C13BV;
import X.C1697810uHb;
import X.InterfaceC1904907d9;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentChunkRequestTimeoutInterceptor implements InterfaceC1904907d9 {
    public final List<String> LL = C1697810uHb.LJIIJJI("1", "16");
    public final C13BV LLILLJJLI = C13BV.INSTANCE;

    public final Map<String, String> LIZ(Request request) {
        String string;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String strDecode = "";
        try {
            try {
                TypedOutput body = request.getBody();
                if (body != null) {
                    body.writeTo(byteArrayOutputStream);
                }
                string = byteArrayOutputStream.toString();
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                string = "";
            }
            try {
                strDecode = URLDecoder.decode(string, StandardCharsets.UTF_8.name());
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                if (C123100dR.LIZ(strDecode)) {
                    Iterator it2 = a0.LJJLIIIJILLIZJL(strDecode, new String[]{"&"}, 0, 6).iterator();
                    while (it2.hasNext()) {
                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
                        if (!listLJJLIIIJILLIZJL.isEmpty()) {
                            linkedHashMap.put(listLJJLIIIJILLIZJL.get(0), listLJJLIIIJILLIZJL.get(1));
                        }
                    }
                }
            } catch (Exception e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (Exception e6) {
                TryCatchGuardChecker.doCheck(e6);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    @Override // X.InterfaceC1904907d9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0X52<?> intercept(X.InterfaceC841770X0l r10) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.CommerceAgentChunkRequestTimeoutInterceptor.intercept(X.0X0l):X.0X52");
    }
}
