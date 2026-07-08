package com.lynx.tasm.service;

import X.AbstractC1338850kwd;
import X.C1320210kSZ;
import com.lynx.jsbridge.network.HttpRequest;

/* JADX INFO: loaded from: classes21.dex */
public interface ILynxHttpService extends IServiceProvider {
    @Override // com.lynx.tasm.service.IServiceProvider
    Class<? extends IServiceProvider> getServiceClass();

    void request(HttpRequest httpRequest, AbstractC1338850kwd abstractC1338850kwd);

    void requestStreaming(HttpRequest httpRequest, AbstractC1338850kwd abstractC1338850kwd, C1320210kSZ c1320210kSZ);
}
