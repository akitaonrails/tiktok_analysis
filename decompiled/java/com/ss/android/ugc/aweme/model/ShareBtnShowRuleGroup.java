package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ShareBtnShowRuleGroup {

    @C09CT("rules")
    public final List<ShareBtnShowRule> showRules;

    public ShareBtnShowRuleGroup() {
        this(new ArrayList());
    }

    public ShareBtnShowRuleGroup(List<ShareBtnShowRule> list) {
        this.showRules = list;
    }
}
