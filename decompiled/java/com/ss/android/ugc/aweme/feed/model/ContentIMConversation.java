package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentIMConversation implements Serializable {

    @C09CT("conversation_id")
    public String conversationId;

    @C09CT("conversation_type")
    public int conversationType;

    @C09CT("group_avatar_url")
    public String groupAvatarUrl;

    @C09CT("group_name")
    public String groupName;

    public ContentIMConversation() {
        this(null, null, null, 0);
    }

    public ContentIMConversation(String str, String str2, String str3, int i) {
        this.conversationId = str;
        this.groupName = str2;
        this.groupAvatarUrl = str3;
        this.conversationType = i;
    }
}
