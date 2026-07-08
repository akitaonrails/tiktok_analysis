package com.ss.android.ugc.aweme.ecommerce.router;

import X.InterfaceC1294060jmO;
import X.InterfaceC2217701Bqy;
import X.InterfaceC2217711Bqz;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.RouteIntent;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public interface ISparkRouterInterceptor {
    void handleSparkContext(SparkContext sparkContext, String str);

    boolean matchInterceptRules(RouteIntent routeIntent);

    boolean matchInterceptRules(String str);

    @InterfaceC1294060jmO
    List<InterfaceC2217701Bqy> provideSparkInterceptActivityCallbacks();

    @InterfaceC1294060jmO
    List<InterfaceC2217711Bqz> provideSparkInterceptSAFCallbacks();
}
