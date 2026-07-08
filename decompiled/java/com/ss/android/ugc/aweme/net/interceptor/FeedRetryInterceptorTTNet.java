package com.ss.android.ugc.aweme.net.interceptor;

import X.InterfaceC1904907d9;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public class FeedRetryInterceptorTTNet implements InterfaceC1904907d9 {
    public static final Pattern LL = PatternProtector.compile(".*/aweme/v\\d/feed.*");

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    @Override // X.InterfaceC1904907d9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0X52 intercept(X.InterfaceC841770X0l r7) throws java.lang.Exception {
        /*
            r6 = this;
            r0 = r7
            X.0ozp r0 = (X.C1494590ozp) r0     // Catch: java.lang.Exception -> Ld
            com.bytedance.retrofit2.client.Request r1 = r0.LIZJ     // Catch: java.lang.Exception -> Ld
            r0 = r7
            X.0ozp r0 = (X.C1494590ozp) r0     // Catch: java.lang.Exception -> Ld
            X.0X52 r0 = r0.LIZ(r1)     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof X.C0XIR
            if (r0 != 0) goto L9c
            X.0ozp r7 = (X.C1494590ozp) r7
            com.bytedance.retrofit2.client.Request r0 = r7.LIZJ
            X.0XMB r4 = r0.newBuilder()
            java.lang.String r5 = r0.getUrl()
            java.util.regex.Pattern r0 = com.ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet.LL
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L9b
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L92
            java.lang.String r0 = "https"
            boolean r0 = r5.startsWith(r0)
            r3 = 1
            r2 = r0 ^ 1
            boolean r0 = r1 instanceof javax.net.ssl.SSLException
            if (r0 != 0) goto L90
            boolean r0 = r1 instanceof java.security.GeneralSecurityException
            if (r0 != 0) goto L90
        L44:
            com.ss.android.common.util.NetworkUtils.com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(r5)
            r1 = r5
            if (r2 == 0) goto L87
            if (r3 == 0) goto L8c
            java.lang.String r2 = "both"
        L4e:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L62
            X.0XI4 r1 = new X.0XI4
            r1.<init>(r5)
            java.lang.String r0 = "retry_reason"
            r1.LJ(r0, r2)
            java.lang.String r1 = r1.LJFF()
        L62:
            com.ss.android.common.util.NetworkUtils.com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7b
            X.0XI4 r2 = new X.0XI4
            r2.<init>(r1)
            java.lang.String r1 = "retry_type"
            java.lang.String r0 = "first_retry"
            r2.LJ(r1, r0)
            java.lang.String r1 = r2.LJFF()
        L7b:
            r4.LIZJ(r1)
            com.bytedance.retrofit2.client.Request r0 = r4.LIZ()
            X.0X52 r0 = r7.LIZ(r0)
            return r0
        L87:
            if (r3 == 0) goto L8c
            java.lang.String r2 = "protocol"
            goto L4e
        L8c:
            java.lang.String r2 = "ssl"
            goto L4e
        L90:
            r3 = 0
            goto L44
        L92:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "url is empty!"
            r1.<init>(r0)
            throw r1
        L9b:
            throw r1
        L9c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet.intercept(X.0X0l):X.0X52");
    }
}
