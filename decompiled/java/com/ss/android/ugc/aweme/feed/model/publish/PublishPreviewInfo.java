package com.ss.android.ugc.aweme.feed.model.publish;

import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class PublishPreviewInfo implements Serializable {
    public String contentSource;
    public String creationId;
    public boolean inPublishing;
    public int progress;
    public final String publishId;
    public PublishStatus publishStatus;

    public PublishPreviewInfo() {
        this(false, 0, PublishStatus.DEFAULT, "", "", "");
    }

    public final void setContentSource(String str) {
        this.contentSource = str;
    }

    public final void setCreationId(String str) {
        this.creationId = str;
    }

    public final void setInPublishing(boolean z) {
        this.inPublishing = z;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setPublishStatus(PublishStatus publishStatus) {
        this.publishStatus = publishStatus;
    }

    public PublishPreviewInfo(boolean z, int i, PublishStatus publishStatus, String str, String str2, String str3) {
        this.inPublishing = z;
        this.progress = i;
        this.publishStatus = publishStatus;
        this.creationId = str;
        this.contentSource = str2;
        this.publishId = str3;
    }
}
