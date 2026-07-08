package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public class TextEffect {

    @C09CT("landscape")
    public Detail landscapeDetail;

    @C09CT("portrait")
    public Detail portraitDetail;

    /* JADX INFO: loaded from: classes18.dex */
    public static class Detail {

        @C09CT("background")
        public ImageModel background;

        @C09CT("duration")
        public long duration;

        @C09CT("height")
        public int height;

        @C09CT("shadow_color")
        public String shadowColor;

        @C09CT("shadow_dx")
        public int shadowDx;

        @C09CT("shadow_dy")
        public int shadowDy;

        @C09CT("shadow_radius")
        public int shadowRadius;

        @C09CT("start")
        public long start;

        @C09CT("stroke_color")
        public String strokeColor;

        @C09CT("stroke_width")
        public int strokeWidth;

        @C09CT("text")
        public Text text;

        @C09CT("text_font_size")
        public int textFontSize;

        @C09CT("width")
        public int width;

        @C09CT("x")
        public int x;

        @C09CT("y")
        public int y;
    }
}
