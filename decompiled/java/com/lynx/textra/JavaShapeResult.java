package com.lynx.textra;

/* JADX INFO: loaded from: classes4.dex */
public class JavaShapeResult {
    public float[] advance_;
    public int glyph_count_;
    public short[] glyphs_;
    public float[] position_x_;
    public float[] position_y_;
    public long[] typeface_instance_;

    public JavaShapeResult(int i) {
        this.glyphs_ = new short[i];
        this.advance_ = new float[i];
        this.position_x_ = new float[i];
        this.position_y_ = new float[i];
        this.typeface_instance_ = new long[i];
        this.glyph_count_ = i;
    }
}
