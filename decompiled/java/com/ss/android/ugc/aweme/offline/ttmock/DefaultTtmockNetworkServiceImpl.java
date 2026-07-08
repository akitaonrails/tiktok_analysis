package com.ss.android.ugc.aweme.offline.ttmock;

import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.google.gson.n;

/* JADX INFO: loaded from: classes24.dex */
public final class DefaultTtmockNetworkServiceImpl implements ITtmockNetworkService {
    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockNetworkService
    public NetworkPartner.Blocker getTTMockBlocker() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockNetworkService
    public n getTTMockNetwork() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockNetworkService
    public boolean isApiNeedMock(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.offline.ttmock.ITtmockNetworkService
    public boolean isOpen() {
        return false;
    }
}
