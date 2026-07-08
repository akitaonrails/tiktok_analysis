package com.ss.android.ugc.aweme.resource;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class VideoTemplateVideoInfo {

    @C09CT("height")
    public final int height;

    @C09CT("url")
    public final String url;

    @C09CT("width")
    public final int width;

    public VideoTemplateVideoInfo() {
        this("", 0, 0);
    }

    public VideoTemplateVideoInfo(String str, int i, int i2) {
        this.url = str;
        this.width = i;
        this.height = i2;
    }
}
