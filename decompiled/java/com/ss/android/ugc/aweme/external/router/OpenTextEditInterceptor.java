package com.ss.android.ugc.aweme.external.router;

import X.C1388190mED;
import X.C1976907ol;
import X.C19EG;
import X.C786410Ut5;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class OpenTextEditInterceptor implements IInterceptor {
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
        return Intrinsics.LJFF(host, "openTextEdit");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Bundle bundle;
        if (routeIntent == null || context == null || C1388190mED.LIZIZ(context) == null) {
            return false;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            IOpenTextNextService iOpenTextNextServiceOpenTextNextService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).openTextNextService();
            Intent extra = routeIntent.getExtra();
            if (extra == null || (bundle = C786410Ut5.g3(extra, "fake_bundle")) == null) {
                bundle = new Bundle();
            }
            iOpenTextNextServiceOpenTextNextService.textCanvasGoNext(c19egLIZIZ, bundle);
            return true;
        }
        return true;
    }
}
