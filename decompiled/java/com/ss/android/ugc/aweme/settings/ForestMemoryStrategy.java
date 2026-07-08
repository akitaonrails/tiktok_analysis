package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ForestMemoryStrategy {

    @C09CT("allow_evict")
    public boolean allowEvict;

    @C09CT("allow_trim_memory_cache")
    public boolean allowTrimMemoryCache;

    @C09CT("allow_trim_resource_group")
    public boolean allowTrimResourceGroup;

    @C09CT("forest_memory_block_list")
    public ArrayList<String> blockList;

    public ForestMemoryStrategy() {
        this(false, false, false, null);
    }

    public ForestMemoryStrategy(boolean z, boolean z2, boolean z3, ArrayList<String> arrayList) {
        this.allowEvict = z;
        this.allowTrimResourceGroup = z2;
        this.allowTrimMemoryCache = z3;
        this.blockList = arrayList;
    }
}
