package com.ss.android.ugc.aweme.ecommerce.ug.common.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;

/* JADX INFO: loaded from: classes33.dex */
public final class EcUgPromotionLabel {

    @C09CT("background_color")
    public final BackgroundColor backGroundColor;

    @C09CT("icon")
    public final Image icon;

    @C09CT("image")
    public final Image image;

    @C09CT("style")
    public final Integer style;

    @C09CT("text")
    public final Text text;

    public EcUgPromotionLabel() {
        this(null, null, null, null, null);
    }

    public static final class BackgroundColor {

        @C09CT("linear_gradient_color")
        public final LinearGradientColor linearGradientColor;

        @C09CT("solid_color")
        public final String solidColor;

        public BackgroundColor() {
            this(null, null);
        }

        /* JADX INFO: loaded from: classes32.dex */
        public static final class LinearGradientColor {

            @C09CT("left_color")
            public final String leftColor;

            @C09CT("right_color")
            public final String rightColor;

            public LinearGradientColor() {
                this(null, null);
            }

            public LinearGradientColor(String str, String str2) {
                this.leftColor = str;
                this.rightColor = str2;
            }
        }

        public BackgroundColor(String str, LinearGradientColor linearGradientColor) {
            this.solidColor = str;
            this.linearGradientColor = linearGradientColor;
        }
    }

    public static final class Text {

        @C09CT("color")
        public final String color;

        @C09CT("content")
        public final String content;

        public Text() {
            this(null, null);
        }

        public Text(String str, String str2) {
            this.content = str;
            this.color = str2;
        }
    }

    public EcUgPromotionLabel(Integer num, Image image, Text text, BackgroundColor backgroundColor, Image image2) {
        this.style = num;
        this.image = image;
        this.text = text;
        this.backGroundColor = backgroundColor;
        this.icon = image2;
    }
}
