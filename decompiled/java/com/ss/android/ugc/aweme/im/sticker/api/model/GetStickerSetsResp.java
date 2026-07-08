package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.common.model.IMStickerSetItem;
import com.ss.android.ugc.aweme.im.common.model.IMStickerTypeInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GetStickerSetsResp extends BaseResponse {

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("is_all_stickers")
    public final Boolean isAllStickers;

    @C09CT("sticker_sets")
    public final List<IMStickerSetItem> stickerSets;

    @C09CT("sticker_type_info")
    public final List<IMStickerTypeInfo> stickerTypeInfo;

    public GetStickerSetsResp() {
        this(null, null, null, null, null);
    }

    public final GetStickerSetsResp copy(List<IMStickerSetItem> list, Boolean bool, Boolean bool2, Long l, List<IMStickerTypeInfo> list2) {
        return new GetStickerSetsResp(list, bool, bool2, l, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetStickerSetsResp)) {
            return false;
        }
        GetStickerSetsResp getStickerSetsResp = (GetStickerSetsResp) obj;
        return Intrinsics.LJFF(this.stickerSets, getStickerSetsResp.stickerSets) && Intrinsics.LJFF(this.isAllStickers, getStickerSetsResp.isAllStickers) && Intrinsics.LJFF(this.hasMore, getStickerSetsResp.hasMore) && Intrinsics.LJFF(this.cursor, getStickerSetsResp.cursor) && Intrinsics.LJFF(this.stickerTypeInfo, getStickerSetsResp.stickerTypeInfo);
    }

    public int hashCode() {
        List<IMStickerSetItem> list = this.stickerSets;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.isAllStickers;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasMore;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.cursor;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        List<IMStickerTypeInfo> list2 = this.stickerTypeInfo;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetStickerSetsResp(stickerSets=");
        sbLIZ.append(this.stickerSets);
        sbLIZ.append(", isAllStickers=");
        sbLIZ.append(this.isAllStickers);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", stickerTypeInfo=");
        sbLIZ.append(this.stickerTypeInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Long getCursor() {
        return this.cursor;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final List<IMStickerSetItem> getStickerSets() {
        return this.stickerSets;
    }

    public final List<IMStickerTypeInfo> getStickerTypeInfo() {
        return this.stickerTypeInfo;
    }

    public final Boolean isAllStickers() {
        return this.isAllStickers;
    }

    public GetStickerSetsResp(List<IMStickerSetItem> list, Boolean bool, Boolean bool2, Long l, List<IMStickerTypeInfo> list2) {
        this.stickerSets = list;
        this.isAllStickers = bool;
        this.hasMore = bool2;
        this.cursor = l;
        this.stickerTypeInfo = list2;
    }
}
