package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentOverview {

    @C09CT("comments")
    public final List<BulletinCommentDetail> comments;

    @C09CT("enable_comment")
    public final Boolean enableComment;

    @C09CT("total")
    public final Integer total;

    public BulletinCommentOverview() {
        this(null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCommentOverview(enableComment=");
        sbLIZ.append(this.enableComment);
        sbLIZ.append(", comments=");
        sbLIZ.append(this.comments);
        sbLIZ.append(", total=");
        sbLIZ.append(this.total);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinCommentOverview(Boolean bool, List<BulletinCommentDetail> list, Integer num) {
        this.enableComment = bool;
        this.comments = list;
        this.total = num;
    }
}
