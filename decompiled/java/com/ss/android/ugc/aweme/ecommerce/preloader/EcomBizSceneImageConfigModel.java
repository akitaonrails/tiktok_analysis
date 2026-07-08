package com.ss.android.ugc.aweme.ecommerce.preloader;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EcomBizSceneImageConfigModel {

    @C09CT("biz_scene")
    public final String bizScene;

    @C09CT("border_divider")
    public final Double feBorderDivider;

    @C09CT("border_factor")
    public final Double feBorderFactor;

    @C09CT("border_radius")
    public final Double feBorderRadius;

    @C09CT("height")
    public final Double feHeight;

    @C09CT("post_process")
    public final Boolean fePostProcess;

    @C09CT("scale_type")
    public final String feScaleType;

    @C09CT("width")
    public final Double feWidth;

    @C09CT("padding")
    public final String padding;

    @C09CT("rgb_565")
    public final Boolean rgb565;

    @C09CT("suffix")
    public final String suffix;

    public EcomBizSceneImageConfigModel(String str, String str2, Double d, Double d2, Boolean bool, Boolean bool2, String str3, Double d3, Double d4, Double d5, String str4) {
        this.bizScene = str;
        this.suffix = str2;
        this.feWidth = d;
        this.feHeight = d2;
        this.fePostProcess = bool;
        this.rgb565 = bool2;
        this.padding = str3;
        this.feBorderRadius = d3;
        this.feBorderFactor = d4;
        this.feBorderDivider = d5;
        this.feScaleType = str4;
    }
}
