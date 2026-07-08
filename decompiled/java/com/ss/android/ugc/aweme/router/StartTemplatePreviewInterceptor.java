package com.ss.android.ugc.aweme.router;

import X.C018G;
import X.C1388190mED;
import X.C1976907ol;
import X.C2188811AlT;
import X.C290860Bae;
import X.C299080Bnu;
import X.C580990MqX;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class StartTemplatePreviewInterceptor implements IInterceptor {
    public final String LL = "startTemplatePreview";

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
        return Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), this.LL);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Intent extra;
        if (C290860Bae.LIZ() && routeIntent != null && (extra = routeIntent.getExtra()) != null) {
            try {
                Bundle extras = extra.getExtras();
                if (extras == null || context == null) {
                    return true;
                }
                if (C299080Bnu.LIZ()) {
                    String strLIZIZ = C018G.LIZIZ(routeIntent.getOriginUrl(), "shoot_way");
                    if (strLIZIZ == null) {
                        strLIZIZ = "StartTemplatePreviewInterceptor";
                    }
                    CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                    if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(context, strLIZIZ, true)) {
                        return true;
                    }
                }
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(context, "push", new C580990MqX(extras, activityLIZ, 4));
                    return true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return true;
    }
}
