package com.bytedance.geckox.settings.model;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class Matcher {

    @C09CT("params")
    public final Map<String, Condition> eventParams;

    @C09CT("mr")
    public final MatchRule matchRule;

    @C09CT("pr")
    public final MultiParamsRule multiParamsRule;
    public final List<Resource> resources;
    public final List<Rule> rules;

    public Matcher(Map<String, Condition> map, List<Rule> list, List<Resource> list2, MatchRule matchRule, MultiParamsRule multiParamsRule) {
        this.eventParams = map;
        this.rules = list;
        this.resources = list2;
        this.matchRule = matchRule;
        this.multiParamsRule = multiParamsRule;
    }
}
