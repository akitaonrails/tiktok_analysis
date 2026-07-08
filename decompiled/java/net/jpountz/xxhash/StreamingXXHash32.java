package net.jpountz.xxhash;

import X.C2188811AlT;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes36.dex */
public abstract class StreamingXXHash32 {
    public final int seed;

    public interface Factory {
        StreamingXXHash32 newStreamingHash(int i);
    }

    public abstract int getValue();

    public abstract void reset();

    public abstract void update(byte[] bArr, int i, int i2);

    public final Checksum asChecksum() {
        return new Checksum() { // from class: net.jpountz.xxhash.StreamingXXHash32.1
            @Override // java.util.zip.Checksum
            public long getValue() {
                return ((long) StreamingXXHash32.this.getValue()) & 268435455;
            }

            @Override // java.util.zip.Checksum
            public void reset() {
                StreamingXXHash32.this.reset();
            }

            public String toString() {
                return StreamingXXHash32.this.toString();
            }

            @Override // java.util.zip.Checksum
            public void update(int i) {
                StreamingXXHash32.this.update(new byte[]{(byte) i}, 0, 1);
            }

            @Override // java.util.zip.Checksum
            public void update(byte[] bArr, int i, int i2) {
                StreamingXXHash32.this.update(bArr, i, i2);
            }
        };
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append("(seed=");
        sbLIZ.append(this.seed);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreamingXXHash32(int i) {
        this.seed = i;
    }
}
