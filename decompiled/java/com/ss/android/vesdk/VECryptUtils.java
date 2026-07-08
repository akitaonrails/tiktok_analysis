package com.ss.android.vesdk;

import X.C2484209oO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileDescriptor;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class VECryptUtils {
    public static native String nativeQueryCryptJson(String str);

    public static String queryCryptJson(String str) {
        return nativeQueryCryptJson(str);
    }

    public static InputStream cryptGetInputStream(FileDescriptor fileDescriptor, String str) {
        try {
            return new TECryptStream(fileDescriptor, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2484209oO.LIZJ("VECryptUtils", th.getLocalizedMessage());
            return null;
        }
    }

    public static InputStream cryptGetInputStream(String str, String str2) {
        try {
            return new TECryptStream(str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2484209oO.LIZJ("VECryptUtils", th.getLocalizedMessage());
            return null;
        }
    }
}
