package com.bytedance.helios.network.api.config;

import X.C08CX;
import X.C09CT;
import X.C2188811AlT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class AllowNetworkApiConfig {

    @C09CT("end_with_domains")
    public final Set<String> endWithDomains;

    @C09CT("invoke_type")
    public final String invokeType;

    @C09CT("start_with_paths")
    public final Set<String> startWithPaths;

    public AllowNetworkApiConfig() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllowNetworkApiConfig)) {
            return false;
        }
        AllowNetworkApiConfig allowNetworkApiConfig = (AllowNetworkApiConfig) obj;
        return Intrinsics.LJFF(this.endWithDomains, allowNetworkApiConfig.endWithDomains) && Intrinsics.LJFF(this.startWithPaths, allowNetworkApiConfig.startWithPaths) && Intrinsics.LJFF(this.invokeType, allowNetworkApiConfig.invokeType);
    }

    public final int hashCode() {
        return (((this.endWithDomains.hashCode() * 31) + this.startWithPaths.hashCode()) * 31) + this.invokeType.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AllowNetworkApiConfig(endWithDomains=");
        sbLIZ.append(this.endWithDomains);
        sbLIZ.append(", startWithPaths=");
        sbLIZ.append(this.startWithPaths);
        sbLIZ.append(", invokeType=");
        sbLIZ.append(this.invokeType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AllowNetworkApiConfig(Set<String> set, Set<String> set2, String str) {
        this.endWithDomains = set;
        this.startWithPaths = set2;
        this.invokeType = str;
    }

    public AllowNetworkApiConfig(Set set, Set set2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? C08CX.INSTANCE : set2, (i & 4) != 0 ? "around" : str);
    }
}
