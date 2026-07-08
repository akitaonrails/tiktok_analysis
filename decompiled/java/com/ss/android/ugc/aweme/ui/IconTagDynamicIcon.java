package com.ss.android.ugc.aweme.ui;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class IconTagDynamicIcon implements Serializable {
    public static final int $stable = 0;

    @C09CT("dark_mode_url")
    public final String darkModeUrl;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("tux_token")
    public final String tuxToken;

    public IconTagDynamicIcon(String str, String str2, String str3) {
        this.tuxToken = str;
        this.imageUrl = str2;
        this.darkModeUrl = str3;
    }
}
