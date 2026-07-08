package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AllFavoriteContentResponse extends BaseResponse {

    @C09CT("has_more")
    public final Integer hasMore;

    @C09CT("aweme_list")
    public final List<Aweme> items;

    @C09CT("cursor")
    public final Long maxCursor;

    public AllFavoriteContentResponse() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllFavoriteContentResponse)) {
            return false;
        }
        AllFavoriteContentResponse allFavoriteContentResponse = (AllFavoriteContentResponse) obj;
        return Intrinsics.LJFF(this.items, allFavoriteContentResponse.items) && Intrinsics.LJFF(this.maxCursor, allFavoriteContentResponse.maxCursor) && Intrinsics.LJFF(this.hasMore, allFavoriteContentResponse.hasMore);
    }

    public final int hashCode() {
        List<Aweme> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.maxCursor;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.hasMore;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AllFavoriteContentResponse(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", maxCursor=");
        sbLIZ.append(this.maxCursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AllFavoriteContentResponse(List<? extends Aweme> list, Long l, Integer num) {
        this.items = list;
        this.maxCursor = l;
        this.hasMore = num;
    }
}
