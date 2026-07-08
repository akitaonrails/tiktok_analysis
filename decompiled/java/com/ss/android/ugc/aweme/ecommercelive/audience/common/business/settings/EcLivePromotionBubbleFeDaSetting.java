package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public final class EcLivePromotionBubbleFeDaSetting {
    public static final EcLivePromotionBubbleFeDaSetting INSTANCE = new EcLivePromotionBubbleFeDaSetting();
    public static final String[] DEFAULT = {"promotion_container_type"};

    public final String[] getValue() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            String[] strArr = DEFAULT;
            String[] strArr2 = (String[]) settingsManagerLIZLLL.LJIIIIZZ("ec_live_promotion_bubble_fe_da_params", String[].class, strArr);
            return strArr2 != null ? strArr2 : strArr;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return DEFAULT;
        }
    }
}
