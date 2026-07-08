package com.ss.android.ugc.aweme.series.innerfeed.interceptor;

import X.C01GW;
import X.C1976907ol;
import X.C2188811AlT;
import X.C452501pT;
import X.C718480SGg;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesInnerFeedInterceptor implements IInterceptor {
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(312));

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public final boolean LIZIZ(RouteIntent routeIntent) {
        String strLIZ;
        Intent extra;
        Intent extra2;
        String strLIZ2 = null;
        if (routeIntent != null && (extra2 = routeIntent.getExtra()) != null) {
            strLIZ = LIZ(extra2, "category");
        } else {
            strLIZ = null;
        }
        SeriesCategory seriesCategoryLIZ = C718480SGg.LIZ(strLIZ);
        SeriesCategory seriesCategory = SeriesCategory.MINI_DRAMA;
        if (seriesCategoryLIZ != seriesCategory) {
            if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                strLIZ2 = LIZ(extra, "series_category");
            }
            if (C718480SGg.LIZ(strLIZ2) != seriesCategory) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String scheme;
        String host;
        Uri uri;
        Uri uri2;
        Uri uri3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String path = null;
        if (routeIntent != null && (uri3 = routeIntent.getUri()) != null) {
            scheme = uri3.getScheme();
        } else {
            scheme = null;
        }
        sbLIZ.append(scheme);
        sbLIZ.append("://");
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
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(strLIZIZ, "aweme://paidcontent/innerfeed")) {
            return true;
        }
        if (Intrinsics.LJFF(strLIZIZ, "aweme://paidcontent/collections/detail")) {
            return LIZIZ(routeIntent);
        }
        return false;
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0562  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r30, final com.bytedance.router.RouteIntent r31) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.innerfeed.interceptor.SeriesInnerFeedInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
