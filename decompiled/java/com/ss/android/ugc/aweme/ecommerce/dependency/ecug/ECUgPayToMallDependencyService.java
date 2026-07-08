package com.ss.android.ugc.aweme.ecommerce.dependency.ecug;

import X.AnonymousClass0957;
import X.C04TD;
import X.C1740920vP8;
import X.C928003jy;
import android.content.Context;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes27.dex */
public final class ECUgPayToMallDependencyService implements IECUgPayToMallDependencyService {
    public void initService() {
    }

    public static IECUgPayToMallDependencyService createIECUgPayToMallDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IECUgPayToMallDependencyService.class, z);
        if (objLIZ != null) {
            return (IECUgPayToMallDependencyService) objLIZ;
        }
        if (C04TD.q == null) {
            synchronized (IECUgPayToMallDependencyService.class) {
                if (C04TD.q == null) {
                    C04TD.q = new ECUgPayToMallDependencyService();
                }
            }
        }
        return C04TD.q;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public void appendScrollFeedTo(h hVar) {
        IEcUgPayToMallService iEcUgPayToMallService = (IEcUgPayToMallService) PluggableExtentionKt.pluggableSpi$default(IEcUgPayToMallService.class, false, false, false, 14, null);
        if (iEcUgPayToMallService != null) {
            iEcUgPayToMallService.appendScrollFeedTo(hVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public Integer getPayToMallMethodV3(String str) {
        IEcUgPayToMallService iEcUgPayToMallService = (IEcUgPayToMallService) PluggableExtentionKt.pluggableSpi$default(IEcUgPayToMallService.class, false, false, false, 14, null);
        if (iEcUgPayToMallService != null) {
            return iEcUgPayToMallService.getPayToMallMethodV3(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public Pair<Boolean, Map<String, Object>> mallParamsV2(Map<String, Object> map) {
        Pair<Boolean, Map<String, Object>> pairMallParamsV2;
        IEcUgPayToMallService iEcUgPayToMallService = (IEcUgPayToMallService) PluggableExtentionKt.pluggableSpi$default(IEcUgPayToMallService.class, false, false, false, 14, null);
        if (iEcUgPayToMallService == null || (pairMallParamsV2 = iEcUgPayToMallService.mallParamsV2(map)) == null) {
            return new Pair<>(Boolean.FALSE, map);
        }
        return pairMallParamsV2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public Pair<Integer, Map<String, Object>> mallParamsV3(Map<String, Object> map) {
        Pair<Integer, Map<String, Object>> pairMallParamsV3;
        IEcUgPayToMallService iEcUgPayToMallService = (IEcUgPayToMallService) PluggableExtentionKt.pluggableSpi$default(IEcUgPayToMallService.class, false, false, false, 14, null);
        if (iEcUgPayToMallService == null || (pairMallParamsV3 = iEcUgPayToMallService.mallParamsV3(map)) == null) {
            return new Pair<>(0, map);
        }
        return pairMallParamsV3;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public void setBackButtonDataDeferred(AnonymousClass0957<n> anonymousClass0957) {
        IEcUgPayToMallService iEcUgPayToMallService = (IEcUgPayToMallService) PluggableExtentionKt.pluggableSpi$default(IEcUgPayToMallService.class, false, false, false, 14, null);
        if (iEcUgPayToMallService != null) {
            iEcUgPayToMallService.setBackButtonDataDeferred(anonymousClass0957);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public void setPayToMallParams(Map<String, Object> map) {
        IEcUgPayToMallService iEcUgPayToMallService = (IEcUgPayToMallService) PluggableExtentionKt.pluggableSpi$default(IEcUgPayToMallService.class, false, false, false, 14, null);
        if (iEcUgPayToMallService != null) {
            iEcUgPayToMallService.setPayToMallParams(map);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public void trackMallEntranceClick(HashMap<String, Object> map) {
        IEcUgPayToMallService iEcUgPayToMallService = (IEcUgPayToMallService) PluggableExtentionKt.pluggableSpi$default(IEcUgPayToMallService.class, false, false, false, 14, null);
        if (iEcUgPayToMallService != null && iEcUgPayToMallService.getTracker() != null) {
            C1740920vP8.LIZ(map);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public void trackMallEntranceShow(HashMap<String, Object> map) {
        IEcUgPayToMallService iEcUgPayToMallService = (IEcUgPayToMallService) PluggableExtentionKt.pluggableSpi$default(IEcUgPayToMallService.class, false, false, false, 14, null);
        if (iEcUgPayToMallService != null && iEcUgPayToMallService.getTracker() != null) {
            C1740920vP8.LIZIZ(map);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public String getDiversionSchema(Context context, String str) {
        IEcUgPayToMallService iEcUgPayToMallService = (IEcUgPayToMallService) PluggableExtentionKt.pluggableSpi$default(IEcUgPayToMallService.class, false, false, false, 14, null);
        if (iEcUgPayToMallService != null) {
            return iEcUgPayToMallService.getDiversionSchema(context, str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public void saveDiversionSchema(Context context, String str, String str2) {
        IEcUgPayToMallService iEcUgPayToMallService = (IEcUgPayToMallService) PluggableExtentionKt.pluggableSpi$default(IEcUgPayToMallService.class, false, false, false, 14, null);
        if (iEcUgPayToMallService != null) {
            iEcUgPayToMallService.saveDiversionSchema(context, str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public String handleMiddlePageUrlAfterPaySuccess(String str, Integer num, String str2, String str3) {
        String strHandleMiddlePageUrlAfterPaySuccess;
        IEcUgPayToMallService iEcUgPayToMallService = (IEcUgPayToMallService) PluggableExtentionKt.pluggableSpi$default(IEcUgPayToMallService.class, false, false, false, 14, null);
        if (iEcUgPayToMallService == null || (strHandleMiddlePageUrlAfterPaySuccess = iEcUgPayToMallService.handleMiddlePageUrlAfterPaySuccess(str, num, str2, str3)) == null) {
            return "";
        }
        return strHandleMiddlePageUrlAfterPaySuccess;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService
    public C928003jy handlePaySuccessWithLandingSchema(String str, String str2, String str3, Integer num) {
        IEcUgPayToMallService iEcUgPayToMallService = (IEcUgPayToMallService) PluggableExtentionKt.pluggableSpi$default(IEcUgPayToMallService.class, false, false, false, 14, null);
        if (iEcUgPayToMallService != null) {
            return iEcUgPayToMallService.handlePaySuccessWithLandingSchema(str, str2, str3, num);
        }
        return null;
    }
}
