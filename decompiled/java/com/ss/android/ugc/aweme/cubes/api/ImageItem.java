package com.ss.android.ugc.aweme.cubes.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class ImageItem implements Serializable {

    @C09CT("height")
    public final int height;

    @C09CT("url")
    public final String url;

    @C09CT("width")
    public final int width;

    public ImageItem() {
        this("", 0, 0);
    }

    public ImageItem(String str, int i, int i2) {
        this.url = str;
        this.height = i;
        this.width = i2;
    }
}
