package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class QuickExternalShareBtnConfig {

    @C09CT("frequency_rule_groups")
    public final List<ShareBtnFrequencyRuleGroup> frequencyRuleGroups;

    @C09CT("hide_rule_groups")
    public final List<ShareBtnHideRuleGroup> hideRuleGroups;

    @C09CT("show_rule_groups")
    public final List<ShareBtnShowRuleGroup> showRuleGroups;

    public QuickExternalShareBtnConfig() {
        this(null, null, null);
    }

    public QuickExternalShareBtnConfig(List<ShareBtnShowRuleGroup> list, List<ShareBtnFrequencyRuleGroup> list2, List<ShareBtnHideRuleGroup> list3) {
        this.showRuleGroups = list;
        this.frequencyRuleGroups = list2;
        this.hideRuleGroups = list3;
    }
}
