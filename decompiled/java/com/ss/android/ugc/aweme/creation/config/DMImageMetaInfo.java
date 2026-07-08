package com.ss.android.ugc.aweme.creation.config;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class DMImageMetaInfo {

    @C09CT("ImageFormat")
    public final String format;

    @C09CT("ImageHeight")
    public final int height;

    @C09CT("ImageUri")
    public final String imageUri;

    @C09CT("ImageWidth")
    public final int width;

    public DMImageMetaInfo() {
        this(null, 0, 0, null);
    }

    public DMImageMetaInfo(String str, int i, int i2, String str2) {
        this.imageUri = str;
        this.width = i;
        this.height = i2;
        this.format = str2;
    }
}
