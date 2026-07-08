package com.ss.android.ugc.aweme.setting.experiment;

import X.C0WZX;
import X.C1701330uNH;
import X.C1976907ol;
import X.C2188811AlT;
import X.C2204961BRm;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class MarketInterceptor implements IInterceptor {
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
        return Intrinsics.LJFF(host, "googleplay");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("market://details?id=");
            sbLIZ.append(packageName);
            Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV98gjwHdzXfBq45hF022klBrHADa5MySPX8tWC6g==", null));
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("https://play.google.com/store/apps/details?id=");
            sbLIZ2.append(packageName);
            Intent intent2 = new Intent("android.intent.action.VIEW", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ2)));
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent2, "Context_startActivity_1");
            C1701330uNH.LIZ(intent2, context);
            C2204961BRm.LJJJJJL(context, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV98gjwHdzXfBq45hF022klBrHADa5MySPX8tWC6g==", null));
            return true;
        }
    }
}
