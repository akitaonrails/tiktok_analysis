package com.ss.android.ugc.aweme.feed.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class StrategyGroup {

    @C09CT("card_types")
    public final List<String> cardTypes;

    @C09CT("group_name")
    public final String name;

    @C09CT("strategies")
    public final List<StrategyInfo> strategies;

    public StrategyGroup() {
        this(null, null, null, 7, null);
    }

    public StrategyGroup(String str, List<String> list, List<StrategyInfo> list2) {
        this.name = str;
        this.cardTypes = list;
        this.strategies = list2;
    }

    public StrategyGroup(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "unknown" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
