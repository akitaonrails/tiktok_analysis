package com.bytedance.helios.network.api.config;

import X.C08CX;
import X.C09CT;
import X.C2188811AlT;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DomainRange)) {
            return false;
        }
        DomainRange domainRange = (DomainRange) obj;
        return Intrinsics.LJFF(this.allowList, domainRange.allowList) && Intrinsics.LJFF(this.blockList, domainRange.blockList) && Intrinsics.LJFF(this.encryptBlockList, domainRange.encryptBlockList) && Intrinsics.LJFF(this.endWithAllowList, domainRange.endWithAllowList) && Intrinsics.LJFF(this.endWithBlockList, domainRange.endWithBlockList);
    }

    public final int hashCode() {
        return (((((((this.allowList.hashCode() * 31) + this.blockList.hashCode()) * 31) + this.encryptBlockList.hashCode()) * 31) + this.endWithAllowList.hashCode()) * 31) + this.endWithBlockList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DomainRange(allowList=");
        sbLIZ.append(this.allowList);
        sbLIZ.append(", blockList=");
        sbLIZ.append(this.blockList);
        sbLIZ.append(", encryptBlockList=");
        sbLIZ.append(this.encryptBlockList);
        sbLIZ.append(", endWithAllowList=");
        sbLIZ.append(this.endWithAllowList);
        sbLIZ.append(", endWithBlockList=");
        sbLIZ.append(this.endWithBlockList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
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
