package com.ss.android.ugc.aweme.verify.bio;

import X.C1388190mED;
import X.C1715520ukA;
import X.C1716020uky;
import X.C1948507kB;
import X.C1976907ol;
import X.C19EG;
import X.C2188811AlT;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class BioVerifyInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) throws JSONException {
        C19EG c19egLIZIZ;
        String url;
        Bundle extras = null;
        if (!C1716020uky.LIZ()) {
            C1715520ukA.LIZLLL("bio_vf_system_check", CardStruct.IStatusCode.DEFAULT, null, null);
            return true;
        }
        C1715520ukA.LIZLLL("bio_vf_system_check", "1", null, null);
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        } else {
            url = null;
        }
        if (C1948507kB.LIZ(url) && c19egLIZIZ != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://verify_center/verify_bio/real");
            Intent extra = routeIntent.getExtra();
            if (extra != null) {
                try {
                    extras = extra.getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            smartRouteBuildRoute.withParam(extras);
            smartRouteBuildRoute.open();
            return true;
        }
        String strValueOf = String.valueOf(C1948507kB.LIZ(url));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19egLIZIZ);
        sbLIZ.append(" is FragmentActivity");
        C1715520ukA.LIZJ("bio_verify_invalid_env", strValueOf, C2188811AlT.LIZIZ(sbLIZ), 8);
        return true;
    }
}
