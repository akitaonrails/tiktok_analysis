package com.bytedance.helios.api.config;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class PathRange {

    @C09CT("allow_list")
    public final Set<String> allowList;

    @C09CT("block_list")
    public final Set<String> blockList;

    @C09CT("start_with_allow_list")
    public final Set<String> startWithAllowList;

    @C09CT("start_with_block_list")
    public final Set<String> startWithBlockList;

    public PathRange() {
        this(null, null, null, null, 15, null);
    }

    public PathRange(Set<String> set, Set<String> set2, Set<String> set3, Set<String> set4) {
        this.allowList = set;
        this.blockList = set2;
        this.startWithAllowList = set3;
        this.startWithBlockList = set4;
    }

    public PathRange(Set set, Set set2, Set set3, Set set4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? C08CX.INSTANCE : set2, (i & 4) != 0 ? C08CX.INSTANCE : set3, (i & 8) != 0 ? C08CX.INSTANCE : set4);
    }
}
