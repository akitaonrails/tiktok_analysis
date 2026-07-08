package com.bytedance.android.livesdk.condition;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class ConditionData {

    @C09CT("conditions")
    public final List<Condition> conditions;

    @C09CT("logical_operator")
    public final String logicalOperator;

    public ConditionData(List<Condition> list, String str) {
        this.conditions = list;
        this.logicalOperator = str;
    }
}
