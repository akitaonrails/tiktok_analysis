package com.bytedance.android.livesdk.model.message;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public class LinkMicSignal {

    @C09CT("send_uid")
    public String senderInteractId;

    @C09CT("send_id")
    public String senderUserId;

    @C09CT("target_uid")
    public String targetInteractId;

    @C09CT("target_id")
    public String targetUserId;

    @C09CT("type")
    public int type;

    @C09CT("ver")
    public String version = "1";

    @C09CT("priority")
    public int priority = 1;
}
