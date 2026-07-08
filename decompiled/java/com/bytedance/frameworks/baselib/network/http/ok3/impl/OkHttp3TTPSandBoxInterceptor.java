package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import X.C0X0W;
import X.C0XLY;
import X.C1495400p18;
import X.C847050XKt;
import X.InterfaceC836900WsK;
import X.InterfaceC847060XKu;
import com.bytedance.ttnet.tnc.TNCManager;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.Request;

/* JADX INFO: loaded from: classes14.dex */
public class OkHttp3TTPSandBoxInterceptor implements InterfaceC836900WsK {
    public static volatile InterfaceC847060XKu LIZ;

    @Override // X.InterfaceC836900WsK
    public final C0XLY intercept(C0X0W c0x0w) throws IOException {
        C1495400p18 c1495400p18 = (C1495400p18) c0x0w;
        Request request = c1495400p18.LJFF;
        if (LIZ != null && "/get_domains/v5/".equals(request.url().LJFF())) {
            InterfaceC847060XKu interfaceC847060XKu = LIZ;
            String strMethod = request.method();
            String str = request.url().LJIIIIZZ;
            Map<String, List<String>> mapLJIIIZ = request.headers().LJIIIZ();
            C847050XKt c847050XKt = (C847050XKt) interfaceC847060XKu;
            c847050XKt.LIZ.getClass();
            if (!c847050XKt.LIZ.LJJIFFI.LIZIZ(strMethod, str, "", TNCManager.LJIIL(mapLJIIIZ))) {
                throw new IOException("TNC requsest dropped by sandbox");
            }
        }
        return c1495400p18.LIZ(request);
    }
}
