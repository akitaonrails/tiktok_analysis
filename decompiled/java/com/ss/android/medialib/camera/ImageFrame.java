package com.ss.android.medialib.camera;

import X.C2185611AgJ;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public class ImageFrame {
    public Bitmap bitmap;
    public ByteBuffer byteBuffer;
    public int format;
    public int height;
    public byte[] mBuf;
    public C2185611AgJ mPlane;
    public int rotate;
    public int width;

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public byte[] getBuf() {
        return this.mBuf;
    }

    public int getFormat() {
        return this.format;
    }

    public int getHeight() {
        return this.height;
    }

    public C2185611AgJ getPlane() {
        return this.mPlane;
    }

    public int getWidth() {
        return this.width;
    }

    public void setBuf(byte[] bArr) {
        this.mBuf = bArr;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public ImageFrame(Bitmap bitmap, int i) {
        this.bitmap = bitmap;
        this.format = i;
    }

    public ImageFrame(C2185611AgJ c2185611AgJ, int i, int i2, int i3) {
        this.mPlane = c2185611AgJ;
        this.format = i;
        this.width = i2;
        this.height = i3;
    }

    public ImageFrame(byte[] bArr, int i, int i2, int i3) {
        this.mBuf = bArr;
        this.format = i;
        this.width = i2;
        this.height = i3;
    }

    public ImageFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        this.byteBuffer = byteBuffer;
        this.width = i;
        this.height = i2;
        this.format = i3;
        this.rotate = i4;
    }

    public static ImageFrame create(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return new ImageFrame(byteBuffer, i, i2, i3, i4);
    }
}
