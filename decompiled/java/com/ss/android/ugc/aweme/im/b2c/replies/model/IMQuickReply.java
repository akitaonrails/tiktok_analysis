package com.ss.android.ugc.aweme.im.b2c.replies.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class IMQuickReply {

    @C09CT("content")
    public final IMQuickReplyContent content;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("is_default")
    public final boolean f70default;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("type")
    public final int type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMQuickReply)) {
            return false;
        }
        IMQuickReply iMQuickReply = (IMQuickReply) obj;
        return Intrinsics.LJFF(this.id, iMQuickReply.id) && this.type == iMQuickReply.type && Intrinsics.LJFF(this.content, iMQuickReply.content) && this.f70default == iMQuickReply.f70default;
    }

    public IMQuickReply() {
        this("", 0, new IMQuickReplyContent(new IMQuickReplyText("")), false);
    }

    public IMQuickReply(String str, int i, IMQuickReplyContent iMQuickReplyContent, boolean z) {
        this.id = str;
        this.type = i;
        this.content = iMQuickReplyContent;
        this.f70default = z;
    }
}
