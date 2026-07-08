package com.ss.android.ugc.aweme.story.inbox;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.highlights.HighlightSkylightUser;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGetFeedByPageResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("awemes")
    public final List<Aweme> awemes;

    @C09CT("cursor")
    public final long cursor;

    @C09CT("has_ever_published_story")
    public final Boolean hasEverPublishedStory;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("highlight_total_count")
    public final Long highlightTotalCount;

    @C09CT("highlight_users")
    public final List<HighlightSkylightUser> highlightUsers;

    @C09CT("insert_cards")
    public final List<StoryInsertCard> insertCards;

    @C09CT("is_demotioned")
    public final Boolean isDemotioned;

    @C09CT("page_control_token")
    public final String pageControlToken;

    @C09CT("skylight_auto_display")
    public final Boolean skylightAutoDisplay;

    @C09CT("skylight_sort_strategy")
    public final int skylightSort;

    @C09CT("skylight_story_users")
    public final List<SkylightStoryUser> skylightStoryUsers;

    @C09CT("total_count")
    public final long totalCnt;

    @C09CT("user_story_notes")
    public final List<StoryNoteBubbleInfo> userLatestStoryNotes;

    public final StoryGetFeedByPageResponse copy(List<Aweme> list, boolean z, long j, long j2, Long l, List<SkylightStoryUser> list2, Boolean bool, List<StoryNoteBubbleInfo> list3, Boolean bool2, int i, List<StoryInsertCard> list4, String str, List<HighlightSkylightUser> list5, Boolean bool3) {
        return new StoryGetFeedByPageResponse(list, z, j, j2, l, list2, bool, list3, bool2, i, list4, str, list5, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryGetFeedByPageResponse)) {
            return false;
        }
        StoryGetFeedByPageResponse storyGetFeedByPageResponse = (StoryGetFeedByPageResponse) obj;
        return Intrinsics.LJFF(this.awemes, storyGetFeedByPageResponse.awemes) && this.hasMore == storyGetFeedByPageResponse.hasMore && this.cursor == storyGetFeedByPageResponse.cursor && this.totalCnt == storyGetFeedByPageResponse.totalCnt && Intrinsics.LJFF(this.highlightTotalCount, storyGetFeedByPageResponse.highlightTotalCount) && Intrinsics.LJFF(this.skylightStoryUsers, storyGetFeedByPageResponse.skylightStoryUsers) && Intrinsics.LJFF(this.isDemotioned, storyGetFeedByPageResponse.isDemotioned) && Intrinsics.LJFF(this.userLatestStoryNotes, storyGetFeedByPageResponse.userLatestStoryNotes) && Intrinsics.LJFF(this.skylightAutoDisplay, storyGetFeedByPageResponse.skylightAutoDisplay) && this.skylightSort == storyGetFeedByPageResponse.skylightSort && Intrinsics.LJFF(this.insertCards, storyGetFeedByPageResponse.insertCards) && Intrinsics.LJFF(this.pageControlToken, storyGetFeedByPageResponse.pageControlToken) && Intrinsics.LJFF(this.highlightUsers, storyGetFeedByPageResponse.highlightUsers) && Intrinsics.LJFF(this.hasEverPublishedStory, storyGetFeedByPageResponse.hasEverPublishedStory);
    }

    public int hashCode() {
        List<Aweme> list = this.awemes;
        int iHashCode = (((((((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + C786410Ut5.Y2(this.cursor)) * 31) + C786410Ut5.Y2(this.totalCnt)) * 31;
        Long l = this.highlightTotalCount;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List<SkylightStoryUser> list2 = this.skylightStoryUsers;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isDemotioned;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<StoryNoteBubbleInfo> list3 = this.userLatestStoryNotes;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool2 = this.skylightAutoDisplay;
        int iHashCode6 = (((iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.skylightSort) * 31;
        List<StoryInsertCard> list4 = this.insertCards;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.pageControlToken;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        List<HighlightSkylightUser> list5 = this.highlightUsers;
        int iHashCode9 = (iHashCode8 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool3 = this.hasEverPublishedStory;
        return iHashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "StoryGetFeedByPageResponse(awemes=" + this.awemes + ", hasMore=" + this.hasMore + ", cursor=" + this.cursor + ", totalCnt=" + this.totalCnt + ", highlightTotalCount=" + this.highlightTotalCount + ", skylightStoryUsers=" + this.skylightStoryUsers + ", isDemotioned=" + this.isDemotioned + ", userLatestStoryNotes=" + this.userLatestStoryNotes + ", skylightAutoDisplay=" + this.skylightAutoDisplay + ", skylightSort=" + this.skylightSort + ", insertCards=" + this.insertCards + ", pageControlToken=" + this.pageControlToken + ", highlightUsers=" + this.highlightUsers + ", hasEverPublishedStory=" + this.hasEverPublishedStory + ')';
    }

    public final List<Aweme> getAwemes() {
        return this.awemes;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final Boolean getHasEverPublishedStory() {
        return this.hasEverPublishedStory;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final Long getHighlightTotalCount() {
        return this.highlightTotalCount;
    }

    public final List<HighlightSkylightUser> getHighlightUsers() {
        return this.highlightUsers;
    }

    public final List<StoryInsertCard> getInsertCards() {
        return this.insertCards;
    }

    public final String getPageControlToken() {
        return this.pageControlToken;
    }

    public final Boolean getSkylightAutoDisplay() {
        return this.skylightAutoDisplay;
    }

    public final int getSkylightSort() {
        return this.skylightSort;
    }

    public final List<SkylightStoryUser> getSkylightStoryUsers() {
        return this.skylightStoryUsers;
    }

    public final long getTotalCnt() {
        return this.totalCnt;
    }

    public final List<StoryNoteBubbleInfo> getUserLatestStoryNotes() {
        return this.userLatestStoryNotes;
    }

    public final Boolean isDemotioned() {
        return this.isDemotioned;
    }

    public StoryGetFeedByPageResponse(List<Aweme> list, boolean z, long j, long j2, Long l, List<SkylightStoryUser> list2, Boolean bool, List<StoryNoteBubbleInfo> list3, Boolean bool2, int i, List<StoryInsertCard> list4, String str, List<HighlightSkylightUser> list5, Boolean bool3) {
        this.awemes = list;
        this.hasMore = z;
        this.cursor = j;
        this.totalCnt = j2;
        this.highlightTotalCount = l;
        this.skylightStoryUsers = list2;
        this.isDemotioned = bool;
        this.userLatestStoryNotes = list3;
        this.skylightAutoDisplay = bool2;
        this.skylightSort = i;
        this.insertCards = list4;
        this.pageControlToken = str;
        this.highlightUsers = list5;
        this.hasEverPublishedStory = bool3;
    }
}
