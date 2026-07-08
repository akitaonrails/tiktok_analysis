package com.bytedance.frameworks.baselib.network.http.retrofit;

import X.C0X52;
import X.C0XMB;
import X.C1493500oy4;
import X.C1494160oz8;
import X.C1494230ozF;
import X.C1494590ozp;
import X.InterfaceC1494070oyz;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.ttnet.TTInternalInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes24.dex */
public class BaseSsInterceptor implements TTInternalInterceptor {
    public void LIZ(Request request, C0X52 c0x52) {
    }

    public Request LIZIZ(Request request) {
        InterfaceC1494070oyz interfaceC1494070oyz = C1494230ozF.LIZ;
        if (request == null) {
            return null;
        }
        try {
            URL url = new URL(request.getUrl());
            if ("http".equals(url.getProtocol())) {
                C1494230ozF.LJIIIZ(url.getHost(), url.getPath(), false, request.getMetrics());
            }
        } catch (MalformedURLException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String url2 = request.getUrl();
        if (request.getExtraInfo() instanceof C1494160oz8) {
            request.getExtraInfo();
            C1494230ozF.LIZLLL(url2, request.getMetrics());
        } else {
            C1494230ozF.LIZLLL(url2, request.getMetrics());
        }
        if (request.getUrl().startsWith("https:") && url2.startsWith("http:")) {
            try {
                URL url3 = new URL(url2);
                C1494230ozF.LJIIIZ(url3.getHost(), url3.getPath(), true, request.getMetrics());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (request.isAddCommonParam()) {
            C1493500oy4.LIZ().getClass();
            try {
                url2 = C1494230ozF.LIZ(url2, request.getMetrics());
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        C0XMB c0xmbNewBuilder = request.newBuilder();
        c0xmbNewBuilder.LIZJ(url2);
        return c0xmbNewBuilder.LIZ();
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) throws Throwable {
        C0X52 c0x52LIZ;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request requestLIZIZ = LIZIZ(c1494590ozp.LIZJ);
        if (C1494590ozp.LJFF) {
            c0x52LIZ = c1494590ozp.LIZJ(requestLIZIZ);
        } else {
            c0x52LIZ = c1494590ozp.LIZ(requestLIZIZ);
        }
        LIZ(requestLIZIZ, c0x52LIZ);
        return c0x52LIZ;
    }
}
