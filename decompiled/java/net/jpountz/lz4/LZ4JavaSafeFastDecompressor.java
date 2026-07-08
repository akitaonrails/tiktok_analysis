package net.jpountz.lz4;

import X.C2188811AlT;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* JADX INFO: loaded from: classes36.dex */
public final class LZ4JavaSafeFastDecompressor extends LZ4FastDecompressor {
    public static final LZ4FastDecompressor INSTANCE = new LZ4JavaSafeFastDecompressor();

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        int i4;
        byte b;
        int i5;
        byte b2;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return decompress(byteBuffer.array(), i + byteBuffer.arrayOffset(), byteBuffer2.array(), i2 + byteBuffer2.arrayOffset(), i3);
        }
        ByteBuffer byteBufferInNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
        ByteBuffer byteBufferInNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder, i);
        ByteBufferUtils.checkRange(byteBufferInNativeByteOrder2, i2, i3);
        if (i3 == 0) {
            if (ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i) == 0) {
                return 1;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Malformed input at ");
            sbLIZ.append(i);
            throw new LZ4Exception(C2188811AlT.LIZIZ(sbLIZ));
        }
        int i6 = i3 + i2;
        int i7 = i;
        int i8 = i2;
        while (true) {
            int i9 = ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i7) & 255;
            int i10 = i7 + 1;
            int i11 = i9 >>> 4;
            if (i11 == 15) {
                while (true) {
                    i5 = i10 + 1;
                    b2 = ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i10);
                    if (b2 != -1) {
                        break;
                    }
                    i11 += 255;
                    i10 = i5;
                }
                i11 += b2 & 255;
                i10 = i5;
            }
            int i12 = i8 + i11;
            int i13 = i6 - 8;
            if (i12 > i13) {
                if (i12 == i6) {
                    LZ4ByteBufferUtils.safeArraycopy(byteBufferInNativeByteOrder, i10, byteBufferInNativeByteOrder2, i8, i11);
                    return (i10 + i11) - i;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Malformed input at ");
                sbLIZ2.append(i10);
                throw new LZ4Exception(C2188811AlT.LIZIZ(sbLIZ2));
            }
            LZ4ByteBufferUtils.wildArraycopy(byteBufferInNativeByteOrder, i10, byteBufferInNativeByteOrder2, i8, i11);
            int i14 = i10 + i11;
            i7 = i14 + 2;
            int shortLE = i12 - ByteBufferUtils.readShortLE(byteBufferInNativeByteOrder, i14);
            if (shortLE >= i2) {
                int i15 = i9 & 15;
                if (i15 == 15) {
                    while (true) {
                        i4 = i7 + 1;
                        b = ByteBufferUtils.readByte(byteBufferInNativeByteOrder, i7);
                        if (b != -1) {
                            break;
                        }
                        i15 += 255;
                        i7 = i4;
                    }
                    i15 += b & 255;
                    i7 = i4;
                }
                int i16 = i15 + 4;
                i8 = i12 + i16;
                if (i8 > i13) {
                    if (i8 <= i6) {
                        LZ4ByteBufferUtils.safeIncrementalCopy(byteBufferInNativeByteOrder2, shortLE, i12, i16);
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Malformed input at ");
                        sbLIZ3.append(i7);
                        throw new LZ4Exception(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                } else {
                    LZ4ByteBufferUtils.wildIncrementalCopy(byteBufferInNativeByteOrder2, shortLE, i12, i8);
                }
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Malformed input at ");
                sbLIZ4.append(i7);
                throw new LZ4Exception(C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor, net.jpountz.lz4.LZ4Decompressor
    public int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        byte b;
        int i5;
        byte b2;
        SafeUtils.checkRange(bArr, i);
        SafeUtils.checkRange(bArr2, i2, i3);
        if (i3 == 0) {
            if (SafeUtils.readByte(bArr, i) == 0) {
                return 1;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Malformed input at ");
            sbLIZ.append(i);
            throw new LZ4Exception(C2188811AlT.LIZIZ(sbLIZ));
        }
        int i6 = i3 + i2;
        int i7 = i;
        int i8 = i2;
        while (true) {
            int i9 = SafeUtils.readByte(bArr, i7) & 255;
            int i10 = i7 + 1;
            int i11 = i9 >>> 4;
            if (i11 == 15) {
                while (true) {
                    i5 = i10 + 1;
                    b2 = SafeUtils.readByte(bArr, i10);
                    if (b2 != -1) {
                        break;
                    }
                    i11 += 255;
                    i10 = i5;
                }
                i11 += b2 & 255;
                i10 = i5;
            }
            int i12 = i8 + i11;
            int i13 = i6 - 8;
            if (i12 > i13) {
                if (i12 == i6) {
                    LZ4SafeUtils.safeArraycopy(bArr, i10, bArr2, i8, i11);
                    return (i10 + i11) - i;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Malformed input at ");
                sbLIZ2.append(i10);
                throw new LZ4Exception(C2188811AlT.LIZIZ(sbLIZ2));
            }
            LZ4SafeUtils.wildArraycopy(bArr, i10, bArr2, i8, i11);
            int i14 = i10 + i11;
            i7 = i14 + 2;
            int shortLE = i12 - SafeUtils.readShortLE(bArr, i14);
            if (shortLE >= i2) {
                int i15 = i9 & 15;
                if (i15 == 15) {
                    while (true) {
                        i4 = i7 + 1;
                        b = SafeUtils.readByte(bArr, i7);
                        if (b != -1) {
                            break;
                        }
                        i15 += 255;
                        i7 = i4;
                    }
                    i15 += b & 255;
                    i7 = i4;
                }
                int i16 = i15 + 4;
                i8 = i12 + i16;
                if (i8 > i13) {
                    if (i8 <= i6) {
                        LZ4SafeUtils.safeIncrementalCopy(bArr2, shortLE, i12, i16);
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Malformed input at ");
                        sbLIZ3.append(i7);
                        throw new LZ4Exception(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                } else {
                    LZ4SafeUtils.wildIncrementalCopy(bArr2, shortLE, i12, i8);
                }
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Malformed input at ");
                sbLIZ4.append(i7);
                throw new LZ4Exception(C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
    }
}
