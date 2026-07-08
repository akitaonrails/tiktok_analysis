package com.bytedance.common.jato.boost;

import X.C0VSJ;
import X.C2104908Ml;

/* JADX INFO: loaded from: classes4.dex */
public class TextureOpt {
    public static native int nativeUnblockJNISurfaceTexture();

    public static void LIZ() {
        if (C2104908Ml.LIZIZ() && !new C0VSJ("/data/local/tmp/disable_sf_opt").exists()) {
            nativeUnblockJNISurfaceTexture();
        }
    }
}
