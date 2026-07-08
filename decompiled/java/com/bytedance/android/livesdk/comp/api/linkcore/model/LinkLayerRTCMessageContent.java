package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LinkLayerRTCMessageContent {

    @C09CT("content_id")
    public final String contentId;

    @C09CT("content_type")
    public final int contentType;

    @C09CT("position")
    public final int position;

    public LinkLayerRTCMessageContent() {
        this("", 0, -1);
    }

    public LinkLayerRTCMessageContent(String str, int i, int i2) {
        this.contentId = str;
        this.contentType = i;
        this.position = i2;
    }
}
