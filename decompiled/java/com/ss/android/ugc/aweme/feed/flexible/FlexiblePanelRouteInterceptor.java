package com.ss.android.ugc.aweme.feed.flexible;

import X.C1976907ol;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class FlexiblePanelRouteInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            host = uri.getHost();
        } else {
            host = null;
        }
        return Intrinsics.LJFF(host, "flex_panel");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x051b A[PHI: r11
      0x051b: PHI (r11v7 com.ss.android.ugc.aweme.feed.flexible.ability.FlexibleComponentAbility) = 
      (r11v6 com.ss.android.ugc.aweme.feed.flexible.ability.FlexibleComponentAbility)
      (r11v11 com.ss.android.ugc.aweme.feed.flexible.ability.FlexibleComponentAbility)
     binds: [B:298:0x0517, B:168:0x0294] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0521 A[PHI: r11 r21
      0x0521: PHI (r11v8 com.ss.android.ugc.aweme.feed.flexible.ability.FlexibleComponentAbility) = 
      (r11v7 com.ss.android.ugc.aweme.feed.flexible.ability.FlexibleComponentAbility)
      (r11v10 com.ss.android.ugc.aweme.feed.flexible.ability.FlexibleComponentAbility)
     binds: [B:301:0x051d, B:171:0x029e] A[DONT_GENERATE, DONT_INLINE]
      0x0521: PHI (r21v2 com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility) = 
      (r21v1 com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility)
      (r21v4 com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility)
     binds: [B:301:0x051d, B:171:0x029e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r18v1, types: [android.app.Activity] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r31, com.bytedance.router.RouteIntent r32) {
        /*
            Method dump skipped, instruction units count: 1351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.flexible.FlexiblePanelRouteInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
