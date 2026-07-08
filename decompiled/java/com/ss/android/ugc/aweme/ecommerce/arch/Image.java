package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class Image {

    @C09CT("height")
    public final int height;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final int width;

    public Image() {
        this(null, 0, 0);
    }

    public Image(List<String> list, int i, int i2) {
        this.urlList = list;
        this.width = i;
        this.height = i2;
    }
}
