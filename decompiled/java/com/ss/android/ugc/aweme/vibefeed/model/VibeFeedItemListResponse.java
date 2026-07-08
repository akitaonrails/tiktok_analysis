package com.ss.android.ugc.aweme.vibefeed.model;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.vibefeed.viewmodel.VibeFeedUser;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeFeedItemListResponse extends BaseResponse {

    @C09CT("all_item_ids")
    public final String allItemIds;

    @C09CT("feed_id")
    public final String feedId;

    @C09CT("filtered_item_ids")
    public final String filteredItemIds;

    @C09CT("joined_feed_uids")
    public final List<String> joinedFeedUids;

    @C09CT("log_pb")
    public final LogPbBean logPB;

    @C09CT("next_cursor")
    public final String nextCursor;

    @C09CT("next_has_more")
    public final Boolean nextHasMore;

    @C09CT("prev_cursor")
    public final String prevCursor;

    @C09CT("prev_has_more")
    public final Boolean prevHasMore;

    @C09CT("total_count")
    public final Integer totalCount;

    @C09CT("feed_items")
    public final List<VibeFeedItem> vibeList;

    @C09CT("visit_finished_users")
    public final List<VibeFeedUser> visitFinishedUsers;

    @C09CT("visit_finished_uids")
    public final List<String> visitUids;

    public VibeFeedItemListResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VibeFeedItemListResponse)) {
            return false;
        }
        VibeFeedItemListResponse vibeFeedItemListResponse = (VibeFeedItemListResponse) obj;
        return Intrinsics.LJFF(this.vibeList, vibeFeedItemListResponse.vibeList) && Intrinsics.LJFF(this.visitUids, vibeFeedItemListResponse.visitUids) && Intrinsics.LJFF(this.feedId, vibeFeedItemListResponse.feedId) && Intrinsics.LJFF(this.visitFinishedUsers, vibeFeedItemListResponse.visitFinishedUsers) && Intrinsics.LJFF(this.joinedFeedUids, vibeFeedItemListResponse.joinedFeedUids) && Intrinsics.LJFF(this.logPB, vibeFeedItemListResponse.logPB) && Intrinsics.LJFF(this.prevHasMore, vibeFeedItemListResponse.prevHasMore) && Intrinsics.LJFF(this.nextHasMore, vibeFeedItemListResponse.nextHasMore) && Intrinsics.LJFF(this.prevCursor, vibeFeedItemListResponse.prevCursor) && Intrinsics.LJFF(this.nextCursor, vibeFeedItemListResponse.nextCursor) && Intrinsics.LJFF(this.allItemIds, vibeFeedItemListResponse.allItemIds) && Intrinsics.LJFF(this.filteredItemIds, vibeFeedItemListResponse.filteredItemIds) && Intrinsics.LJFF(this.totalCount, vibeFeedItemListResponse.totalCount);
    }

    public final int hashCode() {
        List<VibeFeedItem> list = this.vibeList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.visitUids;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.feedId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<VibeFeedUser> list3 = this.visitFinishedUsers;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.joinedFeedUids;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        LogPbBean logPbBean = this.logPB;
        int iHashCode6 = (iHashCode5 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        Boolean bool = this.prevHasMore;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.nextHasMore;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.prevCursor;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nextCursor;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.allItemIds;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.filteredItemIds;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.totalCount;
        return iHashCode12 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "VibeFeedItemListResponse(vibeList=" + this.vibeList + ", visitUids=" + this.visitUids + ", feedId=" + this.feedId + ", visitFinishedUsers=" + this.visitFinishedUsers + ", joinedFeedUids=" + this.joinedFeedUids + ", logPB=" + this.logPB + ", prevHasMore=" + this.prevHasMore + ", nextHasMore=" + this.nextHasMore + ", prevCursor=" + this.prevCursor + ", nextCursor=" + this.nextCursor + ", allItemIds=" + this.allItemIds + ", filteredItemIds=" + this.filteredItemIds + ", totalCount=" + this.totalCount + ')';
    }

    public VibeFeedItemListResponse(List<VibeFeedItem> list, List<String> list2, String str, List<VibeFeedUser> list3, List<String> list4, LogPbBean logPbBean, Boolean bool, Boolean bool2, String str2, String str3, String str4, String str5, Integer num) {
        this.vibeList = list;
        this.visitUids = list2;
        this.feedId = str;
        this.visitFinishedUsers = list3;
        this.joinedFeedUids = list4;
        this.logPB = logPbBean;
        this.prevHasMore = bool;
        this.nextHasMore = bool2;
        this.prevCursor = str2;
        this.nextCursor = str3;
        this.allItemIds = str4;
        this.filteredItemIds = str5;
        this.totalCount = num;
    }

    public VibeFeedItemListResponse(List list, List list2, String str, List list3, List list4, LogPbBean logPbBean, Boolean bool, Boolean bool2, String str2, String str3, String str4, String str5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? C13BV.INSTANCE : list4, (i & 32) != 0 ? null : logPbBean, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : str4, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str5, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? num : null);
    }
}
