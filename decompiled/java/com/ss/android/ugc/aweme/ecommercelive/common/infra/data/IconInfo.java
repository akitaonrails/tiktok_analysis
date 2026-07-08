package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class IconInfo {

    @C09CT("dark_icon")
    public final ECImage darkIcon;

    @C09CT("light_icon")
    public final ECImage lightIcon;

    public IconInfo() {
        this(null, null);
    }

    public IconInfo(ECImage eCImage, ECImage eCImage2) {
        this.lightIcon = eCImage;
        this.darkIcon = eCImage2;
    }
}
