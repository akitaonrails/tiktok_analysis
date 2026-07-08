package com.ss.ugc.live.sdk.message.data;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes18.dex */
public final class HistoryInfo {
    public String commentCursor = "";
    public int count;
    public boolean hasMore;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistoryInfo(commentCursor='");
        sbLIZ.append(this.commentCursor);
        sbLIZ.append("', hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", count=");
        sbLIZ.append(this.count);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getCommentCursor() {
        return this.commentCursor;
    }

    public final int getCount() {
        return this.count;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final void setCommentCursor(String str) {
        this.commentCursor = str;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }
}
