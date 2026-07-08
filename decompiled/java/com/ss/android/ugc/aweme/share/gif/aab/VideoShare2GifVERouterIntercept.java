package com.ss.android.ugc.aweme.share.gif.aab;

import X.C13LP;
import X.C1881407Ym;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.VEPluginInterceptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoShare2GifVERouterIntercept extends VEPluginInterceptor {
    public static final C1881407Ym Companion = new Object() { // from class: X.07Ym
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.VEPluginInterceptor, com.bytedance.router.interceptor.IInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String host;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (host = uri.getHost()) == null) {
            return false;
        }
        Object objLJJJLL = C13LP.LJJJLL(uri.getPathSegments());
        if (objLJJJLL == null) {
            objLJJJLL = "";
        }
        if (!Intrinsics.LJFF(host, "share") || !Intrinsics.LJFF(objLJJJLL, "video_2_gif_edit")) {
            return false;
        }
        return true;
    }
}
