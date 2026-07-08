package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed;

import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultPdpCreatorVideoFeedDependencyService implements IPdpCreatorVideoFeedDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IPdpCreatorVideoFeedDependencyService
    public void clearPdpCreatorVideoCache(String str) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IPdpCreatorVideoFeedDependencyService
    public Object fetchCreatorVideoList(Map<String, ? extends Object> map, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends Response<RecommendListResponse>>> interfaceC1364105Vn) {
        return null;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IPdpCreatorVideoFeedDependencyService
    public boolean startPdpCreatorVideoFeed(Context context, RouteIntent routeIntent) {
        return false;
    }
}
