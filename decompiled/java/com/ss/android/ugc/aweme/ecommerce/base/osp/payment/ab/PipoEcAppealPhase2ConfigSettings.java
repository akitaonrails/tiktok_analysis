package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoEcAppealPhase2ConfigSettings {
    public static final PipoEcAppealPhase2ConfigModel LIZ = new PipoEcAppealPhase2ConfigModel(false, "");

    public static final PipoEcAppealPhase2ConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoEcAppealPhase2ConfigModel pipoEcAppealPhase2ConfigModel = LIZ;
        PipoEcAppealPhase2ConfigModel pipoEcAppealPhase2ConfigModel2 = (PipoEcAppealPhase2ConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_ec_appeal_phase2_config", PipoEcAppealPhase2ConfigModel.class, pipoEcAppealPhase2ConfigModel);
        return pipoEcAppealPhase2ConfigModel2 != null ? pipoEcAppealPhase2ConfigModel2 : pipoEcAppealPhase2ConfigModel;
    }

    public static final class PipoEcAppealPhase2ConfigModel {

        @C09CT("change_payment_method_type")
        public final String changePaymentMethodType;

        @C09CT("is_enabled")
        public final boolean isEnabled;

        public PipoEcAppealPhase2ConfigModel() {
            this(false, "");
        }

        public PipoEcAppealPhase2ConfigModel(boolean z, String str) {
            this.isEnabled = z;
            this.changePaymentMethodType = str;
        }
    }
}
