package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentParams;

/* JADX INFO: loaded from: classes2.dex */
public final class BillInfoRenderRequest {

    @C09CT("bill_info_server_params")
    public final String billInfoServerParams;

    @C09CT("payment_params")
    public final PaymentParams paymentParams;

    public BillInfoRenderRequest(String str, PaymentParams paymentParams) {
        this.billInfoServerParams = str;
        this.paymentParams = paymentParams;
    }
}
