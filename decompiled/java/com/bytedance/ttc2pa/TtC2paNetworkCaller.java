package com.bytedance.ttc2pa;

import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface TtC2paNetworkCaller {
    TtC2paNetworkResponse doPost(String str, Map<String, String> map, byte[] bArr, long j, boolean z);

    TtC2paNetworkResponse onRemoteSign(byte[] bArr);
}
