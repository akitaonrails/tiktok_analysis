package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class StarCommentPushMessage extends AbstractC1136060ffY {

    @C09CT("current")
    public StarCommentMessage current;

    @C09CT("next")
    public StarCommentMessage next;

    @C09CT("queue_version")
    public int queueVersion;

    public StarCommentPushMessage() {
        this.type = C001A.STAR_COMMENT_PUSH_MESSAGE;
    }
}
