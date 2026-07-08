package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class InterfaceControlRule implements Serializable {
    public static final int $stable = 8;

    @C09CT("name")
    public final String name;

    @C09CT("then")
    public final List<RuleConfig> ruleThens;

    @C09CT("when")
    public final RuleWhen ruleWhen;

    public InterfaceControlRule() {
        this(null, null, null);
    }

    public InterfaceControlRule(String str, RuleWhen ruleWhen, List<RuleConfig> list) {
        this.name = str;
        this.ruleWhen = ruleWhen;
        this.ruleThens = list;
    }
}
