package com.bytedance.helios.api.config;

import X.C08CX;
import X.C09CT;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class DomainRange {

    @C09CT("allow_list")
    public final Set<String> allowList;

    @C09CT("block_list")
    public final Set<String> blockList;

    @C09CT("encrypt_block_list")
    public final Set<String> encryptBlockList;

    @C09CT("end_with_allow_list")
    public final Set<String> endWithAllowList;

    @C09CT("end_with_block_list")
    public final Set<String> endWithBlockList;

    public DomainRange() {
        this(null, null, null, null, null, 31, null);
    }

    public DomainRange(Set<String> set, Set<String> set2, Set<String> set3, Set<String> set4, Set<String> set5) {
        this.allowList = set;
        this.blockList = set2;
        this.encryptBlockList = set3;
        this.endWithAllowList = set4;
        this.endWithBlockList = set5;
    }

    public DomainRange(Set set, Set set2, Set set3, Set set4, Set set5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashSet() : set, (i & 2) != 0 ? C08CX.INSTANCE : set2, (i & 4) != 0 ? C08CX.INSTANCE : set3, (i & 8) != 0 ? C08CX.INSTANCE : set4, (i & 16) != 0 ? C08CX.INSTANCE : set5);
    }
}
