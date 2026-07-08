package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class AbRollStruct implements Serializable {

    @C09CT("ab_roll_info_a")
    public final AbRollInfo abRollInfoA;

    @C09CT("ab_roll_info_b")
    public final AbRollInfo abRollInfoB;

    public AbRollStruct() {
        this(null, null);
    }

    public AbRollStruct(AbRollInfo abRollInfo, AbRollInfo abRollInfo2) {
        this.abRollInfoA = abRollInfo;
        this.abRollInfoB = abRollInfo2;
    }
}
