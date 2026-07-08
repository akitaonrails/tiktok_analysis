package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class ProductCard implements Serializable {

    @C09CT("common_image")
    public final CommonImage commonImage;

    @C09CT("jump_model")
    public final String jumpModel;

    @C09CT("desc")
    public final String text;

    public ProductCard(CommonImage commonImage, String str, String str2) {
        this.commonImage = commonImage;
        this.text = str;
        this.jumpModel = str2;
    }
}
