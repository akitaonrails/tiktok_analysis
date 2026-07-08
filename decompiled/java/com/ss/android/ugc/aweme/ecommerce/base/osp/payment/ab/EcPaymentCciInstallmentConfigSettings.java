package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPaymentCciInstallmentConfigSettings {
    public static final CciInstallmentModel LIZ = new CciInstallmentModel(Boolean.FALSE);

    public static final class CciInstallmentModel {

        @C09CT("enable_right_arrow")
        public final Boolean enableRightArrow;

        public CciInstallmentModel() {
            this(Boolean.FALSE);
        }

        public CciInstallmentModel(Boolean bool) {
            this.enableRightArrow = bool;
        }
    }
}
