package com.ss.android.ugc.aweme.search.df.api.cointask.refactor.repo;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ExtraInfo implements Serializable {

    @C09CT("type_in_search_count")
    public final Integer searchCount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExtraInfo) && Intrinsics.LJFF(this.searchCount, ((ExtraInfo) obj).searchCount);
    }

    public int hashCode() {
        Integer num = this.searchCount;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraInfo(searchCount=");
        sbLIZ.append(this.searchCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExtraInfo(Integer num) {
        this.searchCount = num;
    }
}
