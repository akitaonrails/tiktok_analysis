package com.ss.android.ugc.aweme.router;

import X.C01GW;
import X.C1388190mED;
import X.C1976907ol;
import X.C2188811AlT;
import X.C452501pT;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenChatExtInterceptor implements IInterceptor {
    public final C01GW LL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(258));

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
        return Intrinsics.LJFF("chatting/message", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Activity activityLIZ;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            context = activityLIZ;
        }
        String url = null;
        if (context instanceof Activity) {
            ICommercializeFromMainOutService iCommercializeFromMainOutService = (ICommercializeFromMainOutService) this.LL.getValue();
            if (iCommercializeFromMainOutService != null) {
                Activity activity = (Activity) context;
                if (routeIntent != null) {
                    url = routeIntent.getUrl();
                }
                iCommercializeFromMainOutService.LJIIIZ(activity, url);
                return true;
            }
            return true;
        }
        ICommercializeFromMainOutService iCommercializeFromMainOutService2 = (ICommercializeFromMainOutService) this.LL.getValue();
        if (iCommercializeFromMainOutService2 == null) {
            return true;
        }
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        }
        iCommercializeFromMainOutService2.LJIIIIZZ(url);
        return true;
    }
}
