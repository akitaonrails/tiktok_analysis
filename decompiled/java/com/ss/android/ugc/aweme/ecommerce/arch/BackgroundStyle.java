package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class BackgroundStyle {

    @C09CT("dark_color")
    public final String darkColor;

    @C09CT("dark_image")
    public final Image darkImage;

    @C09CT("light_color")
    public final String lightColor;

    @C09CT("light_image")
    public final Image lightImage;

    public BackgroundStyle() {
        this("", "", null, null);
    }

    public BackgroundStyle(String str, String str2, Image image, Image image2) {
        this.darkColor = str;
        this.lightColor = str2;
        this.darkImage = image;
        this.lightImage = image2;
    }
}
