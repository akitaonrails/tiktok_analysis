package com.ss.android.ugc.aweme.net.interceptor.spi;

import X.C0XLP;
import X.C0XLQ;
import X.C13LP;
import com.ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptorTTNet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public final class MusicallyApiAlisgInterceptor implements IApiAlisgInterceptor {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r4.equals("US") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r4.equals("TR") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r4.equals("PK") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r4.equals("NP") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r4.equals("KR") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r4.equals("JP") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (r4.equals("IT") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r4.equals("IQ") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        if (r4.equals("IN") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
    
        if (r4.equals("LK") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        r4 = r2.LJFF.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        if (kotlin.text.u.LJJIIJZLJL(r4, "/service/2/app_log/", false) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0095, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF("log-va.tiktokv.com", r1) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        r2.LIZLLL("log.tiktokv.com");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF("rtlog-va.tiktokv.com", r1) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a5, code lost:
    
        r2.LIZLLL("rtlog.tiktokv.com");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
    
        com.ss.android.ugc.aweme.net.partner.ApiAlisgTTNetHandler.LIZ.getClass();
        r1 = com.ss.android.ugc.aweme.net.partner.ApiAlisgTTNetHandler.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        if ((r1 instanceof java.util.Collection) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
    
        if (r1.isEmpty() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bd, code lost:
    
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        if (r1.hasNext() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
    
        if (kotlin.text.u.LJJIIJZLJL(r4, r1.next(), false) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d3, code lost:
    
        r2.LIZLLL("api-h2.tiktokv.com");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        if (r4.equals("GB") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e9, code lost:
    
        if (r4.equals("FR") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f3, code lost:
    
        if (r4.equals("ES") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fd, code lost:
    
        if (r4.equals("DE") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0107, code lost:
    
        if (r4.equals("BR") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, "api-va.tiktokv.com") == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0111, code lost:
    
        r2.LIZLLL("api19-va.tiktokv.com");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.net.interceptor.spi.IApiAlisgInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C0XM9 r6) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.interceptor.spi.MusicallyApiAlisgInterceptor.LIZIZ(X.0XM9):void");
    }

    @Override // com.ss.android.ugc.aweme.net.interceptor.spi.IApiAlisgInterceptor
    public final String LIZ(String str, String str2, String str3) {
        C0XLP c0xlpLJIIJ;
        C0XLP c0xlpLJIIJ2;
        C0XLQ c0xlqLJIIL;
        C0XLP c0xlpLJIIJ3;
        if (C13LP.LJJJJ(str3, ApiAlisgInterceptorTTNet.LLILLJJLI)) {
            Iterator<String> it2 = ApiAlisgInterceptorTTNet.LL.iterator();
            while (it2.hasNext()) {
                if (u.LJJIIJZLJL(str, it2.next(), false) && (c0xlqLJIIL = C0XLQ.LJIIL(str2)) != null && (c0xlpLJIIJ3 = c0xlqLJIIL.LJIIJ()) != null) {
                    String str4 = c0xlqLJIIL.LIZLLL;
                    if (!u.LJJIIJZLJL(str, "/service/2/app_log/", false)) {
                        c0xlpLJIIJ3.LJFF("api-h2.tiktokv.com");
                    } else if ("log-va.tiktokv.com".equals(str4)) {
                        c0xlpLJIIJ3.LJFF("log.tiktokv.com");
                    } else if ("rtlog-va.tiktokv.com".equals(str4)) {
                        c0xlpLJIIJ3.LJFF("rtlog.tiktokv.com");
                    }
                    str2 = c0xlpLJIIJ3.LIZLLL().LJIIIIZZ;
                }
            }
            return str2;
        }
        if (C13LP.LJJJJ(str3, ApiAlisgInterceptorTTNet.LLILLL)) {
            C0XLQ c0xlqLJIIL2 = C0XLQ.LJIIL(str2);
            if (c0xlqLJIIL2 != null && (c0xlpLJIIJ2 = c0xlqLJIIL2.LJIIJ()) != null && Intrinsics.LJFF(c0xlqLJIIL2.LIZLLL, "api-va.tiktokv.com")) {
                c0xlpLJIIJ2.LJFF("api19-va.tiktokv.com");
                return c0xlpLJIIJ2.LIZLLL().LJIIIIZZ;
            }
            return str2;
        }
        C0XLQ c0xlqLJIIL3 = C0XLQ.LJIIL(str2);
        if (c0xlqLJIIL3 == null || (c0xlpLJIIJ = c0xlqLJIIL3.LJIIJ()) == null || !Intrinsics.LJFF(c0xlqLJIIL3.LIZLLL, "api-va.tiktokv.com")) {
            return str2;
        }
        c0xlpLJIIJ.LJFF("api16-va.tiktokv.com");
        return c0xlpLJIIJ.LIZLLL().LJIIIIZZ;
    }
}
