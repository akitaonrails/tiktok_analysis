package com.ss.android.ugc.aweme.initializer;

import X.C12VK;
import X.C19329010jg;
import X.InterfaceC580190MpF;

/* JADX INFO: loaded from: classes29.dex */
public final class MusicallyAVServiceProxyImpl extends AVServiceProxyImpl {
    @Override // com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl, com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public InterfaceC580190MpF getBridgeService() {
        if (this.bridgeService == null) {
            this.bridgeService = new C19329010jg() { // from class: X.10jh
            };
        }
        return this.bridgeService;
    }

    @Override // com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl, com.ss.android.ugc.aweme.services.IAVServiceProxy, com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    public /* bridge */ /* synthetic */ C12VK getBridgeService() {
        return getBridgeService();
    }
}
