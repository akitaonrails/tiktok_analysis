package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class EcSearchEntranceDataConfigModel {

    @C09CT("enable_new_entrance_rule")
    public final int enableNewEntranceRule;

    @C09CT("enable_new_priority_rule")
    public final int enableNewPriorityRule;

    @C09CT("new_entrance_rule_block_list")
    public final List<Integer> newEntranceRuleBlockList;

    @C09CT("new_priority_rule_block_list")
    public final List<Integer> newPriorityRuleBlockList;

    public EcSearchEntranceDataConfigModel() {
        this(0, 0, null, null, 15, null);
    }

    public EcSearchEntranceDataConfigModel(int i, int i2, List<Integer> list, List<Integer> list2) {
        this.enableNewEntranceRule = i;
        this.enableNewPriorityRule = i2;
        this.newEntranceRuleBlockList = list;
        this.newPriorityRuleBlockList = list2;
    }

    public EcSearchEntranceDataConfigModel(int i, int i2, List list, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? C13BV.INSTANCE : list, (i3 & 8) != 0 ? C13BV.INSTANCE : list2);
    }
}
