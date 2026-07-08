package com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes;

import X.C1976907ol;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class PoiDishesGalleryInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String string;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (string = uri.toString()) == null || !a0.LJJIIZI(string, "aweme://poi/dishes/preview", false)) {
            return false;
        }
        return true;
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_poi_uiwidget_gallery_dishes_PoiDishesGalleryInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:8:0x000f, B:10:0x0015, B:12:0x001b, B:14:0x002c, B:15:0x0030, B:17:0x0036), top: B:50:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[Catch: all -> 0x0087, TryCatch #0 {all -> 0x0087, blocks: (B:27:0x0059, B:29:0x005f, B:31:0x0065, B:33:0x0076, B:34:0x007a, B:36:0x0080), top: B:48:0x0059 }] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptRoute(android.content.Context r7, com.bytedance.router.RouteIntent r8) {
        /*
            r6 = this;
            java.lang.String r3 = "origin_pos"
            java.lang.String r5 = "images"
            if (r7 == 0) goto La3
            r4 = 0
            if (r8 == 0) goto La3
            android.content.Intent r0 = r8.getExtra()
            if (r0 == 0) goto La3
            android.content.Intent r0 = r8.getExtra()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L30
            java.lang.String r2 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_poi_uiwidget_gallery_dishes_PoiDishesGalleryInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(r0, r5)     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L30
            X.04rF r1 = X.C1227904rF.LIZ     // Catch: java.lang.Throwable -> L3d
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$RecommendedDish[]> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.RecommendedDish[].class
            r1.getClass()     // Catch: java.lang.Throwable -> L3d
            java.util.List r0 = X.C1227904rF.LJFF(r0, r2)     // Catch: java.lang.Throwable -> L3d
            java.util.ArrayList r1 = X.C09HN.LIZ(r0)     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L30
        L2c:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L3d
            goto L49
        L30:
            android.content.Intent r0 = r8.getExtra()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L3b
            java.io.Serializable r1 = r0.getSerializableExtra(r5)     // Catch: java.lang.Throwable -> L3d
            goto L2c
        L3b:
            r1 = r4
            goto L2c
        L3d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L49:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L50
            r1 = r4
        L50:
            android.content.Intent r0 = r8.getExtra()
            if (r0 == 0) goto L59
            r0.putExtra(r5, r1)
        L59:
            android.content.Intent r0 = r8.getExtra()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L7a
            java.lang.String r2 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_poi_uiwidget_gallery_dishes_PoiDishesGalleryInterceptor_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(r0, r3)     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L7a
            X.04rF r1 = X.C1227904rF.LIZ     // Catch: java.lang.Throwable -> L87
            java.lang.Class<com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData[]> r0 = com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData[].class
            r1.getClass()     // Catch: java.lang.Throwable -> L87
            java.util.List r0 = X.C1227904rF.LJFF(r0, r2)     // Catch: java.lang.Throwable -> L87
            java.util.ArrayList r1 = X.C09HN.LIZ(r0)     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L7a
        L76:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L87
            goto L93
        L7a:
            android.content.Intent r0 = r8.getExtra()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L85
            java.io.Serializable r1 = r0.getSerializableExtra(r3)     // Catch: java.lang.Throwable -> L87
            goto L76
        L85:
            r1 = r4
            goto L76
        L87:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L93:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L9a
            r4 = r1
        L9a:
            android.content.Intent r0 = r8.getExtra()
            if (r0 == 0) goto La3
            r0.putExtra(r3, r4)
        La3:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
