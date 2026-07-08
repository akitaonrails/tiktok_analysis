package com.bytedance.geckox.settings.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class MatchRule {
    public static final /* synthetic */ MatchRule[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("a")
    public static final MatchRule MATCH_ALL;

    @C09CT("o")
    public static final MatchRule MATCH_ONE;

    public static InterfaceC2044707zh<MatchRule> getEntries() {
        return LLILLJJLI;
    }

    static {
        MatchRule matchRule = new MatchRule("MATCH_ALL", 0);
        MATCH_ALL = matchRule;
        MatchRule matchRule2 = new MatchRule("MATCH_ONE", 1);
        MATCH_ONE = matchRule2;
        MatchRule[] matchRuleArr = {matchRule, matchRule2};
        LL = matchRuleArr;
        LLILLJJLI = new C2254308sP(matchRuleArr);
    }

    public static MatchRule[] values() {
        return (MatchRule[]) LL.clone();
    }

    public static MatchRule valueOf(String str) {
        return (MatchRule) C08FF.LIZ(MatchRule.class, str);
    }

    public MatchRule(String str, int i) {
    }
}
