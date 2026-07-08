package com.bytedance.android.livesdk.model.message.linker.cancel_message;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class LinkerCancelContent {

    @C09CT("cancel_type")
    public int cancelType;

    @C09CT("to_user_id")
    public long inviteeUid;

    @C09CT("from_user_id")
    public long inviterUid;
}
