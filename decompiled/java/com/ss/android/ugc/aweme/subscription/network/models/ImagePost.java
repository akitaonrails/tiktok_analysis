package com.ss.android.ugc.aweme.subscription.network.models;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class ImagePost implements Serializable {
    public static final int $stable = 8;

    @C09CT("cover")
    public final ImageStruct cover;

    @C09CT("images")
    public final List<ImageStruct> images;

    public ImagePost(List<ImageStruct> list, ImageStruct imageStruct) {
        this.images = list;
        this.cover = imageStruct;
    }
}
