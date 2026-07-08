package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* JADX INFO: loaded from: classes36.dex */
public final class XXHash64JavaSafe extends XXHash64 {
    public static final XXHash64 INSTANCE = new XXHash64JavaSafe();

    @Override // net.jpountz.xxhash.XXHash64
    public long hash(ByteBuffer byteBuffer, int i, int i2, long j) {
        long jRotateLeft;
        int i3 = i;
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), i3 + byteBuffer.arrayOffset(), i2, j);
        }
        ByteBufferUtils.checkRange(byteBuffer, i3, i2);
        ByteBuffer byteBufferInLittleEndianOrder = ByteBufferUtils.inLittleEndianOrder(byteBuffer);
        int i4 = i3 + i2;
        long j2 = -4417276706812531889L;
        if (i2 >= 32) {
            int i5 = i4 - 32;
            long jRotateLeft2 = (j - 7046029288634856825L) - 4417276706812531889L;
            long jRotateLeft3 = j - 4417276706812531889L;
            long jRotateLeft4 = j + 0;
            long jRotateLeft5 = j - (-7046029288634856825L);
            while (true) {
                jRotateLeft2 = Long.rotateLeft(jRotateLeft2 + (ByteBufferUtils.readLongLE(byteBufferInLittleEndianOrder, i3) * j2), 31) * (-7046029288634856825L);
                int i6 = i3 + 8;
                jRotateLeft3 = Long.rotateLeft(jRotateLeft3 + (ByteBufferUtils.readLongLE(byteBufferInLittleEndianOrder, i6) * j2), 31) * (-7046029288634856825L);
                int i7 = i6 + 8;
                jRotateLeft4 = Long.rotateLeft(jRotateLeft4 + (ByteBufferUtils.readLongLE(byteBufferInLittleEndianOrder, i7) * j2), 31) * (-7046029288634856825L);
                int i8 = i7 + 8;
                jRotateLeft5 = Long.rotateLeft(jRotateLeft5 + (ByteBufferUtils.readLongLE(byteBufferInLittleEndianOrder, i8) * j2), 31) * (-7046029288634856825L);
                i3 = i8 + 8;
                if (i3 > i5) {
                    break;
                }
                j2 = -4417276706812531889L;
            }
            jRotateLeft = ((((((((((((Long.rotateLeft(jRotateLeft2 * (-4417276706812531889L), 31) * (-7046029288634856825L)) ^ (((Long.rotateLeft(jRotateLeft2, 1) + Long.rotateLeft(jRotateLeft3, 7)) + Long.rotateLeft(jRotateLeft4, 12)) + Long.rotateLeft(jRotateLeft5, 18))) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(jRotateLeft3 * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(jRotateLeft4 * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(jRotateLeft5 * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L;
        } else {
            jRotateLeft = j + 2870177450012600261L;
        }
        long jRotateLeft6 = jRotateLeft + ((long) i2);
        while (i3 <= i4 - 8) {
            jRotateLeft6 = (Long.rotateLeft(jRotateLeft6 ^ (Long.rotateLeft(ByteBufferUtils.readLongLE(byteBufferInLittleEndianOrder, i3) * (-4417276706812531889L), 31) * (-7046029288634856825L)), 27) * (-7046029288634856825L)) - 8796714831421723037L;
            i3 += 8;
        }
        if (i3 <= i4 - 4) {
            jRotateLeft6 = (Long.rotateLeft(jRotateLeft6 ^ ((((long) ByteBufferUtils.readIntLE(byteBufferInLittleEndianOrder, i3)) & 4294967295L) * (-7046029288634856825L)), 23) * (-4417276706812531889L)) + 1609587929392839161L;
            i3 += 4;
        }
        while (i3 < i4) {
            jRotateLeft6 = Long.rotateLeft(jRotateLeft6 ^ (((long) (ByteBufferUtils.readByte(byteBufferInLittleEndianOrder, i3) & 255)) * 2870177450012600261L), 11) * (-7046029288634856825L);
            i3++;
        }
        long j3 = ((jRotateLeft6 >>> 33) ^ jRotateLeft6) * (-4417276706812531889L);
        long j4 = (j3 ^ (j3 >>> 29)) * 1609587929392839161L;
        return j4 ^ (j4 >>> 32);
    }

    @Override // net.jpountz.xxhash.XXHash64
    public long hash(byte[] bArr, int i, int i2, long j) {
        long jRotateLeft;
        int i3 = i;
        SafeUtils.checkRange(bArr, i3, i2);
        int i4 = i3 + i2;
        long j2 = -4417276706812531889L;
        if (i2 >= 32) {
            int i5 = i4 - 32;
            long jRotateLeft2 = (j - 7046029288634856825L) - 4417276706812531889L;
            long jRotateLeft3 = j - 4417276706812531889L;
            long jRotateLeft4 = j + 0;
            long jRotateLeft5 = j - (-7046029288634856825L);
            while (true) {
                jRotateLeft2 = Long.rotateLeft(jRotateLeft2 + (SafeUtils.readLongLE(bArr, i3) * j2), 31) * (-7046029288634856825L);
                int i6 = i3 + 8;
                jRotateLeft3 = Long.rotateLeft(jRotateLeft3 + (SafeUtils.readLongLE(bArr, i6) * j2), 31) * (-7046029288634856825L);
                int i7 = i6 + 8;
                jRotateLeft4 = Long.rotateLeft(jRotateLeft4 + (SafeUtils.readLongLE(bArr, i7) * j2), 31) * (-7046029288634856825L);
                int i8 = i7 + 8;
                jRotateLeft5 = Long.rotateLeft(jRotateLeft5 + (SafeUtils.readLongLE(bArr, i8) * j2), 31) * (-7046029288634856825L);
                i3 = i8 + 8;
                if (i3 > i5) {
                    break;
                }
                j2 = -4417276706812531889L;
            }
            jRotateLeft = ((((((((((((Long.rotateLeft(jRotateLeft2 * (-4417276706812531889L), 31) * (-7046029288634856825L)) ^ (((Long.rotateLeft(jRotateLeft2, 1) + Long.rotateLeft(jRotateLeft3, 7)) + Long.rotateLeft(jRotateLeft4, 12)) + Long.rotateLeft(jRotateLeft5, 18))) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(jRotateLeft3 * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(jRotateLeft4 * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(jRotateLeft5 * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L;
        } else {
            jRotateLeft = j + 2870177450012600261L;
        }
        long jRotateLeft6 = jRotateLeft + ((long) i2);
        while (i3 <= i4 - 8) {
            jRotateLeft6 = (Long.rotateLeft(jRotateLeft6 ^ (Long.rotateLeft(SafeUtils.readLongLE(bArr, i3) * (-4417276706812531889L), 31) * (-7046029288634856825L)), 27) * (-7046029288634856825L)) - 8796714831421723037L;
            i3 += 8;
        }
        if (i3 <= i4 - 4) {
            jRotateLeft6 = (Long.rotateLeft(jRotateLeft6 ^ ((((long) SafeUtils.readIntLE(bArr, i3)) & 4294967295L) * (-7046029288634856825L)), 23) * (-4417276706812531889L)) + 1609587929392839161L;
            i3 += 4;
        }
        while (i3 < i4) {
            jRotateLeft6 = Long.rotateLeft(jRotateLeft6 ^ (((long) (SafeUtils.readByte(bArr, i3) & 255)) * 2870177450012600261L), 11) * (-7046029288634856825L);
            i3++;
        }
        long j3 = ((jRotateLeft6 >>> 33) ^ jRotateLeft6) * (-4417276706812531889L);
        long j4 = (j3 ^ (j3 >>> 29)) * 1609587929392839161L;
        return j4 ^ (j4 >>> 32);
    }
}
