package com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.config;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class VisualSearchBackgroundShaderConfiguration {

    @C09CT("color_chroma_from")
    public final float chromeFrom;

    @C09CT("color_chroma_to")
    public final float chromeTo;

    @C09CT("color_lightness_from")
    public final float colorLightnessFrom;

    @C09CT("color_lightness_to")
    public final float colorLightnessTo;

    @C09CT("merge_tolerance")
    public final float colorMergingTolerance;

    @C09CT("complex")
    public final float complex;

    @C09CT("lightness")
    public final float lightness;

    @C09CT("morph")
    public final float morph;

    @C09CT("position_x")
    public final float positionX;

    @C09CT("position_y")
    public final float positionY;

    @C09CT("scale_x")
    public final float scaleX;

    @C09CT("scale_y")
    public final float scaleY;

    @C09CT("speed")
    public final float speed;

    @C09CT("time_offset")
    public final float timeOffset;

    @C09CT("type")
    public final float type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualSearchBackgroundShaderConfiguration)) {
            return false;
        }
        VisualSearchBackgroundShaderConfiguration visualSearchBackgroundShaderConfiguration = (VisualSearchBackgroundShaderConfiguration) obj;
        return Float.compare(this.type, visualSearchBackgroundShaderConfiguration.type) == 0 && Float.compare(this.speed, visualSearchBackgroundShaderConfiguration.speed) == 0 && Float.compare(this.lightness, visualSearchBackgroundShaderConfiguration.lightness) == 0 && Float.compare(this.complex, visualSearchBackgroundShaderConfiguration.complex) == 0 && Float.compare(this.morph, visualSearchBackgroundShaderConfiguration.morph) == 0 && Float.compare(this.positionX, visualSearchBackgroundShaderConfiguration.positionX) == 0 && Float.compare(this.positionY, visualSearchBackgroundShaderConfiguration.positionY) == 0 && Float.compare(this.scaleX, visualSearchBackgroundShaderConfiguration.scaleX) == 0 && Float.compare(this.scaleY, visualSearchBackgroundShaderConfiguration.scaleY) == 0 && Float.compare(this.timeOffset, visualSearchBackgroundShaderConfiguration.timeOffset) == 0 && Float.compare(this.chromeFrom, visualSearchBackgroundShaderConfiguration.chromeFrom) == 0 && Float.compare(this.chromeTo, visualSearchBackgroundShaderConfiguration.chromeTo) == 0 && Float.compare(this.colorLightnessFrom, visualSearchBackgroundShaderConfiguration.colorLightnessFrom) == 0 && Float.compare(this.colorLightnessTo, visualSearchBackgroundShaderConfiguration.colorLightnessTo) == 0 && Float.compare(this.colorMergingTolerance, visualSearchBackgroundShaderConfiguration.colorMergingTolerance) == 0;
    }

    public final String toString() {
        return "VisualSearchBackgroundShaderConfiguration(type=" + this.type + ", speed=" + this.speed + ", lightness=" + this.lightness + ", complex=" + this.complex + ", morph=" + this.morph + ", positionX=" + this.positionX + ", positionY=" + this.positionY + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", timeOffset=" + this.timeOffset + ", chromeFrom=" + this.chromeFrom + ", chromeTo=" + this.chromeTo + ", colorLightnessFrom=" + this.colorLightnessFrom + ", colorLightnessTo=" + this.colorLightnessTo + ", colorMergingTolerance=" + this.colorMergingTolerance + ')';
    }

    public VisualSearchBackgroundShaderConfiguration() {
        this(6.0f, 5.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.05f, 0.25f, 0.0f, 0.2f, 4.0f);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((Float.floatToIntBits(this.type) * 31) + Float.floatToIntBits(this.speed)) * 31) + Float.floatToIntBits(this.lightness)) * 31) + Float.floatToIntBits(this.complex)) * 31) + Float.floatToIntBits(this.morph)) * 31) + Float.floatToIntBits(this.positionX)) * 31) + Float.floatToIntBits(this.positionY)) * 31) + Float.floatToIntBits(this.scaleX)) * 31) + Float.floatToIntBits(this.scaleY)) * 31) + Float.floatToIntBits(this.timeOffset)) * 31) + Float.floatToIntBits(this.chromeFrom)) * 31) + Float.floatToIntBits(this.chromeTo)) * 31) + Float.floatToIntBits(this.colorLightnessFrom)) * 31) + Float.floatToIntBits(this.colorLightnessTo)) * 31) + Float.floatToIntBits(this.colorMergingTolerance);
    }

    public VisualSearchBackgroundShaderConfiguration(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.type = f;
        this.speed = f2;
        this.lightness = f3;
        this.complex = f4;
        this.morph = f5;
        this.positionX = f6;
        this.positionY = f7;
        this.scaleX = f8;
        this.scaleY = f9;
        this.timeOffset = f10;
        this.chromeFrom = f11;
        this.chromeTo = f12;
        this.colorLightnessFrom = f13;
        this.colorLightnessTo = f14;
        this.colorMergingTolerance = f15;
    }
}
