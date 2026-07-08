package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class IMInfo implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("conversation_info")
    public ContentIMConversation contentIMConversation;

    @C09CT("display_quick_reply_box")
    public boolean displayQuickReplyBox;

    @C09CT("rec_type")
    public int recType;

    @C09CT("from")
    public User user;

    public static final class Companion {
    }

    public IMInfo() {
        this(false, null, 0, null);
    }

    public IMInfo(boolean z, User user, int i, ContentIMConversation contentIMConversation) {
        this.displayQuickReplyBox = z;
        this.user = user;
        this.recType = i;
        this.contentIMConversation = contentIMConversation;
    }
}
