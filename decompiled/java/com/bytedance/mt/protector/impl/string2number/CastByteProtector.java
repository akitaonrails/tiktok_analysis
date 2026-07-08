package com.bytedance.mt.protector.impl.string2number;

import X.C08FJ;
import X.C09EU;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class CastByteProtector extends C08FJ<Byte> {
    public static byte parseByte(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return Byte.parseByte(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Byte b = (Byte) C08FJ.tryProtect(th, Byte.class);
                if (b != null) {
                    return b.byteValue();
                }
                throw th;
            }
        }
        return Byte.parseByte(str);
    }

    public static Byte valueOf(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return Byte.valueOf(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Byte b = (Byte) C08FJ.tryProtect(th, Byte.class);
                if (b != null) {
                    return b;
                }
                throw th;
            }
        }
        return Byte.valueOf(str);
    }

    public static byte parseByte(String str, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return Byte.parseByte(str, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Byte b = (Byte) C08FJ.tryProtect(th, Byte.class);
                if (b != null) {
                    return b.byteValue();
                }
                throw th;
            }
        }
        return Byte.parseByte(str, i);
    }

    public static Byte valueOf(String str, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return Byte.valueOf(str, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Byte b = (Byte) C08FJ.tryProtect(th, Byte.class);
                if (b != null) {
                    return b;
                }
                throw th;
            }
        }
        return Byte.valueOf(str, i);
    }
}
