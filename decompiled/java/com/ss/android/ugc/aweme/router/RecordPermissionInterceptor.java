package com.ss.android.ugc.aweme.router;

import X.C018G;
import X.C1388190mED;
import X.C1976907ol;
import X.C2188811AlT;
import X.C299080Bnu;
import X.InterfaceC1294060jmO;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
@InterfaceC1294060jmO
public final class RecordPermissionInterceptor implements IInterceptor {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public Boolean LLIZLLLIL;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        String path;
        String host2;
        Uri uri;
        Uri uri2;
        Uri uri3;
        Uri uri4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String path2 = null;
        if (routeIntent != null && (uri4 = routeIntent.getUri()) != null) {
            host = uri4.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        if (routeIntent != null && (uri3 = routeIntent.getUri()) != null) {
            path = uri3.getPath();
        } else {
            path = null;
        }
        sbLIZ.append(path);
        if (!Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "studio/task/create")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
                host2 = uri2.getHost();
            } else {
                host2 = null;
            }
            sbLIZ2.append(host2);
            if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
                path2 = uri.getPath();
            }
            sbLIZ2.append(path2);
            if (!Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ2), "studio/create")) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(final Context context, final RouteIntent routeIntent) {
        Activity activityLIZ;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            context = activityLIZ;
        }
        if (C299080Bnu.LIZ()) {
            String strLIZIZ = C018G.LIZIZ(routeIntent.getOriginUrl(), "shoot_way");
            if (strLIZIZ == null) {
                strLIZIZ = "RecordPermissionInterceptor";
            }
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(context, strLIZIZ, true)) {
                return true;
            }
        }
        final Class<? extends Activity> videoRecordPermissionActivityClass = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).classnameService().getVideoRecordPermissionActivityClass();
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("RecordPermissionInterceptor", new IExternalService.ServiceLoadCallback() { // from class: X.120Y
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onLoad(com.ss.android.ugc.aweme.services.AsyncAVService r14, long r15) {
                /*
                    Method dump skipped, instruction units count: 646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C120Y.onLoad(com.ss.android.ugc.aweme.services.AsyncAVService, long):void");
            }
        });
        return true;
    }
}
