package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSubConversationData implements Serializable {
    public static final int $stable = 8;

    @C09CT("conversation_id")
    public String conversationId;

    @C09CT("force")
    public boolean force;

    @C09CT("is_push_message")
    public boolean isPush;

    @C09CT("sub_conversation_id")
    public String subConversationId;

    @C09CT("message_id")
    public String unReadMsgId;

    public TakoSubConversationData() {
        this(null, null, false, null, false);
    }

    public final boolean isPush() {
        return this.isPush;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setForce(boolean z) {
        this.force = z;
    }

    public final void setPush(boolean z) {
        this.isPush = z;
    }

    public final void setSubConversationId(String str) {
        this.subConversationId = str;
    }

    public final void setUnReadMsgId(String str) {
        this.unReadMsgId = str;
    }

    public TakoSubConversationData(String str, String str2, boolean z, String str3, boolean z2) {
        this.conversationId = str;
        this.subConversationId = str2;
        this.isPush = z;
        this.unReadMsgId = str3;
        this.force = z2;
    }
}
