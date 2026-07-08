package com.lynx.canvas.capi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class LoaderServiceHelper {
    public static BitmapDecodeResult decodeImageSync(byte[] bArr) {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (bitmapDecodeByteArray != null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmapDecodeByteArray.getByteCount());
            bitmapDecodeByteArray.copyPixelsToBuffer(byteBufferAllocateDirect);
            return new BitmapDecodeResult(byteBufferAllocateDirect, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
        }
        return null;
    }

    public static byte[] encodeBitmapSync(ByteBuffer byteBuffer, int i, int i2, int i3, float f) {
        Bitmap.CompressFormat compressFormat;
        if (i3 == 0) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            if (i3 == 1) {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i * i2) / 4) + 256);
        if (bitmapCreateBitmap.compress(compressFormat, Math.round(f * 100.0f), byteArrayOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }
}
