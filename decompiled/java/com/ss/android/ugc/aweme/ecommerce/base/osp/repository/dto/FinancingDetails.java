package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.AnonymousClass0369;
import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class FinancingDetails implements Serializable {
    public static final int $stable = 0;
    public static final AnonymousClass0369 Companion = new AnonymousClass0369();

    @C09CT("downpayment_amount")
    public final Amount downpaymentAmount;

    @C09CT("hybrid_downpayment_amount")
    public final Amount hybridDownpaymentAmount;

    @C09CT("requested_installment_plan_id")
    public final String requestedInstallmentPlanId;

    @C09CT("requested_prequalified_installment_plan_id")
    public final String requestedPrequalifiedInstallmentPlanId;

    public FinancingDetails() {
        this(null, null, null, null);
    }

    public FinancingDetails(Amount amount, Amount amount2, String str, String str2) {
        this.downpaymentAmount = amount;
        this.hybridDownpaymentAmount = amount2;
        this.requestedPrequalifiedInstallmentPlanId = str;
        this.requestedInstallmentPlanId = str2;
    }
}
