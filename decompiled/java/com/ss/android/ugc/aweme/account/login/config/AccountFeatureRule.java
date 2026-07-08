package com.ss.android.ugc.aweme.account.login.config;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes27.dex */
public final class AccountFeatureRule {

    @C09CT("when")
    public final RuleCondition condition;

    @C09CT("patch")
    public final n patch;

    public AccountFeatureRule() {
        this(new RuleCondition(null, null, 3, null), new n());
    }

    public AccountFeatureRule(RuleCondition ruleCondition, n nVar) {
        this.condition = ruleCondition;
        this.patch = nVar;
    }
}
