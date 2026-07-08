package com.lynx.react.bridge;

import com.lynx.tasm.TemplateData;

/* JADX INFO: loaded from: classes21.dex */
public interface WritableArray extends ReadableArray {
    void pushArray(WritableArray writableArray);

    void pushBoolean(boolean z);

    void pushByteArray(byte[] bArr);

    void pushDouble(double d);

    void pushInt(int i);

    void pushLong(long j);

    void pushMap(WritableMap writableMap);

    void pushNull();

    void pushPiperData(PiperData piperData);

    void pushString(String str);

    void pushTemplateData(TemplateData templateData);
}
