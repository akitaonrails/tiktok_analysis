package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class Entrance {

    @C09CT("candidates")
    public final List<Candidate> candidates;

    @C09CT("show_limit")
    public final int showLimit;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Entrance)) {
            return false;
        }
        Entrance entrance = (Entrance) obj;
        return this.showLimit == entrance.showLimit && Intrinsics.LJFF(this.candidates, entrance.candidates);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Entrance(showLimit=");
        sbLIZ.append(this.showLimit);
        sbLIZ.append(", candidates=");
        sbLIZ.append(this.candidates);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Entrance(int i, List<Candidate> list) {
        this.showLimit = i;
        this.candidates = list;
    }
}
