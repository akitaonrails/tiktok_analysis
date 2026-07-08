package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageInfo {

    @C09CT("has_face")
    public final int hasFace;

    @C09CT("index")
    public final int index;

    @C09CT("uri")
    public final String uri;

    @C09CT("url")
    public final String url;

    public ImageInfo() {
        this("", "", 0, 0);
    }

    public ImageInfo(String str, String str2, int i, int i2) {
        this.url = str;
        this.uri = str2;
        this.hasFace = i;
        this.index = i2;
    }
}
