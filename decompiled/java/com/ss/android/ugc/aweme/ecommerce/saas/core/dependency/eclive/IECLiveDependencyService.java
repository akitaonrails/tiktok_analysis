package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive;

import X.InterfaceC1364105Vn;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public interface IECLiveDependencyService extends IECommerceHostService {
    n getLiveRelatedProductInfo(String str, String str2);

    Map<String, String> getRoomInfo();

    int getSellingItemTypeRate();

    Object reportAction(String str, String str2, String str3, int i, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void startVideoPlaybackActivity(Context context, RouteIntent routeIntent);

    void startVideoReplayActivity(Context context, RouteIntent routeIntent);
}
