package com.ss.android.ugc.feed.platform.componentmanager.data;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpTreeData implements Serializable {
    public static final int $stable = 8;

    @C09CT("root")
    public final String root;

    @C09CT("structure")
    public final Map<String, Set<String>> structure;

    public FcpTreeData() {
        this(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FcpTreeData(String str, Map<String, ? extends Set<String>> map) {
        this.root = str;
        this.structure = map;
    }
}
