package net.jpountz.util;

import X.C08FF;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes31.dex */
public enum SafeUtils {
    ;

    public static void checkLength(int i) {
        if (i >= 0) {
        } else {
            throw new IllegalArgumentException("lengths must be >= 0");
        }
    }

    public static SafeUtils valueOf(String str) {
        return (SafeUtils) C08FF.LIZ(SafeUtils.class, str);
    }

    public static void checkRange(byte[] bArr, int i) {
        if (i >= 0 && i < bArr.length) {
        } else {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public static byte readByte(byte[] bArr, int i) {
        return bArr[i];
    }

    public static int readInt(byte[] bArr, int i) {
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            return readIntBE(bArr, i);
        }
        return readIntLE(bArr, i);
    }

    public static int readIntBE(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int readIntLE(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long readLongLE(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int readShort(short[] sArr, int i) {
        return sArr[i] & 65535;
    }

    public static int readShortLE(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static int readInt(int[] iArr, int i) {
        return iArr[i];
    }

    public static void checkRange(byte[] bArr, int i, int i2) {
        checkLength(i2);
        if (i2 > 0) {
            checkRange(bArr, i);
            checkRange(bArr, (i + i2) - 1);
        }
    }

    public static void writeByte(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) i2;
    }

    public static void writeInt(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    public static void writeShort(short[] sArr, int i, int i2) {
        sArr[i] = (short) i2;
    }

    public static void writeShortLE(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >>> 8);
    }
}
