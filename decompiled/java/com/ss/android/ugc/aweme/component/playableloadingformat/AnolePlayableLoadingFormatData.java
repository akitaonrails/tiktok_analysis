package com.ss.android.ugc.aweme.component.playableloadingformat;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public final class AnolePlayableLoadingFormatData implements Serializable {
    public static final int $stable = 0;

    @C09CT("bgColor")
    public final String bgColor;

    @C09CT("color1")
    public final String color1;

    @C09CT("color2")
    public final String color2;

    @C09CT("color3")
    public final String color3;

    @C09CT("color4")
    public final String color4;

    @C09CT("complex")
    public final Float complex;

    @C09CT("lightness")
    public final Float lightness;

    @C09CT("morph")
    public final Float morph;

    @C09CT("position1")
    public final Float position1;

    @C09CT("position2")
    public final Float position2;

    @C09CT("scaleX")
    public final Float scaleX;

    @C09CT("scaleY")
    public final Float scaleY;

    @C09CT("speed")
    public final Float speed;

    @C09CT("timeOffset")
    public final Float timeOffset;

    public AnolePlayableLoadingFormatData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public AnolePlayableLoadingFormatData(Float f, Float f2, String str, String str2, String str3, String str4, String str5, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9) {
        this.speed = f;
        this.timeOffset = f2;
        this.color1 = str;
        this.color2 = str2;
        this.color3 = str3;
        this.color4 = str4;
        this.bgColor = str5;
        this.lightness = f3;
        this.position1 = f4;
        this.position2 = f5;
        this.scaleX = f6;
        this.scaleY = f7;
        this.complex = f8;
        this.morph = f9;
    }
}
