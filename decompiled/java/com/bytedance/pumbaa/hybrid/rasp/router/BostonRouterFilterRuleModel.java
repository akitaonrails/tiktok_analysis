package com.bytedance.pumbaa.hybrid.rasp.router;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class BostonRouterFilterRuleModel {

    @C09CT("filter")
    public final List<String> filter;

    @C09CT("key")
    public final String key;

    @C09CT("schema")
    public final String schema;

    public BostonRouterFilterRuleModel() {
        this("", "", null);
    }

    public BostonRouterFilterRuleModel(String str, String str2, List<String> list) {
        this.key = str;
        this.schema = str2;
        this.filter = list;
    }
}
