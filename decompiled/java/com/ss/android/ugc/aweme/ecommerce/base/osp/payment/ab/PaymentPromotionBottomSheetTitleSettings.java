package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import android.content.Context;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class PaymentPromotionBottomSheetTitleSettings {
    public static final PaymentPromotionBottomSheetConfig LIZ = new PaymentPromotionBottomSheetConfig(null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(126));

    public static final class PaymentPromotionBottomSheetConfig {

        @C09CT("payment_title")
        public final String paymentTitle;

        public PaymentPromotionBottomSheetConfig() {
            this(null);
        }

        public PaymentPromotionBottomSheetConfig(String str) {
            this.paymentTitle = str;
        }
    }

    public static String LIZ(Context context) {
        String string;
        String str = ((PaymentPromotionBottomSheetConfig) LIZIZ.getValue()).paymentTitle;
        if (str == null) {
            if (context == null || (string = context.getString(2131839179)) == null) {
                return "";
            }
            return string;
        }
        return str;
    }
}
