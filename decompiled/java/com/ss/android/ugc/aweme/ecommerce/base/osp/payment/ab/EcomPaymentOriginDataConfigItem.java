package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomPaymentOriginDataConfigItem {

    @C09CT("display_payment_method_id")
    public final String displayPmId;

    @C09CT("filter_invalid_payment")
    public final Boolean filterInvalid;

    @C09CT("merged_payment_method_id")
    public final String mergedPmId;

    @C09CT("parent_payment_method_id")
    public final String parentPmId;

    public EcomPaymentOriginDataConfigItem() {
        this(null, null, null, Boolean.FALSE);
    }

    public EcomPaymentOriginDataConfigItem(String str, String str2, String str3, Boolean bool) {
        this.parentPmId = str;
        this.displayPmId = str2;
        this.mergedPmId = str3;
        this.filterInvalid = bool;
    }
}
