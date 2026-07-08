package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPaymentCreditAddCciConfigSettings {
    public static final CreditConfig LIZ = new CreditConfig(true, true, true, true, true);

    public static final CreditConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        CreditConfig creditConfig = LIZ;
        CreditConfig creditConfig2 = (CreditConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_payment_br_credit_add_cci_config", CreditConfig.class, creditConfig);
        return creditConfig2 != null ? creditConfig2 : creditConfig;
    }

    public static final class CreditConfig {

        @C09CT("disable_show_installment")
        public final boolean disableShowInstallment;

        @C09CT("disable_use_cci_installment_in_combination_state")
        public final boolean disableUseCciInstallmentInCombinationState;

        @C09CT("enable_add_card_strategy")
        public final boolean enableAddCardStrategy;

        @C09CT("should_disable_independent_price")
        public final boolean shouldDisableIndependentPrice;

        @C09CT("should_skip_installment_select")
        public final boolean shouldSkipInstallmentSelect;

        public CreditConfig() {
            this(true, true, true, true, true);
        }

        public CreditConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.enableAddCardStrategy = z;
            this.disableShowInstallment = z2;
            this.shouldSkipInstallmentSelect = z3;
            this.disableUseCciInstallmentInCombinationState = z4;
            this.shouldDisableIndependentPrice = z5;
        }
    }
}
