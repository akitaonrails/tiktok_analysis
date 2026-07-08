package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpTopBubble {

    @C09CT("da_info")
    public Map<String, String> daInfo;

    @C09CT("highlight_text")
    public final String highlightText;

    @C09CT("left_icon")
    public final ECImage leftIcon;

    @C09CT("left_icon_dark")
    public final ECImage leftIconDark;

    @C09CT("product_id")
    public final String productId;

    @C09CT("right_icon")
    public final ECImage rightIcon;

    @C09CT("right_icon_dark")
    public final ECImage rightIconDark;

    @C09CT("schema")
    public final String schema;

    @C09CT("text")
    public final String text;

    public PdpTopBubble(ECImage eCImage, ECImage eCImage2, String str, String str2, ECImage eCImage3, ECImage eCImage4, String str3, String str4, Map<String, String> map) {
        this.leftIcon = eCImage;
        this.leftIconDark = eCImage2;
        this.text = str;
        this.highlightText = str2;
        this.rightIcon = eCImage3;
        this.rightIconDark = eCImage4;
        this.schema = str3;
        this.productId = str4;
        this.daInfo = map;
    }
}
