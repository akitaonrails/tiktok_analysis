package com.ss.android.ugc.aweme.poi.claim.route;

import X.C0PEM;
import X.C1189060h32;
import X.C1976907ol;
import X.C2296808zG;
import X.C23250099c;
import X.C680140Qm4;
import X.C680160Qm6;
import X.C680170Qm7;
import android.content.Context;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class PoiClaimInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String string;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (string = uri.toString()) == null || !a0.LJJIIZI(string, "aweme://poi/claim", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Boolean boolValueOf;
        PoiClaimPreDecodeModel poiClaimPreDecodeModel = (PoiClaimPreDecodeModel) C680170Qm7.LIZIZ.getValue();
        if (poiClaimPreDecodeModel != null) {
            boolValueOf = Boolean.valueOf(poiClaimPreDecodeModel.enable);
        } else {
            boolValueOf = null;
        }
        if (C1189060h32.LJIILJJIL(boolValueOf) && !C680160Qm6.LIZ) {
            C680160Qm6.LIZ = true;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C680140Qm4(null), 3);
            return false;
        }
        return false;
    }
}
