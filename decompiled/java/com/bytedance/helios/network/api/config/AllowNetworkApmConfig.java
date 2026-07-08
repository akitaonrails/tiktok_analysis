package com.bytedance.helios.network.api.config;

import X.C08CX;
import X.C09CT;
import X.C2188811AlT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class AllowNetworkApmConfig {

    @C09CT("content_sub_types")
    public final Set<String> contentSubTypes;

    @C09CT("content_types")
    public final Set<String> contentTypes;

    @C09CT("invoke_type")
    public final String invokeType;

    public AllowNetworkApmConfig() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllowNetworkApmConfig)) {
            return false;
        }
        AllowNetworkApmConfig allowNetworkApmConfig = (AllowNetworkApmConfig) obj;
        return Intrinsics.LJFF(this.contentTypes, allowNetworkApmConfig.contentTypes) && Intrinsics.LJFF(this.contentSubTypes, allowNetworkApmConfig.contentSubTypes) && Intrinsics.LJFF(this.invokeType, allowNetworkApmConfig.invokeType);
    }

    public final int hashCode() {
        return (((this.contentTypes.hashCode() * 31) + this.contentSubTypes.hashCode()) * 31) + this.invokeType.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AllowNetworkApmConfig(contentTypes=");
        sbLIZ.append(this.contentTypes);
        sbLIZ.append(", contentSubTypes=");
        sbLIZ.append(this.contentSubTypes);
        sbLIZ.append(", invokeType=");
        sbLIZ.append(this.invokeType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AllowNetworkApmConfig(Set<String> set, Set<String> set2, String str) {
        this.contentTypes = set;
        this.contentSubTypes = set2;
        this.invokeType = str;
    }

    public AllowNetworkApmConfig(Set set, Set set2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? C08CX.INSTANCE : set2, (i & 4) != 0 ? "around" : str);
    }
}
