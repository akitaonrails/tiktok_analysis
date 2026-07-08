package com.ss.android.ugc.aweme.im.b2c.replies.api;

import X.C09CT;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReplyContent;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReplyText;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes28.dex */
public final class QuickReplySaveRequest {

    @C09CT("content")
    public final IMQuickReplyContent content;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("type")
    public final int type;

    @C09CT("biz_uid")
    public final long uid;

    public QuickReplySaveRequest() {
        this(0L, "", 0, new IMQuickReplyContent(new IMQuickReplyText("")));
    }

    public QuickReplySaveRequest(long j, String str, int i, IMQuickReplyContent iMQuickReplyContent) {
        this.uid = j;
        this.id = str;
        this.type = i;
        this.content = iMQuickReplyContent;
    }
}
