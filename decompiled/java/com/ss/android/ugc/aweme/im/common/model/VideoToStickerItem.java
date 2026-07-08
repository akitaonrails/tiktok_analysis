package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class VideoToStickerItem implements Serializable {

    @C09CT("original_video_id")
    public final Long originalVideoId;

    @C09CT("original_video_creator_uid")
    public final Long userId;

    public VideoToStickerItem() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoToStickerItem)) {
            return false;
        }
        VideoToStickerItem videoToStickerItem = (VideoToStickerItem) obj;
        return Intrinsics.LJFF(this.userId, videoToStickerItem.userId) && Intrinsics.LJFF(this.originalVideoId, videoToStickerItem.originalVideoId);
    }

    public int hashCode() {
        Long l = this.userId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.originalVideoId;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoToStickerItem(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", originalVideoId=");
        sbLIZ.append(this.originalVideoId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoToStickerItem(Long l, Long l2) {
        this.userId = l;
        this.originalVideoId = l2;
    }
}
