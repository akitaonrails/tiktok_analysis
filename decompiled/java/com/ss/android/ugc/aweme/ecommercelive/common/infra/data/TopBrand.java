package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class TopBrand implements Serializable {

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("icon")
    public final Image icon;

    @C09CT("text")
    public final String text;

    @C09CT("text_color")
    public final String textColor;

    public TopBrand() {
        this(null, null, null, null);
    }

    public TopBrand(Image image, String str, String str2, String str3) {
        this.icon = image;
        this.text = str;
        this.textColor = str2;
        this.backgroundColor = str3;
    }
}
