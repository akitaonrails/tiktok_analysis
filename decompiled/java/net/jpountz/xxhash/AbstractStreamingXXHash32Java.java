package net.jpountz.xxhash;

/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractStreamingXXHash32Java extends StreamingXXHash32 {
    public int memSize;
    public final byte[] memory;
    public long totalLen;
    public int v1;
    public int v2;
    public int v3;
    public int v4;

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public void reset() {
        int i = this.seed;
        this.v1 = (i - 1640531535) - 2048144777;
        this.v2 = (-2048144777) + i;
        this.v3 = i;
        this.v4 = i - (-1640531535);
        this.totalLen = 0L;
        this.memSize = 0;
    }

    public AbstractStreamingXXHash32Java(int i) {
        super(i);
        this.memory = new byte[16];
        reset();
    }
}
