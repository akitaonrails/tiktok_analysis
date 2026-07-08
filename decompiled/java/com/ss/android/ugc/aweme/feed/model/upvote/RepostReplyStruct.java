package com.ss.android.ugc.aweme.feed.model.upvote;

import X.C09CT;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostReplyStruct implements Serializable {
    public UpvoteCacheState cacheState;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("digg_count")
    public Integer diggCount;
    public String fakeId;
    public Boolean isServerExpand;

    @C09CT("cid")
    public String replyId;

    @C09CT("reply_to_comment_id")
    public final String replyToCommentId;

    @C09CT("reply_to_userid")
    public final String replyToUserid;

    @C09CT("reply_to_username")
    public final String replyToUsername;

    @C09CT("repost_id")
    public final String repostId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;

    @C09CT("text")
    public String text;

    @C09CT("text_extra")
    public List<? extends TextExtraStruct> textExtra;

    @C09CT("user")
    public final User user;

    @C09CT("user_digged")
    public Integer userDigged;

    public final RepostReplyStruct copy(String str, String str2, String str3, Long l, Integer num, Integer num2, User user, Integer num3, String str4, String str5, String str6, List<? extends TextExtraStruct> list, String str7, Boolean bool, UpvoteCacheState upvoteCacheState) {
        return new RepostReplyStruct(str, str2, str3, l, num, num2, user, num3, str4, str5, str6, list, str7, bool, upvoteCacheState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepostReplyStruct)) {
            return false;
        }
        RepostReplyStruct repostReplyStruct = (RepostReplyStruct) obj;
        return Intrinsics.LJFF(this.replyId, repostReplyStruct.replyId) && Intrinsics.LJFF(this.text, repostReplyStruct.text) && Intrinsics.LJFF(this.repostId, repostReplyStruct.repostId) && Intrinsics.LJFF(this.createTime, repostReplyStruct.createTime) && Intrinsics.LJFF(this.diggCount, repostReplyStruct.diggCount) && Intrinsics.LJFF(this.status, repostReplyStruct.status) && Intrinsics.LJFF(this.user, repostReplyStruct.user) && Intrinsics.LJFF(this.userDigged, repostReplyStruct.userDigged) && Intrinsics.LJFF(this.replyToCommentId, repostReplyStruct.replyToCommentId) && Intrinsics.LJFF(this.replyToUsername, repostReplyStruct.replyToUsername) && Intrinsics.LJFF(this.replyToUserid, repostReplyStruct.replyToUserid) && Intrinsics.LJFF(this.textExtra, repostReplyStruct.textExtra) && Intrinsics.LJFF(this.fakeId, repostReplyStruct.fakeId) && Intrinsics.LJFF(this.isServerExpand, repostReplyStruct.isServerExpand) && this.cacheState == repostReplyStruct.cacheState;
    }

    public int hashCode() {
        String str = this.replyId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.repostId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.createTime;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.diggCount;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.status;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        User user = this.user;
        int iHashCode7 = (iHashCode6 + (user == null ? 0 : user.hashCode())) * 31;
        Integer num3 = this.userDigged;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.replyToCommentId;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.replyToUsername;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.replyToUserid;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<? extends TextExtraStruct> list = this.textExtra;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.fakeId;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.isServerExpand;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        UpvoteCacheState upvoteCacheState = this.cacheState;
        return iHashCode14 + (upvoteCacheState != null ? upvoteCacheState.hashCode() : 0);
    }

    public String toString() {
        return "RepostReplyStruct(replyId=" + this.replyId + ", text=" + this.text + ", repostId=" + this.repostId + ", createTime=" + this.createTime + ", diggCount=" + this.diggCount + ", status=" + this.status + ", user=" + this.user + ", userDigged=" + this.userDigged + ", replyToCommentId=" + this.replyToCommentId + ", replyToUsername=" + this.replyToUsername + ", replyToUserid=" + this.replyToUserid + ", textExtra=" + this.textExtra + ", fakeId=" + this.fakeId + ", isServerExpand=" + this.isServerExpand + ", cacheState=" + this.cacheState + ')';
    }

    public final Boolean isServerExpand() {
        return this.isServerExpand;
    }

    public final void setCacheState(UpvoteCacheState upvoteCacheState) {
        this.cacheState = upvoteCacheState;
    }

    public final void setDiggCount(Integer num) {
        this.diggCount = num;
    }

    public final void setFakeId(String str) {
        this.fakeId = str;
    }

    public final void setReplyId(String str) {
        this.replyId = str;
    }

    public final void setServerExpand(Boolean bool) {
        this.isServerExpand = bool;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTextExtra(List<? extends TextExtraStruct> list) {
        this.textExtra = list;
    }

    public final void setUserDigged(Integer num) {
        this.userDigged = num;
    }

    public final void updateWhenPublishSuccess(RepostReplyStruct repostReplyStruct) {
        this.replyId = repostReplyStruct.replyId;
        this.text = repostReplyStruct.text;
        this.status = repostReplyStruct.status;
        this.cacheState = repostReplyStruct.cacheState;
    }

    public RepostReplyStruct(String str, String str2, String str3, Long l, Integer num, Integer num2, User user, Integer num3, String str4, String str5, String str6, List<? extends TextExtraStruct> list, String str7, Boolean bool, UpvoteCacheState upvoteCacheState) {
        this.replyId = str;
        this.text = str2;
        this.repostId = str3;
        this.createTime = l;
        this.diggCount = num;
        this.status = num2;
        this.user = user;
        this.userDigged = num3;
        this.replyToCommentId = str4;
        this.replyToUsername = str5;
        this.replyToUserid = str6;
        this.textExtra = list;
        this.fakeId = str7;
        this.isServerExpand = bool;
        this.cacheState = upvoteCacheState;
    }
}
