package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SMBKeywordReplyScenario {

    @C09CT("auto_reply")
    public ContentAuditStatus autoReply;

    @C09CT("keywords")
    public List<String> keywords = new ArrayList();

    @C09CT("msg_id_str")
    public String msgIdStr = "";
}
