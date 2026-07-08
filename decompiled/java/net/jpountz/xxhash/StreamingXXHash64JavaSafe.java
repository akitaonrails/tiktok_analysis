package net.jpountz.xxhash;

import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.StreamingXXHash64;

/* JADX INFO: loaded from: classes36.dex */
public final class StreamingXXHash64JavaSafe extends AbstractStreamingXXHash64Java {
    @Override // net.jpountz.xxhash.StreamingXXHash64
    public long getValue() {
        long jRotateLeft;
        int i;
        if (this.totalLen >= 32) {
            long j = this.v1;
            long j2 = this.v2;
            long j3 = this.v3;
            jRotateLeft = ((((((Long.rotateLeft(j3 * (-4417276706812531889L), 31) * (-7046029288634856825L)) ^ (((((((((Long.rotateLeft(j, 1) + Long.rotateLeft(j2, 7)) + Long.rotateLeft(j3, 12)) + Long.rotateLeft(r0, 18)) ^ (Long.rotateLeft(j * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(j2 * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L)) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(this.v4 * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L;
        } else {
            jRotateLeft = this.seed + 2870177450012600261L;
        }
        long jRotateLeft2 = jRotateLeft + this.totalLen;
        int i2 = 0;
        while (true) {
            i = this.memSize;
            if (i2 > i - 8) {
                break;
            }
            jRotateLeft2 = (Long.rotateLeft(jRotateLeft2 ^ (Long.rotateLeft(SafeUtils.readLongLE(this.memory, i2) * (-4417276706812531889L), 31) * (-7046029288634856825L)), 27) * (-7046029288634856825L)) - 8796714831421723037L;
            i2 += 8;
        }
        if (i2 <= i - 4) {
            jRotateLeft2 = (Long.rotateLeft(jRotateLeft2 ^ ((((long) SafeUtils.readIntLE(this.memory, i2)) & 4294967295L) * (-7046029288634856825L)), 23) * (-4417276706812531889L)) + 1609587929392839161L;
            i2 += 4;
        }
        while (i2 < this.memSize) {
            jRotateLeft2 = Long.rotateLeft(jRotateLeft2 ^ (((long) (this.memory[i2] & 255)) * 2870177450012600261L), 11) * (-7046029288634856825L);
            i2++;
        }
        long j4 = (jRotateLeft2 ^ (jRotateLeft2 >>> 33)) * (-4417276706812531889L);
        long j5 = (j4 ^ (j4 >>> 29)) * 1609587929392839161L;
        return j5 ^ (j5 >>> 32);
    }

    public static class Factory implements StreamingXXHash64.Factory {
        public static final StreamingXXHash64.Factory INSTANCE = new Factory();

        @Override // net.jpountz.xxhash.StreamingXXHash64.Factory
        public StreamingXXHash64 newStreamingHash(long j) {
            return new StreamingXXHash64JavaSafe(j);
        }
    }

    public StreamingXXHash64JavaSafe(long j) {
        super(j);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public void update(byte[] bArr, int i, int i2) {
        int i3 = i;
        SafeUtils.checkRange(bArr, i3, i2);
        this.totalLen += (long) i2;
        int i4 = this.memSize;
        if (i4 + i2 < 32) {
            System.arraycopy(bArr, i3, this.memory, i4, i2);
            this.memSize += i2;
            return;
        }
        int i5 = i2 + i3;
        if (i4 > 0) {
            System.arraycopy(bArr, i3, this.memory, i4, 32 - i4);
            long longLE = this.v1 + (SafeUtils.readLongLE(this.memory, 0) * (-4417276706812531889L));
            this.v1 = longLE;
            this.v1 = Long.rotateLeft(longLE, 31) * (-7046029288634856825L);
            long longLE2 = this.v2 + (SafeUtils.readLongLE(this.memory, 8) * (-4417276706812531889L));
            this.v2 = longLE2;
            this.v2 = Long.rotateLeft(longLE2, 31) * (-7046029288634856825L);
            long longLE3 = this.v3 + (SafeUtils.readLongLE(this.memory, 16) * (-4417276706812531889L));
            this.v3 = longLE3;
            this.v3 = Long.rotateLeft(longLE3, 31) * (-7046029288634856825L);
            long longLE4 = this.v4 + (SafeUtils.readLongLE(this.memory, 24) * (-4417276706812531889L));
            this.v4 = longLE4;
            this.v4 = Long.rotateLeft(longLE4, 31) * (-7046029288634856825L);
            i3 += 32 - this.memSize;
            this.memSize = 0;
        }
        int i6 = i5 - 32;
        long jRotateLeft = this.v1;
        long jRotateLeft2 = this.v2;
        long jRotateLeft3 = this.v3;
        long jRotateLeft4 = this.v4;
        while (i3 <= i6) {
            jRotateLeft = Long.rotateLeft(jRotateLeft + (SafeUtils.readLongLE(bArr, i3) * (-4417276706812531889L)), 31) * (-7046029288634856825L);
            int i7 = i3 + 8;
            jRotateLeft2 = Long.rotateLeft(jRotateLeft2 + (SafeUtils.readLongLE(bArr, i7) * (-4417276706812531889L)), 31) * (-7046029288634856825L);
            int i8 = i7 + 8;
            jRotateLeft3 = Long.rotateLeft(jRotateLeft3 + (SafeUtils.readLongLE(bArr, i8) * (-4417276706812531889L)), 31) * (-7046029288634856825L);
            int i9 = i8 + 8;
            jRotateLeft4 = Long.rotateLeft(jRotateLeft4 + (SafeUtils.readLongLE(bArr, i9) * (-4417276706812531889L)), 31) * (-7046029288634856825L);
            i3 = i9 + 8;
        }
        this.v1 = jRotateLeft;
        this.v2 = jRotateLeft2;
        this.v3 = jRotateLeft3;
        this.v4 = jRotateLeft4;
        if (i3 < i5) {
            int i10 = i5 - i3;
            System.arraycopy(bArr, i3, this.memory, 0, i10);
            this.memSize = i10;
        }
    }
}
