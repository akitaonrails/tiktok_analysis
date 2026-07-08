package com.lynx.serval.svg.model;

/* JADX INFO: loaded from: classes21.dex */
public class PaintRef {
    public long mColor;
    public String mIri;
    public float mOpacity;
    public int mType;

    public PaintRef(int i, long j, float f, String str) {
        this.mType = i;
        this.mColor = j;
        this.mOpacity = f;
        this.mIri = str;
    }
}
