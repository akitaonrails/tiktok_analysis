package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPaymentAddCardConfigSettings {
    public static final EcPaymentAddCardConfigModel LIZ = new EcPaymentAddCardConfigModel(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);

    public static final class EcPaymentAddCardConfigModel {

        @C09CT("ccdc_add_card_check")
        public final Boolean ccdcAddCardCheck;

        @C09CT("cci_installment_separate_select")
        public final Boolean cciInstallmentSeparateSelect;

        @C09CT("form_opti")
        public final Boolean formOpti;

        @C09CT("new_display_name_type")
        public final Boolean newDisplayNameType;

        public EcPaymentAddCardConfigModel() {
            this(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
        }

        public EcPaymentAddCardConfigModel(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            this.ccdcAddCardCheck = bool;
            this.cciInstallmentSeparateSelect = bool2;
            this.newDisplayNameType = bool3;
            this.formOpti = bool4;
        }
    }

    public static final EcPaymentAddCardConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcPaymentAddCardConfigModel ecPaymentAddCardConfigModel = LIZ;
        EcPaymentAddCardConfigModel ecPaymentAddCardConfigModel2 = (EcPaymentAddCardConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ec_payment_add_card_config", EcPaymentAddCardConfigModel.class, ecPaymentAddCardConfigModel);
        return ecPaymentAddCardConfigModel2 != null ? ecPaymentAddCardConfigModel2 : ecPaymentAddCardConfigModel;
    }
}
