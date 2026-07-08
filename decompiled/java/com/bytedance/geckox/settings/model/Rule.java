package com.bytedance.geckox.settings.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class Rule {

    @C09CT("pr")
    public final MultiParamsRule multiParamsRule;

    @C09CT("params")
    public final Map<String, Condition> paramConditions;

    public Rule(MultiParamsRule multiParamsRule, Map<String, Condition> map) {
        this.multiParamsRule = multiParamsRule;
        this.paramConditions = map;
    }
}
