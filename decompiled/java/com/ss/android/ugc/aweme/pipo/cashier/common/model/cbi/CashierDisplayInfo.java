package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class CashierDisplayInfo {

    @C09CT("default_pricing_plan_id")
    public final String defaultPricingPlanId;

    @C09CT("pricing_plans")
    public final Map<String, PricingPlan> pricingPlanMap;

    @C09CT("raw_text_and_icon")
    public final RawTextAndIcon rawTextAndIcon;

    @C09CT("text_style")
    public final TextStyle textStyle;

    public CashierDisplayInfo() {
        this(null, null, null, null);
    }

    public CashierDisplayInfo(RawTextAndIcon rawTextAndIcon, TextStyle textStyle, Map<String, PricingPlan> map, String str) {
        this.rawTextAndIcon = rawTextAndIcon;
        this.textStyle = textStyle;
        this.pricingPlanMap = map;
        this.defaultPricingPlanId = str;
    }
}
