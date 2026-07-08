package com.sun.jna;

import X.C1697810uHb;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS286S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class JnaLibrarianLancetHelper {
    public static final JnaLibrarianLancetHelper INSTANCE = new JnaLibrarianLancetHelper();
    public static final List<Function2<String, Integer, Long>> loadLibraryRetries;
    public static final Constructor<NativeLibrary> nativeLibraryCtor;

    static {
        Constructor<NativeLibrary> declaredConstructor = NativeLibrary.class.getDeclaredConstructor(String.class, String.class, Long.TYPE, Map.class);
        declaredConstructor.setAccessible(true);
        nativeLibraryCtor = declaredConstructor;
        loadLibraryRetries = C1697810uHb.LJIIJJI(AFwS286S0000000_3.get$arr$(4), AFwS286S0000000_3.get$arr$(5), AFwS286S0000000_3.get$arr$(6), AFwS286S0000000_3.get$arr$(7));
    }

    public final List<Function2<String, Integer, Long>> getLoadLibraryRetries() {
        return loadLibraryRetries;
    }

    public final NativeLibrary newNativeLibrary(String str, long j, Map<String, ?> map) {
        return nativeLibraryCtor.newInstance(str, str, Long.valueOf(j), map);
    }
}
