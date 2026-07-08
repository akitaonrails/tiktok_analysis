package com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews;

import X.C1976907ol;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class PoiReviewsGalleryInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String string;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (string = uri.toString()) == null || !a0.LJJIIZI(string, "aweme://poi/reviews/preview", false)) {
            return false;
        }
        return true;
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_poi_uiwidget_gallery_reviews_PoiReviewsGalleryInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:8:0x000d, B:10:0x0013, B:12:0x0019, B:14:0x002a, B:15:0x002e, B:17:0x0034), top: B:29:0x000d }] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptRoute(android.content.Context r6, com.bytedance.router.RouteIntent r7) {
        /*
            r5 = this;
            java.lang.String r4 = "origin_pos"
            if (r6 == 0) goto L57
            r3 = 0
            if (r7 == 0) goto L57
            android.content.Intent r0 = r7.getExtra()
            if (r0 == 0) goto L57
            android.content.Intent r0 = r7.getExtra()     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L2e
            java.lang.String r2 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_poi_uiwidget_gallery_reviews_PoiReviewsGalleryInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(r0, r4)     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L2e
            X.04rF r1 = X.C1227904rF.LIZ     // Catch: java.lang.Throwable -> L3b
            java.lang.Class<com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData[]> r0 = com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData[].class
            r1.getClass()     // Catch: java.lang.Throwable -> L3b
            java.util.List r0 = X.C1227904rF.LJFF(r0, r2)     // Catch: java.lang.Throwable -> L3b
            java.util.ArrayList r1 = X.C09HN.LIZ(r0)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L2e
        L2a:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L3b
            goto L47
        L2e:
            android.content.Intent r0 = r7.getExtra()     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L39
            java.io.Serializable r1 = r0.getSerializableExtra(r4)     // Catch: java.lang.Throwable -> L3b
            goto L2a
        L39:
            r1 = r3
            goto L2a
        L3b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L47:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L4e
            r3 = r1
        L4e:
            android.content.Intent r0 = r7.getExtra()
            if (r0 == 0) goto L57
            r0.putExtra(r4, r3)
        L57:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewsGalleryInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
