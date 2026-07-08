package com.bytedance.pumbaa.hybrid.rasp.router;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class BostonRouterInterceptorModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("hint_enable")
    public final boolean hintEnable;

    @C09CT("report_enable")
    public final boolean reportEnable;

    @C09CT("risk_filters")
    public final List<BostonRouterFilterRuleModel> riskFilters;

    @C09CT("risky_schema")
    public final List<String> riskySchemas;

    public BostonRouterInterceptorModel() {
        this(false, false, false, new ArrayList(), new ArrayList());
    }

    public BostonRouterInterceptorModel(boolean z, boolean z2, boolean z3, List<String> list, List<BostonRouterFilterRuleModel> list2) {
        this.enable = z;
        this.reportEnable = z2;
        this.hintEnable = z3;
        this.riskySchemas = list;
        this.riskFilters = list2;
    }
}
