package com.lynx.serval.svg.model;

/* JADX INFO: loaded from: classes21.dex */
public class StrokePaintModel extends PaintRef {
    public float[] mStrokeDashArray;
    public float mStrokeDashOffset;
    public int mStrokeLineCap;
    public int mStrokeLineJoin;
    public float mStrokeMiterLimit;
    public int mVectorEffect;
    public float mWith;

    public StrokePaintModel(int i, String str, long j, float f, float f2, int i2, int i3, float f3, float f4, float[] fArr, int i4) {
        super(i, j, f2, str);
        this.mWith = f;
        this.mStrokeLineCap = i2;
        this.mStrokeLineJoin = i3;
        this.mStrokeMiterLimit = f3;
        this.mStrokeDashOffset = f4;
        this.mStrokeDashArray = fArr;
        this.mVectorEffect = i4;
    }
}
