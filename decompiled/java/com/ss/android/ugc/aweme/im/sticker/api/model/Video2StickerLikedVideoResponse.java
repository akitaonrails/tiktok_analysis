package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Video2StickerLikedVideoResponse extends BaseResponse {

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("max_cursor")
    public final Long maxCursor;

    @C09CT("min_cursor")
    public final Long minCursor;

    public Video2StickerLikedVideoResponse() {
        this(null, null, null, null);
    }

    public final Video2StickerLikedVideoResponse copy(List<? extends Aweme> list, Boolean bool, Long l, Long l2) {
        return new Video2StickerLikedVideoResponse(list, bool, l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video2StickerLikedVideoResponse)) {
            return false;
        }
        Video2StickerLikedVideoResponse video2StickerLikedVideoResponse = (Video2StickerLikedVideoResponse) obj;
        return Intrinsics.LJFF(this.awemeList, video2StickerLikedVideoResponse.awemeList) && Intrinsics.LJFF(this.hasMore, video2StickerLikedVideoResponse.hasMore) && Intrinsics.LJFF(this.maxCursor, video2StickerLikedVideoResponse.maxCursor) && Intrinsics.LJFF(this.minCursor, video2StickerLikedVideoResponse.minCursor);
    }

    public int hashCode() {
        List<Aweme> list = this.awemeList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.maxCursor;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.minCursor;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Video2StickerLikedVideoResponse(awemeList=");
        sbLIZ.append(this.awemeList);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", maxCursor=");
        sbLIZ.append(this.maxCursor);
        sbLIZ.append(", minCursor=");
        sbLIZ.append(this.minCursor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final Long getMaxCursor() {
        return this.maxCursor;
    }

    public final Long getMinCursor() {
        return this.minCursor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Video2StickerLikedVideoResponse(List<? extends Aweme> list, Boolean bool, Long l, Long l2) {
        this.awemeList = list;
        this.hasMore = bool;
        this.maxCursor = l;
        this.minCursor = l2;
    }
}
