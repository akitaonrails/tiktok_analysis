package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class Strategy implements Serializable {
    public static final int $stable = 8;

    @C09CT("action")
    public final Integer action;

    @C09CT("conditions")
    public final List<Condition> conditions;

    @C09CT("domains")
    public final List<String> domains;

    public Strategy() {
        this(null, null, null, 7, null);
    }

    public Strategy(Integer num, List<Condition> list, List<String> list2) {
        this.action = num;
        this.conditions = list;
        this.domains = list2;
    }

    public Strategy(Integer num, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 2 : num, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
