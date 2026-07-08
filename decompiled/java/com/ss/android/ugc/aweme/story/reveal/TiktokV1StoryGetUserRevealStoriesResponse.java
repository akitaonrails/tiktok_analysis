package com.ss.android.ugc.aweme.story.reveal;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TiktokV1StoryGetUserRevealStoriesResponse extends BaseResponse {

    @C09CT("all_viewed")
    public Boolean allViewed;

    @C09CT("current_position")
    public Long currentPosition;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("has_more_after")
    public final Boolean hasMoreAfter;

    @C09CT("has_more_before")
    public final Boolean hasMoreBefore;

    @C09CT("max_cursor")
    public final Long maxCursor;

    @C09CT("min_cursor")
    public final Long minCursor;

    @C09CT("stories")
    public final List<Aweme> stories;

    @C09CT("total_count")
    public Long totalCount;

    public TiktokV1StoryGetUserRevealStoriesResponse() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokV1StoryGetUserRevealStoriesResponse)) {
            return false;
        }
        TiktokV1StoryGetUserRevealStoriesResponse tiktokV1StoryGetUserRevealStoriesResponse = (TiktokV1StoryGetUserRevealStoriesResponse) obj;
        return Intrinsics.LJFF(this.stories, tiktokV1StoryGetUserRevealStoriesResponse.stories) && Intrinsics.LJFF(this.totalCount, tiktokV1StoryGetUserRevealStoriesResponse.totalCount) && Intrinsics.LJFF(this.currentPosition, tiktokV1StoryGetUserRevealStoriesResponse.currentPosition) && Intrinsics.LJFF(this.allViewed, tiktokV1StoryGetUserRevealStoriesResponse.allViewed) && Intrinsics.LJFF(this.hasMoreAfter, tiktokV1StoryGetUserRevealStoriesResponse.hasMoreAfter) && Intrinsics.LJFF(this.hasMoreBefore, tiktokV1StoryGetUserRevealStoriesResponse.hasMoreBefore) && Intrinsics.LJFF(this.cursor, tiktokV1StoryGetUserRevealStoriesResponse.cursor) && Intrinsics.LJFF(this.minCursor, tiktokV1StoryGetUserRevealStoriesResponse.minCursor) && Intrinsics.LJFF(this.maxCursor, tiktokV1StoryGetUserRevealStoriesResponse.maxCursor);
    }

    public final int hashCode() {
        List<Aweme> list = this.stories;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.totalCount;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.currentPosition;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.allViewed;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasMoreAfter;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasMoreBefore;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l3 = this.cursor;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.minCursor;
        int iHashCode8 = (iHashCode7 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.maxCursor;
        return iHashCode8 + (l5 != null ? l5.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokV1StoryGetUserRevealStoriesResponse(stories=");
        sbLIZ.append(this.stories);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.totalCount);
        sbLIZ.append(", currentPosition=");
        sbLIZ.append(this.currentPosition);
        sbLIZ.append(", allViewed=");
        sbLIZ.append(this.allViewed);
        sbLIZ.append(", hasMoreAfter=");
        sbLIZ.append(this.hasMoreAfter);
        sbLIZ.append(", hasMoreBefore=");
        sbLIZ.append(this.hasMoreBefore);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", minCursor=");
        sbLIZ.append(this.minCursor);
        sbLIZ.append(", maxCursor=");
        sbLIZ.append(this.maxCursor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TiktokV1StoryGetUserRevealStoriesResponse(List<? extends Aweme> list, Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, Long l3, Long l4, Long l5) {
        this.stories = list;
        this.totalCount = l;
        this.currentPosition = l2;
        this.allViewed = bool;
        this.hasMoreAfter = bool2;
        this.hasMoreBefore = bool3;
        this.cursor = l3;
        this.minCursor = l4;
        this.maxCursor = l5;
    }

    public TiktokV1StoryGetUserRevealStoriesResponse(List list, Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, Long l3, Long l4, Long l5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0L : l, (i & 4) != 0 ? 0L : l2, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? Boolean.FALSE : bool2, (i & 32) != 0 ? Boolean.FALSE : bool3, (i & 64) != 0 ? 0L : l3, (i & 128) != 0 ? 0L : l4, (i & 256) != 0 ? 0L : l5);
    }
}
