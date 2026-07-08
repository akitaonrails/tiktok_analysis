package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentRenderData;

/* JADX INFO: loaded from: classes2.dex */
public final class BillInfoRenderResponse {

    @C09CT("leading_elevator_bar")
    public final LeadingElevatorBar elevatorBar;

    @C09CT("payment_render_data")
    public final PaymentRenderData paymentRenderData;

    public BillInfoRenderResponse(PaymentRenderData paymentRenderData, LeadingElevatorBar leadingElevatorBar) {
        this.paymentRenderData = paymentRenderData;
        this.elevatorBar = leadingElevatorBar;
    }
}
