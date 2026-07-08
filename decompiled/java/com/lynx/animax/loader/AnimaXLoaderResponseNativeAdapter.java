package com.lynx.animax.loader;

import X.C1288570jdX;
import X.EnumC1288560jdW;
import X.InterfaceC1288580jdY;

/* JADX INFO: loaded from: classes21.dex */
public final class AnimaXLoaderResponseNativeAdapter {
    public final C1288570jdX<?> LIZ;

    public AnimaXCloseableBitmapReferenceNativeAdapter getBitmap() {
        return new AnimaXCloseableBitmapReferenceNativeAdapter((InterfaceC1288580jdY) this.LIZ.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public byte[] getData() {
        return (byte[]) this.LIZ.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getErrorMessage() {
        Throwable th;
        C1288570jdX<?> c1288570jdX = this.LIZ;
        return (c1288570jdX.LIZ != EnumC1288560jdW.ERROR || (th = (Throwable) c1288570jdX.LIZIZ) == null) ? "" : th.getMessage();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getFilePath() {
        return (String) this.LIZ.LIZIZ;
    }

    public int getType() {
        return this.LIZ.LIZ.ordinal();
    }

    public AnimaXLoaderResponseNativeAdapter(C1288570jdX<?> c1288570jdX) {
        this.LIZ = c1288570jdX;
    }
}
