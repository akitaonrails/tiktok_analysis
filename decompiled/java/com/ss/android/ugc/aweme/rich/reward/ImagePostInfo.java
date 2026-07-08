package com.ss.android.ugc.aweme.rich.reward;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ImagePostInfo implements Serializable {

    @C09CT("images")
    public final List<ImageItem> images;

    public ImagePostInfo() {
        this(null);
    }

    public ImagePostInfo(List<ImageItem> list) {
        this.images = list;
    }
}
