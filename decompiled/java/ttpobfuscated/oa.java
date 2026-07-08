package ttpobfuscated;

/* JADX INFO: loaded from: classes24.dex */
public final class oa {
    public static final int a(int i) {
        return i >> 16;
    }

    public static final int a(int i, boolean z) {
        return (i << 1) | (z ? 1 : 0);
    }

    public static final int a(short s, short s2) {
        return (s << 16) | (s2 & 65535);
    }

    public static final boolean a(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    public static final int b(int i) {
        return (short) i;
    }

    public static final int a(int i, int i2, int i3) {
        return (i & i2) >>> i3;
    }

    public static final short b(int i, int i2, int i3) {
        return (short) ((i & i2) >>> i3);
    }
}
