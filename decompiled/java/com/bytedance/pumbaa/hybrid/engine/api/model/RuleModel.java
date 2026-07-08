package com.bytedance.pumbaa.hybrid.engine.api.model;

import X.C09CT;
import X.C0WN8;
import X.C0WO5;

/* JADX INFO: loaded from: classes14.dex */
public final class RuleModel {

    @C09CT("action")
    public final ActionModel action;

    @C09CT("rule_aspect")
    public final C0WN8 aspectType;

    @C09CT("condition")
    public final C0WO5 condition;

    @C09CT("rule_name")
    public final String name;

    @C09CT("rule_priority")
    public final int priority;

    public RuleModel(String str, int i, C0WN8 c0wn8, C0WO5 c0wo5, ActionModel actionModel) {
        this.name = str;
        this.priority = i;
        this.aspectType = c0wn8;
        this.condition = c0wo5;
        this.action = actionModel;
    }
}
