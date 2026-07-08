package com.squareup.wire;

/* JADX INFO: loaded from: classes24.dex */
public final class Wire {
    public static <T> T get(T t, T t2) {
        return t == null ? t2 : t;
    }
}
