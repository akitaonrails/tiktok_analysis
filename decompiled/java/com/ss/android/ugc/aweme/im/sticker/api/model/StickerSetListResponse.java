package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class StickerSetListResponse extends BaseResponse {

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("sticker_meta")
    public final List<IMStickerMeta> stickerMeta;

    @C09CT("sticker_sets")
    public final List<StickerSetInfo> stickerSetInfoList;

    public StickerSetListResponse() {
        this(null, null, null, null);
    }

    public final StickerSetListResponse copy(List<StickerSetInfo> list, Boolean bool, Long l, List<IMStickerMeta> list2) {
        return new StickerSetListResponse(list, bool, l, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerSetListResponse)) {
            return false;
        }
        StickerSetListResponse stickerSetListResponse = (StickerSetListResponse) obj;
        return Intrinsics.LJFF(this.stickerSetInfoList, stickerSetListResponse.stickerSetInfoList) && Intrinsics.LJFF(this.hasMore, stickerSetListResponse.hasMore) && Intrinsics.LJFF(this.cursor, stickerSetListResponse.cursor) && Intrinsics.LJFF(this.stickerMeta, stickerSetListResponse.stickerMeta);
    }

    public int hashCode() {
        List<StickerSetInfo> list = this.stickerSetInfoList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.cursor;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        List<IMStickerMeta> list2 = this.stickerMeta;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerSetListResponse(stickerSetInfoList=");
        sbLIZ.append(this.stickerSetInfoList);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", stickerMeta=");
        sbLIZ.append(this.stickerMeta);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Long getCursor() {
        return this.cursor;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final List<IMStickerMeta> getStickerMeta() {
        return this.stickerMeta;
    }

    public final List<StickerSetInfo> getStickerSetInfoList() {
        return this.stickerSetInfoList;
    }

    public StickerSetListResponse(List<StickerSetInfo> list, Boolean bool, Long l, List<IMStickerMeta> list2) {
        this.stickerSetInfoList = list;
        this.hasMore = bool;
        this.cursor = l;
        this.stickerMeta = list2;
    }
}
