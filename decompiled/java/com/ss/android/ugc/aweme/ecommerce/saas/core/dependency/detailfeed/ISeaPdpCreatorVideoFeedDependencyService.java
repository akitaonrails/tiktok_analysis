package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed;

import X.InterfaceC1364105Vn;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;

/* JADX INFO: loaded from: classes4.dex */
public interface ISeaPdpCreatorVideoFeedDependencyService extends IECommerceHostService {
    Object reportRecommendImpression(WriteImpressionRequest writeImpressionRequest, InterfaceC1364105Vn<? super Response<Object>> interfaceC1364105Vn);

    boolean startSeaPdpCreatorVideoFeed(Context context, RouteIntent routeIntent);
}
