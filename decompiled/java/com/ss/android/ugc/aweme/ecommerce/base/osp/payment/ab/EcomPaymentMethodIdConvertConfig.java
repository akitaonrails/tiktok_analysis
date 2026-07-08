package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomPaymentMethodIdConvertConfig {
    public static final PaymentMethodIdConvertModel LIZ = new PaymentMethodIdConvertModel(C13BV.INSTANCE);

    public static final class PaymentMethodIdConvertModel {

        @C09CT("savebox_convert_pmids")
        public final List<PaymentMethodIdConvertItemModel> covertPmIds;

        public PaymentMethodIdConvertModel() {
            this(null);
        }

        public PaymentMethodIdConvertModel(List<PaymentMethodIdConvertItemModel> list) {
            this.covertPmIds = list;
        }
    }

    public static final class PaymentMethodIdConvertItemModel {

        @C09CT("origin_payment_method_id")
        public final String originPmId;

        @C09CT("target_payment_method_id")
        public final String targetPmId;

        public PaymentMethodIdConvertItemModel() {
            this(null, null);
        }

        public PaymentMethodIdConvertItemModel(String str, String str2) {
            this.originPmId = str;
            this.targetPmId = str2;
        }
    }
}
