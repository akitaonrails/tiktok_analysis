package com.bytedance.helios.api.config;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class RangeConf {

    @C09CT("domains")
    public final DomainRange domains;

    @C09CT("paths")
    public final PathRange paths;

    @C09CT("schemes")
    public final Set<String> schemes;

    @C09CT("targets")
    public final Set<Integer> targets;

    public RangeConf() {
        this(null, null, null, null, 15, null);
    }

    public RangeConf(Set<Integer> set, Set<String> set2, DomainRange domainRange, PathRange pathRange) {
        this.targets = set;
        this.schemes = set2;
        this.domains = domainRange;
        this.paths = pathRange;
    }

    public RangeConf(Set set, Set set2, DomainRange domainRange, PathRange pathRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? C08CX.INSTANCE : set2, (i & 4) != 0 ? new DomainRange(null, null, null, null, null, 31, null) : domainRange, (i & 8) != 0 ? new PathRange(null, null, null, null, 15, null) : pathRange);
    }
}
