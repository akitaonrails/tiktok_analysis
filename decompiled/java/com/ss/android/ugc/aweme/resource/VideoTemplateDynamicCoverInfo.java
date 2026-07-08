package com.ss.android.ugc.aweme.resource;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class VideoTemplateDynamicCoverInfo {

    @C09CT("height")
    public final int height;

    @C09CT("url")
    public final String url;

    @C09CT("width")
    public final int width;

    public VideoTemplateDynamicCoverInfo() {
        this(null, 0, 0);
    }

    public VideoTemplateDynamicCoverInfo(String str, int i, int i2) {
        this.url = str;
        this.width = i;
        this.height = i2;
    }
}
