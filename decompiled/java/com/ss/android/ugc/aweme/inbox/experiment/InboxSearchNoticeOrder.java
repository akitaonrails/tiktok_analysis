package com.ss.android.ugc.aweme.inbox.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchNoticeOrder {

    @C09CT("comments")
    public int commentsPriority;

    @C09CT("mentions")
    public int mentionsPriority = 1;

    public final int getCommentsPriority() {
        return this.commentsPriority;
    }

    public final int getMentionsPriority() {
        return this.mentionsPriority;
    }

    public final void setCommentsPriority(int i) {
        this.commentsPriority = i;
    }

    public final void setMentionsPriority(int i) {
        this.mentionsPriority = i;
    }
}
