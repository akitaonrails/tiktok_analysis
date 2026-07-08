package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.story.model.StoryAnalytics;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SimpleStoryViewerPayload {

    @C09CT("expiry_period")
    public final int expiryPeriod;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("viewer_list")
    public final List<SimpleStoryInteractionUser> interactionUserList;

    @C09CT("is_full_viewer")
    public final Boolean isFullViewer;

    @C09CT("is_show_like_list_limit")
    public final boolean isShowLikeListLimit;

    @C09CT("next_cursor")
    public final long nextCursor;

    @C09CT("offset")
    public final long offset;

    @C09CT("story_analytics")
    public final StoryAnalytics storyAnalytics;

    @C09CT("total_views")
    public final long total;

    @C09CT("total_viewers")
    public final Long viewersCount;

    public SimpleStoryViewerPayload() {
        this(0L, false, 0L, null, null, null, 0, 0L, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleStoryViewerPayload)) {
            return false;
        }
        SimpleStoryViewerPayload simpleStoryViewerPayload = (SimpleStoryViewerPayload) obj;
        return this.total == simpleStoryViewerPayload.total && this.hasMore == simpleStoryViewerPayload.hasMore && this.nextCursor == simpleStoryViewerPayload.nextCursor && Intrinsics.LJFF(this.interactionUserList, simpleStoryViewerPayload.interactionUserList) && Intrinsics.LJFF(this.storyAnalytics, simpleStoryViewerPayload.storyAnalytics) && Intrinsics.LJFF(this.isFullViewer, simpleStoryViewerPayload.isFullViewer) && this.expiryPeriod == simpleStoryViewerPayload.expiryPeriod && Intrinsics.LJFF(this.viewersCount, simpleStoryViewerPayload.viewersCount) && this.offset == simpleStoryViewerPayload.offset && this.isShowLikeListLimit == simpleStoryViewerPayload.isShowLikeListLimit;
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.total) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + C786410Ut5.Y2(this.nextCursor)) * 31;
        List<SimpleStoryInteractionUser> list = this.interactionUserList;
        int iHashCode = (iY2 + (list == null ? 0 : list.hashCode())) * 31;
        StoryAnalytics storyAnalytics = this.storyAnalytics;
        int iHashCode2 = (iHashCode + (storyAnalytics == null ? 0 : storyAnalytics.hashCode())) * 31;
        Boolean bool = this.isFullViewer;
        int iHashCode3 = (((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + this.expiryPeriod) * 31;
        Long l = this.viewersCount;
        return ((((iHashCode3 + (l != null ? l.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.offset)) * 31) + C786410Ut5.Z2(this.isShowLikeListLimit);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimpleStoryViewerPayload(total=");
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
        sbLIZ.append(", offset=");
        sbLIZ.append(this.offset);
        sbLIZ.append(", isShowLikeListLimit=");
        sbLIZ.append(this.isShowLikeListLimit);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SimpleStoryViewerPayload(long j, boolean z, long j2, List<SimpleStoryInteractionUser> list, StoryAnalytics storyAnalytics, Boolean bool, int i, Long l, long j3, boolean z2) {
        this.total = j;
        this.hasMore = z;
        this.nextCursor = j2;
        this.interactionUserList = list;
        this.storyAnalytics = storyAnalytics;
        this.isFullViewer = bool;
        this.expiryPeriod = i;
        this.viewersCount = l;
        this.offset = j3;
        this.isShowLikeListLimit = z2;
    }
}
