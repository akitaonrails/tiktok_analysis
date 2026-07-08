package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class BrandImageData implements Serializable {

    @C09CT("height")
    public final Integer height;

    @C09CT("url")
    public final String url;

    @C09CT("width")
    public final Integer width;

    public BrandImageData(String str, Integer num, Integer num2) {
        this.url = str;
        this.width = num;
        this.height = num2;
    }
}
