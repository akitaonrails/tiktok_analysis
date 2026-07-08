package com.ss.android.ugc.aweme.topic.movie.favorite.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MovieCollectionListResponse extends BaseResponse {

    @C09CT("cursor")
    public final long cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("movie_list")
    public final List<TopicRawInfo> movieList;

    public MovieCollectionListResponse() {
        this(null, 0L, false, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieCollectionListResponse)) {
            return false;
        }
        MovieCollectionListResponse movieCollectionListResponse = (MovieCollectionListResponse) obj;
        return Intrinsics.LJFF(this.movieList, movieCollectionListResponse.movieList) && this.cursor == movieCollectionListResponse.cursor && this.hasMore == movieCollectionListResponse.hasMore;
    }

    public final int hashCode() {
        return (((this.movieList.hashCode() * 31) + C786410Ut5.Y2(this.cursor)) * 31) + C786410Ut5.Z2(this.hasMore);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MovieCollectionListResponse(movieList=");
        sbLIZ.append(this.movieList);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MovieCollectionListResponse(List<TopicRawInfo> list, long j, boolean z) {
        this.movieList = list;
        this.cursor = j;
        this.hasMore = z;
    }

    public MovieCollectionListResponse(List list, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z);
    }
}
