package com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service;

import X.AnonymousClass0185;
import X.AnonymousClass0863;
import X.C098200Yq;
import X.C1697810uHb;
import X.C189200o6;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.deeplink.router.EcUgRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.router.ECMixFeedRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.ug.ordercenter.router.ECOrderCenterRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.router.ECTrendingRouterInterceptor;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public final class EcUgDeeplinkService implements IEcUgDeeplinkService {
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service.IEcUgDeeplinkService
    public final List<IInterceptor> LIZ() {
        return C1697810uHb.LJIIJJI(new EcUgRouterInterceptor(), new ECMixFeedRouterInterceptor(), new ECOrderCenterRouterInterceptor(), new ECTrendingRouterInterceptor());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service.IEcUgDeeplinkService
    public final Map<String, Object> LIZIZ(String str) {
        boolean z;
        AnonymousClass0863.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String strLJ = AnonymousClass0185.LJ(UriProtector.parse(str), "ec_perf_deeplink_params");
            if (strLJ.length() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                linkedHashMap.put("ec_perf_deeplink_params", strLJ);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return linkedHashMap;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service.IEcUgDeeplinkService
    public final void LIZJ(Uri.Builder builder, long j) {
        AnonymousClass0863.LIZ.getClass();
        AnonymousClass0863.LIZ(builder, j);
    }
}
