package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import X.InterfaceC1493790oyX;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes24.dex */
public class OkHttp3DnsParserInterceptor implements InterfaceC1493790oyX {
    public static volatile OkHttp3DnsParserInterceptor LIZ;

    public static OkHttp3DnsParserInterceptor LIZ() {
        if (LIZ == null) {
            synchronized (OkHttp3DnsParserInterceptor.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new OkHttp3DnsParserInterceptor();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}
