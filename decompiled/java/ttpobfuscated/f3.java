package ttpobfuscated;

/* JADX INFO: loaded from: classes24.dex */
public final class f3 {
    public static final int a(int i) {
        return (i & (-4194304)) >>> 22;
    }

    public static final int a(int i, byte b) {
        return (i & 4194303) + (b << 22);
    }

    public static final int b(int i, int i2) {
        return i | (i2 << 22);
    }

    public static final int a(int i, int i2) {
        return i | (i2 << 22);
    }
}
