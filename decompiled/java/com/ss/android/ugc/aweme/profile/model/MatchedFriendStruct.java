package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MatchedFriendStruct implements Serializable {

    @C09CT("video_items")
    public List<? extends Aweme> awemeList;
    public Integer awemeListSize;
    public Integer awemeListVideoCoverSize;

    @C09CT("external_recommend_reason")
    public ExternalRecommendReasonStruct externalRecommendReasonStruct;

    @C09CT("face_cover_num")
    public Integer faceCoverNum;

    @C09CT("friend_relation_type")
    public String friendRelationType;

    @C09CT("is_acquaintance")
    public Boolean isAcquaintance;

    @C09CT("is_new_joined")
    public Boolean isNewJoiner;

    @C09CT("is_new_maf")
    public Boolean isNewMaF;
    public Boolean isRecMore;

    @C09CT("label_type")
    public String labelType;

    @C09CT("mutual_struct")
    public MutualStruct mMutualStruct;

    @C09CT("rec_type")
    public String recType;

    @C09CT("recommend_reason")
    public String recommendReason;

    @C09CT("recommend_reason_starling")
    public String recommendReasonStarling;

    @C09CT("relation_type")
    public String relationType;

    @C09CT("repost_items")
    public List<? extends Aweme> repostAwemeList;

    @C09CT("school_mutual_struct")
    public SchoolMutualStruct schoolMutualStruct;

    @C09CT("social_info")
    public String socialInfo;

    @C09CT("social_ui_config")
    public int socialUIConfig;

    @C09CT("video_item_reason")
    public String videoItemReason;

    @C09CT("video_num_type")
    public String videoNumType;

    public MatchedFriendStruct() {
        this(null, null, null, null, null, "", null, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, Boolean.FALSE, 0, null, null, 0, 0, Boolean.FALSE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchedFriendStruct)) {
            return false;
        }
        MatchedFriendStruct matchedFriendStruct = (MatchedFriendStruct) obj;
        return Intrinsics.LJFF(this.recommendReason, matchedFriendStruct.recommendReason) && Intrinsics.LJFF(this.recType, matchedFriendStruct.recType) && Intrinsics.LJFF(this.relationType, matchedFriendStruct.relationType) && Intrinsics.LJFF(this.mMutualStruct, matchedFriendStruct.mMutualStruct) && Intrinsics.LJFF(this.schoolMutualStruct, matchedFriendStruct.schoolMutualStruct) && Intrinsics.LJFF(this.socialInfo, matchedFriendStruct.socialInfo) && Intrinsics.LJFF(this.externalRecommendReasonStruct, matchedFriendStruct.externalRecommendReasonStruct) && Intrinsics.LJFF(this.isNewMaF, matchedFriendStruct.isNewMaF) && Intrinsics.LJFF(this.isAcquaintance, matchedFriendStruct.isAcquaintance) && Intrinsics.LJFF(this.awemeList, matchedFriendStruct.awemeList) && Intrinsics.LJFF(this.repostAwemeList, matchedFriendStruct.repostAwemeList) && Intrinsics.LJFF(this.videoItemReason, matchedFriendStruct.videoItemReason) && Intrinsics.LJFF(this.faceCoverNum, matchedFriendStruct.faceCoverNum) && Intrinsics.LJFF(this.videoNumType, matchedFriendStruct.videoNumType) && Intrinsics.LJFF(this.recommendReasonStarling, matchedFriendStruct.recommendReasonStarling) && Intrinsics.LJFF(this.isNewJoiner, matchedFriendStruct.isNewJoiner) && this.socialUIConfig == matchedFriendStruct.socialUIConfig && Intrinsics.LJFF(this.friendRelationType, matchedFriendStruct.friendRelationType) && Intrinsics.LJFF(this.labelType, matchedFriendStruct.labelType) && Intrinsics.LJFF(this.awemeListSize, matchedFriendStruct.awemeListSize) && Intrinsics.LJFF(this.awemeListVideoCoverSize, matchedFriendStruct.awemeListVideoCoverSize) && Intrinsics.LJFF(this.isRecMore, matchedFriendStruct.isRecMore);
    }

    public int hashCode() {
        String str = this.recommendReason;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.recType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.relationType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MutualStruct mutualStruct = this.mMutualStruct;
        int iHashCode4 = (iHashCode3 + (mutualStruct == null ? 0 : mutualStruct.hashCode())) * 31;
        SchoolMutualStruct schoolMutualStruct = this.schoolMutualStruct;
        int iHashCode5 = (iHashCode4 + (schoolMutualStruct == null ? 0 : schoolMutualStruct.hashCode())) * 31;
        String str4 = this.socialInfo;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ExternalRecommendReasonStruct externalRecommendReasonStruct = this.externalRecommendReasonStruct;
        int iHashCode7 = (iHashCode6 + (externalRecommendReasonStruct == null ? 0 : externalRecommendReasonStruct.hashCode())) * 31;
        Boolean bool = this.isNewMaF;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAcquaintance;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<? extends Aweme> list = this.awemeList;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<? extends Aweme> list2 = this.repostAwemeList;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.videoItemReason;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.faceCoverNum;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.videoNumType;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.recommendReasonStarling;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool3 = this.isNewJoiner;
        int iHashCode16 = (((iHashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31) + this.socialUIConfig) * 31;
        String str8 = this.friendRelationType;
        int iHashCode17 = (iHashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.labelType;
        int iHashCode18 = (iHashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num2 = this.awemeListSize;
        int iHashCode19 = (iHashCode18 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.awemeListVideoCoverSize;
        int iHashCode20 = (iHashCode19 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool4 = this.isRecMore;
        return iHashCode20 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        return "MatchedFriendStruct(recommendReason=" + this.recommendReason + ", recType=" + this.recType + ", relationType=" + this.relationType + ", mMutualStruct=" + this.mMutualStruct + ", schoolMutualStruct=" + this.schoolMutualStruct + ", socialInfo=" + this.socialInfo + ", externalRecommendReasonStruct=" + this.externalRecommendReasonStruct + ", isNewMaF=" + this.isNewMaF + ", isAcquaintance=" + this.isAcquaintance + ", awemeList=" + this.awemeList + ", repostAwemeList=" + this.repostAwemeList + ", videoItemReason=" + this.videoItemReason + ", faceCoverNum=" + this.faceCoverNum + ", videoNumType=" + this.videoNumType + ", recommendReasonStarling=" + this.recommendReasonStarling + ", isNewJoiner=" + this.isNewJoiner + ", socialUIConfig=" + this.socialUIConfig + ", friendRelationType=" + this.friendRelationType + ", labelType=" + this.labelType + ", awemeListSize=" + this.awemeListSize + ", awemeListVideoCoverSize=" + this.awemeListVideoCoverSize + ", isRecMore=" + this.isRecMore + ')';
    }

    public final Boolean isAcquaintance() {
        return this.isAcquaintance;
    }

    public final Boolean isNewJoiner() {
        return this.isNewJoiner;
    }

    public final Boolean isNewMaF() {
        return this.isNewMaF;
    }

    public final Boolean isRecMore() {
        return this.isRecMore;
    }

    public final void setAwemeList(List<? extends Aweme> list) {
        this.awemeList = list;
    }

    public final void setAwemeListSize(Integer num) {
        this.awemeListSize = num;
    }

    public final void setAwemeListVideoCoverSize(Integer num) {
        this.awemeListVideoCoverSize = num;
    }

    public final void setExternalRecommendReasonStruct(ExternalRecommendReasonStruct externalRecommendReasonStruct) {
        this.externalRecommendReasonStruct = externalRecommendReasonStruct;
    }

    public final void setMMutualStruct(MutualStruct mutualStruct) {
        this.mMutualStruct = mutualStruct;
    }

    public final void setNewMaF(Boolean bool) {
        this.isNewMaF = bool;
    }

    public final void setRecMore(Boolean bool) {
        this.isRecMore = bool;
    }

    public final void setRecType(String str) {
        this.recType = str;
    }

    public final void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public final void setRelationType(String str) {
        this.relationType = str;
    }

    public final void setRepostAwemeList(List<? extends Aweme> list) {
        this.repostAwemeList = list;
    }

    public MatchedFriendStruct(String str, String str2, String str3, MutualStruct mutualStruct, SchoolMutualStruct schoolMutualStruct, String str4, ExternalRecommendReasonStruct externalRecommendReasonStruct, Boolean bool, Boolean bool2, List<? extends Aweme> list, List<? extends Aweme> list2, String str5, Integer num, String str6, String str7, Boolean bool3, int i, String str8, String str9, Integer num2, Integer num3, Boolean bool4) {
        this.recommendReason = str;
        this.recType = str2;
        this.relationType = str3;
        this.mMutualStruct = mutualStruct;
        this.schoolMutualStruct = schoolMutualStruct;
        this.socialInfo = str4;
        this.externalRecommendReasonStruct = externalRecommendReasonStruct;
        this.isNewMaF = bool;
        this.isAcquaintance = bool2;
        this.awemeList = list;
        this.repostAwemeList = list2;
        this.videoItemReason = str5;
        this.faceCoverNum = num;
        this.videoNumType = str6;
        this.recommendReasonStarling = str7;
        this.isNewJoiner = bool3;
        this.socialUIConfig = i;
        this.friendRelationType = str8;
        this.labelType = str9;
        this.awemeListSize = num2;
        this.awemeListVideoCoverSize = num3;
        this.isRecMore = bool4;
    }
}
