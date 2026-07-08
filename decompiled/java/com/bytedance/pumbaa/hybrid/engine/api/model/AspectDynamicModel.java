package com.bytedance.pumbaa.hybrid.engine.api.model;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class AspectDynamicModel {

    @C09CT("constant")
    public final Map<String, ValueModel> constants;

    @C09CT("rules")
    public final List<RuleModel> rules;

    @C09CT("version")
    public final String version;

    public AspectDynamicModel() {
        this(null, null, null, 7, null);
    }

    public AspectDynamicModel(String str, Map<String, ValueModel> map, List<RuleModel> list) {
        this.version = str;
        this.constants = map;
        this.rules = list;
    }

    public AspectDynamicModel(String str, Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "1" : str, (i & 2) != 0 ? C2097608Jq.LJ() : map, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
