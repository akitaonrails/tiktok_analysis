package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class RuleWhen implements Serializable {
    public static final int $stable = 8;

    @C09CT("domain")
    public final RuleConfig domain;

    @C09CT("path")
    public final RuleConfig path;

    public RuleWhen() {
        this(null, null);
    }

    public RuleWhen(RuleConfig ruleConfig, RuleConfig ruleConfig2) {
        this.domain = ruleConfig;
        this.path = ruleConfig2;
    }
}
