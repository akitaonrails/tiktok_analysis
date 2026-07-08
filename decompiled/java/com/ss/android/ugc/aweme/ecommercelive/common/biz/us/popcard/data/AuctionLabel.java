package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;

/* JADX INFO: loaded from: classes33.dex */
public final class AuctionLabel {

    @C09CT("default_color")
    public final Color color;

    @C09CT("default_text")
    public final String defaultText;

    @C09CT("icon_dark")
    public final ECImage iconDark;

    @C09CT("icon_light")
    public final ECImage iconLight;

    public AuctionLabel() {
        this(null, null, null, null);
    }

    public AuctionLabel(String str, Color color, ECImage eCImage, ECImage eCImage2) {
        this.defaultText = str;
        this.color = color;
        this.iconLight = eCImage;
        this.iconDark = eCImage2;
    }
}
