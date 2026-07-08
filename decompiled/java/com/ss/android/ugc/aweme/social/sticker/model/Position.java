package com.ss.android.ugc.aweme.social.sticker.model;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class Position {

    @C09CT("height")
    public final float height;

    @C09CT("radius_u")
    public final float radiusU;

    @C09CT("radius_v")
    public final float radiusV;

    @C09CT("scale")
    public final float scale;

    @C09CT("u")
    public final float u;

    @C09CT("v")
    public final float v;

    @C09CT("width")
    public final float width;

    @C09CT("x")
    public final float x;

    @C09CT("y")
    public final float y;

    public Position() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Position(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.radiusU = f;
        this.radiusV = f2;
        this.u = f3;
        this.v = f4;
        this.x = f5;
        this.y = f6;
        this.width = f7;
        this.height = f8;
        this.scale = f9;
    }
}
