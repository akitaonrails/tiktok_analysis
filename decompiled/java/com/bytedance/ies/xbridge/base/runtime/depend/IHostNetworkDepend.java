package com.bytedance.ies.xbridge.base.runtime.depend;

import X.C1059860dge;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface IHostNetworkDepend {
    XIRetrofit createRetrofit(String str, boolean z);

    Map<String, Object> getAPIParams();

    boolean usePiperData(C1059860dge c1059860dge);
}
