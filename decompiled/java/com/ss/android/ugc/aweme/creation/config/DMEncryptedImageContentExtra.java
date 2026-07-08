package com.ss.android.ugc.aweme.creation.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class DMEncryptedImageContentExtra implements Serializable {

    @C09CT("img_format")
    public final String format;

    @C09CT("img_height")
    public final int height;

    @C09CT("img_width")
    public final int width;

    public DMEncryptedImageContentExtra(int i, int i2, String str) {
        this.width = i;
        this.height = i2;
        this.format = str;
    }
}
