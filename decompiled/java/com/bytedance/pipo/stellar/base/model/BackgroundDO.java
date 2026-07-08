package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BackgroundDO implements Serializable {

    @C09CT("border")
    public final StrokeDO border;

    @C09CT("background_color")
    public final ColorDO color;

    @C09CT("corner")
    public final CornerDO corner;

    @C09CT("elevation")
    public final Integer elevation;

    @C09CT("gradient")
    public final GradientDO gradient;

    @C09CT("image")
    public final ImageDO image;

    public BackgroundDO() {
        this(null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundDO)) {
            return false;
        }
        BackgroundDO backgroundDO = (BackgroundDO) obj;
        return Intrinsics.LJFF(this.corner, backgroundDO.corner) && Intrinsics.LJFF(this.border, backgroundDO.border) && Intrinsics.LJFF(this.color, backgroundDO.color) && Intrinsics.LJFF(this.gradient, backgroundDO.gradient) && Intrinsics.LJFF(this.image, backgroundDO.image) && Intrinsics.LJFF(this.elevation, backgroundDO.elevation);
    }

    public int hashCode() {
        CornerDO cornerDO = this.corner;
        int iHashCode = (cornerDO == null ? 0 : cornerDO.hashCode()) * 31;
        StrokeDO strokeDO = this.border;
        int iHashCode2 = (iHashCode + (strokeDO == null ? 0 : strokeDO.hashCode())) * 31;
        ColorDO colorDO = this.color;
        int iHashCode3 = (iHashCode2 + (colorDO == null ? 0 : colorDO.hashCode())) * 31;
        GradientDO gradientDO = this.gradient;
        int iHashCode4 = (iHashCode3 + (gradientDO == null ? 0 : gradientDO.hashCode())) * 31;
        ImageDO imageDO = this.image;
        int iHashCode5 = (iHashCode4 + (imageDO == null ? 0 : imageDO.hashCode())) * 31;
        Integer num = this.elevation;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public BackgroundDO(CornerDO cornerDO, StrokeDO strokeDO, ColorDO colorDO, GradientDO gradientDO, ImageDO imageDO, Integer num) {
        this.corner = cornerDO;
        this.border = strokeDO;
        this.color = colorDO;
        this.gradient = gradientDO;
        this.image = imageDO;
        this.elevation = num;
    }
}
