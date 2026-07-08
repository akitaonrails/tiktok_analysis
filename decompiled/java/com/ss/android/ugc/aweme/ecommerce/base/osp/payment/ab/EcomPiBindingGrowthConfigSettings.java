package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomPiBindingGrowthConfigSettings {
    public static final EcomPiBindingGrowthConfigModel LIZ = new EcomPiBindingGrowthConfigModel(false, true, false);

    public static boolean LIZ() {
        return LIZIZ().enablePaymentAssurance;
    }

    public static final EcomPiBindingGrowthConfigModel LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomPiBindingGrowthConfigModel ecomPiBindingGrowthConfigModel = LIZ;
        EcomPiBindingGrowthConfigModel ecomPiBindingGrowthConfigModel2 = (EcomPiBindingGrowthConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_pi_binding_growth_config", EcomPiBindingGrowthConfigModel.class, ecomPiBindingGrowthConfigModel);
        return ecomPiBindingGrowthConfigModel2 != null ? ecomPiBindingGrowthConfigModel2 : ecomPiBindingGrowthConfigModel;
    }

    public static final class EcomPiBindingGrowthConfigModel {

        @C09CT("add_card_retain_style_v2")
        public final boolean enableAddCardRetainStyleV2;

        @C09CT("tts_payment_assurance")
        public final boolean enablePaymentAssurance;

        @C09CT("tts_payment_assurance_keyboard_floating_window")
        public final boolean enablePaymentAssuranceKeyboardFloatingWindow;

        public EcomPiBindingGrowthConfigModel() {
            this(false, true, false);
        }

        public EcomPiBindingGrowthConfigModel(boolean z, boolean z2, boolean z3) {
            this.enablePaymentAssurance = z;
            this.enablePaymentAssuranceKeyboardFloatingWindow = z2;
            this.enableAddCardRetainStyleV2 = z3;
        }
    }
}
