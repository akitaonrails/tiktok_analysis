package com.lynx.animax.loader;

import X.C1288570jdX;
import X.InterfaceC1285780jZ2;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
public class AnimaXLoaderCompletionHandler implements InterfaceC1285780jZ2 {
    public final long LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public native void nativeOnComplete(long j, AnimaXLoaderResponseNativeAdapter animaXLoaderResponseNativeAdapter);

    public AnimaXLoaderCompletionHandler(long j) {
        this.LIZ = j;
    }

    public static AnimaXLoaderCompletionHandler createCompletionHandler(long j) {
        return new AnimaXLoaderCompletionHandler(j);
    }

    public final void LIZ(C1288570jdX<?> c1288570jdX) {
        if (!this.LIZIZ.getAndSet(true)) {
            nativeOnComplete(this.LIZ, new AnimaXLoaderResponseNativeAdapter(c1288570jdX));
        }
    }
}
