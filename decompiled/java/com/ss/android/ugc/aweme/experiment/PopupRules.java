package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C1697810uHb;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class PopupRules {

    @C09CT("frequency")
    public final int freq;

    @C09CT("interval")
    public final int interval;

    @C09CT("rules")
    public final List<Rules> rules;

    public PopupRules() {
        this(null, 0, 0, 7, null);
    }

    public PopupRules(List<Rules> list, int i, int i2) {
        this.rules = list;
        this.interval = i;
        this.freq = i2;
    }

    public PopupRules(List list, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? C1697810uHb.LJIIJJI(new Rules(Collections.singletonList(2), Collections.singletonList(0)), new Rules(C1697810uHb.LJIIJJI(3, 2), C1697810uHb.LJIIJJI(3, 0)), new Rules(C1697810uHb.LJIIJJI(3, 2), C1697810uHb.LJIIJJI(4, 0))) : list, (i3 & 2) != 0 ? 7 : i, (i3 & 4) != 0 ? 3 : i2);
    }
}
