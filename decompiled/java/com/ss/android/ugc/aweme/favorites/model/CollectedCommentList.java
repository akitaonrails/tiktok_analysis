package com.ss.android.ugc.aweme.favorites.model;

import X.C09CT;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class CollectedCommentList {

    @C09CT("cursor")
    public int cursor;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("invalid_count")
    public int invalidCount;

    @C09CT("comment_list")
    public List<Comment> items;
}
