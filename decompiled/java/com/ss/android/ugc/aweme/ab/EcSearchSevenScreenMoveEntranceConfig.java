package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes35.dex */
public final class EcSearchSevenScreenMoveEntranceConfig {

    @C09CT("disable_list")
    public final List<Integer> disableEntranceList;

    @C09CT("enable_list")
    public final List<Integer> enableEntranceList;

    @C09CT("strategy")
    public final int strategy;

    public EcSearchSevenScreenMoveEntranceConfig() {
        this(0, null, null, 7, null);
    }

    public EcSearchSevenScreenMoveEntranceConfig(int i, List<Integer> list, List<Integer> list2) {
        this.strategy = i;
        this.disableEntranceList = list;
        this.enableEntranceList = list2;
    }

    public EcSearchSevenScreenMoveEntranceConfig(int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
