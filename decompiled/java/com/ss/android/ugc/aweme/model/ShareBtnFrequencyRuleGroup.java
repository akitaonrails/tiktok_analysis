package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareBtnFrequencyRuleGroup {

    @C09CT("rules")
    public final List<ShareBtnFrequencyRule> frequencyRules;

    public ShareBtnFrequencyRuleGroup() {
        this(new ArrayList());
    }

    public ShareBtnFrequencyRuleGroup(List<ShareBtnFrequencyRule> list) {
        this.frequencyRules = list;
    }
}
