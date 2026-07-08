package com.bytedance.mt.protector.impl.string2number;

import X.C08FJ;
import X.C08FM;
import X.C09EU;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class CastIntegerProtector extends C08FJ<Integer> {
    public static int parseInt(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return Integer.parseInt(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Integer num = (Integer) C08FJ.tryProtect(th, Integer.class);
                if (num != null) {
                    return num.intValue();
                }
                throw th;
            }
        }
        return Integer.parseInt(str);
    }

    public static int parseUnsignedInt(String str) {
        if (C09EU.LIZIZ()) {
            try {
                if (str.length() > 1 && str.charAt(0) == '+') {
                    str = str.substring(1);
                }
                long j = Long.parseLong(str, 10);
                if ((4294967295L & j) == j) {
                    return (int) j;
                }
                throw new NumberFormatException("Input " + str + " in base 10 is not in the range of an unsigned integer");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Integer num = (Integer) C08FJ.tryProtect(th, Integer.class);
                if (num != null) {
                    return num.intValue();
                }
                throw th;
            }
        }
        if (str.length() > 1 && str.charAt(0) == '+') {
            str = str.substring(1);
        }
        long j2 = Long.parseLong(str, 10);
        if ((4294967295L & j2) == j2) {
            return (int) j2;
        }
        throw new NumberFormatException("Input " + str + " in base 10 is not in the range of an unsigned integer");
    }

    public static Integer valueOf(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return Integer.valueOf(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Integer num = (Integer) C08FJ.tryProtect(th, Integer.class);
                if (num != null) {
                    return num;
                }
                throw th;
            }
        }
        return Integer.valueOf(str);
    }

    public static int parseInt(String str, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return Integer.parseInt(str, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Integer num = (Integer) C08FJ.tryProtect(th, Integer.class);
                if (num != null) {
                    return num.intValue();
                }
                throw th;
            }
        }
        return Integer.parseInt(str, i);
    }

    public static int parseUnsignedInt(String str, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return C08FM.LIZ(i, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Integer num = (Integer) C08FJ.tryProtect(th, Integer.class);
                if (num != null) {
                    return num.intValue();
                }
                throw th;
            }
        }
        if (str.length() > 1 && str.charAt(0) == '+') {
            str = str.substring(1);
        }
        long j = Long.parseLong(str, i);
        if ((4294967295L & j) == j) {
            return (int) j;
        }
        throw new NumberFormatException("Input " + str + " in base " + i + " is not in the range of an unsigned integer");
    }

    public static Integer valueOf(String str, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return Integer.valueOf(str, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Integer num = (Integer) C08FJ.tryProtect(th, Integer.class);
                if (num != null) {
                    return num;
                }
                throw th;
            }
        }
        return Integer.valueOf(str, i);
    }
}
