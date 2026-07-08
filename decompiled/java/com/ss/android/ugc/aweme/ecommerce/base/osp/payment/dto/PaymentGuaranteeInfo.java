package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentGuaranteeInfo {

    @C09CT("payment_guarantees")
    public List<PaymentGuarantee> paymentGuarantee;

    @C09CT("save_display_popup_text")
    public SaveDisplayInfo saveInfo;

    public PaymentGuaranteeInfo() {
    }

    public PaymentGuaranteeInfo(SaveDisplayInfo saveDisplayInfo, List<PaymentGuarantee> list) {
        this.saveInfo = saveDisplayInfo;
        this.paymentGuarantee = list;
    }
}
