package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackageBenefit {

    @C09CT("benefit_config")
    public BenefitConfig benefitConfig;

    @C09CT("customized_benefits")
    public List<SubCustomizedBenefit> customizedBenefits = new ArrayList();

    @C09CT("package_summary")
    public SubPackageSummary packageSummary;

    @C09CT("progressive_benefit_info")
    public ProgressiveBenefitInfo progressiveBenefitInfo;

    @C09CT("total_perk_count")
    public long totalPerkCount;
}
