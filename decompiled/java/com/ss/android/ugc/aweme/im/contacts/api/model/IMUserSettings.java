package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class IMUserSettings {

    @C09CT("chat_bubble_id")
    public Long chatBubbleId;

    public IMUserSettings() {
        this(null);
    }

    public IMUserSettings(Long l) {
        this.chatBubbleId = l;
    }
}
