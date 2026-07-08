package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style;

import X.C09CT;
import X.C418440Gaw;
import X.C814420VxA;

/* JADX INFO: loaded from: classes36.dex */
public final class ECMixMallStyleDTO {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;

    @C09CT("bg_color")
    public ECMixMallBgColorDTO bgColor;

    @C09CT("bg_image")
    public ECMixMallBgImgDTO bgImg;

    @C09CT("column")
    public int column;

    @C09CT("height_info")
    public HeightInfo heightInfo;

    @C09CT("item_gap_h")
    public float itemGapHDp;

    @C09CT("item_gap_v")
    public float itemGapVDp;

    @C09CT("layout")
    public int layout;

    @C09CT("margin_bottom")
    public float marginBottomDp;

    @C09CT("margin_left")
    public float marginLeftDp;

    @C09CT("margin_right")
    public float marginRightDp;

    @C09CT("margin_top")
    public float marginTopDp;

    @C09CT("status_bar_style")
    public int statusBarStyle;

    public ECMixMallStyleDTO() {
        this(0, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, null, null, null);
    }

    public final void LIZ() {
        this.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.itemGapHDp)));
        this.LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.itemGapVDp)));
        this.LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.marginBottomDp)));
        this.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.marginTopDp)));
        this.LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.marginLeftDp)));
        this.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.marginRightDp)));
    }

    public ECMixMallStyleDTO(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, int i3, int i4, int i5, int i6, int i7, int i8, int i9, ECMixMallBgColorDTO eCMixMallBgColorDTO, ECMixMallBgImgDTO eCMixMallBgImgDTO, HeightInfo heightInfo) {
        this.layout = i;
        this.column = i2;
        this.marginLeftDp = f;
        this.marginRightDp = f2;
        this.marginTopDp = f3;
        this.marginBottomDp = f4;
        this.itemGapHDp = f5;
        this.itemGapVDp = f6;
        this.LIZ = i3;
        this.LIZIZ = i4;
        this.LIZJ = i5;
        this.LIZLLL = i6;
        this.LJ = i7;
        this.LJFF = i8;
        this.statusBarStyle = i9;
        this.bgColor = eCMixMallBgColorDTO;
        this.bgImg = eCMixMallBgImgDTO;
        this.heightInfo = heightInfo;
    }
}
