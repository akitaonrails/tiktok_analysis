package net.jpountz.xxhash;

import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.StreamingXXHash32;

/* JADX INFO: loaded from: classes36.dex */
public final class StreamingXXHash32JavaSafe extends AbstractStreamingXXHash32Java {
    @Override // net.jpountz.xxhash.StreamingXXHash32
    public int getValue() {
        int iRotateLeft = (int) (((long) (this.totalLen >= 16 ? Integer.rotateLeft(this.v1, 1) + Integer.rotateLeft(this.v2, 7) + Integer.rotateLeft(this.v3, 12) + Integer.rotateLeft(this.v4, 18) : this.seed + 374761393)) + this.totalLen);
        int i = 0;
        while (i <= this.memSize - 4) {
            iRotateLeft = Integer.rotateLeft(iRotateLeft + (SafeUtils.readIntLE(this.memory, i) * (-1028477379)), 17) * 668265263;
            i += 4;
        }
        while (i < this.memSize) {
            iRotateLeft = Integer.rotateLeft(iRotateLeft + ((SafeUtils.readByte(this.memory, i) & 255) * 374761393), 11) * (-1640531535);
            i++;
        }
        int i2 = (iRotateLeft ^ (iRotateLeft >>> 15)) * (-2048144777);
        int i3 = (i2 ^ (i2 >>> 13)) * (-1028477379);
        return i3 ^ (i3 >>> 16);
    }

    public static class Factory implements StreamingXXHash32.Factory {
        public static final StreamingXXHash32.Factory INSTANCE = new Factory();

        @Override // net.jpountz.xxhash.StreamingXXHash32.Factory
        public StreamingXXHash32 newStreamingHash(int i) {
            return new StreamingXXHash32JavaSafe(i);
        }
    }

    public StreamingXXHash32JavaSafe(int i) {
        super(i);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public void update(byte[] bArr, int i, int i2) {
        SafeUtils.checkRange(bArr, i, i2);
        this.totalLen += (long) i2;
        int i3 = this.memSize;
        if (i3 + i2 < 16) {
            System.arraycopy(bArr, i, this.memory, i3, i2);
            this.memSize += i2;
            return;
        }
        int i4 = i2 + i;
        if (i3 > 0) {
            System.arraycopy(bArr, i, this.memory, i3, 16 - i3);
            int intLE = this.v1 + (SafeUtils.readIntLE(this.memory, 0) * (-2048144777));
            this.v1 = intLE;
            this.v1 = Integer.rotateLeft(intLE, 13) * (-1640531535);
            int intLE2 = this.v2 + (SafeUtils.readIntLE(this.memory, 4) * (-2048144777));
            this.v2 = intLE2;
            this.v2 = Integer.rotateLeft(intLE2, 13) * (-1640531535);
            int intLE3 = this.v3 + (SafeUtils.readIntLE(this.memory, 8) * (-2048144777));
            this.v3 = intLE3;
            this.v3 = Integer.rotateLeft(intLE3, 13) * (-1640531535);
            int intLE4 = this.v4 + (SafeUtils.readIntLE(this.memory, 12) * (-2048144777));
            this.v4 = intLE4;
            this.v4 = Integer.rotateLeft(intLE4, 13) * (-1640531535);
            i += 16 - this.memSize;
            this.memSize = 0;
        }
        int i5 = i4 - 16;
        int iRotateLeft = this.v1;
        int iRotateLeft2 = this.v2;
        int iRotateLeft3 = this.v3;
        int iRotateLeft4 = this.v4;
        while (i <= i5) {
            iRotateLeft = Integer.rotateLeft(iRotateLeft + (SafeUtils.readIntLE(bArr, i) * (-2048144777)), 13) * (-1640531535);
            int i6 = i + 4;
            iRotateLeft2 = Integer.rotateLeft(iRotateLeft2 + (SafeUtils.readIntLE(bArr, i6) * (-2048144777)), 13) * (-1640531535);
            int i7 = i6 + 4;
            iRotateLeft3 = Integer.rotateLeft(iRotateLeft3 + (SafeUtils.readIntLE(bArr, i7) * (-2048144777)), 13) * (-1640531535);
            int i8 = i7 + 4;
            iRotateLeft4 = Integer.rotateLeft(iRotateLeft4 + (SafeUtils.readIntLE(bArr, i8) * (-2048144777)), 13) * (-1640531535);
            i = i8 + 4;
        }
        this.v1 = iRotateLeft;
        this.v2 = iRotateLeft2;
        this.v3 = iRotateLeft3;
        this.v4 = iRotateLeft4;
        if (i < i4) {
            int i9 = i4 - i;
            System.arraycopy(bArr, i, this.memory, 0, i9);
            this.memSize = i9;
        }
    }
}
