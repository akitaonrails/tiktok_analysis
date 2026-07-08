package com.ss.android.ugc.feed.platform.ab;

import X.C04TD;
import X.C722800SWw;
import com.ss.android.ugc.aweme.adaptation.LowScreenNewStrategyAPI;
import com.ss.android.ugc.feed.platform.componentmanager.metric.device.ScreenConfig;

/* JADX INFO: loaded from: classes12.dex */
public final class LowScreenOptimizeABImpl implements LowScreenNewStrategyAPI {
    public static LowScreenNewStrategyAPI LIZIZ() {
        Object objLIZ = C04TD.LIZ(LowScreenNewStrategyAPI.class, false);
        if (objLIZ != null) {
            return (LowScreenNewStrategyAPI) objLIZ;
        }
        if (C04TD.k6 == null) {
            synchronized (LowScreenNewStrategyAPI.class) {
                if (C04TD.k6 == null) {
                    C04TD.k6 = new LowScreenOptimizeABImpl();
                }
            }
        }
        return C04TD.k6;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.LowScreenNewStrategyAPI
    public final boolean LIZ(int i) {
        ScreenConfig screenConfig;
        if (!LowScreenOptimizeAB.LIZJ().openAB || !LowScreenOptimizeAB.LIZJ().enableAdaptTab || (screenConfig = (ScreenConfig) C722800SWw.LIZIZ.getValue()) == null) {
            return false;
        }
        Integer num = screenConfig.smallHeightDp;
        Integer num2 = screenConfig.smallWidthDp;
        if (num2 == null || screenConfig.smallHeightDp == null || num2.intValue() <= 0 || screenConfig.smallHeightDp.intValue() <= 0 || num == null || i > num.intValue()) {
            return false;
        }
        return true;
    }
}
