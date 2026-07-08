package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC330550CxZ;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class StoryViewerListResponse extends BaseResponse implements InterfaceC330550CxZ {
    public final String LL;

    @C09CT("expiry_period")
    public final int expiryPeriod;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("viewer_list")
    public List<StoryInteractionUser> interactionUserList;

    @C09CT("is_full_viewer")
    public final Boolean isFullViewer;

    @C09CT("next_cursor")
    public final long nextCursor;

    @C09CT("story_analytics")
    public final StoryAnalytics storyAnalytics;

    @C09CT("total_views")
    public long total;

    @C09CT("total_viewers")
    public final Long viewersCount;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryViewerListResponse)) {
            return false;
        }
        StoryViewerListResponse storyViewerListResponse = (StoryViewerListResponse) obj;
        return this.total == storyViewerListResponse.total && this.hasMore == storyViewerListResponse.hasMore && this.nextCursor == storyViewerListResponse.nextCursor && Intrinsics.LJFF(this.interactionUserList, storyViewerListResponse.interactionUserList) && Intrinsics.LJFF(this.storyAnalytics, storyViewerListResponse.storyAnalytics) && Intrinsics.LJFF(this.isFullViewer, storyViewerListResponse.isFullViewer) && this.expiryPeriod == storyViewerListResponse.expiryPeriod && Intrinsics.LJFF(this.viewersCount, storyViewerListResponse.viewersCount) && Intrinsics.LJFF(this.LL, storyViewerListResponse.LL);
    }

    @Override // X.InterfaceC330550CxZ
    public final long getOffset() {
        return 0L;
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.total) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + C786410Ut5.Y2(this.nextCursor)) * 31;
        List<StoryInteractionUser> list = this.interactionUserList;
        int iHashCode = (iY2 + (list == null ? 0 : list.hashCode())) * 31;
        StoryAnalytics storyAnalytics = this.storyAnalytics;
        int iHashCode2 = (iHashCode + (storyAnalytics == null ? 0 : storyAnalytics.hashCode())) * 31;
        Boolean bool = this.isFullViewer;
        int iHashCode3 = (((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + this.expiryPeriod) * 31;
        Long l = this.viewersCount;
        return ((iHashCode3 + (l != null ? l.hashCode() : 0)) * 31) + this.LL.hashCode();
    }

    @Override // X.InterfaceC330550CxZ
    public final boolean isShowLikeListLimit() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryViewerListResponse(total=");
        sbLIZ.append(this.total);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", interactionUserList=");
        sbLIZ.append(this.interactionUserList);
        sbLIZ.append(", storyAnalytics=");
        sbLIZ.append(this.storyAnalytics);
        sbLIZ.append(", isFullViewer=");
        sbLIZ.append(this.isFullViewer);
        sbLIZ.append(", expiryPeriod=");
        sbLIZ.append(this.expiryPeriod);
        sbLIZ.append(", viewersCount=");
        sbLIZ.append(this.viewersCount);
        sbLIZ.append(", javaClassName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC330550CxZ
    public final int getExpiryPeriod() {
        return this.expiryPeriod;
    }

    @Override // X.InterfaceC330550CxZ
    public final boolean getHasMore() {
        return this.hasMore;
    }

    @Override // X.InterfaceC330550CxZ
    public final List<StoryInteractionUser> getInteractionUserList() {
        return this.interactionUserList;
    }

    @Override // X.InterfaceC330550CxZ
    public final String getJavaClassName() {
        return this.LL;
    }

    @Override // X.InterfaceC330550CxZ
    public final long getNextCursor() {
        return this.nextCursor;
    }

    @Override // X.InterfaceC330550CxZ
    public final StoryAnalytics getStoryAnalytics() {
        return this.storyAnalytics;
    }

    @Override // X.InterfaceC330550CxZ
    public final long getTotal() {
        return this.total;
    }

    @Override // X.InterfaceC330550CxZ
    public final Long getViewersCount() {
        return this.viewersCount;
    }

    @Override // X.InterfaceC330550CxZ
    public final Boolean isFullViewer() {
        return this.isFullViewer;
    }

    @Override // X.InterfaceC330550CxZ
    public final void setInteractionUserList(List<StoryInteractionUser> list) {
        this.interactionUserList = list;
    }

    @Override // X.InterfaceC330550CxZ
    public final void setTotal(long j) {
        this.total = j;
    }

    public StoryViewerListResponse(long j, boolean z, long j2, List<StoryInteractionUser> list, StoryAnalytics storyAnalytics, Boolean bool, int i, Long l, String str) {
        this.total = j;
        this.hasMore = z;
        this.nextCursor = j2;
        this.interactionUserList = list;
        this.storyAnalytics = storyAnalytics;
        this.isFullViewer = bool;
        this.expiryPeriod = i;
        this.viewersCount = l;
        this.LL = str;
    }
}
