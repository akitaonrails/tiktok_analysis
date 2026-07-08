package com.ss.android.ugc.aweme.comment.easteregg.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PhotoToStickerResponse extends BaseResponse {

    @C09CT("result")
    public final Integer result;

    @C09CT("sticker")
    public final StickerItem stickerItem;

    public PhotoToStickerResponse() {
        this(null, -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoToStickerResponse)) {
            return false;
        }
        PhotoToStickerResponse photoToStickerResponse = (PhotoToStickerResponse) obj;
        return Intrinsics.LJFF(this.stickerItem, photoToStickerResponse.stickerItem) && Intrinsics.LJFF(this.result, photoToStickerResponse.result);
    }

    public final int hashCode() {
        StickerItem stickerItem = this.stickerItem;
        int iHashCode = (stickerItem == null ? 0 : stickerItem.hashCode()) * 31;
        Integer num = this.result;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoToStickerResponse(stickerItem=");
        sbLIZ.append(this.stickerItem);
        sbLIZ.append(", result=");
        sbLIZ.append(this.result);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PhotoToStickerResponse(StickerItem stickerItem, Integer num) {
        this.stickerItem = stickerItem;
        this.result = num;
    }
}
