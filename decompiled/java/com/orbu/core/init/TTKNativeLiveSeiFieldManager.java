package com.orbu.core.init;

import com.orbu.core.TTKOrbu;
import com.orbu.core.adapter.TTKLiveSEIRequest;
import com.orbu.core.adapter.TTKResponseKt;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes14.dex */
public final class TTKNativeLiveSeiFieldManager {
    public static final TTKNativeLiveSeiFieldManager INSTANCE = new TTKNativeLiveSeiFieldManager();

    public static final int shouldInterceptSeiField(TTKLiveSEIRequest tTKLiveSEIRequest) {
        return !TTKResponseKt.isBlock(TTKOrbu.INSTANCE.shouldInterceptTTKRequest(tTKLiveSEIRequest)) ? 1 : 0;
    }

    public static final int proceedSeiField(String str, float f, String str2) {
        Float fValueOf = Float.valueOf(f);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("x-tt-dataflow-id", str2);
        return shouldInterceptSeiField(new TTKLiveSEIRequest(str, fValueOf, linkedHashMap));
    }

    public static final int proceedSeiField(String str, long j, String str2) {
        Long lValueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("x-tt-dataflow-id", str2);
        return shouldInterceptSeiField(new TTKLiveSEIRequest(str, lValueOf, linkedHashMap));
    }

    public static final int proceedSeiField(String str, boolean z, String str2) {
        Boolean boolValueOf = Boolean.valueOf(z);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("x-tt-dataflow-id", str2);
        return shouldInterceptSeiField(new TTKLiveSEIRequest(str, boolValueOf, linkedHashMap));
    }

    public static final int proceedSeiField(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("x-tt-dataflow-id", str3);
        return shouldInterceptSeiField(new TTKLiveSEIRequest(str, str2, linkedHashMap));
    }

    public static final int proceedSeiField(String str, byte[] bArr, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("x-tt-dataflow-id", str2);
        return shouldInterceptSeiField(new TTKLiveSEIRequest(str, bArr, linkedHashMap));
    }
}
