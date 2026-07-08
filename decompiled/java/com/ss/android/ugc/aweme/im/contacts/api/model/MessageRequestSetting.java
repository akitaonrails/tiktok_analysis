package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestSetting {

    @C09CT("prioritize_message_requests")
    public final boolean prioritySettingState;

    public MessageRequestSetting() {
        this(false);
    }

    public MessageRequestSetting(boolean z) {
        this.prioritySettingState = z;
    }
}
