package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GetStickerFavoritesResp extends BaseResponse {

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("stickers")
    public final List<StickerItem> stickers;

    public GetStickerFavoritesResp() {
        this(null, null, null);
    }

    public final GetStickerFavoritesResp copy(List<StickerItem> list, Boolean bool, Long l) {
        return new GetStickerFavoritesResp(list, bool, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetStickerFavoritesResp)) {
            return false;
        }
        GetStickerFavoritesResp getStickerFavoritesResp = (GetStickerFavoritesResp) obj;
        return Intrinsics.LJFF(this.stickers, getStickerFavoritesResp.stickers) && Intrinsics.LJFF(this.hasMore, getStickerFavoritesResp.hasMore) && Intrinsics.LJFF(this.cursor, getStickerFavoritesResp.cursor);
    }

    public int hashCode() {
        List<StickerItem> list = this.stickers;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.cursor;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetStickerFavoritesResp(stickers=");
        sbLIZ.append(this.stickers);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Long getCursor() {
        return this.cursor;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final List<StickerItem> getStickers() {
        return this.stickers;
    }

    public GetStickerFavoritesResp(List<StickerItem> list, Boolean bool, Long l) {
        this.stickers = list;
        this.hasMore = bool;
        this.cursor = l;
    }
}
