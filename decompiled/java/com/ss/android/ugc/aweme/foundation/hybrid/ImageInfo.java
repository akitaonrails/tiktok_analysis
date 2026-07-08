package com.ss.android.ugc.aweme.foundation.hybrid;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class ImageInfo implements Serializable {

    @C09CT("image_name")
    public final String imageName;

    @C09CT("image_url")
    public final String imageUrl;

    public ImageInfo() {
        this("", "");
    }

    public ImageInfo(String str, String str2) {
        this.imageName = str;
        this.imageUrl = str2;
    }
}
