package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PopularStickerListResponseV2 extends BaseResponse {

    @C09CT("next_cursor")
    public final int cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("stickers")
    public final List<StickerItem> stickerList;

    public PopularStickerListResponseV2() {
        this(null, 0, false);
    }

    public final PopularStickerListResponseV2 copy(List<StickerItem> list, int i, boolean z) {
        return new PopularStickerListResponseV2(list, i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopularStickerListResponseV2)) {
            return false;
        }
        PopularStickerListResponseV2 popularStickerListResponseV2 = (PopularStickerListResponseV2) obj;
        return Intrinsics.LJFF(this.stickerList, popularStickerListResponseV2.stickerList) && this.cursor == popularStickerListResponseV2.cursor && this.hasMore == popularStickerListResponseV2.hasMore;
    }

    public int hashCode() {
        List<StickerItem> list = this.stickerList;
        return ((((list == null ? 0 : list.hashCode()) * 31) + this.cursor) * 31) + C786410Ut5.Z2(this.hasMore);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopularStickerListResponseV2(stickerList=");
        sbLIZ.append(this.stickerList);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<StickerItem> getStickerList() {
        return this.stickerList;
    }

    public PopularStickerListResponseV2(List<StickerItem> list, int i, boolean z) {
        this.stickerList = list;
        this.cursor = i;
        this.hasMore = z;
    }
}
