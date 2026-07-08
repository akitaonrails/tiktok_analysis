package com.ss.android.ugc.now.interaction.model;

import X.C09CT;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentItemList extends BaseCommentResponse {
    public static final int $stable = 8;

    @C09CT("cursor")
    public long cursor;

    @C09CT("is_downgrade")
    public boolean isDowngrade;

    @C09CT("has_more")
    public int isHasMore;

    @C09CT("comments")
    public List<? extends Comment> items;

    @C09CT("total")
    public long total;

    /* JADX INFO: renamed from: isHasMore, reason: collision with other method in class */
    public final boolean m350isHasMore() {
        return this.isHasMore == 1;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final List<Comment> getItems() {
        return this.items;
    }

    public final long getTotal() {
        return this.total;
    }

    public final boolean isDowngrade() {
        return this.isDowngrade;
    }

    public final int isHasMore() {
        return this.isHasMore;
    }

    public final void setCursor(long j) {
        this.cursor = j;
    }

    public final void setDowngrade(boolean z) {
        this.isDowngrade = z;
    }

    public final void setHasMore(int i) {
        this.isHasMore = i;
    }

    public final void setItems(List<? extends Comment> list) {
        this.items = list;
    }

    public final void setTotal(long j) {
        this.total = j;
    }
}
