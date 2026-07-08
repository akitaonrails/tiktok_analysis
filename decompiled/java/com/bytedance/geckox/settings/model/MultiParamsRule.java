package com.bytedance.geckox.settings.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class MultiParamsRule {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MultiParamsRule[] $VALUES;

    @C09CT("a")
    public static final MultiParamsRule MATCH_AND = new MultiParamsRule("MATCH_AND", 0);

    @C09CT("o")
    public static final MultiParamsRule MATCH_OR = new MultiParamsRule("MATCH_OR", 1);

    public static final /* synthetic */ MultiParamsRule[] $values() {
        return new MultiParamsRule[]{MATCH_AND, MATCH_OR};
    }

    public static InterfaceC2044707zh<MultiParamsRule> getEntries() {
        return $ENTRIES;
    }

    static {
        MultiParamsRule[] multiParamsRuleArr$values = $values();
        $VALUES = multiParamsRuleArr$values;
        $ENTRIES = new C2254308sP(multiParamsRuleArr$values);
    }

    public static MultiParamsRule[] values() {
        return (MultiParamsRule[]) $VALUES.clone();
    }

    public static MultiParamsRule valueOf(String str) {
        return (MultiParamsRule) C08FF.LIZ(MultiParamsRule.class, str);
    }

    public MultiParamsRule(String str, int i) {
    }
}
