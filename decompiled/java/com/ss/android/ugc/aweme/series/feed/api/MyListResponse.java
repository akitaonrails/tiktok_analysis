package com.ss.android.ugc.aweme.series.feed.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.minidrama.common.component.model.MyListBanner;
import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MyListResponse extends BaseResponse {

    @C09CT("banner")
    public final MyListBanner banner;

    @C09CT("collections")
    public final List<ShortDramaOverview> collections;

    @C09CT("cursor")
    public final String cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    public MyListResponse() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyListResponse)) {
            return false;
        }
        MyListResponse myListResponse = (MyListResponse) obj;
        return Intrinsics.LJFF(this.cursor, myListResponse.cursor) && Intrinsics.LJFF(this.hasMore, myListResponse.hasMore) && Intrinsics.LJFF(this.collections, myListResponse.collections) && Intrinsics.LJFF(this.banner, myListResponse.banner);
    }

    public final int hashCode() {
        String str = this.cursor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<ShortDramaOverview> list = this.collections;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        MyListBanner myListBanner = this.banner;
        return iHashCode3 + (myListBanner != null ? myListBanner.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MyListResponse(cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", collections=");
        sbLIZ.append(this.collections);
        sbLIZ.append(", banner=");
        sbLIZ.append(this.banner);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MyListResponse(String str, Boolean bool, List<ShortDramaOverview> list, MyListBanner myListBanner) {
        this.cursor = str;
        this.hasMore = bool;
        this.collections = list;
        this.banner = myListBanner;
    }

    public MyListResponse(String str, Boolean bool, List list, MyListBanner myListBanner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? null : myListBanner);
    }
}
