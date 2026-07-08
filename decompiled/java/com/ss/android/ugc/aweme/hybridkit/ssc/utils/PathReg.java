package com.ss.android.ugc.aweme.hybridkit.ssc.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class PathReg {

    @C09CT("rule")
    public final RuleUnit rule;

    @C09CT("test")
    public final String test;

    public PathReg() {
        this(null, null);
    }

    public PathReg(String str, RuleUnit ruleUnit) {
        this.test = str;
        this.rule = ruleUnit;
    }
}
