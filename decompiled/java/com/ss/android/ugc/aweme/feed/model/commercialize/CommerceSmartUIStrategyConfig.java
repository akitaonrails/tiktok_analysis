package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class CommerceSmartUIStrategyConfig implements Serializable {

    @C09CT("default")
    public int defaultIndex;

    @C09CT("lable_index_mapping")
    public List<String> lableIndexMapping;

    @C09CT("plan")
    public PlanConfig[] plans;

    public final int getDefaultIndex() {
        return this.defaultIndex;
    }

    public final List<String> getLableIndexMapping() {
        return this.lableIndexMapping;
    }

    public final PlanConfig[] getPlans() {
        return this.plans;
    }

    public final void setDefaultIndex(int i) {
        this.defaultIndex = i;
    }

    public final void setLableIndexMapping(List<String> list) {
        this.lableIndexMapping = list;
    }

    public final void setPlans(PlanConfig[] planConfigArr) {
        this.plans = planConfigArr;
    }
}
