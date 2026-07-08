package com.ss.android.ugc.aweme.favorites.business.playlist.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GetPlaylistCollectionListResp extends BaseResponse {

    @C09CT("cursor")
    public final int cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("mix_info_list")
    public final List<MixInfo> mixInfoList;

    public GetPlaylistCollectionListResp() {
        this(null, 0, false, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPlaylistCollectionListResp)) {
            return false;
        }
        GetPlaylistCollectionListResp getPlaylistCollectionListResp = (GetPlaylistCollectionListResp) obj;
        return Intrinsics.LJFF(this.mixInfoList, getPlaylistCollectionListResp.mixInfoList) && this.cursor == getPlaylistCollectionListResp.cursor && this.hasMore == getPlaylistCollectionListResp.hasMore;
    }

    public final int hashCode() {
        return (((this.mixInfoList.hashCode() * 31) + this.cursor) * 31) + C786410Ut5.Z2(this.hasMore);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetPlaylistCollectionListResp(mixInfoList=");
        sbLIZ.append(this.mixInfoList);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetPlaylistCollectionListResp(List<MixInfo> list, int i, boolean z) {
        this.mixInfoList = list;
        this.cursor = i;
        this.hasMore = z;
    }

    public GetPlaylistCollectionListResp(List list, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z);
    }
}
