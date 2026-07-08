package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionContentResponse extends BaseResponse {

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("items")
    public final List<Aweme> items;

    @C09CT("max_cursor")
    public final Long maxCursor;

    public CollectionContentResponse() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionContentResponse)) {
            return false;
        }
        CollectionContentResponse collectionContentResponse = (CollectionContentResponse) obj;
        return Intrinsics.LJFF(this.items, collectionContentResponse.items) && Intrinsics.LJFF(this.maxCursor, collectionContentResponse.maxCursor) && Intrinsics.LJFF(this.hasMore, collectionContentResponse.hasMore);
    }

    public final int hashCode() {
        List<Aweme> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.maxCursor;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.hasMore;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectionContentResponse(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", maxCursor=");
        sbLIZ.append(this.maxCursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionContentResponse(List<? extends Aweme> list, Long l, Boolean bool) {
        this.items = list;
        this.maxCursor = l;
        this.hasMore = bool;
    }
}
