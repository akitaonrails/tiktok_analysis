package com.ss.android.ugc.aweme.feed.model.upvote;

import X.C09CT;
import X.C13BV;
import X.C13LQ;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.im.IMAIMojiSticker;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvoteStruct implements Serializable {

    @C09CT("aimoji_sticker")
    public IMAIMojiSticker aiMojiSticker;

    @C09CT("bubble_hidden")
    public final boolean bubbleHidden;
    public UpvoteCacheState cacheState;

    @C09CT("carrier_id")
    public final String carrierId;

    @C09CT("carrier_type")
    public final int carrierType;

    @C09CT("comment_repost")
    public final CommentInfoStruct commentInfo;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("is_high_quality_maf_recommend")
    public final boolean isRecommendMaf;

    @C09CT("user_liked")
    public boolean isUserLiked;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("like_count")
    public int likeCount;
    public PublishFrom publishFrom;

    @C09CT("repost_comment_info")
    public final UpvoteReplyInfo replyInfo;

    @C09CT("repost_item_source")
    public final int repostItemSource;

    @C09CT("repost_relation_type")
    public final int repostRelationType;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("text")
    public String text;

    @C09CT("text_extra")
    public List<? extends TextExtraStruct> textExtra;

    @C09CT("text_id")
    public final String textId;

    @C09CT("total")
    public final int total;

    @C09CT("unread_gids")
    public List<String> unReadAids;

    @C09CT("comment_id")
    public final String upvoteId;

    @C09CT("upvote_label_type")
    public final int upvoteLabelType;

    @C09CT("user")
    public final User user;

    @C09CT("user_list")
    public final List<User> userList;

    public final UpvoteStruct copy(String str, String str2, String str3, long j, int i, User user, int i2, List<? extends User> list, int i3, boolean z, int i4, boolean z2, String str4, List<String> list2, List<? extends TextExtraStruct> list3, IMAIMojiSticker iMAIMojiSticker, boolean z3, UpvoteReplyInfo upvoteReplyInfo, int i5, int i6, int i7, String str5, CommentInfoStruct commentInfoStruct, UpvoteCacheState upvoteCacheState, PublishFrom publishFrom) {
        return new UpvoteStruct(str, str2, str3, j, i, user, i2, list, i3, z, i4, z2, str4, list2, list3, iMAIMojiSticker, z3, upvoteReplyInfo, i5, i6, i7, str5, commentInfoStruct, upvoteCacheState, publishFrom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpvoteStruct)) {
            return false;
        }
        UpvoteStruct upvoteStruct = (UpvoteStruct) obj;
        return Intrinsics.LJFF(this.upvoteId, upvoteStruct.upvoteId) && Intrinsics.LJFF(this.textId, upvoteStruct.textId) && Intrinsics.LJFF(this.itemId, upvoteStruct.itemId) && this.createTime == upvoteStruct.createTime && this.status == upvoteStruct.status && Intrinsics.LJFF(this.user, upvoteStruct.user) && this.upvoteLabelType == upvoteStruct.upvoteLabelType && Intrinsics.LJFF(this.userList, upvoteStruct.userList) && this.total == upvoteStruct.total && this.bubbleHidden == upvoteStruct.bubbleHidden && this.likeCount == upvoteStruct.likeCount && this.isUserLiked == upvoteStruct.isUserLiked && Intrinsics.LJFF(this.text, upvoteStruct.text) && Intrinsics.LJFF(this.unReadAids, upvoteStruct.unReadAids) && Intrinsics.LJFF(this.textExtra, upvoteStruct.textExtra) && Intrinsics.LJFF(this.aiMojiSticker, upvoteStruct.aiMojiSticker) && this.isRecommendMaf == upvoteStruct.isRecommendMaf && Intrinsics.LJFF(this.replyInfo, upvoteStruct.replyInfo) && this.repostRelationType == upvoteStruct.repostRelationType && this.repostItemSource == upvoteStruct.repostItemSource && this.carrierType == upvoteStruct.carrierType && Intrinsics.LJFF(this.carrierId, upvoteStruct.carrierId) && Intrinsics.LJFF(this.commentInfo, upvoteStruct.commentInfo) && this.cacheState == upvoteStruct.cacheState && this.publishFrom == upvoteStruct.publishFrom;
    }

    public int hashCode() {
        int iHashCode = this.upvoteId.hashCode() * 31;
        String str = this.textId;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.itemId.hashCode()) * 31) + C786410Ut5.Y2(this.createTime)) * 31) + this.status) * 31;
        User user = this.user;
        int iHashCode3 = (((iHashCode2 + (user == null ? 0 : user.hashCode())) * 31) + this.upvoteLabelType) * 31;
        List<User> list = this.userList;
        int iHashCode4 = (((((((((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + this.total) * 31) + C786410Ut5.Z2(this.bubbleHidden)) * 31) + this.likeCount) * 31) + C786410Ut5.Z2(this.isUserLiked)) * 31;
        String str2 = this.text;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list2 = this.unReadAids;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<? extends TextExtraStruct> list3 = this.textExtra;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        IMAIMojiSticker iMAIMojiSticker = this.aiMojiSticker;
        int iHashCode8 = (((iHashCode7 + (iMAIMojiSticker == null ? 0 : iMAIMojiSticker.hashCode())) * 31) + C786410Ut5.Z2(this.isRecommendMaf)) * 31;
        UpvoteReplyInfo upvoteReplyInfo = this.replyInfo;
        int iHashCode9 = (((((((iHashCode8 + (upvoteReplyInfo == null ? 0 : upvoteReplyInfo.hashCode())) * 31) + this.repostRelationType) * 31) + this.repostItemSource) * 31) + this.carrierType) * 31;
        String str3 = this.carrierId;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CommentInfoStruct commentInfoStruct = this.commentInfo;
        int iHashCode11 = (iHashCode10 + (commentInfoStruct == null ? 0 : commentInfoStruct.hashCode())) * 31;
        UpvoteCacheState upvoteCacheState = this.cacheState;
        int iHashCode12 = (iHashCode11 + (upvoteCacheState == null ? 0 : upvoteCacheState.hashCode())) * 31;
        PublishFrom publishFrom = this.publishFrom;
        return iHashCode12 + (publishFrom != null ? publishFrom.hashCode() : 0);
    }

    public final boolean isFake() {
        return C13LQ.LJJIJIIJI(this.cacheState, new UpvoteCacheState[]{UpvoteCacheState.PRE_PUBLISH, UpvoteCacheState.PUBLISH_FAILED}) >= 0;
    }

    public String toString() {
        return "UpvoteStruct(upvoteId=" + this.upvoteId + ", textId=" + this.textId + ", itemId=" + this.itemId + ", createTime=" + this.createTime + ", status=" + this.status + ", user=" + this.user + ", upvoteLabelType=" + this.upvoteLabelType + ", userList=" + this.userList + ", total=" + this.total + ", bubbleHidden=" + this.bubbleHidden + ", likeCount=" + this.likeCount + ", isUserLiked=" + this.isUserLiked + ", text=" + this.text + ", unReadAids=" + this.unReadAids + ", textExtra=" + this.textExtra + ", aiMojiSticker=" + this.aiMojiSticker + ", isRecommendMaf=" + this.isRecommendMaf + ", replyInfo=" + this.replyInfo + ", repostRelationType=" + this.repostRelationType + ", repostItemSource=" + this.repostItemSource + ", carrierType=" + this.carrierType + ", carrierId=" + this.carrierId + ", commentInfo=" + this.commentInfo + ", cacheState=" + this.cacheState + ", publishFrom=" + this.publishFrom + ')';
    }

    public final boolean isPublished() {
        return this.cacheState == null;
    }

    public final boolean isRecommendMaf() {
        return this.isRecommendMaf;
    }

    public final boolean isUserLiked() {
        return this.isUserLiked;
    }

    public final void setAiMojiSticker(IMAIMojiSticker iMAIMojiSticker) {
        this.aiMojiSticker = iMAIMojiSticker;
    }

    public final void setCacheState(UpvoteCacheState upvoteCacheState) {
        this.cacheState = upvoteCacheState;
    }

    public final void setLikeCount(int i) {
        this.likeCount = i;
    }

    public final void setPublishFrom(PublishFrom publishFrom) {
        this.publishFrom = publishFrom;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTextExtra(List<? extends TextExtraStruct> list) {
        this.textExtra = list;
    }

    public final void setUnReadAids(List<String> list) {
        this.unReadAids = list;
    }

    public final void setUserLiked(boolean z) {
        this.isUserLiked = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpvoteStruct(String str, String str2, String str3, long j, int i, User user, int i2, List<? extends User> list, int i3, boolean z, int i4, boolean z2, String str4, List<String> list2, List<? extends TextExtraStruct> list3, IMAIMojiSticker iMAIMojiSticker, boolean z3, UpvoteReplyInfo upvoteReplyInfo, int i5, int i6, int i7, String str5, CommentInfoStruct commentInfoStruct, UpvoteCacheState upvoteCacheState, PublishFrom publishFrom) {
        this.upvoteId = str;
        this.textId = str2;
        this.itemId = str3;
        this.createTime = j;
        this.status = i;
        this.user = user;
        this.upvoteLabelType = i2;
        this.userList = list;
        this.total = i3;
        this.bubbleHidden = z;
        this.likeCount = i4;
        this.isUserLiked = z2;
        this.text = str4;
        this.unReadAids = list2;
        this.textExtra = list3;
        this.aiMojiSticker = iMAIMojiSticker;
        this.isRecommendMaf = z3;
        this.replyInfo = upvoteReplyInfo;
        this.repostRelationType = i5;
        this.repostItemSource = i6;
        this.carrierType = i7;
        this.carrierId = str5;
        this.commentInfo = commentInfoStruct;
        this.cacheState = upvoteCacheState;
        this.publishFrom = publishFrom;
    }

    public UpvoteStruct(String str, String str2, String str3, long j, int i, User user, int i2, List list, int i3, boolean z, int i4, boolean z2, String str4, List list2, List list3, IMAIMojiSticker iMAIMojiSticker, boolean z3, UpvoteReplyInfo upvoteReplyInfo, int i5, int i6, int i7, String str5, CommentInfoStruct commentInfoStruct, UpvoteCacheState upvoteCacheState, PublishFrom publishFrom, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) == 0 ? str2 : "", str3, (i8 & 8) != 0 ? 0L : j, (i8 & 16) != 0 ? 0 : i, (i8 & 32) != 0 ? null : user, (i8 & 64) != 0 ? 0 : i2, (i8 & 128) != 0 ? C13BV.INSTANCE : list, (i8 & 256) != 0 ? 0 : i3, (i8 & 512) != 0 ? false : z, (i8 & 1024) != 0 ? 0 : i4, (i8 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z2, (i8 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str4, (i8 & 8192) != 0 ? null : list2, (i8 & 16384) != 0 ? null : list3, (32768 & i8) != 0 ? null : iMAIMojiSticker, (65536 & i8) != 0 ? false : z3, (131072 & i8) != 0 ? null : upvoteReplyInfo, (262144 & i8) != 0 ? 0 : i5, (524288 & i8) != 0 ? 0 : i6, (1048576 & i8) != 0 ? 0 : i7, (2097152 & i8) != 0 ? null : str5, (4194304 & i8) != 0 ? null : commentInfoStruct, (8388608 & i8) == 0 ? upvoteCacheState : null, (i8 & 16777216) != 0 ? PublishFrom.DEFAULT : publishFrom);
    }
}
