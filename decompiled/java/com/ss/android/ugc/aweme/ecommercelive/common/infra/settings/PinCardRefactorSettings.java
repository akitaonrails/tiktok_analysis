package com.ss.android.ugc.aweme.ecommercelive.common.infra.settings;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes7.dex */
public final class PinCardRefactorSettings {
    public static final PinCardRefactorConfig LIZ = new PinCardRefactorConfig(true, true, true, true, true);

    public static final PinCardRefactorConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PinCardRefactorConfig pinCardRefactorConfig = LIZ;
        PinCardRefactorConfig pinCardRefactorConfig2 = (PinCardRefactorConfig) settingsManagerLIZLLL.LJIIIIZZ("ecommerce_pin_card_refactor_settings", PinCardRefactorConfig.class, pinCardRefactorConfig);
        return pinCardRefactorConfig2 != null ? pinCardRefactorConfig2 : pinCardRefactorConfig;
    }

    /* JADX INFO: loaded from: classes33.dex */
    public static final class PinCardRefactorConfig {

        @C09CT("assistant_enable")
        public boolean assistantEnable;

        @C09CT("atmosphere_enable")
        public boolean atmosphereEnable;

        @C09CT("fans_exclusive_enable")
        public boolean fansExclusiveEnable;

        @C09CT("promotion_enable")
        public boolean promotionEnable;

        @C09CT("selling_point_enable")
        public boolean sellingPointEnable;

        public PinCardRefactorConfig() {
            this(true, true, true, true, true);
        }

        public PinCardRefactorConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.sellingPointEnable = z;
            this.promotionEnable = z2;
            this.fansExclusiveEnable = z3;
            this.assistantEnable = z4;
            this.atmosphereEnable = z5;
        }
    }
}
