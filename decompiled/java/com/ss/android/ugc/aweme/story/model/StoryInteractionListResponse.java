package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class StoryInteractionListResponse extends BaseResponse {

    @C09CT("interaction_list")
    public final List<StoryInteractionListInfo> interactionUserList;

    @C09CT("story_analytics")
    public final StoryAnalytics storyAnalytics;

    @C09CT("total_views")
    public final long total;

    @C09CT("total_viewers")
    public final Long viewersCount;

    public StoryInteractionListResponse() {
        this(0L, null, null, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryInteractionListResponse)) {
            return false;
        }
        StoryInteractionListResponse storyInteractionListResponse = (StoryInteractionListResponse) obj;
        return this.total == storyInteractionListResponse.total && Intrinsics.LJFF(this.interactionUserList, storyInteractionListResponse.interactionUserList) && Intrinsics.LJFF(this.storyAnalytics, storyInteractionListResponse.storyAnalytics) && Intrinsics.LJFF(this.viewersCount, storyInteractionListResponse.viewersCount);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.total) * 31;
        List<StoryInteractionListInfo> list = this.interactionUserList;
        int iHashCode = (iY2 + (list == null ? 0 : list.hashCode())) * 31;
        StoryAnalytics storyAnalytics = this.storyAnalytics;
        int iHashCode2 = (iHashCode + (storyAnalytics == null ? 0 : storyAnalytics.hashCode())) * 31;
        Long l = this.viewersCount;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryInteractionListResponse(total=");
        sbLIZ.append(this.total);
        sbLIZ.append(", interactionUserList=");
        sbLIZ.append(this.interactionUserList);
        sbLIZ.append(", storyAnalytics=");
        sbLIZ.append(this.storyAnalytics);
        sbLIZ.append(", viewersCount=");
        sbLIZ.append(this.viewersCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final StoryInteractionListInfo LJ(int i) {
        List<StoryInteractionListInfo> list = this.interactionUserList;
        StoryInteractionListInfo storyInteractionListInfo = null;
        if (list == null) {
            return null;
        }
        Iterator<StoryInteractionListInfo> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            StoryInteractionListInfo next = it2.next();
            Integer num = next.interactionType;
            if (num != null && num.intValue() == i) {
                storyInteractionListInfo = next;
                break;
            }
        }
        return storyInteractionListInfo;
    }

    public StoryInteractionListResponse(long j, List<StoryInteractionListInfo> list, StoryAnalytics storyAnalytics, Long l) {
        this.total = j;
        this.interactionUserList = list;
        this.storyAnalytics = storyAnalytics;
        this.viewersCount = l;
    }
}
