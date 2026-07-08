package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Video2StickerFavoriteVideoResponse extends BaseResponse {

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    public Video2StickerFavoriteVideoResponse() {
        this(null, null, null);
    }

    public final Video2StickerFavoriteVideoResponse copy(List<? extends Aweme> list, Boolean bool, Long l) {
        return new Video2StickerFavoriteVideoResponse(list, bool, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video2StickerFavoriteVideoResponse)) {
            return false;
        }
        Video2StickerFavoriteVideoResponse video2StickerFavoriteVideoResponse = (Video2StickerFavoriteVideoResponse) obj;
        return Intrinsics.LJFF(this.awemeList, video2StickerFavoriteVideoResponse.awemeList) && Intrinsics.LJFF(this.hasMore, video2StickerFavoriteVideoResponse.hasMore) && Intrinsics.LJFF(this.cursor, video2StickerFavoriteVideoResponse.cursor);
    }

    public int hashCode() {
        List<Aweme> list = this.awemeList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.cursor;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Video2StickerFavoriteVideoResponse(awemeList=");
        sbLIZ.append(this.awemeList);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final Long getCursor() {
        return this.cursor;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Video2StickerFavoriteVideoResponse(List<? extends Aweme> list, Boolean bool, Long l) {
        this.awemeList = list;
        this.hasMore = bool;
        this.cursor = l;
    }
}
