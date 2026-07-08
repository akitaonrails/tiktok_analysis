package net.jpountz.util;

import X.C08FF;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes31.dex */
public enum Utils {
    ;

    public static final ByteOrder NATIVE_BYTE_ORDER = ByteOrder.nativeOrder();
    public static final boolean unalignedAccessAllowed;

    static {
        String property = System.getProperty("os.arch");
        unalignedAccessAllowed = property.equals("i386") || property.equals("x86") || property.equals("amd64") || property.equals("x86_64") || property.equals("aarch64") || property.equals("ppc64le");
    }

    public static boolean isUnalignedAccessAllowed() {
        return unalignedAccessAllowed;
    }

    public static Utils valueOf(String str) {
        return (Utils) C08FF.LIZ(Utils.class, str);
    }
}
