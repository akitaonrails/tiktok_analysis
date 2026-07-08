package net.jpountz.xxhash;

import X.C2188811AlT;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes36.dex */
public abstract class StreamingXXHash64 {
    public final long seed;

    public interface Factory {
        StreamingXXHash64 newStreamingHash(long j);
    }

    public abstract long getValue();

    public abstract void reset();

    public abstract void update(byte[] bArr, int i, int i2);

    public final Checksum asChecksum() {
        return new Checksum() { // from class: net.jpountz.xxhash.StreamingXXHash64.1
            @Override // java.util.zip.Checksum
            public long getValue() {
                return StreamingXXHash64.this.getValue();
            }

            @Override // java.util.zip.Checksum
            public void reset() {
                StreamingXXHash64.this.reset();
            }

            public String toString() {
                return StreamingXXHash64.this.toString();
            }

            @Override // java.util.zip.Checksum
            public void update(int i) {
                StreamingXXHash64.this.update(new byte[]{(byte) i}, 0, 1);
            }

            @Override // java.util.zip.Checksum
            public void update(byte[] bArr, int i, int i2) {
                StreamingXXHash64.this.update(bArr, i, i2);
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

    public StreamingXXHash64(long j) {
        this.seed = j;
    }
}
