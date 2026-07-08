package com.bytedance.sdk.xbridge.registry.core.model.idl;

import X.InterfaceC1294060jmO;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: loaded from: classes10.dex */
public interface CompletionBlock<S extends XBaseResultModel> {
    void onFailure(int i, String str, S s);

    @InterfaceC1294060jmO
    void onRawSuccess(S s);

    void onSuccess(S s, String str);
}
