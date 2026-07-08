package com.ss.android.ugc.aweme.shortvideo.ui.savelocal;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class WatermarkMetadata {

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("is_image_mode")
    public final boolean isImageMode;

    public WatermarkMetadata() {
        this(false, "");
    }

    public WatermarkMetadata(boolean z, String str) {
        this.isImageMode = z;
        this.creationId = str;
    }
}
