package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public final class PaidEventPreview implements Serializable {

    @C09CT("allow_preview")
    public Long allowPreview;

    @C09CT("allow_preview_time")
    public Long allowPreviewTime;

    public PaidEventPreview() {
        this(null, null);
    }

    public final void setAllowPreview(Long l) {
        this.allowPreview = l;
    }

    public final void setAllowPreviewTime(Long l) {
        this.allowPreviewTime = l;
    }

    public PaidEventPreview(Long l, Long l2) {
        this.allowPreview = l;
        this.allowPreviewTime = l2;
    }
}
