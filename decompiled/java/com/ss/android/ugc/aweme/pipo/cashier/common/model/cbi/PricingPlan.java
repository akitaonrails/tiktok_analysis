package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PricingPlan {

    @C09CT("actual_payment_amount")
    public final PricingAmount actualAmount;

    @C09CT("price_marketing_info")
    public final List<CBIPricingPlanMarketingTool> marketingTools;

    @C09CT("payment_display_summary")
    public final PricePlanPaymentDisplaySummary paymentDisplaySummary;

    @C09CT("pricing_plan_id")
    public final String pricingPlanId;

    public PricingPlan(String str, List<CBIPricingPlanMarketingTool> list, PricingAmount pricingAmount, PricePlanPaymentDisplaySummary pricePlanPaymentDisplaySummary) {
        this.pricingPlanId = str;
        this.marketingTools = list;
        this.actualAmount = pricingAmount;
        this.paymentDisplaySummary = pricePlanPaymentDisplaySummary;
    }
}
