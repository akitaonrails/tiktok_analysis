package com.ss.android.ttve.nativePort;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes34.dex */
public class TEParcelWrapper extends p {
    public Rect readRect() {
        return new Rect(readInt(), readInt(), readInt(), readInt());
    }

    public RectF readRectF() {
        return new RectF(readFloat(), readFloat(), readFloat(), readFloat());
    }

    public TEParcelWrapper(byte[] bArr) {
        super(bArr);
    }

    public float[] readFloatArray(int i) {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = readFloat();
        }
        return fArr;
    }

    public PointF[] readPointFArray(int i) {
        PointF[] pointFArr = new PointF[i];
        for (int i2 = 0; i2 < i; i2++) {
            pointFArr[i2] = new PointF(readFloat(), readFloat());
        }
        return pointFArr;
    }

    public String[] readStringArray(int i) {
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = readString();
        }
        return strArr;
    }
}
