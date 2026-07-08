package com.squareup.wire;

/* JADX INFO: loaded from: classes24.dex */
public final class Preconditions {
    public static void LIZ(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }
}
