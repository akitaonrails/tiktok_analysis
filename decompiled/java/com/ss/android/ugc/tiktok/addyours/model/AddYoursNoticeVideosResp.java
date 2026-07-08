package com.ss.android.ugc.tiktok.addyours.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AddYoursNoticeVideosResp extends BaseResponse {

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("videos")
    public final List<Aweme> videos;

    public AddYoursNoticeVideosResp() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursNoticeVideosResp)) {
            return false;
        }
        AddYoursNoticeVideosResp addYoursNoticeVideosResp = (AddYoursNoticeVideosResp) obj;
        return Intrinsics.LJFF(this.videos, addYoursNoticeVideosResp.videos) && Intrinsics.LJFF(this.hasMore, addYoursNoticeVideosResp.hasMore) && Intrinsics.LJFF(this.cursor, addYoursNoticeVideosResp.cursor);
    }

    public final int hashCode() {
        List<Aweme> list = this.videos;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.cursor;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursNoticeVideosResp(videos=");
        sbLIZ.append(this.videos);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursNoticeVideosResp(List<? extends Aweme> list, Boolean bool, Integer num) {
        this.videos = list;
        this.hasMore = bool;
        this.cursor = num;
    }
}
