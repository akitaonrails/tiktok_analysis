package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C1697810uHb;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class NewPopupRules {

    @C09CT("frequency")
    public final int frequency;

    @C09CT("group")
    public final int group;

    @C09CT("interval")
    public final List<Integer> interval;

    @C09CT("rules")
    public final List<List<Integer>> rules;

    public NewPopupRules() {
        this(0, 0, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewPopupRules(int i, int i2, List<Integer> list, List<? extends List<Integer>> list2) {
        this.group = i;
        this.frequency = i2;
        this.interval = list;
        this.rules = list2;
    }

    public NewPopupRules(int i, int i2, List list, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 2 : i, (i3 & 2) != 0 ? 8 : i2, (i3 & 4) != 0 ? C1697810uHb.LJIIJJI(15, 8, 3) : list, (i3 & 8) != 0 ? C1697810uHb.LJIIJJI(Collections.singletonList(3), C1697810uHb.LJIIJJI(2, 3), C1697810uHb.LJIIJJI(1, 2, 3)) : list2);
    }
}
