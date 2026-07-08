package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartFeedLoadMoreStrategyConfig {

    @C09CT("default")
    public int defaultIndex;

    @C09CT("label_index_mapping")
    public List<String> labelIndexMapping;

    @C09CT("plan")
    public List<FeedLoadMorePlan> plans;

    public final int getDefaultIndex() {
        return this.defaultIndex;
    }

    public final List<String> getLabelIndexMapping() {
        return this.labelIndexMapping;
    }

    public final List<FeedLoadMorePlan> getPlans() {
        return this.plans;
    }

    public final FeedLoadMorePlan getPlan(String str) {
        int iIndexOf;
        List<FeedLoadMorePlan> list = this.plans;
        List<String> list2 = this.labelIndexMapping;
        if (list != null && list2 != null && (iIndexOf = list2.indexOf(str)) >= 0 && iIndexOf < list.size()) {
            return (FeedLoadMorePlan) ListProtector.get(list, iIndexOf);
        }
        return null;
    }

    public final void setDefaultIndex(int i) {
        this.defaultIndex = i;
    }

    public final void setLabelIndexMapping(List<String> list) {
        this.labelIndexMapping = list;
    }

    public final void setPlans(List<FeedLoadMorePlan> list) {
        this.plans = list;
    }
}
