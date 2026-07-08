package net.jpountz.xxhash;

import net.jpountz.xxhash.StreamingXXHash64;

/* JADX INFO: loaded from: classes36.dex */
public final class StreamingXXHash64JNI extends StreamingXXHash64 {
    public long state;

    private void checkState() {
        if (this.state == 0) {
            throw new AssertionError("Already finalized");
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        XXHashJNI.XXH64_free(this.state);
        this.state = 0L;
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public long getValue() {
        checkState();
        return XXHashJNI.XXH64_digest(this.state);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public void reset() {
        checkState();
        XXHashJNI.XXH64_free(this.state);
        this.state = XXHashJNI.XXH64_init(this.seed);
    }

    public static class Factory implements StreamingXXHash64.Factory {
        public static final StreamingXXHash64.Factory INSTANCE = new Factory();

        @Override // net.jpountz.xxhash.StreamingXXHash64.Factory
        public StreamingXXHash64 newStreamingHash(long j) {
            return new StreamingXXHash64JNI(j);
        }
    }

    public StreamingXXHash64JNI(long j) {
        super(j);
        this.state = XXHashJNI.XXH64_init(j);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public void update(byte[] bArr, int i, int i2) {
        checkState();
        XXHashJNI.XXH64_update(this.state, bArr, i, i2);
    }
}
