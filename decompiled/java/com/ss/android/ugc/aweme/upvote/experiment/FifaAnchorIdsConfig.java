package com.ss.android.ugc.aweme.upvote.experiment;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FifaAnchorIdsConfig {

    @C09CT("ids")
    public final List<String> ids;

    public FifaAnchorIdsConfig() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FifaAnchorIdsConfig) && Intrinsics.LJFF(this.ids, ((FifaAnchorIdsConfig) obj).ids);
    }

    public final int hashCode() {
        List<String> list = this.ids;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FifaAnchorIdsConfig(ids=");
        sbLIZ.append(this.ids);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FifaAnchorIdsConfig(List<String> list) {
        this.ids = list;
    }
}
