package com.ss.android.ugc.aweme.music.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicDetailStoryEntranceResponse extends BaseResponse {

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT("has_more")
    public final Integer hasMore;

    @C09CT("page_token")
    public final String pageToken;

    @C09CT("total_count")
    public final Integer totalCount;

    @C09CT("unread_story_ids")
    public final List<String> unreadStoryIds;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicDetailStoryEntranceResponse)) {
            return false;
        }
        MusicDetailStoryEntranceResponse musicDetailStoryEntranceResponse = (MusicDetailStoryEntranceResponse) obj;
        return Intrinsics.LJFF(this.awemeList, musicDetailStoryEntranceResponse.awemeList) && Intrinsics.LJFF(this.unreadStoryIds, musicDetailStoryEntranceResponse.unreadStoryIds) && Intrinsics.LJFF(this.pageToken, musicDetailStoryEntranceResponse.pageToken) && Intrinsics.LJFF(this.totalCount, musicDetailStoryEntranceResponse.totalCount) && Intrinsics.LJFF(this.hasMore, musicDetailStoryEntranceResponse.hasMore);
    }

    public final int hashCode() {
        List<Aweme> list = this.awemeList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.unreadStoryIds;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.pageToken;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.totalCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.hasMore;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicDetailStoryEntranceResponse(awemeList=");
        sbLIZ.append(this.awemeList);
        sbLIZ.append(", unreadStoryIds=");
        sbLIZ.append(this.unreadStoryIds);
        sbLIZ.append(", pageToken=");
        sbLIZ.append(this.pageToken);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.totalCount);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MusicDetailStoryEntranceResponse(List<Aweme> list, List<String> list2, String str, Integer num, Integer num2) {
        this.awemeList = list;
        this.unreadStoryIds = list2;
        this.pageToken = str;
        this.totalCount = num;
        this.hasMore = num2;
    }
}
