package com.bytedance.helios.api.config;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class DataOperationStrategy {

    @C09CT("delete")
    public final Set<String> delete;

    @C09CT("update")
    public final Map<String, String> update;

    public DataOperationStrategy() {
        this(new LinkedHashSet(), new LinkedHashMap());
    }

    public DataOperationStrategy(Set<String> set, Map<String, String> map) {
        this.delete = set;
        this.update = map;
    }
}
