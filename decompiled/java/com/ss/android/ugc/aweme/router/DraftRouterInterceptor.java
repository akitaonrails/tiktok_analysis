package com.ss.android.ugc.aweme.router;

import X.C0WZX;
import X.C1388190mED;
import X.C1701330uNH;
import X.C1976907ol;
import X.C2204961BRm;
import X.C844470XAv;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class DraftRouterInterceptor implements IInterceptor {
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
        return Intrinsics.LJFF(host, "draft_box");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Activity activityLIZ;
        Context contextLIZ;
        Class<? extends Activity> draftBoxActivity = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).classnameService().getDraftBoxActivity();
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        if (activityLIZ != null) {
            Intent intent = new Intent(activityLIZ, draftBoxActivity);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZ, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, activityLIZ);
            C2204961BRm.LJIILLIIL(activityLIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPindovLznylsBopl3g+QAYTh2SlBAp8+ET2ro+7", null));
            return true;
        }
        if (context == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        } else {
            contextLIZ = context;
        }
        Intent intent2 = new Intent(context, draftBoxActivity);
        intent2.addFlags(268435456);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextLIZ, intent2, "Context_startActivity_1");
        C1701330uNH.LIZ(intent2, contextLIZ);
        C2204961BRm.LJJJJJL(contextLIZ, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPindovLznylsBopl3g+QAYTh2SlBAp8+ET2ro+7", null));
        return true;
    }
}
