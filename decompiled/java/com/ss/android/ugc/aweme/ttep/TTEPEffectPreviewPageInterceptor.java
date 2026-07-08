package com.ss.android.ugc.aweme.ttep;

import X.C1388190mED;
import X.C1976907ol;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public final class TTEPEffectPreviewPageInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        Uri uri;
        String host;
        String path;
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        } else {
            url = null;
        }
        if (url == null || url.length() == 0 || (host = (uri = UriProtector.parse(url)).getHost()) == null || (path = uri.getPath()) == null || !Intrinsics.LJFF(host, "aweme") || !u.LJJIIJZLJL(path, "/sticker/preview_", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        IExternalService iExternalService;
        Activity activityLIZ;
        String url = null;
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        }
        if (url == null || url.length() == 0) {
            return false;
        }
        Uri uri = UriProtector.parse(url);
        if (uri.getHost() != null && uri.getPath() != null && url != null && url.length() != 0) {
            Uri uri2 = UriProtector.parse(url);
            int size = uri2.getPathSegments().size() - 1;
            if (size < 0 || (str = (String) ListProtector.get(uri2.getPathSegments(), size)) == null || (iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null)) == null || context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
                return false;
            }
            iExternalService.ttepAbilityService().jumpShootPageAndPreview(activityLIZ, str, true);
            return true;
        }
        return false;
    }
}
