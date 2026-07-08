package com.bytedance.helios.api.config;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

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

    public AllowNetworkApmConfig(Set<String> set, Set<String> set2, String str) {
        this.contentTypes = set;
        this.contentSubTypes = set2;
        this.invokeType = str;
    }

    public AllowNetworkApmConfig(Set set, Set set2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? C08CX.INSTANCE : set2, (i & 4) != 0 ? "around" : str);
    }
}
