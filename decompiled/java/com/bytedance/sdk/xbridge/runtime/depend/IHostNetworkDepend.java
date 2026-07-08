package com.bytedance.sdk.xbridge.runtime.depend;

import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface IHostNetworkDepend {
    XIRetrofit createRetrofit(String str, boolean z);

    Map<String, Object> getAPIParams();

    boolean usePiperData(String str);
}
