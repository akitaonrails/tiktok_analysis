package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class RuleConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("op")
    public final String op;
    public final Map<String, String> replaceMap;

    @C09CT("type")
    public final String type;

    @C09CT("value")
    public final Set<String> value;

    public RuleConfig() {
        this(null, null, null, new LinkedHashMap());
    }

    public RuleConfig(String str, String str2, Set<String> set, Map<String, String> map) {
        this.op = str;
        this.type = str2;
        this.value = set;
        this.replaceMap = map;
    }
}
