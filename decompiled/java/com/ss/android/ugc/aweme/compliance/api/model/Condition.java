package com.ss.android.ugc.aweme.compliance.api.model;

import X.C08CX;
import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class Condition implements Serializable {
    public static final int $stable = 8;

    @C09CT("action")
    public final Integer action;

    @C09CT("paths")
    public final Set<String> paths;

    @C09CT("subdomains")
    public final List<String> subdomains;

    public Condition() {
        this(null, null, null, 7, null);
    }

    public Condition(Integer num, Set<String> set, List<String> list) {
        this.action = num;
        this.paths = set;
        this.subdomains = list;
    }

    public Condition(Integer num, Set set, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 2 : num, (i & 2) != 0 ? C08CX.INSTANCE : set, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
