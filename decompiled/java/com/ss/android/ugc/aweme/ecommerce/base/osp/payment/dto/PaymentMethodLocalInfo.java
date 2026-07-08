package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentMethodLocalInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("payment_method_id")
    public final String id;

    @C09CT("is_new_card")
    public final Boolean newCard;

    @C09CT("sub_payment_method_local_info")
    public final List<PaymentMethodLocalInfo> subPaymentMethodLocalInfo;

    @C09CT("payment_method_token")
    public final String token;

    public PaymentMethodLocalInfo() {
        this(null, null, null, null);
    }

    public PaymentMethodLocalInfo(String str, String str2, Boolean bool, List<PaymentMethodLocalInfo> list) {
        this.id = str;
        this.token = str2;
        this.newCard = bool;
        this.subPaymentMethodLocalInfo = list;
    }
}
