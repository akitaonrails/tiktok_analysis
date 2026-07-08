package com.ss.android.ugc.aweme.ecommercelive.audience.common.saas;

import X.C01GW;
import X.C04TD;
import X.C099R;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ECLiveDependencyService implements IECLiveDependencyService {
    public final C01GW liveService$delegate = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(237));

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService
    public int getSellingItemTypeRate() {
        return 7;
    }

    public void initService() {
    }

    private final IEcommerceLiveService getLiveService() {
        return (IEcommerceLiveService) this.liveService$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService
    public Map<String, String> getRoomInfo() {
        return getLiveService().getRoomInfo();
    }

    public static IECLiveDependencyService createIECLiveDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IECLiveDependencyService.class, z);
        if (objLIZ != null) {
            return (IECLiveDependencyService) objLIZ;
        }
        if (C04TD.f108e0 == null) {
            synchronized (IECLiveDependencyService.class) {
                if (C04TD.f108e0 == null) {
                    C04TD.f108e0 = new ECLiveDependencyService();
                }
            }
        }
        return C04TD.f108e0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService
    public n getLiveRelatedProductInfo(String str, String str2) {
        return getLiveService().getLiveRelatedProductInfo(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService
    public void startVideoPlaybackActivity(Context context, RouteIntent routeIntent) {
        IEcommerceLiveService iEcommerceLiveService = (IEcommerceLiveService) PluggableExtentionKt.pluggableSpi$default(IEcommerceLiveService.class, false, false, false, 14, null);
        if (iEcommerceLiveService != null) {
            iEcommerceLiveService.startVideoPlaybackActivity(context, routeIntent);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService
    public void startVideoReplayActivity(Context context, RouteIntent routeIntent) {
        IEcommerceLiveService iEcommerceLiveService = (IEcommerceLiveService) PluggableExtentionKt.pluggableSpi$default(IEcommerceLiveService.class, false, false, false, 14, null);
        if (iEcommerceLiveService != null) {
            iEcommerceLiveService.startVideoReplayActivity(context, routeIntent);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService
    public Object reportAction(String str, String str2, String str3, int i, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objReportAction = getLiveService().reportAction(str, str2, str3, i, interfaceC1364105Vn);
        if (objReportAction == C099R.LJFF()) {
            return objReportAction;
        }
        return Unit.LIZ;
    }
}
