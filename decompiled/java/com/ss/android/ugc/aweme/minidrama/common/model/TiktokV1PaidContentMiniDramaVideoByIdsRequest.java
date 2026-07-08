package com.ss.android.ugc.aweme.minidrama.common.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TiktokV1PaidContentMiniDramaVideoByIdsRequest {

    @C09CT("video_ids")
    public final List<Long> videoIds;

    public TiktokV1PaidContentMiniDramaVideoByIdsRequest() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TiktokV1PaidContentMiniDramaVideoByIdsRequest) && Intrinsics.LJFF(this.videoIds, ((TiktokV1PaidContentMiniDramaVideoByIdsRequest) obj).videoIds);
    }

    public final int hashCode() {
        List<Long> list = this.videoIds;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokV1PaidContentMiniDramaVideoByIdsRequest(videoIds=");
        sbLIZ.append(this.videoIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TiktokV1PaidContentMiniDramaVideoByIdsRequest(List<Long> list) {
        this.videoIds = list;
    }
}
