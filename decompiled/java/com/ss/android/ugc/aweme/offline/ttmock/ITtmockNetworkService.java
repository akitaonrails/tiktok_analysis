package com.ss.android.ugc.aweme.offline.ttmock;

import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.google.gson.n;

/* JADX INFO: loaded from: classes24.dex */
public interface ITtmockNetworkService {
    NetworkPartner.Blocker getTTMockBlocker();

    n getTTMockNetwork();

    boolean isApiNeedMock(String str);

    boolean isOpen();
}
