package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PayloadTemplate {

    @C09CT("common_retain_display_info")
    public CommonRetainDisplayInfo commonRetainDisplayInfo;

    @C09CT("voucher_retain_display_info")
    public VoucherRetainDisplayInfo displayInfo;

    public PayloadTemplate() {
        this(null, null);
    }

    public PayloadTemplate(VoucherRetainDisplayInfo voucherRetainDisplayInfo, CommonRetainDisplayInfo commonRetainDisplayInfo) {
        this.displayInfo = voucherRetainDisplayInfo;
        this.commonRetainDisplayInfo = commonRetainDisplayInfo;
    }
}
