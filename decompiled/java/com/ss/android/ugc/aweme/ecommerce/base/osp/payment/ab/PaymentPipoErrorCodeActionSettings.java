package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentPipoErrorCodeActionSettings {
    public static final PaymentErrorCode LIZ = new PaymentErrorCode(false, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(59));

    public static final class PaymentErrorCode {

        @C09CT("enable_error_code")
        public final boolean enable;

        @C09CT("merchant_id")
        public final String merchantId;

        public PaymentErrorCode() {
            this(false, null);
        }

        public PaymentErrorCode(boolean z, String str) {
            this.enable = z;
            this.merchantId = str;
        }
    }
}
