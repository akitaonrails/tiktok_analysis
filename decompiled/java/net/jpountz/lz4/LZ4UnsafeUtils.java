package net.jpountz.lz4;

import X.C08FF;
import java.nio.ByteOrder;
import net.jpountz.util.UnsafeUtils;
import net.jpountz.util.Utils;

/* JADX INFO: loaded from: classes31.dex */
public enum LZ4UnsafeUtils {
    ;

    public static final /* synthetic */ boolean $assertionsDisabled = false;

    public static LZ4UnsafeUtils valueOf(String str) {
        return (LZ4UnsafeUtils) C08FF.LIZ(LZ4UnsafeUtils.class, str);
    }

    public static int readShortLittleEndian(byte[] bArr, int i) {
        short sReverseBytes = UnsafeUtils.readShort(bArr, i);
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            sReverseBytes = Short.reverseBytes(sReverseBytes);
        }
        return sReverseBytes & 65535;
    }

    public static boolean readIntEquals(byte[] bArr, int i, int i2) {
        if (UnsafeUtils.readInt(bArr, i) == UnsafeUtils.readInt(bArr, i2)) {
            return true;
        }
        return false;
    }

    public static int writeLen(int i, byte[] bArr, int i2) {
        while (i >= 255) {
            UnsafeUtils.writeByte(bArr, i2, 255);
            i -= 255;
            i2++;
        }
        int i3 = i2 + 1;
        UnsafeUtils.writeByte(bArr, i2, i);
        return i3;
    }

    public static void writeShortLittleEndian(byte[] bArr, int i, int i2) {
        short sReverseBytes = (short) i2;
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            sReverseBytes = Short.reverseBytes(sReverseBytes);
        }
        UnsafeUtils.writeShort(bArr, i, sReverseBytes);
    }

    public static int commonBytes(byte[] bArr, int i, int i2, int i3) {
        int iNumberOfTrailingZeros;
        int i4 = 0;
        while (i2 <= i3 - 8) {
            if (UnsafeUtils.readLong(bArr, i2) == UnsafeUtils.readLong(bArr, i)) {
                i4 += 8;
                i += 8;
                i2 += 8;
            } else {
                if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
                    iNumberOfTrailingZeros = Long.numberOfLeadingZeros(UnsafeUtils.readLong(bArr, i) ^ UnsafeUtils.readLong(bArr, i2));
                } else {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(UnsafeUtils.readLong(bArr, i) ^ UnsafeUtils.readLong(bArr, i2));
                }
                return i4 + (iNumberOfTrailingZeros >>> 3);
            }
        }
        while (i2 < i3) {
            int i5 = i + 1;
            int i6 = i2 + 1;
            if (UnsafeUtils.readByte(bArr, i) != UnsafeUtils.readByte(bArr, i2)) {
                break;
            }
            i4++;
            i = i5;
            i2 = i6;
        }
        return i4;
    }

    public static void safeIncrementalCopy(byte[] bArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 + i4;
            int i6 = i + i4;
            bArr[i5] = bArr[i6];
            UnsafeUtils.writeByte(bArr, i5, UnsafeUtils.readByte(bArr, i6));
        }
    }

    public static void wildIncrementalCopy(byte[] bArr, int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 < 4) {
            int i5 = 0;
            int i6 = 0;
            do {
                UnsafeUtils.writeByte(bArr, i2 + i6, UnsafeUtils.readByte(bArr, i + i6));
                i6++;
            } while (i6 < 4);
            int i7 = i2 + 4;
            int i8 = i + 4;
            int i9 = i7 - i8;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 5) {
                            if (i9 != 6) {
                                if (i9 == 7) {
                                    i5 = 3;
                                }
                            } else {
                                i5 = 2;
                            }
                        } else {
                            i5 = 1;
                        }
                    } else {
                        i8 -= 3;
                        i5 = -1;
                    }
                } else {
                    i8 -= 2;
                }
            } else {
                i8 -= 3;
            }
            UnsafeUtils.writeInt(bArr, i7, UnsafeUtils.readInt(bArr, i8));
            i2 = i7 + 4;
            i = i8 - i5;
        } else if (i4 < 8) {
            UnsafeUtils.writeLong(bArr, i2, UnsafeUtils.readLong(bArr, i));
            i2 += i4;
        }
        while (i2 < i3) {
            UnsafeUtils.writeLong(bArr, i2, UnsafeUtils.readLong(bArr, i));
            i2 += 8;
            i += 8;
        }
    }

    public static int commonBytesBackward(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = 0;
        while (i > i3 && i2 > i4) {
            i--;
            i2--;
            if (UnsafeUtils.readByte(bArr, i) != UnsafeUtils.readByte(bArr, i2)) {
                break;
            }
            i5++;
        }
        return i5;
    }

    public static void safeArraycopy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i3 & (-8);
        wildArraycopy(bArr, i, bArr2, i2, i4);
        int i5 = i3 & 7;
        for (int i6 = 0; i6 < i5; i6++) {
            UnsafeUtils.writeByte(bArr2, i2 + i4 + i6, UnsafeUtils.readByte(bArr, i + i4 + i6));
        }
    }

    public static void wildArraycopy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 8) {
            UnsafeUtils.writeLong(bArr2, i2 + i4, UnsafeUtils.readLong(bArr, i + i4));
        }
    }

    public static int lastLiterals(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        return LZ4SafeUtils.lastLiterals(bArr, i, i2, bArr2, i3, i4);
    }

    public static int encodeSequence(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i2 - i;
        int iWriteLen = i5 + 1;
        if (i9 >= 15) {
            iWriteLen = writeLen(i9 - 15, bArr2, iWriteLen);
            i7 = -16;
        } else {
            i7 = i9 << 4;
        }
        wildArraycopy(bArr, i, bArr2, iWriteLen, i9);
        int i10 = iWriteLen + i9;
        int i11 = i2 - i3;
        int i12 = i10 + 1;
        bArr2[i10] = (byte) i11;
        int iWriteLen2 = i12 + 1;
        bArr2[i12] = (byte) (i11 >>> 8);
        int i13 = i4 - 4;
        if (iWriteLen2 + 6 + (i13 >>> 8) <= i6) {
            if (i13 >= 15) {
                i8 = i7 | 15;
                iWriteLen2 = writeLen(i13 - 15, bArr2, iWriteLen2);
            } else {
                i8 = i7 | i13;
            }
            bArr2[i5] = (byte) i8;
            return iWriteLen2;
        }
        throw new LZ4Exception("maxDestLen is too small");
    }
}
