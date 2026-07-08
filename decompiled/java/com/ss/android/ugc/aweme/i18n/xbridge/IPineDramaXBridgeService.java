package com.ss.android.ugc.aweme.i18n.xbridge;

import X.C13BV;

/* JADX INFO: loaded from: classes29.dex */
public interface IPineDramaXBridgeService {
    C13BV provideXBridgetIDLMethodList();

    public static final class DowngradeInstance implements IPineDramaXBridgeService {
        @Override // com.ss.android.ugc.aweme.i18n.xbridge.IPineDramaXBridgeService
        public final C13BV provideXBridgetIDLMethodList() {
            return C13BV.INSTANCE;
        }
    }
}
