package com.ss.android.ugc.aweme.minidrama.common.preload;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TiktokV1PaidContentMiniDramaVideoResponse extends BaseResponse {

    @C09CT("video_list")
    public final List<CollectionVideo> videoList;

    public TiktokV1PaidContentMiniDramaVideoResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TiktokV1PaidContentMiniDramaVideoResponse) && Intrinsics.LJFF(this.videoList, ((TiktokV1PaidContentMiniDramaVideoResponse) obj).videoList);
    }

    public final int hashCode() {
        List<CollectionVideo> list = this.videoList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokV1PaidContentMiniDramaVideoResponse(videoList=");
        sbLIZ.append(this.videoList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TiktokV1PaidContentMiniDramaVideoResponse(List<CollectionVideo> list) {
        this.videoList = list;
    }
}
