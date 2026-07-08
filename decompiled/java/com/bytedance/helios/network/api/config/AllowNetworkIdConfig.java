package com.bytedance.helios.network.api.config;

import X.C08CX;
import X.C09CT;
import X.C2188811AlT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class AllowNetworkIdConfig {

    @C09CT("api_ids")
    public final Set<Integer> apiIds;

    @C09CT("invoke_type")
    public final String invokeType;

    public AllowNetworkIdConfig() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllowNetworkIdConfig)) {
            return false;
        }
        AllowNetworkIdConfig allowNetworkIdConfig = (AllowNetworkIdConfig) obj;
        return Intrinsics.LJFF(this.apiIds, allowNetworkIdConfig.apiIds) && Intrinsics.LJFF(this.invokeType, allowNetworkIdConfig.invokeType);
    }

    public final int hashCode() {
        return (this.apiIds.hashCode() * 31) + this.invokeType.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AllowNetworkIdConfig(apiIds=");
        sbLIZ.append(this.apiIds);
        sbLIZ.append(", invokeType=");
        sbLIZ.append(this.invokeType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AllowNetworkIdConfig(Set<Integer> set, String str) {
        this.apiIds = set;
        this.invokeType = str;
    }

    public AllowNetworkIdConfig(Set set, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? "around" : str);
    }
}
