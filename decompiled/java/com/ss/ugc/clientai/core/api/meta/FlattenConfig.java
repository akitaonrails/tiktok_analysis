package com.ss.ugc.clientai.core.api.meta;

import X.C09CT;
import java.util.HashSet;

/* JADX INFO: loaded from: classes24.dex */
public final class FlattenConfig {

    @C09CT("flatted_recursive")
    public boolean flattedRecursive;

    @C09CT("prefix")
    public String prefix;

    @C09CT("reverse_producers")
    public HashSet<String> reverseProducers;

    @C09CT("separator")
    public String separator;

    public FlattenConfig() {
        this("_", "", false, null);
    }

    public FlattenConfig(String str, String str2, boolean z, HashSet<String> hashSet) {
        this.separator = str;
        this.prefix = str2;
        this.flattedRecursive = z;
        this.reverseProducers = hashSet;
    }
}
