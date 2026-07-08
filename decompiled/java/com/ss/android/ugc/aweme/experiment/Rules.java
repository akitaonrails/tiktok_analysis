package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class Rules {

    @C09CT("duration")
    public final List<Integer> duration;

    @C09CT("stage")
    public final List<Integer> stage;

    public Rules() {
        this(null, null, 3, null);
    }

    public Rules(List<Integer> list, List<Integer> list2) {
        this.stage = list;
        this.duration = list2;
    }

    public Rules(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
