package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed;

import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;

/* JADX INFO: loaded from: classes2.dex */
public interface IDetailFeedDependencyService extends IECommerceHostService {
    boolean startVideoFeed(Context context, RouteIntent routeIntent);
}
