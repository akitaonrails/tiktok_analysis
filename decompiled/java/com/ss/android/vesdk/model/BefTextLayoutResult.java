package com.ss.android.vesdk.model;

import android.graphics.Bitmap;
import com.ss.android.ttve.nativePort.TEParcelWrapper;

/* JADX INFO: loaded from: classes34.dex */
public class BefTextLayoutResult {
    public Bitmap bitmap;
    public int height;
    public int lineCount;
    public int width;

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLineCount() {
        return this.lineCount;
    }

    public int getWidth() {
        return this.width;
    }

    public static BefTextLayoutResult readFromByteArray(byte[][] bArr) {
        TEParcelWrapper tEParcelWrapper = new TEParcelWrapper(bArr[0]);
        BefTextLayoutResult befTextLayoutResult = new BefTextLayoutResult();
        befTextLayoutResult.setBitmap(tEParcelWrapper.readBitmap());
        befTextLayoutResult.setWidth(tEParcelWrapper.readInt());
        befTextLayoutResult.setHeight(tEParcelWrapper.readInt());
        befTextLayoutResult.setLineCount(tEParcelWrapper.readInt());
        return befTextLayoutResult;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLineCount(int i) {
        this.lineCount = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
