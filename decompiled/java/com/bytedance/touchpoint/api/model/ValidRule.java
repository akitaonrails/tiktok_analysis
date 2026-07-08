package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ValidRule {

    @C09CT("rule_meta")
    public final String ruleMeta;

    @C09CT("rule_type")
    public final String ruleType;

    public ValidRule(String str, String str2) {
        this.ruleType = str;
        this.ruleMeta = str2;
    }
}
