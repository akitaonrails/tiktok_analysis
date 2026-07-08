package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class GradientDO implements Serializable {

    @C09CT("angle")
    public final String angle;

    @C09CT("center_color")
    public final ColorDO centerColor;

    @C09CT("center_x")
    public final String centerX;

    @C09CT("center_y")
    public final String centerY;

    @C09CT("end_color")
    public final ColorDO endColor;

    @C09CT("gradient_radius")
    public final String radius;

    @C09CT("start_color")
    public final ColorDO startColor;

    @C09CT("type")
    public final String type;

    public GradientDO() {
        this(null, null, null, null, null, null, null, null);
    }

    public GradientDO(String str, ColorDO colorDO, ColorDO colorDO2, ColorDO colorDO3, String str2, String str3, String str4, String str5) {
        this.type = str;
        this.startColor = colorDO;
        this.centerColor = colorDO2;
        this.endColor = colorDO3;
        this.angle = str2;
        this.centerX = str3;
        this.centerY = str4;
        this.radius = str5;
    }
}
