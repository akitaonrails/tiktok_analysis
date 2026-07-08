package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class StickerInboxNotificationRequest {

    @C09CT("create_source")
    public final int createSource;

    public StickerInboxNotificationRequest() {
        this(0);
    }

    public StickerInboxNotificationRequest(int i) {
        this.createSource = i;
    }
}
