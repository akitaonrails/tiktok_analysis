package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Video2StickerSceneResponse extends BaseResponse {

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("video_stickers")
    public final List<VideoSticker> stickerList;

    public Video2StickerSceneResponse() {
        this(null, null, null);
    }

    public final Video2StickerSceneResponse copy(List<VideoSticker> list, Long l, Boolean bool) {
        return new Video2StickerSceneResponse(list, l, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video2StickerSceneResponse)) {
            return false;
        }
        Video2StickerSceneResponse video2StickerSceneResponse = (Video2StickerSceneResponse) obj;
        return Intrinsics.LJFF(this.stickerList, video2StickerSceneResponse.stickerList) && Intrinsics.LJFF(this.cursor, video2StickerSceneResponse.cursor) && Intrinsics.LJFF(this.hasMore, video2StickerSceneResponse.hasMore);
    }

    public int hashCode() {
        List<VideoSticker> list = this.stickerList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.cursor;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.hasMore;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Video2StickerSceneResponse(stickerList=");
        sbLIZ.append(this.stickerList);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Long getCursor() {
        return this.cursor;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final List<VideoSticker> getStickerList() {
        return this.stickerList;
    }

    public Video2StickerSceneResponse(List<VideoSticker> list, Long l, Boolean bool) {
        this.stickerList = list;
        this.cursor = l;
        this.hasMore = bool;
    }
}
