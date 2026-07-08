package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Video2StickerPostedVideoResponse extends BaseResponse {

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("max_create_time")
    public final Long maxCreateTime;

    public Video2StickerPostedVideoResponse() {
        this(null, null, null);
    }

    public final Video2StickerPostedVideoResponse copy(List<? extends Aweme> list, Boolean bool, Long l) {
        return new Video2StickerPostedVideoResponse(list, bool, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video2StickerPostedVideoResponse)) {
            return false;
        }
        Video2StickerPostedVideoResponse video2StickerPostedVideoResponse = (Video2StickerPostedVideoResponse) obj;
        return Intrinsics.LJFF(this.awemeList, video2StickerPostedVideoResponse.awemeList) && Intrinsics.LJFF(this.hasMore, video2StickerPostedVideoResponse.hasMore) && Intrinsics.LJFF(this.maxCreateTime, video2StickerPostedVideoResponse.maxCreateTime);
    }

    public int hashCode() {
        List<Aweme> list = this.awemeList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.maxCreateTime;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Video2StickerPostedVideoResponse(awemeList=");
        sbLIZ.append(this.awemeList);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", maxCreateTime=");
        sbLIZ.append(this.maxCreateTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final Long getMaxCreateTime() {
        return this.maxCreateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Video2StickerPostedVideoResponse(List<? extends Aweme> list, Boolean bool, Long l) {
        this.awemeList = list;
        this.hasMore = bool;
        this.maxCreateTime = l;
    }
}
