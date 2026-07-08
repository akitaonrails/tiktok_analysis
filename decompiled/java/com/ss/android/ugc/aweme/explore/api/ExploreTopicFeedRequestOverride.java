package com.ss.android.ugc.aweme.explore.api;

import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ExploreTopicFeedRequestOverride {
    public final List<String> awemeIds;

    public ExploreTopicFeedRequestOverride() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExploreTopicFeedRequestOverride) && Intrinsics.LJFF(this.awemeIds, ((ExploreTopicFeedRequestOverride) obj).awemeIds);
    }

    public int hashCode() {
        List<String> list = this.awemeIds;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreTopicFeedRequestOverride(awemeIds=");
        sbLIZ.append(this.awemeIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreTopicFeedRequestOverride(List<String> list) {
        this.awemeIds = list;
    }
}
