package com.bytedance.mt.protector.impl.string2number;

import X.C08FJ;
import X.C08FN;
import X.C08FO;
import X.C09EU;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class CastLongProtector extends C08FJ<Long> {
    public static long parseLong(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return Long.parseLong(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Long l = (Long) C08FJ.tryProtect(th, Long.class);
                if (l != null) {
                    return l.longValue();
                }
                throw th;
            }
        }
        return Long.parseLong(str);
    }

    public static long parseUnsignedLong(String str) {
        int i;
        long j;
        long j2;
        long j3;
        if (C09EU.LIZIZ()) {
            try {
                return C08FO.LIZ(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Long l = (Long) C08FJ.tryProtect(th, Long.class);
                if (l != null) {
                    return l.longValue();
                }
                throw th;
            }
        }
        int length = str.length();
        if (length != 0) {
            int i2 = 10;
            long j4 = 10;
            long j5 = 0;
            int i3 = 0;
            if (j4 < 0) {
                if (Long.MAX_VALUE < (j4 ^ Long.MIN_VALUE)) {
                    j = 0;
                } else {
                    j = 1;
                }
            } else {
                long j6 = (Long.MAX_VALUE / j4) << 1;
                if ((((-1) - (j6 * j4)) ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE)) {
                    i = 1;
                } else {
                    i = 0;
                }
                j = j6 + ((long) i);
            }
            if (str.charAt(0) == '+' && length > 1) {
                i3 = 1;
            }
            long j7 = 0;
            while (i3 < length) {
                int iDigit = Character.digit(str.charAt(i3), i2);
                if (iDigit != -1) {
                    if (j7 >= j5 && j7 <= j) {
                        if (j7 == j) {
                            if (j4 < 0) {
                                if (Long.MAX_VALUE < (j4 ^ Long.MIN_VALUE)) {
                                    j3 = -1;
                                } else {
                                    j3 = (-1) - j4;
                                }
                            } else {
                                long j8 = (-1) - (((Long.MAX_VALUE / j4) << 1) * j4);
                                if ((j8 ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE)) {
                                    j2 = j4;
                                } else {
                                    j2 = 0;
                                }
                                j3 = j8 - j2;
                            }
                            if (iDigit <= ((int) j3)) {
                            }
                        }
                        j7 = (j7 * j4) + ((long) iDigit);
                        i3++;
                        i2 = 10;
                        j5 = 0;
                    }
                    throw new NumberFormatException("Too large for unsigned long: ".concat(str));
                }
                throw new NumberFormatException(str);
            }
            return j7;
        }
        throw new NumberFormatException("empty string");
    }

    public static Long valueOf(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return Long.valueOf(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Long l = (Long) C08FJ.tryProtect(th, Long.class);
                if (l != null) {
                    return l;
                }
                throw th;
            }
        }
        return Long.valueOf(str);
    }

    public static long parseLong(String str, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return Long.parseLong(str, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Long l = (Long) C08FJ.tryProtect(th, Long.class);
                if (l != null) {
                    return l.longValue();
                }
                throw th;
            }
        }
        return Long.parseLong(str, i);
    }

    public static long parseUnsignedLong(String str, int i) {
        int i2;
        long j;
        long j2;
        long j3;
        if (C09EU.LIZIZ()) {
            try {
                return C08FN.LIZ(i, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Long l = (Long) C08FJ.tryProtect(th, Long.class);
                if (l != null) {
                    return l.longValue();
                }
                throw th;
            }
        }
        int length = str.length();
        if (length != 0) {
            if (i >= 2 && i <= 36) {
                long j4 = i;
                long j5 = 0;
                int i3 = 0;
                if (j4 < 0) {
                    if (Long.MAX_VALUE < (j4 ^ Long.MIN_VALUE)) {
                        j = 0;
                    } else {
                        j = 1;
                    }
                } else {
                    long j6 = (Long.MAX_VALUE / j4) << 1;
                    if ((((-1) - (j6 * j4)) ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE)) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    j = j6 + ((long) i2);
                }
                if (str.charAt(0) == '+' && length > 1) {
                    i3 = 1;
                }
                long j7 = 0;
                while (i3 < length) {
                    int iDigit = Character.digit(str.charAt(i3), i);
                    if (iDigit != -1) {
                        if (j7 >= j5 && j7 <= j) {
                            if (j7 == j) {
                                if (j4 < 0) {
                                    if (Long.MAX_VALUE < (j4 ^ Long.MIN_VALUE)) {
                                        j3 = -1;
                                    } else {
                                        j3 = (-1) - j4;
                                    }
                                } else {
                                    long j8 = (-1) - (((Long.MAX_VALUE / j4) << 1) * j4);
                                    if ((j8 ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE)) {
                                        j2 = j4;
                                    } else {
                                        j2 = 0;
                                    }
                                    j3 = j8 - j2;
                                }
                                if (iDigit <= ((int) j3)) {
                                }
                            }
                            j7 = (j7 * j4) + ((long) iDigit);
                            i3++;
                            j5 = 0;
                        }
                        throw new NumberFormatException("Too large for unsigned long: ".concat(str));
                    }
                    throw new NumberFormatException(str);
                }
                return j7;
            }
            throw new NumberFormatException("illegal radix: ".concat(String.valueOf(i)));
        }
        throw new NumberFormatException("empty string");
    }

    public static Long valueOf(String str, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return Long.valueOf(str, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Long l = (Long) C08FJ.tryProtect(th, Long.class);
                if (l != null) {
                    return l;
                }
                throw th;
            }
        }
        return Long.valueOf(str, i);
    }
}
