package com.ss.android.ugc.aweme.friendstab.repo;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3RepostModel {
    public final Set<String> LIZ;

    @C09CT("is_viewer_liked")
    public Integer isViewerLiked;

    @C09CT("like_count")
    public Integer likeCount;

    @C09CT("real_repost_id")
    public final String realRepostId;

    @C09CT("repost_comment")
    public RepostCommentStruct repostComments;

    @C09CT("repost_id")
    public final String repostId;

    @C09CT("repost_text")
    public final String repostText;

    @C09CT("text_extra")
    public final List<RepostTextExtra> repostTextExtra;

    @C09CT("repost_time")
    public final Long repostTime;

    @C09CT("reposted_aweme")
    public final Aweme repostedAweme;

    @C09CT("reposter")
    public final User reposter;

    public FriendsV3RepostModel() {
        this(null, null, null, null, null, null, null, null, null, null, new LinkedHashSet());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsV3RepostModel)) {
            return false;
        }
        FriendsV3RepostModel friendsV3RepostModel = (FriendsV3RepostModel) obj;
        return Intrinsics.LJFF(this.repostId, friendsV3RepostModel.repostId) && Intrinsics.LJFF(this.repostedAweme, friendsV3RepostModel.repostedAweme) && Intrinsics.LJFF(this.reposter, friendsV3RepostModel.reposter) && Intrinsics.LJFF(this.repostTime, friendsV3RepostModel.repostTime) && Intrinsics.LJFF(this.repostText, friendsV3RepostModel.repostText) && Intrinsics.LJFF(this.repostTextExtra, friendsV3RepostModel.repostTextExtra) && Intrinsics.LJFF(this.realRepostId, friendsV3RepostModel.realRepostId) && Intrinsics.LJFF(this.likeCount, friendsV3RepostModel.likeCount) && Intrinsics.LJFF(this.isViewerLiked, friendsV3RepostModel.isViewerLiked) && Intrinsics.LJFF(this.repostComments, friendsV3RepostModel.repostComments) && Intrinsics.LJFF(this.LIZ, friendsV3RepostModel.LIZ);
    }

    public final int hashCode() {
        String str = this.repostId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Aweme aweme = this.repostedAweme;
        int iHashCode2 = (iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        User user = this.reposter;
        int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        Long l = this.repostTime;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.repostText;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<RepostTextExtra> list = this.repostTextExtra;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.realRepostId;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.likeCount;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.isViewerLiked;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        RepostCommentStruct repostCommentStruct = this.repostComments;
        return ((iHashCode9 + (repostCommentStruct != null ? repostCommentStruct.hashCode() : 0)) * 31) + this.LIZ.hashCode();
    }

    public final String toString() {
        return "FriendsV3RepostModel(repostId=" + this.repostId + ", repostedAweme=" + this.repostedAweme + ", reposter=" + this.reposter + ", repostTime=" + this.repostTime + ", repostText=" + this.repostText + ", repostTextExtra=" + this.repostTextExtra + ", realRepostId=" + this.realRepostId + ", likeCount=" + this.likeCount + ", isViewerLiked=" + this.isViewerLiked + ", repostComments=" + this.repostComments + ", mobRecords=" + this.LIZ + ')';
    }

    public FriendsV3RepostModel(String str, Aweme aweme, User user, Long l, String str2, List<RepostTextExtra> list, String str3, Integer num, Integer num2, RepostCommentStruct repostCommentStruct, Set<String> set) {
        this.repostId = str;
        this.repostedAweme = aweme;
        this.reposter = user;
        this.repostTime = l;
        this.repostText = str2;
        this.repostTextExtra = list;
        this.realRepostId = str3;
        this.likeCount = num;
        this.isViewerLiked = num2;
        this.repostComments = repostCommentStruct;
        this.LIZ = set;
    }
}
