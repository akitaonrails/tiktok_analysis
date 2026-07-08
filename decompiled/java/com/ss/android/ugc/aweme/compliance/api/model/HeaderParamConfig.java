package com.ss.android.ugc.aweme.compliance.api.model;

import X.C08CX;
import X.C09CT;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class HeaderParamConfig {

    @C09CT("allowApis")
    public final List<AllowApiConfig> allowApis;

    @C09CT("denyKeys")
    public final Set<String> denyKeys;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("regions")
    public final Set<String> regions;

    @C09CT("scope")
    public final Integer scope;

    public HeaderParamConfig() {
        this(null, null, null, null, null, 31, null);
    }

    public HeaderParamConfig(Boolean bool, Integer num, Set<String> set, Set<String> set2, List<AllowApiConfig> list) {
        this.enable = bool;
        this.scope = num;
        this.regions = set;
        this.denyKeys = set2;
        this.allowApis = list;
    }

    public HeaderParamConfig(Boolean bool, Integer num, Set set, Set set2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? C08CX.INSTANCE : set, (i & 8) != 0 ? C08CX.INSTANCE : set2, (i & 16) == 0 ? list : null);
    }
}
