package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class SMBChatPromptTemplate {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("prompt")
    public String prompt = "";

    @C09CT("message")
    public String message = "";
}
