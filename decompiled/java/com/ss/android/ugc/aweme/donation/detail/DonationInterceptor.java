package com.ss.android.ugc.aweme.donation.detail;

import X.C1976907ol;
import X.C2188811AlT;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class DonationInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        Uri uri2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String path = null;
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            host = uri2.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            path = uri.getPath();
        }
        sbLIZ.append(path);
        return a0.LJJIIZI(C2188811AlT.LIZIZ(sbLIZ), "donation/pannel", false);
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0347 A[PHI: r8
      0x0347: PHI (r8v4 java.lang.String) = (r8v1 java.lang.String), (r8v5 java.lang.String) binds: [B:200:0x0345, B:198:0x0342] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0353 A[PHI: r8
      0x0353: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v4 java.lang.String), (r8v4 java.lang.String) binds: [B:200:0x0345, B:202:0x034b, B:204:0x0351] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03d3 A[PHI: r11
      0x03d3: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v3 java.lang.String) binds: [B:207:0x0356, B:214:0x0369] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0172  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r18, com.bytedance.router.RouteIntent r19) {
        /*
            Method dump skipped, instruction units count: 991
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.donation.detail.DonationInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
