package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;

/* JADX INFO: loaded from: classes27.dex */
public final class BackgroundImage {

    @C09CT("dark")
    public final Image dark;

    @C09CT("light")
    public final Image light;

    public BackgroundImage(Image image, Image image2) {
        this.light = image;
        this.dark = image2;
    }
}
