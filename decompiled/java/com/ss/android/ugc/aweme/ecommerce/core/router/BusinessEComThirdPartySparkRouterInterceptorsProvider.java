package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.AbstractC1549820qQu;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.service.IEComThirdPartyHybridSparkInterceptorService;
import java.util.Collections;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessEComThirdPartySparkRouterInterceptorsProvider implements IEComThirdPartyHybridSparkInterceptorService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEComThirdPartyHybridSparkInterceptorService
    public final List LIZ() {
        return Collections.singletonList(new AbstractC1549820qQu() { // from class: X.0qQs
            @Override // com.ss.android.ugc.aweme.ecommerce.router.IThirdPartySparkRouterInterceptor
            public final boolean matchInterceptRules(RouteIntent routeIntent) {
                String url;
                if (routeIntent == null || (url = routeIntent.getUrl()) == null) {
                    return false;
                }
                return u.LJJIIJZLJL(url, "aweme://echybrid/intercept_back", false);
            }

            @Override // com.ss.android.ugc.aweme.ecommerce.router.IThirdPartySparkRouterInterceptor
            public final boolean matchInterceptRules(String str) {
                if (str == null) {
                    return false;
                }
                return u.LJJIIJZLJL(str, "aweme://echybrid/intercept_back", false);
            }

            @Override // com.ss.android.ugc.aweme.ecommerce.router.IThirdPartySparkRouterInterceptor
            public final void handleSparkContext(SparkContext sparkContext, String str) {
                if (C2190461Ao8.LIZIZ()) {
                    sparkContext.LJJLIIIJJI(new C1549790qQr());
                    return;
                }
                C1549770qQp c1549770qQp = new C1549770qQp();
                sparkContext.LJJLIIIJJI(c1549770qQp);
                sparkContext.LJJLIIIJL(c1549770qQp);
            }
        });
    }
}
