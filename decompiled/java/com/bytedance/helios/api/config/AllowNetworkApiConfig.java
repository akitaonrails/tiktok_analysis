package com.bytedance.helios.api.config;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

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

    public AllowNetworkApiConfig(Set<String> set, Set<String> set2, String str) {
        this.endWithDomains = set;
        this.startWithPaths = set2;
        this.invokeType = str;
    }

    public AllowNetworkApiConfig(Set set, Set set2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? C08CX.INSTANCE : set2, (i & 4) != 0 ? "around" : str);
    }
}
