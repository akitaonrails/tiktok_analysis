package com.bytedance.helios.network.api.config;

import X.C08CX;
import X.C09CT;
import X.C2188811AlT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathRange)) {
            return false;
        }
        PathRange pathRange = (PathRange) obj;
        return Intrinsics.LJFF(this.allowList, pathRange.allowList) && Intrinsics.LJFF(this.blockList, pathRange.blockList) && Intrinsics.LJFF(this.startWithAllowList, pathRange.startWithAllowList) && Intrinsics.LJFF(this.startWithBlockList, pathRange.startWithBlockList);
    }

    public final int hashCode() {
        return (((((this.allowList.hashCode() * 31) + this.blockList.hashCode()) * 31) + this.startWithAllowList.hashCode()) * 31) + this.startWithBlockList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PathRange(allowList=");
        sbLIZ.append(this.allowList);
        sbLIZ.append(", blockList=");
        sbLIZ.append(this.blockList);
        sbLIZ.append(", startWithAllowList=");
        sbLIZ.append(this.startWithAllowList);
        sbLIZ.append(", startWithBlockList=");
        sbLIZ.append(this.startWithBlockList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
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
