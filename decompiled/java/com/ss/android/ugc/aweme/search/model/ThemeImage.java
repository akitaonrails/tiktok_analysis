package com.ss.android.ugc.aweme.search.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class ThemeImage {

    @C09CT("dark")
    public final Image dark;

    @C09CT("light")
    public final Image light;

    public ThemeImage() {
        this(null, null);
    }

    public final ThemeImage copy(Image image, Image image2) {
        return new ThemeImage(image, image2);
    }

    public ThemeImage(Image image, Image image2) {
        this.light = image;
        this.dark = image2;
    }
}
