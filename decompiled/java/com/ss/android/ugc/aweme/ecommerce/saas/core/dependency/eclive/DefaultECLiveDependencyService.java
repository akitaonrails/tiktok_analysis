package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive;

import X.C2097608Jq;
import X.InterfaceC1364105Vn;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.google.gson.n;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultECLiveDependencyService implements IECLiveDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService
    public n getLiveRelatedProductInfo(String str, String str2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService
    public int getSellingItemTypeRate() {
        return 7;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService
    public void startVideoPlaybackActivity(Context context, RouteIntent routeIntent) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService
    public void startVideoReplayActivity(Context context, RouteIntent routeIntent) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService
    public Map<String, String> getRoomInfo() {
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService
    public Object reportAction(String str, String str2, String str3, int i, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }
}
