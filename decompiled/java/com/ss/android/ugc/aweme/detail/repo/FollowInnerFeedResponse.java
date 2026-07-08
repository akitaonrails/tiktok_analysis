package com.ss.android.ugc.aweme.detail.repo;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.aweme.follow.LastViewData;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.FollowInsertedResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowInnerFeedResponse extends BaseResponse {

    @C09CT("blank_panel_text")
    public final String blankPanelText;

    @C09CT("card_insert_results")
    public final List<CardInsertResultInfo> cardInsertResults;

    @C09CT("cursor")
    public final String cursor;

    @C09CT("data")
    public final List<FollowFeed> data;

    @C09CT("feed_type")
    public final Integer feedType;

    @C09CT("has_more")
    public final Integer hasMore;

    @C09CT("inserted_filter_codes")
    public final String insertedFilterCodes;

    @C09CT("inserted_results")
    public final List<FollowInsertedResult> insertedResults;

    @C09CT("last_view")
    public final LastViewData lastView;

    @C09CT("level")
    public final Integer level;

    @C09CT("need_change_snapshot")
    public final Integer needChangeSnapshot;

    @C09CT("need_delete_snapshot")
    public final Integer needDeleteSnapshot;

    @C09CT("new_item_count")
    public final Integer newItemCount;

    @C09CT("new_room_count")
    public final Integer newRoomCount;

    @C09CT("preload")
    public final Integer preload;

    @C09CT("snapshot_control")
    public final Integer snapshotControl;

    @C09CT("update_item_count")
    public final Integer updateItemCount;

    public FollowInnerFeedResponse() {
        this(null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowInnerFeedResponse)) {
            return false;
        }
        FollowInnerFeedResponse followInnerFeedResponse = (FollowInnerFeedResponse) obj;
        return Intrinsics.LJFF(this.cursor, followInnerFeedResponse.cursor) && Intrinsics.LJFF(this.level, followInnerFeedResponse.level) && Intrinsics.LJFF(this.hasMore, followInnerFeedResponse.hasMore) && Intrinsics.LJFF(this.data, followInnerFeedResponse.data) && Intrinsics.LJFF(this.lastView, followInnerFeedResponse.lastView) && Intrinsics.LJFF(this.newItemCount, followInnerFeedResponse.newItemCount) && Intrinsics.LJFF(this.newRoomCount, followInnerFeedResponse.newRoomCount) && Intrinsics.LJFF(this.feedType, followInnerFeedResponse.feedType) && Intrinsics.LJFF(this.snapshotControl, followInnerFeedResponse.snapshotControl) && Intrinsics.LJFF(this.needDeleteSnapshot, followInnerFeedResponse.needDeleteSnapshot) && Intrinsics.LJFF(this.needChangeSnapshot, followInnerFeedResponse.needChangeSnapshot) && Intrinsics.LJFF(this.updateItemCount, followInnerFeedResponse.updateItemCount) && Intrinsics.LJFF(this.blankPanelText, followInnerFeedResponse.blankPanelText) && Intrinsics.LJFF(this.preload, followInnerFeedResponse.preload) && Intrinsics.LJFF(this.insertedFilterCodes, followInnerFeedResponse.insertedFilterCodes) && Intrinsics.LJFF(this.insertedResults, followInnerFeedResponse.insertedResults) && Intrinsics.LJFF(this.cardInsertResults, followInnerFeedResponse.cardInsertResults);
    }

    public final int hashCode() {
        String str = this.cursor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.level;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.hasMore;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<FollowFeed> list = this.data;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        LastViewData lastViewData = this.lastView;
        int iHashCode5 = (iHashCode4 + (lastViewData == null ? 0 : lastViewData.hashCode())) * 31;
        Integer num3 = this.newItemCount;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.newRoomCount;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.feedType;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.snapshotControl;
        int iHashCode9 = (iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.needDeleteSnapshot;
        int iHashCode10 = (iHashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.needChangeSnapshot;
        int iHashCode11 = (iHashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.updateItemCount;
        int iHashCode12 = (iHashCode11 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str2 = this.blankPanelText;
        int iHashCode13 = (iHashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num10 = this.preload;
        int iHashCode14 = (iHashCode13 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str3 = this.insertedFilterCodes;
        int iHashCode15 = (iHashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<FollowInsertedResult> list2 = this.insertedResults;
        int iHashCode16 = (iHashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CardInsertResultInfo> list3 = this.cardInsertResults;
        return iHashCode16 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "FollowInnerFeedResponse(cursor=" + this.cursor + ", level=" + this.level + ", hasMore=" + this.hasMore + ", data=" + this.data + ", lastView=" + this.lastView + ", newItemCount=" + this.newItemCount + ", newRoomCount=" + this.newRoomCount + ", feedType=" + this.feedType + ", snapshotControl=" + this.snapshotControl + ", needDeleteSnapshot=" + this.needDeleteSnapshot + ", needChangeSnapshot=" + this.needChangeSnapshot + ", updateItemCount=" + this.updateItemCount + ", blankPanelText=" + this.blankPanelText + ", preload=" + this.preload + ", insertedFilterCodes=" + this.insertedFilterCodes + ", insertedResults=" + this.insertedResults + ", cardInsertResults=" + this.cardInsertResults + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FollowInnerFeedResponse(String str, Integer num, Integer num2, List<? extends FollowFeed> list, LastViewData lastViewData, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, String str2, Integer num10, String str3, List<FollowInsertedResult> list2, List<CardInsertResultInfo> list3) {
        this.cursor = str;
        this.level = num;
        this.hasMore = num2;
        this.data = list;
        this.lastView = lastViewData;
        this.newItemCount = num3;
        this.newRoomCount = num4;
        this.feedType = num5;
        this.snapshotControl = num6;
        this.needDeleteSnapshot = num7;
        this.needChangeSnapshot = num8;
        this.updateItemCount = num9;
        this.blankPanelText = str2;
        this.preload = num10;
        this.insertedFilterCodes = str3;
        this.insertedResults = list2;
        this.cardInsertResults = list3;
    }
}
