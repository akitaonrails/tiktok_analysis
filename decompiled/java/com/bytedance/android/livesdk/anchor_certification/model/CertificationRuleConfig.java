package com.bytedance.android.livesdk.anchor_certification.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CertificationRuleConfig {

    @C09CT("consequent_check_period_num")
    public long consequentCheckPeriodNum;

    @C09CT("content_density_rule_config")
    public ContentDensityRuleConfig contentDensityRuleConfig;

    @C09CT("revenue_rule_config")
    public RevenueRuleConfig revenueRuleConfig;

    @C09CT("types")
    public List<Integer> types = new ArrayList();
}
