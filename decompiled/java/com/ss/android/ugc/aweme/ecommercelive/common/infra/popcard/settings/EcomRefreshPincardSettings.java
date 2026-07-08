package com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.settings;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes33.dex */
public final class EcomRefreshPincardSettings {
    public static final PinCardRefactorConfig LIZ = new PinCardRefactorConfig(-1, -1);

    public static final class PinCardRefactorConfig {

        @C09CT("max")
        public long max;

        @C09CT("min")
        public long min;

        public PinCardRefactorConfig() {
            this(-1L, -1L);
        }

        public PinCardRefactorConfig(long j, long j2) {
            this.max = j;
            this.min = j2;
        }
    }

    public static final PinCardRefactorConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PinCardRefactorConfig pinCardRefactorConfig = LIZ;
        PinCardRefactorConfig pinCardRefactorConfig2 = (PinCardRefactorConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_live_pin_card_refresh_config", PinCardRefactorConfig.class, pinCardRefactorConfig);
        return pinCardRefactorConfig2 != null ? pinCardRefactorConfig2 : pinCardRefactorConfig;
    }

    public static final boolean LIZIZ() {
        return LIZ().min > 0 && LIZ().max > LIZ().min;
    }
}
