package net.jpountz.xxhash;

import net.jpountz.xxhash.StreamingXXHash32;

/* JADX INFO: loaded from: classes36.dex */
public final class StreamingXXHash32JNI extends StreamingXXHash32 {
    public long state;

    private void checkState() {
        if (this.state == 0) {
            throw new AssertionError("Already finalized");
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        XXHashJNI.XXH32_free(this.state);
        this.state = 0L;
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public int getValue() {
        checkState();
        return XXHashJNI.XXH32_digest(this.state);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public void reset() {
        checkState();
        XXHashJNI.XXH32_free(this.state);
        this.state = XXHashJNI.XXH32_init(this.seed);
    }

    public static class Factory implements StreamingXXHash32.Factory {
        public static final StreamingXXHash32.Factory INSTANCE = new Factory();

        @Override // net.jpountz.xxhash.StreamingXXHash32.Factory
        public StreamingXXHash32 newStreamingHash(int i) {
            return new StreamingXXHash32JNI(i);
        }
    }

    public StreamingXXHash32JNI(int i) {
        super(i);
        this.state = XXHashJNI.XXH32_init(i);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public void update(byte[] bArr, int i, int i2) {
        checkState();
        XXHashJNI.XXH32_update(this.state, bArr, i, i2);
    }
}
