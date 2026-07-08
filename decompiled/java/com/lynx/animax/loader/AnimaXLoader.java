package com.lynx.animax.loader;

import X.InterfaceC1288480jdO;

/* JADX INFO: loaded from: classes21.dex */
public class AnimaXLoader {
    public final InterfaceC1288480jdO LIZ;

    public AnimaXLoader(InterfaceC1288480jdO interfaceC1288480jdO) {
        this.LIZ = interfaceC1288480jdO;
    }

    public static AnimaXLoader create(InterfaceC1288480jdO interfaceC1288480jdO) {
        return new AnimaXLoader(interfaceC1288480jdO);
    }

    public void load(AnimaXLoaderRequest animaXLoaderRequest, AnimaXLoaderCompletionHandler animaXLoaderCompletionHandler) {
        this.LIZ.LIZ(animaXLoaderRequest, animaXLoaderCompletionHandler);
    }
}
