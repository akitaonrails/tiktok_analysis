package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class PhotoCommentStickerItem implements Serializable {

    @C09CT("comment_id")
    public final Long commentId;

    @C09CT("like_count")
    public final Long likeCount;

    @C09CT("update_time")
    public final Long updateTime;

    @C09CT("video_id")
    public final Long videoId;

    public PhotoCommentStickerItem() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoCommentStickerItem)) {
            return false;
        }
        PhotoCommentStickerItem photoCommentStickerItem = (PhotoCommentStickerItem) obj;
        return Intrinsics.LJFF(this.commentId, photoCommentStickerItem.commentId) && Intrinsics.LJFF(this.videoId, photoCommentStickerItem.videoId) && Intrinsics.LJFF(this.likeCount, photoCommentStickerItem.likeCount) && Intrinsics.LJFF(this.updateTime, photoCommentStickerItem.updateTime);
    }

    public int hashCode() {
        Long l = this.commentId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.videoId;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.likeCount;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.updateTime;
        return iHashCode3 + (l4 != null ? l4.hashCode() : 0);
    }

    public PhotoCommentStickerItem(Long l, Long l2, Long l3, Long l4) {
        this.commentId = l;
        this.videoId = l2;
        this.likeCount = l3;
        this.updateTime = l4;
    }
}
