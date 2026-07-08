package com.tiktok.clientai.android.bytenn.bridge;

import X.C1286480jaA;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class ByteNNRet {
    public static final C1286480jaA Companion = new Object() { // from class: X.0jaA
    };
    public final int code;
    public final Map<String, float[]> data;
    public final String message;

    public final boolean isSuccess() {
        return this.code == 0;
    }

    public ByteNNRet(int i, String str, Map<String, float[]> map) {
        this.code = i;
        this.message = str;
        this.data = map;
    }
}
