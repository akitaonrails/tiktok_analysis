package com.ss.android.ugc.aweme.account.login.config;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class RuleCondition {

    @C09CT("aid")
    public final List<String> aid;

    @C09CT("aid_not")
    public final List<String> aidNot;

    public RuleCondition() {
        this(null, null, 3, null);
    }

    public RuleCondition(List<String> list, List<String> list2) {
        this.aid = list;
        this.aidNot = list2;
    }

    public RuleCondition(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
