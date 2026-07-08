package com.bytedance.helios.api.config;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class AllowNetworkIdConfig {

    @C09CT("api_ids")
    public final Set<Integer> apiIds;

    @C09CT("invoke_type")
    public final String invokeType;

    public AllowNetworkIdConfig() {
        this(null, null, 3, null);
    }

    public AllowNetworkIdConfig(Set<Integer> set, String str) {
        this.apiIds = set;
        this.invokeType = str;
    }

    public AllowNetworkIdConfig(Set set, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? "around" : str);
    }
}
