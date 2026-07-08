package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SaveStickerResp extends BaseResponse {

    @C09CT("is_creator_banned")
    public final boolean isCreatorBanned;

    @C09CT("sticker")
    public final StickerItem sticker;

    public SaveStickerResp() {
        this(null, false);
    }

    public final SaveStickerResp copy(StickerItem stickerItem, boolean z) {
        return new SaveStickerResp(stickerItem, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveStickerResp)) {
            return false;
        }
        SaveStickerResp saveStickerResp = (SaveStickerResp) obj;
        return Intrinsics.LJFF(this.sticker, saveStickerResp.sticker) && this.isCreatorBanned == saveStickerResp.isCreatorBanned;
    }

    public int hashCode() {
        StickerItem stickerItem = this.sticker;
        return ((stickerItem == null ? 0 : stickerItem.hashCode()) * 31) + C786410Ut5.Z2(this.isCreatorBanned);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveStickerResp(sticker=");
        sbLIZ.append(this.sticker);
        sbLIZ.append(", isCreatorBanned=");
        sbLIZ.append(this.isCreatorBanned);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final StickerItem getSticker() {
        return this.sticker;
    }

    public final boolean isCreatorBanned() {
        return this.isCreatorBanned;
    }

    public SaveStickerResp(StickerItem stickerItem, boolean z) {
        this.sticker = stickerItem;
        this.isCreatorBanned = z;
    }
}
