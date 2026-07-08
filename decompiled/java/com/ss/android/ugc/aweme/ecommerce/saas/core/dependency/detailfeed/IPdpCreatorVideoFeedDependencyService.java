package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed;

import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface IPdpCreatorVideoFeedDependencyService extends IECommerceHostService {
    void clearPdpCreatorVideoCache(String str);

    Object fetchCreatorVideoList(Map<String, Object> map, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends Response<RecommendListResponse>>> interfaceC1364105Vn);

    boolean startPdpCreatorVideoFeed(Context context, RouteIntent routeIntent);
}
