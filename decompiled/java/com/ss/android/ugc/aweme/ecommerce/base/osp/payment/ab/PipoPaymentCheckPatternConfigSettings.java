package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoPaymentCheckPatternConfigSettings {
    public static final PipoPaymentCheckPatternConfigModel LIZ = new PipoPaymentCheckPatternConfigModel(null);

    public static final class PipoPaymentCheckPatternConfigModel {

        @C09CT("holder_name_check_pattern")
        public final String holderNameCheckPattern;

        public PipoPaymentCheckPatternConfigModel() {
            this(null);
        }

        public PipoPaymentCheckPatternConfigModel(String str) {
            this.holderNameCheckPattern = str;
        }
    }
}
