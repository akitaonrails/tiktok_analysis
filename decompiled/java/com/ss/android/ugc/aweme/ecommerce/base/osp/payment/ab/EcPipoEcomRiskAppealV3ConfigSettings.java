package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPipoEcomRiskAppealV3ConfigSettings {
    public static final V3Config LIZ = new V3Config(false, false, false, false);

    public static final V3Config LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        V3Config v3Config = LIZ;
        V3Config v3Config2 = (V3Config) settingsManagerLIZLLL.LJIIIIZZ("pipo_ecom_risk_appeal_v3_config", V3Config.class, v3Config);
        return v3Config2 != null ? v3Config2 : v3Config;
    }

    public static final boolean LIZIZ() {
        return LIZ().isAddCardDialogEnabled;
    }

    public static final boolean LIZJ() {
        return LIZ().isCustomTagEnabled;
    }

    public static final class V3Config {

        @C09CT("is_add_card_dialog_enabled")
        public final boolean isAddCardDialogEnabled;

        @C09CT("is_change_merchant_order_id_in_get_appeal_authorization_content")
        public final boolean isChangeMerchantOrderIdInGetAppealAuthorizationContent;

        @C09CT("is_custom_tag_enabled")
        public final boolean isCustomTagEnabled;

        @C09CT("is_google_pay_enabled")
        public final boolean isGooglePayEnabled;

        public V3Config() {
            this(false, false, false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof V3Config)) {
                return false;
            }
            V3Config v3Config = (V3Config) obj;
            return this.isAddCardDialogEnabled == v3Config.isAddCardDialogEnabled && this.isCustomTagEnabled == v3Config.isCustomTagEnabled && this.isChangeMerchantOrderIdInGetAppealAuthorizationContent == v3Config.isChangeMerchantOrderIdInGetAppealAuthorizationContent && this.isGooglePayEnabled == v3Config.isGooglePayEnabled;
        }

        public final int hashCode() {
            return (((((C786410Ut5.Z2(this.isAddCardDialogEnabled) * 31) + C786410Ut5.Z2(this.isCustomTagEnabled)) * 31) + C786410Ut5.Z2(this.isChangeMerchantOrderIdInGetAppealAuthorizationContent)) * 31) + C786410Ut5.Z2(this.isGooglePayEnabled);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("V3Config(isAddCardDialogEnabled=");
            sbLIZ.append(this.isAddCardDialogEnabled);
            sbLIZ.append(", isCustomTagEnabled=");
            sbLIZ.append(this.isCustomTagEnabled);
            sbLIZ.append(", isChangeMerchantOrderIdInGetAppealAuthorizationContent=");
            sbLIZ.append(this.isChangeMerchantOrderIdInGetAppealAuthorizationContent);
            sbLIZ.append(", isGooglePayEnabled=");
            sbLIZ.append(this.isGooglePayEnabled);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public V3Config(boolean z, boolean z2, boolean z3, boolean z4) {
            this.isAddCardDialogEnabled = z;
            this.isCustomTagEnabled = z2;
            this.isChangeMerchantOrderIdInGetAppealAuthorizationContent = z3;
            this.isGooglePayEnabled = z4;
        }
    }
}
