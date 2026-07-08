package com.ss.ttlivestreamer.core.opengl;

import X.C1272560jDi;
import X.C1273510jFF;

/* JADX INFO: loaded from: classes21.dex */
public final class GLTexture {
    public static final C1272560jDi TextureType = new Object() { // from class: X.0jDi
    };
    public int height;
    public String name;
    public int rotation;
    public int textureId;
    public int textureType;
    public long timestamp;
    public float[] transformMatrixFloats4x4;
    public UVRange uvRange;
    public int width;

    public GLTexture() {
        this(0, 0, 0, 0, 0L);
    }

    public final int getRotatedHeight() {
        int i = this.rotation;
        return (i == 90 || i == 270) ? this.width : this.height;
    }

    public final int getRotatedWidth() {
        int i = this.rotation;
        return (i == 90 || i == 270) ? this.height : this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRotation() {
        return this.rotation;
    }

    public final int getTextureId() {
        return this.textureId;
    }

    public final int getTextureType() {
        return this.textureType;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float[] getTransformMatrixFloats4x4() {
        return this.transformMatrixFloats4x4;
    }

    public final UVRange getUvRange() {
        return this.uvRange;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRotation(int i) {
        this.rotation = i;
    }

    public final void setTextureId(int i) {
        this.textureId = i;
    }

    public final void setTextureType(int i) {
        this.textureType = i;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setTransformMatrixFloats4x4(float[] fArr) {
        this.transformMatrixFloats4x4 = fArr;
    }

    public final void setUvRange(UVRange uVRange) {
        this.uvRange = uVRange;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public GLTexture(int i, int i2, int i3, int i4, long j) {
        this.textureId = i;
        this.width = i2;
        this.height = i3;
        this.rotation = i4;
        this.timestamp = j;
        this.uvRange = new UVRange();
        this.transformMatrixFloats4x4 = C1273510jFF.LIZIZ();
        this.name = "";
    }
}
