package com.ss.android.ugc.aweme.ecommercebase.promotion.data.style;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;

/* JADX INFO: loaded from: classes33.dex */
public final class DiscountTag {

    @C09CT("bg_color")
    public final LabelColor background;

    @C09CT("borderColor")
    public final LabelColor borderColor;

    @C09CT("borderWidth")
    public final Integer borderWidth;

    @C09CT("edge_insets")
    public final EdgeInset edgeInset;

    @C09CT("exceedLength")
    public final Integer exceedLength;

    @C09CT("exceedText")
    public final String exceedText;

    @C09CT("height")
    public final Integer height;

    @C09CT("icon")
    public final Image icon;

    @C09CT("radius")
    public final Integer radius;

    @C09CT("text")
    public final PriceTextConfig text;

    @C09CT("type")
    public final Integer type;

    @C09CT("use_brackets")
    public final Boolean useBrackets;

    @C09CT("use_minus_prefix")
    public final Boolean useMinusPrefix;

    public DiscountTag(PriceTextConfig priceTextConfig, LabelColor labelColor, Integer num, Integer num2, Integer num3, LabelColor labelColor2, Image image, String str, Integer num4, Integer num5, Boolean bool, Boolean bool2, EdgeInset edgeInset) {
        this.text = priceTextConfig;
        this.background = labelColor;
        this.height = num;
        this.borderWidth = num2;
        this.radius = num3;
        this.borderColor = labelColor2;
        this.icon = image;
        this.exceedText = str;
        this.exceedLength = num4;
        this.type = num5;
        this.useBrackets = bool;
        this.useMinusPrefix = bool2;
        this.edgeInset = edgeInset;
    }
}
