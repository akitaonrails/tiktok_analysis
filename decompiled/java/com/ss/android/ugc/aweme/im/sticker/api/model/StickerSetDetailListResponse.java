package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class StickerSetDetailListResponse extends BaseResponse {

    @C09CT("sticker_sets")
    public final List<StickerSet> stickerSetList;

    public StickerSetDetailListResponse() {
        this(null);
    }

    public final StickerSetDetailListResponse copy(List<StickerSet> list) {
        return new StickerSetDetailListResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickerSetDetailListResponse) && Intrinsics.LJFF(this.stickerSetList, ((StickerSetDetailListResponse) obj).stickerSetList);
    }

    public int hashCode() {
        List<StickerSet> list = this.stickerSetList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerSetDetailListResponse(stickerSetList=");
        sbLIZ.append(this.stickerSetList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<StickerSet> getStickerSetList() {
        return this.stickerSetList;
    }

    public StickerSetDetailListResponse(List<StickerSet> list) {
        this.stickerSetList = list;
    }
}
