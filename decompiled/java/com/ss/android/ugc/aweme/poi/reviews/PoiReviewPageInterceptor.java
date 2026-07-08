package com.ss.android.ugc.aweme.poi.reviews;

import X.C1186790gzN;
import X.C123100dR;
import X.C1976907ol;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.reviews.model.PoiReviewsMobParams;
import java.io.Serializable;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewPageInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String string;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (string = uri.toString()) == null || !a0.LJJIIZI(string, "//poi/review_list", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Serializable serializableExtra;
        Intent extra;
        Intent extra2;
        Intent extra3;
        Intent extra4;
        if (routeIntent != null && (extra4 = routeIntent.getExtra()) != null) {
            extra4.putExtra("page_start_ts", System.currentTimeMillis());
        }
        String stringExtra = null;
        if (routeIntent != null && (extra3 = routeIntent.getExtra()) != null) {
            serializableExtra = extra3.getSerializableExtra("poi_reviews_mob_params");
        } else {
            serializableExtra = null;
        }
        if (!(serializableExtra instanceof PoiReviewsMobParams) || serializableExtra == null) {
            if (routeIntent != null && (extra2 = routeIntent.getExtra()) != null) {
                try {
                    stringExtra = extra2.getStringExtra("group_id");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (C123100dR.LIZ(stringExtra) && (extra = routeIntent.getExtra()) != null) {
                C1186790gzN.LJ(extra, "poi_reviews_mob_params", new PoiReviewsMobParams(stringExtra));
                return false;
            }
            return false;
        }
        return false;
    }
}
