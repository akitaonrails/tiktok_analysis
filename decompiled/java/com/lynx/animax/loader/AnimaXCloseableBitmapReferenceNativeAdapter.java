package com.lynx.animax.loader;

import X.InterfaceC1288580jdY;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes21.dex */
public class AnimaXCloseableBitmapReferenceNativeAdapter {
    public final InterfaceC1288580jdY LIZ;

    public void close() {
        this.LIZ.close();
    }

    public Bitmap get() {
        return this.LIZ.get();
    }

    public boolean isValid() {
        return this.LIZ.isValid();
    }

    public AnimaXCloseableBitmapReferenceNativeAdapter(InterfaceC1288580jdY interfaceC1288580jdY) {
        this.LIZ = interfaceC1288580jdY;
    }
}
