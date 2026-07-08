package com.ss.android.ugc.aweme.friendstab.repo;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostCommentStruct {

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("repost_comment_count")
    public final Integer repostCommentCount;

    @C09CT("repost_comment")
    public List<RepostReplyStruct> repostCommentList;

    public RepostCommentStruct() {
        this(null, null, null);
    }

    public final int hashCode() {
        List<RepostReplyStruct> list = this.repostCommentList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.repostCommentCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.hasMore;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostCommentStruct(repostCommentList=");
        sbLIZ.append(this.repostCommentList);
        sbLIZ.append(", repostCommentCount=");
        sbLIZ.append(this.repostCommentCount);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RepostCommentStruct(List<RepostReplyStruct> list, Integer num, Boolean bool) {
        this.repostCommentList = list;
        this.repostCommentCount = num;
        this.hasMore = bool;
    }
}
