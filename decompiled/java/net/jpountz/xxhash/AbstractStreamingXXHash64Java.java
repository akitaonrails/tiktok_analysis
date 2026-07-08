package net.jpountz.xxhash;

/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractStreamingXXHash64Java extends StreamingXXHash64 {
    public int memSize;
    public final byte[] memory;
    public long totalLen;
    public long v1;
    public long v2;
    public long v3;
    public long v4;

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public void reset() {
        long j = this.seed;
        this.v1 = (j - 7046029288634856825L) - 4417276706812531889L;
        this.v2 = (-4417276706812531889L) + j;
        this.v3 = j + 0;
        this.v4 = j - (-7046029288634856825L);
        this.totalLen = 0L;
        this.memSize = 0;
    }

    public AbstractStreamingXXHash64Java(long j) {
        super(j);
        this.memory = new byte[32];
        reset();
    }
}
