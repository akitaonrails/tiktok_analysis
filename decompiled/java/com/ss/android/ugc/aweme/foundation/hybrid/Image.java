package com.ss.android.ugc.aweme.foundation.hybrid;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class Image implements Serializable {

    @C09CT("dark")
    public ImageInfo dark;

    @C09CT("height")
    public Integer height;

    @C09CT("light")
    public ImageInfo light;

    @C09CT("width")
    public Integer width;

    public Image() {
        this(0, 0, null, null);
    }

    public final void setDark(ImageInfo imageInfo) {
        this.dark = imageInfo;
    }

    public final void setHeight(Integer num) {
        this.height = num;
    }

    public final void setLight(ImageInfo imageInfo) {
        this.light = imageInfo;
    }

    public final void setWidth(Integer num) {
        this.width = num;
    }

    public Image(Integer num, Integer num2, ImageInfo imageInfo, ImageInfo imageInfo2) {
        this.height = num;
        this.width = num2;
        this.light = imageInfo;
        this.dark = imageInfo2;
    }
}
