package com.bytedance.vcloud.strategy.drm;

import X.C2188811AlT;
import X.C786410Ut5;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.UUID;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public final class PsshUtils {
    public static final UUID WIDEVINE_UUID = new UUID(-1301668207276963122L, -6645017420763422227L);

    public static String bytesToHex(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (byte b : bArr) {
                sb.append(C786410Ut5.j4("%02X", new Object[]{Integer.valueOf(b & 255)}));
            }
            return sb.toString();
        }
        return "null";
    }

    public static String cacheKeyOf(String str) {
        String kidFromPssh = parseKidFromPssh(str);
        if (kidFromPssh != null) {
            return kidFromPssh;
        }
        return str;
    }

    public static String identityOf(Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.g);
        sbLIZ.append(Integer.toHexString(System.identityHashCode(obj)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String joinSortedKids(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        for (int i = 1; i < strArr.length; i++) {
            String str = strArr[i];
            int i2 = i - 1;
            while (i2 >= 0) {
                String str2 = strArr[i2];
                if (str2 == null || str2.compareTo(str) <= 0) {
                    break;
                }
                strArr[i2 + 1] = strArr[i2];
                i2--;
            }
            strArr[i2 + 1] = str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (strArr[i3] != null) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(strArr[i3]);
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    public static String parseKidFromPssh(byte[] bArr) {
        if (bArr != null) {
            int i = 32;
            if (bArr.length >= 32) {
                try {
                    readU32(bArr, 0);
                    if (bArr[4] == 112 && bArr[5] == 115 && bArr[6] == 115 && bArr[7] == 104) {
                        int i2 = bArr[8] & 255;
                        if (28 > bArr.length) {
                            return null;
                        }
                        long u64 = readU64(bArr, 12);
                        long u642 = readU64(bArr, 20);
                        UUID uuid = WIDEVINE_UUID;
                        if (u64 == uuid.getMostSignificantBits() && u642 == uuid.getLeastSignificantBits()) {
                            if (i2 > 0) {
                                if (32 > bArr.length) {
                                    return null;
                                }
                                long u32 = readU32(bArr, 28);
                                String[] strArr = new String[(int) u32];
                                int i3 = 0;
                                while (i3 < u32) {
                                    int i4 = i + 16;
                                    if (i4 > bArr.length) {
                                        return null;
                                    }
                                    byte[] bArr2 = new byte[16];
                                    System.arraycopy(bArr, i, bArr2, 0, 16);
                                    strArr[i3] = bytesToHex(bArr2);
                                    i3++;
                                    i = i4;
                                }
                                return joinSortedKids(strArr);
                            }
                            if (32 > bArr.length) {
                                return null;
                            }
                            return parseKidFromWidevinePsshData(bArr, 32, (int) Math.min(bArr.length, ((long) 32) + readU32(bArr, 28)));
                        }
                    }
                    return null;
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return null;
    }

    public static String parseKidFromPssh(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return parseKidFromPssh(Base64.decode(str, 0));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static long readU32(byte[] bArr, int i) {
        return ((long) (bArr[i + 3] & 255)) | (((long) (bArr[i] & 255)) << 24) | (((long) (bArr[i + 1] & 255)) << 16) | (((long) (bArr[i + 2] & 255)) << 8);
    }

    public static long readU64(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            j = (j << 8) | ((long) (bArr[i + i2] & 255));
        }
        return j;
    }

    public static String parseKidFromWidevinePsshData(byte[] bArr, int i, int i2) {
        int i3;
        String[] strArr = new String[8];
        int i4 = 0;
        while (i < i2) {
            int i5 = i + 1;
            int i6 = bArr[i] & 255;
            int i7 = i6 >> 3;
            int i8 = i6 & 7;
            if (i8 == 2) {
                long[] jArr = new long[1];
                int varint = readVarint(bArr, i5, i2, jArr);
                if (varint < 0 || (i3 = (int) jArr[0]) < 0 || (i = varint + i3) > i2) {
                    break;
                }
                if (i7 == 2 && i3 == 16) {
                    byte[] bArr2 = new byte[16];
                    System.arraycopy(bArr, varint, bArr2, 0, 16);
                    if (i4 == strArr.length) {
                        String[] strArr2 = new String[strArr.length * 2];
                        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                        strArr = strArr2;
                    }
                    strArr[i4] = bytesToHex(bArr2);
                    i4++;
                }
            } else if (i8 == 0) {
                i = readVarint(bArr, i5, i2, new long[1]);
                if (i < 0) {
                    break;
                }
            } else if (i8 == 5) {
                i = i5 + 4;
            } else {
                if (i8 != 1) {
                    break;
                }
                i = i5 + 8;
            }
        }
        if (i4 == 0) {
            return null;
        }
        String[] strArr3 = new String[i4];
        System.arraycopy(strArr, 0, strArr3, 0, i4);
        return joinSortedKids(strArr3);
    }

    public static int readVarint(byte[] bArr, int i, int i2, long[] jArr) {
        long j = 0;
        int i3 = 0;
        while (i < i2 && i3 < 64) {
            int i4 = i + 1;
            int i5 = bArr[i] & 255;
            j |= ((long) (i5 & 127)) << i3;
            if ((i5 & 128) == 0) {
                jArr[0] = j;
                return i4;
            }
            i3 += 7;
            i = i4;
        }
        return -1;
    }
}
