package com.bytedance.android.livesdk.comp.api.linkcore.model;

/* JADX INFO: loaded from: classes36.dex */
public final class ResourceContent {
    public String contentLinkMicId;
    public int contentType;
    public String streamId;

    public final void setContentLinkMicId(String str) {
        this.contentLinkMicId = str;
    }

    public final void setContentType(int i) {
        this.contentType = i;
    }

    public final void setStreamId(String str) {
        this.streamId = str;
    }

    public ResourceContent(String str, int i, String str2) {
        this.streamId = str;
        this.contentType = i;
        this.contentLinkMicId = str2;
    }
}
