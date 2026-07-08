package com.bytedance.vmsdk.jsbridge.utils;

/* JADX INFO: loaded from: classes35.dex */
public class NativeHostObjectTest implements NativeHostObject {
    public native long nativeGetHostObject(long j);

    @Override // com.bytedance.vmsdk.jsbridge.utils.NativeHostObject
    public final long getPtr(long j) {
        return nativeGetHostObject(j);
    }
}
