package com.ss.android.ugc.aweme.ecommerce.dependency.ecug;

import X.C04TD;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IMallLandingPerfTrackerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MallLandingPerfTrackerDependencyService implements IMallLandingPerfTrackerDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IMallLandingPerfTrackerDependencyService
    public String newPerfId() {
        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
        if (iMallLandingPerfTracker != null) {
            return iMallLandingPerfTracker.newPerfId();
        }
        return null;
    }

    public static IMallLandingPerfTrackerDependencyService createIMallLandingPerfTrackerDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IMallLandingPerfTrackerDependencyService.class, z);
        if (objLIZ != null) {
            return (IMallLandingPerfTrackerDependencyService) objLIZ;
        }
        if (C04TD.u == null) {
            synchronized (IMallLandingPerfTrackerDependencyService.class) {
                if (C04TD.u == null) {
                    C04TD.u = new MallLandingPerfTrackerDependencyService();
                }
            }
        }
        return C04TD.u;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IMallLandingPerfTrackerDependencyService
    public void onClickMallEntry(String str, Long l) {
        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
        if (iMallLandingPerfTracker != null) {
            iMallLandingPerfTracker.onClickMallEntry(str, l);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IMallLandingPerfTrackerDependencyService
    public void onSearchMixLandingFinished(String str, long j, String str2) {
        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
        if (iMallLandingPerfTracker != null) {
            iMallLandingPerfTracker.onSearchMixLandingFinished(str, j, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IMallLandingPerfTrackerDependencyService
    public void onStartJumpToMall(String str, Long l, boolean z) {
        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
        if (iMallLandingPerfTracker != null) {
            iMallLandingPerfTracker.onStartJumpToMall(str, l, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IMallLandingPerfTrackerDependencyService
    public void onLandingFinished(String str, String str2, Map<String, ? extends Object> map, int i) {
        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
        if (iMallLandingPerfTracker != null) {
            iMallLandingPerfTracker.onLandingFinished(str, str2, map, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IMallLandingPerfTrackerDependencyService
    public void onLandingMallAndInsert(String str, String str2, Map<String, ? extends Object> map, int i) {
        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
        if (iMallLandingPerfTracker != null) {
            iMallLandingPerfTracker.LIZIZ(str, str2, map);
        }
    }
}
