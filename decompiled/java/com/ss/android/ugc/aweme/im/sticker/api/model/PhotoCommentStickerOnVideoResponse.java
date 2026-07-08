package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PhotoCommentStickerOnVideoResponse extends BaseResponse {

    @C09CT("stickers")
    public final List<StickerItem> stickers;

    public PhotoCommentStickerOnVideoResponse() {
        this(null);
    }

    public final PhotoCommentStickerOnVideoResponse copy(List<StickerItem> list) {
        return new PhotoCommentStickerOnVideoResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhotoCommentStickerOnVideoResponse) && Intrinsics.LJFF(this.stickers, ((PhotoCommentStickerOnVideoResponse) obj).stickers);
    }

    public int hashCode() {
        List<StickerItem> list = this.stickers;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoCommentStickerOnVideoResponse(stickers=");
        sbLIZ.append(this.stickers);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<StickerItem> getStickers() {
        return this.stickers;
    }

    public PhotoCommentStickerOnVideoResponse(List<StickerItem> list) {
        this.stickers = list;
    }
}
