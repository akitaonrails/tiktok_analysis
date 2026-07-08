package com.ss.android.ugc.aweme.feed.model.upvote;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvoteReplyInfo implements Serializable {

    @C09CT("repost_comment_next_cursor")
    public final long nextCursor;

    @C09CT("repost_comment")
    public final List<RepostReplyStruct> repostReply;

    @C09CT("repost_comment_count")
    public final long totalReplyCount;

    public UpvoteReplyInfo() {
        this(null, 0L, 0L);
    }

    public int hashCode() {
        List<RepostReplyStruct> list = this.repostReply;
        return ((((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Y2(this.nextCursor)) * 31) + C786410Ut5.Y2(this.totalReplyCount);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpvoteReplyInfo(repostReply=");
        sbLIZ.append(this.repostReply);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", totalReplyCount=");
        sbLIZ.append(this.totalReplyCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UpvoteReplyInfo(List<RepostReplyStruct> list, long j, long j2) {
        this.repostReply = list;
        this.nextCursor = j;
        this.totalReplyCount = j2;
    }
}
