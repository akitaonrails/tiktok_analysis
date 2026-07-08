package com.ss.android.ttve.nativePort;

import X.C2188811AlT;
import X.C2484209oO;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
public class p {
    public byte[] mData;
    public int mPos;

    public Bitmap readBitmap() {
        byte[] bArr = this.mData;
        if (bArr.length != 0) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    public boolean readBoolean() {
        if (this.mPos + 4 <= this.mData.length) {
            return readInt() != 0;
        }
        C2484209oO.LIZJ("TEParcel", "out of border");
        return false;
    }

    public float readFloat() {
        if (this.mPos + 4 <= this.mData.length) {
            return Float.intBitsToFloat(readInt());
        }
        C2484209oO.LIZJ("TEParcel", "out of border");
        return -1.0f;
    }

    public int readInt() {
        int i = this.mPos;
        int i2 = i + 4;
        byte[] bArr = this.mData;
        if (i2 > bArr.length) {
            C2484209oO.LIZJ("TEParcel", "out of border");
            return -1;
        }
        int i3 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 127) << 24);
        if ((bArr[i + 3] >> 7) != 0) {
            i3 -= Integer.MIN_VALUE;
        }
        this.mPos = i + 4;
        return i3;
    }

    public Long readLong() {
        int i = this.mPos;
        int i2 = i + 8;
        byte[] bArr = this.mData;
        if (i2 > bArr.length) {
            C2484209oO.LIZJ("TEParcel", "out of border");
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        this.mPos += 8;
        return Long.valueOf(byteBufferWrap.getLong());
    }

    public String readString() {
        int i = readInt();
        return readInternalString(i, i);
    }

    public p(byte[] bArr) {
        this.mData = bArr;
    }

    public byte[] readByteArray(int i) {
        if (i <= 0) {
            return null;
        }
        int i2 = this.mPos;
        int i3 = i2 + i;
        byte[] bArr = this.mData;
        if (i3 > bArr.length) {
            C2484209oO.LIZJ("TEParcel", "out of border");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i2 + i);
        this.mPos += i;
        return bArrCopyOfRange;
    }

    public String readString(int i) {
        return readInternalString(readInt(), i);
    }

    public String readInternalString(int i, int i2) {
        int i3 = this.mPos;
        int i4 = i3 + i2;
        byte[] bArr = this.mData;
        if (i4 > bArr.length) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("readString out of bound(data size=");
            sbLIZ.append(this.mData.length);
            sbLIZ.append(", start=");
            sbLIZ.append(this.mPos);
            sbLIZ.append(", len=");
            sbLIZ.append(i2);
            sbLIZ.append(")");
            C2484209oO.LIZJ("TEParcel", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        String str = new String(bArr, i3, i, Charset.forName("UTF-8"));
        this.mPos += i2;
        return str;
    }
}
