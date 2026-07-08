package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class SPMMapping implements Serializable {
    public static final int $stable = 8;

    @C09CT("mapping")
    public final Map<String, List<String>> mapping;

    @C09CT("tips")
    public final String tips;

    public SPMMapping() {
        this(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SPMMapping(Map<String, ? extends List<String>> map, String str) {
        this.mapping = map;
        this.tips = str;
    }
}
