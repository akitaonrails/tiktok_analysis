package com.ss.android.ugc.aweme.rich.reward;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class ImageItem implements Serializable {

    @C09CT("display_image")
    public final DisplayImage displayImage;

    public ImageItem() {
        this(null);
    }

    public ImageItem(DisplayImage displayImage) {
        this.displayImage = displayImage;
    }
}
