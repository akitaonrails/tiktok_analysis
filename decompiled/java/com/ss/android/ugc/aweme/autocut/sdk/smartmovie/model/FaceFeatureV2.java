package com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model;

/* JADX INFO: loaded from: classes4.dex */
public final class FaceFeatureV2 {
    public float height;
    public float width;
    public float x;
    public float y;

    public FaceFeatureV2() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final void setWidth(float f) {
        this.width = f;
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final void setY(float f) {
        this.y = f;
    }

    public FaceFeatureV2(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
    }
}
