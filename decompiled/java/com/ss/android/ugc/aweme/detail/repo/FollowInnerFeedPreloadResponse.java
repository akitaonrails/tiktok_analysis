package com.ss.android.ugc.aweme.detail.repo;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FollowInnerFeedPreloadResponse extends BaseResponse {

    @C09CT("entries")
    public final Map<String, BatchEntry> entries;

    public FollowInnerFeedPreloadResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FollowInnerFeedPreloadResponse) && Intrinsics.LJFF(this.entries, ((FollowInnerFeedPreloadResponse) obj).entries);
    }

    public final int hashCode() {
        Map<String, BatchEntry> map = this.entries;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowInnerFeedPreloadResponse(entries=");
        sbLIZ.append(this.entries);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FollowInnerFeedPreloadResponse(Map<String, BatchEntry> map) {
        this.entries = map;
    }
}
