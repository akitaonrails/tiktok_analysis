package com.ss.android.ugc.aweme.story.archive2.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GetArchivedStoryIDsResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("awemes")
    public final List<Aweme> awemes;

    @C09CT("date_to_story_ids")
    public final Map<String, ArchivedStoryIdList> dateToStoryIds;

    @C09CT("has_more")
    public final Boolean hasMore;

    public final GetArchivedStoryIDsResponse copy(List<Aweme> list, Boolean bool, Map<String, ArchivedStoryIdList> map) {
        return new GetArchivedStoryIDsResponse(list, bool, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetArchivedStoryIDsResponse)) {
            return false;
        }
        GetArchivedStoryIDsResponse getArchivedStoryIDsResponse = (GetArchivedStoryIDsResponse) obj;
        return Intrinsics.LJFF(this.awemes, getArchivedStoryIDsResponse.awemes) && Intrinsics.LJFF(this.hasMore, getArchivedStoryIDsResponse.hasMore) && Intrinsics.LJFF(this.dateToStoryIds, getArchivedStoryIDsResponse.dateToStoryIds);
    }

    public int hashCode() {
        List<Aweme> list = this.awemes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, ArchivedStoryIdList> map = this.dateToStoryIds;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetArchivedStoryIDsResponse(awemes=");
        sbLIZ.append(this.awemes);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", dateToStoryIds=");
        sbLIZ.append(this.dateToStoryIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Aweme> getAwemes() {
        return this.awemes;
    }

    public final Map<String, ArchivedStoryIdList> getDateToStoryIds() {
        return this.dateToStoryIds;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public GetArchivedStoryIDsResponse(List<Aweme> list, Boolean bool, Map<String, ArchivedStoryIdList> map) {
        this.awemes = list;
        this.hasMore = bool;
        this.dateToStoryIds = map;
    }
}
