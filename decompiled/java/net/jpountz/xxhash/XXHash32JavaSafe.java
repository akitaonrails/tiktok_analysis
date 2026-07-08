package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* JADX INFO: loaded from: classes36.dex */
public final class XXHash32JavaSafe extends XXHash32 {
    public static final XXHash32 INSTANCE = new XXHash32JavaSafe();

    @Override // net.jpountz.xxhash.XXHash32
    public int hash(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int iRotateLeft;
        int i4 = i;
        int iRotateLeft2 = i3;
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), i4 + byteBuffer.arrayOffset(), i2, iRotateLeft2);
        }
        ByteBufferUtils.checkRange(byteBuffer, i4, i2);
        ByteBuffer byteBufferInLittleEndianOrder = ByteBufferUtils.inLittleEndianOrder(byteBuffer);
        int i5 = i4 + i2;
        if (i2 >= 16) {
            int i6 = i5 - 16;
            int iRotateLeft3 = (iRotateLeft2 - 1640531535) - 2048144777;
            int iRotateLeft4 = iRotateLeft2 - 2048144777;
            int iRotateLeft5 = iRotateLeft2 - (-1640531535);
            do {
                iRotateLeft3 = Integer.rotateLeft(iRotateLeft3 + (ByteBufferUtils.readIntLE(byteBufferInLittleEndianOrder, i4) * (-2048144777)), 13) * (-1640531535);
                int i7 = i4 + 4;
                iRotateLeft4 = Integer.rotateLeft(iRotateLeft4 + (ByteBufferUtils.readIntLE(byteBufferInLittleEndianOrder, i7) * (-2048144777)), 13) * (-1640531535);
                int i8 = i7 + 4;
                iRotateLeft2 = Integer.rotateLeft(iRotateLeft2 + (ByteBufferUtils.readIntLE(byteBufferInLittleEndianOrder, i8) * (-2048144777)), 13) * (-1640531535);
                int i9 = i8 + 4;
                iRotateLeft5 = Integer.rotateLeft(iRotateLeft5 + (ByteBufferUtils.readIntLE(byteBufferInLittleEndianOrder, i9) * (-2048144777)), 13) * (-1640531535);
                i4 = i9 + 4;
            } while (i4 <= i6);
            iRotateLeft = Integer.rotateLeft(iRotateLeft3, 1) + Integer.rotateLeft(iRotateLeft4, 7) + Integer.rotateLeft(iRotateLeft2, 12) + Integer.rotateLeft(iRotateLeft5, 18);
        } else {
            iRotateLeft = iRotateLeft2 + 374761393;
        }
        int iRotateLeft6 = iRotateLeft + i2;
        while (i4 <= i5 - 4) {
            iRotateLeft6 = Integer.rotateLeft(iRotateLeft6 + (ByteBufferUtils.readIntLE(byteBufferInLittleEndianOrder, i4) * (-1028477379)), 17) * 668265263;
            i4 += 4;
        }
        while (i4 < i5) {
            iRotateLeft6 = Integer.rotateLeft(iRotateLeft6 + ((ByteBufferUtils.readByte(byteBufferInLittleEndianOrder, i4) & 255) * 374761393), 11) * (-1640531535);
            i4++;
        }
        int i10 = ((iRotateLeft6 >>> 15) ^ iRotateLeft6) * (-2048144777);
        int i11 = (i10 ^ (i10 >>> 13)) * (-1028477379);
        return i11 ^ (i11 >>> 16);
    }

    @Override // net.jpountz.xxhash.XXHash32
    public int hash(byte[] bArr, int i, int i2, int i3) {
        int iRotateLeft;
        SafeUtils.checkRange(bArr, i, i2);
        int i4 = i + i2;
        if (i2 >= 16) {
            int i5 = i4 - 16;
            int iRotateLeft2 = (i3 - 1640531535) - 2048144777;
            int iRotateLeft3 = i3 - 2048144777;
            int iRotateLeft4 = i3 - (-1640531535);
            do {
                iRotateLeft2 = Integer.rotateLeft(iRotateLeft2 + (SafeUtils.readIntLE(bArr, i) * (-2048144777)), 13) * (-1640531535);
                int i6 = i + 4;
                iRotateLeft3 = Integer.rotateLeft(iRotateLeft3 + (SafeUtils.readIntLE(bArr, i6) * (-2048144777)), 13) * (-1640531535);
                int i7 = i6 + 4;
                i3 = Integer.rotateLeft(i3 + (SafeUtils.readIntLE(bArr, i7) * (-2048144777)), 13) * (-1640531535);
                int i8 = i7 + 4;
                iRotateLeft4 = Integer.rotateLeft(iRotateLeft4 + (SafeUtils.readIntLE(bArr, i8) * (-2048144777)), 13) * (-1640531535);
                i = i8 + 4;
            } while (i <= i5);
            iRotateLeft = Integer.rotateLeft(iRotateLeft2, 1) + Integer.rotateLeft(iRotateLeft3, 7) + Integer.rotateLeft(i3, 12) + Integer.rotateLeft(iRotateLeft4, 18);
        } else {
            iRotateLeft = i3 + 374761393;
        }
        int iRotateLeft5 = iRotateLeft + i2;
        while (i <= i4 - 4) {
            iRotateLeft5 = Integer.rotateLeft(iRotateLeft5 + (SafeUtils.readIntLE(bArr, i) * (-1028477379)), 17) * 668265263;
            i += 4;
        }
        while (i < i4) {
            iRotateLeft5 = Integer.rotateLeft(iRotateLeft5 + ((SafeUtils.readByte(bArr, i) & 255) * 374761393), 11) * (-1640531535);
            i++;
        }
        int i9 = ((iRotateLeft5 >>> 15) ^ iRotateLeft5) * (-2048144777);
        int i10 = (i9 ^ (i9 >>> 13)) * (-1028477379);
        return i10 ^ (i10 >>> 16);
    }
}
