package com.ss.android.ugc.aweme.net.interceptor.spi;

import X.C0XLO;
import X.C0XLP;
import X.C0XLQ;
import X.C0XM9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class TikTokApiAlisgInterceptor implements IApiAlisgInterceptor {
    @Override // com.ss.android.ugc.aweme.net.interceptor.spi.IApiAlisgInterceptor
    public final void LIZIZ(C0XM9 c0xm9) {
        C0XLO c0xlo = c0xm9.LIZJ;
        if (Intrinsics.LJFF(c0xlo.LIZLLL, "api.tiktokv.com")) {
            c0xlo.LIZLLL("api-h2.tiktokv.com");
        }
    }

    @Override // com.ss.android.ugc.aweme.net.interceptor.spi.IApiAlisgInterceptor
    public final String LIZ(String str, String str2, String str3) {
        C0XLP c0xlpLJIIJ;
        C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(str2);
        if (c0xlqLJIIL != null && (c0xlpLJIIJ = c0xlqLJIIL.LJIIJ()) != null) {
            if (Intrinsics.LJFF(c0xlqLJIIL.LIZLLL, "api.tiktokv.com")) {
                c0xlpLJIIJ.LJFF("api-h2.tiktokv.com");
            }
            return c0xlpLJIIJ.LIZLLL().LJIIIIZZ;
        }
        return str2;
    }
}
