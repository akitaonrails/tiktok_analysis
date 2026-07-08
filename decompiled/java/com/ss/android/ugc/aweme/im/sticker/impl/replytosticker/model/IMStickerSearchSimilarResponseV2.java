package com.ss.android.ugc.aweme.im.sticker.impl.replytosticker.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class IMStickerSearchSimilarResponseV2 extends BaseResponse {

    @C09CT("stickers")
    public final List<StickerItem> stickerList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IMStickerSearchSimilarResponseV2) && Intrinsics.LJFF(this.stickerList, ((IMStickerSearchSimilarResponseV2) obj).stickerList);
    }

    public final int hashCode() {
        List<StickerItem> list = this.stickerList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMStickerSearchSimilarResponseV2(stickerList=");
        sbLIZ.append(this.stickerList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMStickerSearchSimilarResponseV2(List<StickerItem> list) {
        this.stickerList = list;
    }
}
