package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoPaymentDisplaySubIconConfigModel {

    @C09CT("payment_method_allow_list")
    public final List<String> paymentMethodAllowList;

    @C09CT("payment_method_allow_list_for_sub_icons")
    public final List<String> paymentMethodAllowListForSubIcons;

    public PipoPaymentDisplaySubIconConfigModel() {
        this(null, null);
    }

    public PipoPaymentDisplaySubIconConfigModel(List<String> list, List<String> list2) {
        this.paymentMethodAllowList = list;
        this.paymentMethodAllowListForSubIcons = list2;
    }
}
