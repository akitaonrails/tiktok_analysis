package com.bytedance.netecho;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public final class NetechoConfig {
    public static final NetechoConfig INSTANCE = new NetechoConfig();
    public static Function1<? super String, Unit> loadLibrary = NetechoConfig$loadLibrary$1.INSTANCE;

    public final Function1<String, Unit> getLoadLibrary() {
        return loadLibrary;
    }

    public final void setLoadLibrary(Function1<? super String, Unit> function1) {
        loadLibrary = function1;
    }
}
