package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoCheckoutNewCardPreRiskConfigSettings {
    public static final PipoCheckoutNewCardPreRiskConfigModel LIZ = new PipoCheckoutNewCardPreRiskConfigModel(Boolean.FALSE);

    public static final class PipoCheckoutNewCardPreRiskConfigModel {

        @C09CT("enable_new_card_pre_risk")
        public final Boolean enableNewCardPreRisk;

        public PipoCheckoutNewCardPreRiskConfigModel() {
            this(Boolean.FALSE);
        }

        public PipoCheckoutNewCardPreRiskConfigModel(Boolean bool) {
            this.enableNewCardPreRisk = bool;
        }
    }
}
