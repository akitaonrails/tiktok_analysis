package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareBtnHideRuleGroup {

    @C09CT("rules")
    public final List<ShareBtnHideRule> hideRules;

    public ShareBtnHideRuleGroup() {
        this(new ArrayList());
    }

    public ShareBtnHideRuleGroup(List<ShareBtnHideRule> list) {
        this.hideRules = list;
    }
}
