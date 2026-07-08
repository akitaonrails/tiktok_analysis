package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class IconImageModel implements Serializable {

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("icon_url_dark")
    public final String iconUrlDark;

    public IconImageModel() {
        this(null, null);
    }

    public IconImageModel(String str, String str2) {
        this.iconUrl = str;
        this.iconUrlDark = str2;
    }
}
