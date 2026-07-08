package com.ss.android.ugc.aweme.story.experiment.thought;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class StoryNoteMvpBackgroundOklchSettings {
    public static final BackgroundOklchModel LIZ = new BackgroundOklchModel(0.9f, 0.025f, new GrayOklch(0.9f, 0.0f, 0.0f), new GrayOklch(0.85f, 0.0f, 0.0f), new GrayOklch(0.8f, 0.0f, 0.0f), 20.0f, 0.05f, 0.08f, 0.99f);

    public static final class BackgroundOklchModel {

        @C09CT("bright_lightness")
        public final float brightLightness;

        @C09CT("gray_chroma")
        public final float grayChroma;

        @C09CT("gray_oklch_1")
        public final GrayOklch grayOklch1;

        @C09CT("gray_oklch_2")
        public final GrayOklch grayOklch2;

        @C09CT("gray_oklch_3")
        public final GrayOklch grayOklch3;

        @C09CT("hue_shift")
        public final float hueShift;

        @C09CT("lightness_shift")
        public final float lightnessShift;

        @C09CT("min_chroma_if_not_gray")
        public final float minChromaIfNotGray;

        @C09CT("white_lightness")
        public final float whiteLightness;

        public BackgroundOklchModel() {
            this(0.9f, 0.025f, new GrayOklch(0.9f, 0.0f, 0.0f), new GrayOklch(0.85f, 0.0f, 0.0f), new GrayOklch(0.8f, 0.0f, 0.0f), 20.0f, 0.05f, 0.08f, 0.99f);
        }

        public BackgroundOklchModel(float f, float f2, GrayOklch grayOklch, GrayOklch grayOklch2, GrayOklch grayOklch3, float f3, float f4, float f5, float f6) {
            this.brightLightness = f;
            this.grayChroma = f2;
            this.grayOklch1 = grayOklch;
            this.grayOklch2 = grayOklch2;
            this.grayOklch3 = grayOklch3;
            this.hueShift = f3;
            this.lightnessShift = f4;
            this.minChromaIfNotGray = f5;
            this.whiteLightness = f6;
        }
    }

    public static final class GrayOklch {

        @C09CT("C")
        public final float c;

        @C09CT("H")
        public final float h;

        @C09CT("L")
        public final float l;

        public GrayOklch(float f, float f2, float f3) {
            this.l = f;
            this.c = f2;
            this.h = f3;
        }
    }
}
