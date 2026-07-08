package com.sun.jna;

/* JADX INFO: loaded from: classes31.dex */
public class NativeLong extends IntegerType {
    public static final int SIZE = Native.LONG_SIZE;
    public static final long serialVersionUID = 1;

    public NativeLong() {
        this(0L);
    }

    public NativeLong(long j) {
        this(j, false);
    }

    public NativeLong(long j, boolean z) {
        super(SIZE, j, z);
    }
}
