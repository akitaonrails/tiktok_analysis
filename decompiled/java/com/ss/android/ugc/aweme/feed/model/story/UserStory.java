package com.ss.android.ugc.aweme.feed.model.story;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.highlights.HighlightSkylightUser;
import com.ss.android.ugc.aweme.profile.model.UserFilterStoryInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class UserStory extends BaseResponse implements Serializable {
    public long addToCacheTime;

    @C09CT("all_viewed")
    public boolean allViewed;
    public UserStoryCurrentInfo currentInfo;

    @C09CT("current_position")
    public long currentPosition;
    public boolean fakeAwemeShell;
    public boolean fakeSelfStoryCollection;
    public int firstUnViewedStoryIdx;

    @C09CT("has_more_after")
    public boolean hasMoreAfter;

    @C09CT("has_more_before")
    public boolean hasMoreBefore;
    public transient HighlightSkylightUser highlightSkylightUser;
    public boolean isFromRemote;

    @C09CT("is_post_style")
    public boolean isPostStyle;

    @C09CT("is_story_guide_card")
    public volatile boolean isStoryGuideCard;

    @C09CT("last_story_created_at")
    public long lastStoryCreatedAt;

    @C09CT("max_cursor")
    public long maxCursor;
    public UserStoryCurrentInfo maxViewedInfo;

    @C09CT("story_lite_meta_data")
    public List<StoryLiteMetaData> metaDataList;

    @C09CT("min_cursor")
    public long minCursor;
    public long originTotalCount;
    public boolean shouldStartFromUnViewedStoryIdx;

    @C09CT("stories")
    public List<Aweme> stories;

    @C09CT("total_count")
    public long totalCount;
    public long totalVV;
    public List<String> unReadStoryAids;

    @C09CT("user_filter_story_info")
    public UserFilterStoryInfo userFilterStoryInfo;

    public UserStory() {
    }

    public final UserStory copy(List<Aweme> list, long j, long j2, boolean z, long j3, long j4, boolean z2, boolean z3, long j5, boolean z4, List<StoryLiteMetaData> list2, UserFilterStoryInfo userFilterStoryInfo, boolean z5, HighlightSkylightUser highlightSkylightUser, long j6, UserStoryCurrentInfo userStoryCurrentInfo, boolean z6, boolean z7, UserStoryCurrentInfo userStoryCurrentInfo2, int i, boolean z8, long j7, List<String> list3, boolean z9) {
        return new UserStory(list, j, j2, z, j3, j4, z2, z3, j5, z4, list2, userFilterStoryInfo, z5, highlightSkylightUser, j6, userStoryCurrentInfo, z6, z7, userStoryCurrentInfo2, i, z8, j7, list3, z9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStory)) {
            return false;
        }
        UserStory userStory = (UserStory) obj;
        return Intrinsics.LJFF(this.stories, userStory.stories) && this.totalCount == userStory.totalCount && this.currentPosition == userStory.currentPosition && this.allViewed == userStory.allViewed && this.minCursor == userStory.minCursor && this.maxCursor == userStory.maxCursor && this.hasMoreAfter == userStory.hasMoreAfter && this.hasMoreBefore == userStory.hasMoreBefore && this.lastStoryCreatedAt == userStory.lastStoryCreatedAt && this.isPostStyle == userStory.isPostStyle && Intrinsics.LJFF(this.metaDataList, userStory.metaDataList) && Intrinsics.LJFF(this.userFilterStoryInfo, userStory.userFilterStoryInfo) && this.isStoryGuideCard == userStory.isStoryGuideCard && Intrinsics.LJFF(this.highlightSkylightUser, userStory.highlightSkylightUser) && this.originTotalCount == userStory.originTotalCount && Intrinsics.LJFF(this.currentInfo, userStory.currentInfo) && this.fakeSelfStoryCollection == userStory.fakeSelfStoryCollection && this.fakeAwemeShell == userStory.fakeAwemeShell && Intrinsics.LJFF(this.maxViewedInfo, userStory.maxViewedInfo) && this.firstUnViewedStoryIdx == userStory.firstUnViewedStoryIdx && this.shouldStartFromUnViewedStoryIdx == userStory.shouldStartFromUnViewedStoryIdx && this.totalVV == userStory.totalVV && Intrinsics.LJFF(this.unReadStoryAids, userStory.unReadStoryAids) && this.isFromRemote == userStory.isFromRemote;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.stories.hashCode() * 31) + C786410Ut5.Y2(this.totalCount)) * 31) + C786410Ut5.Y2(this.currentPosition)) * 31) + C786410Ut5.Z2(this.allViewed)) * 31) + C786410Ut5.Y2(this.minCursor)) * 31) + C786410Ut5.Y2(this.maxCursor)) * 31) + C786410Ut5.Z2(this.hasMoreAfter)) * 31) + C786410Ut5.Z2(this.hasMoreBefore)) * 31) + C786410Ut5.Y2(this.lastStoryCreatedAt)) * 31) + C786410Ut5.Z2(this.isPostStyle)) * 31;
        List<StoryLiteMetaData> list = this.metaDataList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        UserFilterStoryInfo userFilterStoryInfo = this.userFilterStoryInfo;
        int iHashCode3 = (((iHashCode2 + (userFilterStoryInfo == null ? 0 : userFilterStoryInfo.hashCode())) * 31) + C786410Ut5.Z2(this.isStoryGuideCard)) * 31;
        HighlightSkylightUser highlightSkylightUser = this.highlightSkylightUser;
        int iHashCode4 = (((iHashCode3 + (highlightSkylightUser == null ? 0 : highlightSkylightUser.hashCode())) * 31) + C786410Ut5.Y2(this.originTotalCount)) * 31;
        UserStoryCurrentInfo userStoryCurrentInfo = this.currentInfo;
        int iHashCode5 = (((((iHashCode4 + (userStoryCurrentInfo == null ? 0 : userStoryCurrentInfo.hashCode())) * 31) + C786410Ut5.Z2(this.fakeSelfStoryCollection)) * 31) + C786410Ut5.Z2(this.fakeAwemeShell)) * 31;
        UserStoryCurrentInfo userStoryCurrentInfo2 = this.maxViewedInfo;
        int iHashCode6 = (((((((iHashCode5 + (userStoryCurrentInfo2 == null ? 0 : userStoryCurrentInfo2.hashCode())) * 31) + this.firstUnViewedStoryIdx) * 31) + C786410Ut5.Z2(this.shouldStartFromUnViewedStoryIdx)) * 31) + C786410Ut5.Y2(this.totalVV)) * 31;
        List<String> list2 = this.unReadStoryAids;
        return ((iHashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isFromRemote);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "UserStory(stories=" + this.stories + ", totalCount=" + this.totalCount + ", currentPosition=" + this.currentPosition + ", allViewed=" + this.allViewed + ", minCursor=" + this.minCursor + ", maxCursor=" + this.maxCursor + ", hasMoreAfter=" + this.hasMoreAfter + ", hasMoreBefore=" + this.hasMoreBefore + ", lastStoryCreatedAt=" + this.lastStoryCreatedAt + ", isPostStyle=" + this.isPostStyle + ", metaDataList=" + this.metaDataList + ", userFilterStoryInfo=" + this.userFilterStoryInfo + ", isStoryGuideCard=" + this.isStoryGuideCard + ", highlightSkylightUser=" + this.highlightSkylightUser + ", originTotalCount=" + this.originTotalCount + ", currentInfo=" + this.currentInfo + ", fakeSelfStoryCollection=" + this.fakeSelfStoryCollection + ", fakeAwemeShell=" + this.fakeAwemeShell + ", maxViewedInfo=" + this.maxViewedInfo + ", firstUnViewedStoryIdx=" + this.firstUnViewedStoryIdx + ", shouldStartFromUnViewedStoryIdx=" + this.shouldStartFromUnViewedStoryIdx + ", totalVV=" + this.totalVV + ", unReadStoryAids=" + this.unReadStoryAids + ", isFromRemote=" + this.isFromRemote + ')';
    }

    public final long getAddToCacheTime() {
        return this.addToCacheTime;
    }

    public final boolean getAllViewed() {
        return this.allViewed;
    }

    public final UserStoryCurrentInfo getCurrentInfo() {
        return this.currentInfo;
    }

    public final long getCurrentPosition() {
        return this.currentPosition;
    }

    public final boolean getFakeAwemeShell() {
        return this.fakeAwemeShell;
    }

    public final boolean getFakeSelfStoryCollection() {
        return this.fakeSelfStoryCollection;
    }

    public final int getFirstUnViewedStoryIdx() {
        return this.firstUnViewedStoryIdx;
    }

    public final boolean getHasMoreAfter() {
        return this.hasMoreAfter;
    }

    public final boolean getHasMoreBefore() {
        return this.hasMoreBefore;
    }

    public final HighlightSkylightUser getHighlightSkylightUser() {
        return this.highlightSkylightUser;
    }

    public final long getLastStoryCreatedAt() {
        return this.lastStoryCreatedAt;
    }

    public final long getMaxCursor() {
        return this.maxCursor;
    }

    public final UserStoryCurrentInfo getMaxViewedInfo() {
        return this.maxViewedInfo;
    }

    public final List<StoryLiteMetaData> getMetaDataList() {
        return this.metaDataList;
    }

    public final long getMinCursor() {
        return this.minCursor;
    }

    public final long getOriginTotalCount() {
        return this.originTotalCount;
    }

    public final boolean getShouldStartFromUnViewedStoryIdx() {
        return this.shouldStartFromUnViewedStoryIdx;
    }

    public final List<Aweme> getStories() {
        return this.stories;
    }

    public final long getTotalCount() {
        return this.totalCount;
    }

    public final long getTotalVV() {
        return this.totalVV;
    }

    public final List<String> getUnReadStoryAids() {
        return this.unReadStoryAids;
    }

    public final UserFilterStoryInfo getUserFilterStoryInfo() {
        return this.userFilterStoryInfo;
    }

    public final boolean isFromRemote() {
        return this.isFromRemote;
    }

    public final boolean isPostStyle() {
        return this.isPostStyle;
    }

    public final boolean isStoryGuideCard() {
        return this.isStoryGuideCard;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC2217241BqE<com.ss.android.ugc.aweme.feed.model.story.UserStory, ?>> diffProperties(com.ss.android.ugc.aweme.feed.model.story.UserStory r8) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.story.UserStory.diffProperties(com.ss.android.ugc.aweme.feed.model.story.UserStory):java.util.List");
    }

    public final int getNextStoryIndex(int i) {
        int iIntValue;
        Integer num;
        UserStoryCurrentInfo userStoryCurrentInfo = this.maxViewedInfo;
        if (userStoryCurrentInfo != null && (num = userStoryCurrentInfo.currentIndex) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        int iMax = Math.max(iIntValue, i);
        int i2 = iMax + 1;
        long j = i2;
        long j2 = this.totalCount;
        if (j >= j2 && iMax < j2) {
            return iMax;
        }
        return i2;
    }

    public final void setAddToCacheTime(long j) {
        if (this.addToCacheTime > 0) {
            return;
        }
        this.addToCacheTime = j;
    }

    public final void setAllViewed(boolean z) {
        this.allViewed = z;
    }

    public final void setCurrentInfo(UserStoryCurrentInfo userStoryCurrentInfo) {
        this.currentInfo = userStoryCurrentInfo;
    }

    public final void setCurrentPosition(long j) {
        this.currentPosition = j;
    }

    public final void setFakeAwemeShell(boolean z) {
        this.fakeAwemeShell = z;
    }

    public final void setFirstUnViewedStoryIdx(int i) {
        this.firstUnViewedStoryIdx = i;
    }

    public final void setFromRemote(boolean z) {
        this.isFromRemote = z;
    }

    public final void setHasMoreAfter(boolean z) {
        this.hasMoreAfter = z;
    }

    public final void setHasMoreBefore(boolean z) {
        this.hasMoreBefore = z;
    }

    public final void setHighlightSkylightUser(HighlightSkylightUser highlightSkylightUser) {
        this.highlightSkylightUser = highlightSkylightUser;
    }

    public final void setLastStoryCreatedAt(long j) {
        this.lastStoryCreatedAt = j;
    }

    public final void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public final void setMaxViewedInfo(UserStoryCurrentInfo userStoryCurrentInfo) {
        this.maxViewedInfo = userStoryCurrentInfo;
    }

    public final void setMinCursor(long j) {
        this.minCursor = j;
    }

    public final void setOriginTotalCount(long j) {
        this.originTotalCount = j;
    }

    public final void setPostStyle(boolean z) {
        this.isPostStyle = z;
    }

    public final void setShouldStartFromUnViewedStoryIdx(boolean z) {
        this.shouldStartFromUnViewedStoryIdx = z;
    }

    public final void setStories(List<Aweme> list) {
        this.stories = list;
    }

    public final void setStoryGuideCard(boolean z) {
        this.isStoryGuideCard = z;
    }

    public final void setTotalCount(long j) {
        this.totalCount = j;
    }

    public final void setTotalVV(long j) {
        this.totalVV = j;
    }

    public final void setUnReadStoryAids(List<String> list) {
        this.unReadStoryAids = list;
    }

    public UserStory(List<Aweme> list, long j, long j2, boolean z, long j3, long j4, boolean z2, boolean z3, long j5, boolean z4, List<StoryLiteMetaData> list2, UserFilterStoryInfo userFilterStoryInfo, boolean z5, HighlightSkylightUser highlightSkylightUser, long j6, UserStoryCurrentInfo userStoryCurrentInfo, boolean z6, boolean z7, UserStoryCurrentInfo userStoryCurrentInfo2, int i, boolean z8, long j7, List<String> list3, boolean z9) {
        this.stories = list;
        this.totalCount = j;
        this.currentPosition = j2;
        this.allViewed = z;
        this.minCursor = j3;
        this.maxCursor = j4;
        this.hasMoreAfter = z2;
        this.hasMoreBefore = z3;
        this.lastStoryCreatedAt = j5;
        this.isPostStyle = z4;
        this.metaDataList = list2;
        this.userFilterStoryInfo = userFilterStoryInfo;
        this.isStoryGuideCard = z5;
        this.highlightSkylightUser = highlightSkylightUser;
        this.originTotalCount = j6;
        this.currentInfo = userStoryCurrentInfo;
        this.fakeSelfStoryCollection = z6;
        this.fakeAwemeShell = z7;
        this.maxViewedInfo = userStoryCurrentInfo2;
        this.firstUnViewedStoryIdx = i;
        this.shouldStartFromUnViewedStoryIdx = z8;
        this.totalVV = j7;
        this.unReadStoryAids = list3;
        this.isFromRemote = z9;
    }
}
