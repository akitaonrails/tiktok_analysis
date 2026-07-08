package com.ss.android.ugc.aweme.bulletin.db.modle;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentDBOverview {

    @C09CT("comments")
    public final List<BulletinCommentDB> comments;

    @C09CT("enable_comment")
    public final Boolean enableComment;

    @C09CT("total")
    public final Integer total;

    public BulletinCommentDBOverview() {
        this(null, null, null);
    }

    public BulletinCommentDBOverview(Boolean bool, List<BulletinCommentDB> list, Integer num) {
        this.enableComment = bool;
        this.comments = list;
        this.total = num;
    }
}
