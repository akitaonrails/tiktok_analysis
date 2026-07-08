package com.bytedance.fresco.nativeheif;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class HeifData {
    public final byte[] data;
    public final int error;
    public final int height;
    public final boolean isVvif;
    public final int width;

    public HeifData(int i) {
        this.error = i;
    }

    public Bitmap newBitmap(Bitmap.Config config) {
        int i;
        int i2;
        byte[] bArr = this.data;
        if (bArr != null && bArr.length > 0 && (i = this.width) > 0 && (i2 = this.height) > 0) {
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
            bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(this.data));
            return bitmapCreateBitmap;
        }
        return null;
    }

    public HeifData(byte[] bArr, int i, int i2, boolean z) {
        this.data = bArr;
        this.width = i;
        this.height = i2;
        this.isVvif = z;
    }
}
