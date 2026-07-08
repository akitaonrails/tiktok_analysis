package com.ss.android.ugc.aweme.search.df.api.cointask.refactor.repo;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SearchROWCoinTaskDoneTMExtra implements Serializable {

    @C09CT("search_periodic_request")
    public final ExtraInfo extra;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchROWCoinTaskDoneTMExtra) && Intrinsics.LJFF(this.extra, ((SearchROWCoinTaskDoneTMExtra) obj).extra);
    }

    public int hashCode() {
        ExtraInfo extraInfo = this.extra;
        if (extraInfo == null) {
            return 0;
        }
        return extraInfo.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchROWCoinTaskDoneTMExtra(extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchROWCoinTaskDoneTMExtra(ExtraInfo extraInfo) {
        this.extra = extraInfo;
    }
}
