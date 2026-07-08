package com.ss.android.ugc.aweme.friendstab.model;

import X.C09CT;
import X.C1583300rIu;
import X.C2188811AlT;
import X.EnumC1586610rOF;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.repostfeed.experiment.RepostFeedConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class NewContentResponse extends BaseResponse {

    @C09CT("friend_data")
    public final FriendsFeedRedDotResponse friendsFeedResponse;

    @C09CT("share_feed_data")
    public final RepostFeedRedDotResponse repostFeedResponse;

    public static final class FriendsFeedRedDotResponse extends SocialFeedRedDotResponse<FriendsUserNewContent> {

        @C09CT("affinity_rank_threshold")
        public final Float affinityRankThreshold;

        @C09CT("affinity_score_threshold")
        public final Float affinityScoreThreshold;

        @C09CT("new_content_map")
        public ArrayList<FriendsUserNewContent> avatarList;

        @C09CT("content_metadata")
        public final ArrayList<ContentMetadata> contentMetadataList;

        @C09CT("downgrading_new_content_count")
        public final Integer downgradingNewContentCount;

        @C09CT("fake_count_reason")
        public final String fakeCountReason;

        @C09CT("reduce_coefficient")
        public final Float reduceCoefficient;

        public final int getNewContentCountForDisplay() {
            Integer num = this.downgradingNewContentCount;
            return (num == null || num.intValue() <= 0) ? getRedDotCount() : this.downgradingNewContentCount.intValue();
        }

        public final Float getAffinityRankThreshold() {
            return this.affinityRankThreshold;
        }

        public final Float getAffinityScoreThreshold() {
            return this.affinityScoreThreshold;
        }

        @Override // com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse
        public ArrayList<FriendsUserNewContent> getAvatarList() {
            return this.avatarList;
        }

        public final ArrayList<ContentMetadata> getContentMetadataList() {
            return this.contentMetadataList;
        }

        public final Integer getDowngradingNewContentCount() {
            return this.downgradingNewContentCount;
        }

        public final String getFakeCountReason() {
            return this.fakeCountReason;
        }

        public final Float getReduceCoefficient() {
            return this.reduceCoefficient;
        }

        public void setAvatarList(ArrayList<FriendsUserNewContent> arrayList) {
            this.avatarList = arrayList;
        }
    }

    public final NewContentResponse copy(FriendsFeedRedDotResponse friendsFeedRedDotResponse, RepostFeedRedDotResponse repostFeedRedDotResponse) {
        return new NewContentResponse(friendsFeedRedDotResponse, repostFeedRedDotResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewContentResponse)) {
            return false;
        }
        NewContentResponse newContentResponse = (NewContentResponse) obj;
        return Intrinsics.LJFF(this.friendsFeedResponse, newContentResponse.friendsFeedResponse) && Intrinsics.LJFF(this.repostFeedResponse, newContentResponse.repostFeedResponse);
    }

    public int hashCode() {
        FriendsFeedRedDotResponse friendsFeedRedDotResponse = this.friendsFeedResponse;
        int iHashCode = (friendsFeedRedDotResponse == null ? 0 : friendsFeedRedDotResponse.hashCode()) * 31;
        RepostFeedRedDotResponse repostFeedRedDotResponse = this.repostFeedResponse;
        return iHashCode + (repostFeedRedDotResponse != null ? repostFeedRedDotResponse.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewContentResponse(friendsFeedResponse=");
        sbLIZ.append(this.friendsFeedResponse);
        sbLIZ.append(", repostFeedResponse=");
        sbLIZ.append(this.repostFeedResponse);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Map<EnumC1586610rOF, ArrayList<? extends UserNewContent>> getFeedTypeAvatarMap() {
        RepostFeedRedDotResponse repostFeedRedDotResponse;
        ArrayList<RepostUserNewContent> avatarList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EnumC1586610rOF enumC1586610rOF = EnumC1586610rOF.FRIENDS_FEED;
        FriendsFeedRedDotResponse friendsFeedRedDotResponse = this.friendsFeedResponse;
        linkedHashMap.put(enumC1586610rOF, friendsFeedRedDotResponse != null ? friendsFeedRedDotResponse.getAvatarList() : null);
        C1583300rIu.LIZ.getClass();
        RepostFeedConfig repostFeedConfigLIZ = C1583300rIu.LIZ();
        if (repostFeedConfigLIZ != null && (repostFeedConfigLIZ.bottomReminder & 4) == 4 && (repostFeedRedDotResponse = this.repostFeedResponse) != null && (avatarList = repostFeedRedDotResponse.getAvatarList()) != null) {
            linkedHashMap.put(EnumC1586610rOF.REPOST_FEED, avatarList);
        }
        return linkedHashMap;
    }

    public final ArrayList<UserNewContent> getNewMergedAvatarList() {
        RepostFeedRedDotResponse repostFeedRedDotResponse;
        ArrayList<RepostUserNewContent> avatarList;
        ArrayList<FriendsUserNewContent> avatarList2;
        ArrayList<UserNewContent> arrayList = new ArrayList<>();
        FriendsFeedRedDotResponse friendsFeedRedDotResponse = this.friendsFeedResponse;
        if (friendsFeedRedDotResponse != null && (avatarList2 = friendsFeedRedDotResponse.getAvatarList()) != null) {
            arrayList.addAll(avatarList2);
        }
        C1583300rIu.LIZ.getClass();
        RepostFeedConfig repostFeedConfigLIZ = C1583300rIu.LIZ();
        if (repostFeedConfigLIZ != null && (repostFeedConfigLIZ.bottomReminder & 4) == 4 && (repostFeedRedDotResponse = this.repostFeedResponse) != null && (avatarList = repostFeedRedDotResponse.getAvatarList()) != null) {
            arrayList.addAll(avatarList);
        }
        return arrayList;
    }

    public final int totalCount() {
        return tabCount("FRIENDS_FEED") + tabCount("REPOST_FEED");
    }

    public static final class RepostFeedRedDotResponse extends SocialFeedRedDotResponse<RepostUserNewContent> {

        @C09CT("new_content_users")
        public final ArrayList<RepostUserNewContent> avatarList;

        @C09CT("new_content_metas")
        public final ArrayList<ContentMetadata> metaList;

        @C09CT("tab_shown_status")
        public final boolean shouldShowTab;

        public RepostFeedRedDotResponse() {
            this(null, null, false);
        }

        @Override // com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse
        public ArrayList<RepostUserNewContent> getAvatarList() {
            return this.avatarList;
        }

        public final ArrayList<ContentMetadata> getMetaList() {
            return this.metaList;
        }

        public final boolean getShouldShowTab() {
            return this.shouldShowTab;
        }

        public RepostFeedRedDotResponse(ArrayList<RepostUserNewContent> arrayList, ArrayList<ContentMetadata> arrayList2, boolean z) {
            this.avatarList = arrayList;
            this.metaList = arrayList2;
            this.shouldShowTab = z;
        }
    }

    public final FriendsFeedRedDotResponse getFriendsFeedResponse() {
        return this.friendsFeedResponse;
    }

    public final RepostFeedRedDotResponse getRepostFeedResponse() {
        return this.repostFeedResponse;
    }

    public final int tabCount(String str) {
        RepostFeedRedDotResponse repostFeedRedDotResponse;
        if (Intrinsics.LJFF(str, "FRIENDS_FEED")) {
            FriendsFeedRedDotResponse friendsFeedRedDotResponse = this.friendsFeedResponse;
            if (friendsFeedRedDotResponse == null) {
                return 0;
            }
            return friendsFeedRedDotResponse.getNewContentCountForDisplay();
        }
        if (!Intrinsics.LJFF(str, "REPOST_FEED") || (repostFeedRedDotResponse = this.repostFeedResponse) == null) {
            return 0;
        }
        return repostFeedRedDotResponse.getRedDotCount();
    }

    public final int totalCount(String str) {
        return totalCount() - tabCount(str);
    }

    public NewContentResponse(FriendsFeedRedDotResponse friendsFeedRedDotResponse, RepostFeedRedDotResponse repostFeedRedDotResponse) {
        this.friendsFeedResponse = friendsFeedRedDotResponse;
        this.repostFeedResponse = repostFeedRedDotResponse;
    }
}
