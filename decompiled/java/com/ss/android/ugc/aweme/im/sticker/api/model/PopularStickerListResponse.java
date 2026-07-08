package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PopularStickerListResponse extends BaseResponse {

    @C09CT("stickers")
    public final List<PopularStickerStruct> popularStickers;

    public PopularStickerListResponse() {
        this(null);
    }

    public final PopularStickerListResponse copy(List<PopularStickerStruct> list) {
        return new PopularStickerListResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PopularStickerListResponse) && Intrinsics.LJFF(this.popularStickers, ((PopularStickerListResponse) obj).popularStickers);
    }

    public int hashCode() {
        List<PopularStickerStruct> list = this.popularStickers;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopularStickerListResponse(popularStickers=");
        sbLIZ.append(this.popularStickers);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<PopularStickerStruct> getPopularStickers() {
        return this.popularStickers;
    }

    public PopularStickerListResponse(List<PopularStickerStruct> list) {
        this.popularStickers = list;
    }
}
