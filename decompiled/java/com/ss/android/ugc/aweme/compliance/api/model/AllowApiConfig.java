package com.ss.android.ugc.aweme.compliance.api.model;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class AllowApiConfig {

    @C09CT("domains")
    public final Set<String> domains;

    @C09CT("paths")
    public final Set<String> paths;

    public AllowApiConfig() {
        this(null, null, 3, null);
    }

    public AllowApiConfig(Set<String> set, Set<String> set2) {
        this.domains = set;
        this.paths = set2;
    }

    public AllowApiConfig(Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? C08CX.INSTANCE : set2);
    }
}
