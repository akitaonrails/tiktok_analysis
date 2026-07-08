package com.bytedance.fresco.animatedheif;

import X.C1328730kgJ;
import X.InterfaceC1329960kiI;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes21.dex */
public class HeifFrame implements InterfaceC1329960kiI {
    public long mNativeContext;

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(boolean z, int i, int i2, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

    public int getDurationMs() {
        return nativeGetDurationMs();
    }

    @Override // X.InterfaceC1329960kiI
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // X.InterfaceC1329960kiI
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // X.InterfaceC1329960kiI
    public int getXOffset() {
        return nativeGetXOffset();
    }

    @Override // X.InterfaceC1329960kiI
    public int getYOffset() {
        return nativeGetYOffset();
    }

    public boolean isBlendWithPreviousFrame() {
        return nativeIsBlendWithPreviousFrame();
    }

    public boolean shouldDisposeToBackgroundColor() {
        return nativeShouldDisposeToBackgroundColor();
    }

    @Override // X.InterfaceC1329960kiI
    public void dispose() {
        nativeDispose();
    }

    public HeifFrame(long j) {
        this.mNativeContext = j;
    }

    private void nativeRenderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(C1328730kgJ.LJIILJJIL, i, i2, bitmap);
    }

    @Override // X.InterfaceC1329960kiI
    public void renderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}
