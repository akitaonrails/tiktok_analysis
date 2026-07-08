package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PhotoCommentStickerContent extends BaseContent {

    @C09CT("photo_comment_sticker_aweme_id")
    public final String awemeId;

    @C09CT("photo_comment_stickers")
    public final List<StickerItem> stickers;

    public PhotoCommentStickerContent() {
        this(null, null);
    }

    public final PhotoCommentStickerContent copy(String str, List<StickerItem> list) {
        return new PhotoCommentStickerContent(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoCommentStickerContent)) {
            return false;
        }
        PhotoCommentStickerContent photoCommentStickerContent = (PhotoCommentStickerContent) obj;
        return Intrinsics.LJFF(this.awemeId, photoCommentStickerContent.awemeId) && Intrinsics.LJFF(this.stickers, photoCommentStickerContent.stickers);
    }

    public int hashCode() {
        String str = this.awemeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<StickerItem> list = this.stickers;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoCommentStickerContent(awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", stickers=");
        sbLIZ.append(this.stickers);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final List<StickerItem> getStickers() {
        return this.stickers;
    }

    public PhotoCommentStickerContent(String str, List<StickerItem> list) {
        this.awemeId = str;
        this.stickers = list;
    }
}
