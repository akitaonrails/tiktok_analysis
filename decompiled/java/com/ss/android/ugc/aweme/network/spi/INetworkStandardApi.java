package com.ss.android.ugc.aweme.network.spi;

import X.C1BMO;

/* JADX INFO: loaded from: classes35.dex */
public interface INetworkStandardApi {
    void addEffectiveConnectionTypeChangedListener(C1BMO c1bmo);

    int getEffectiveConnectionType();

    void removeEffectiveConnectionTypeChangedListener(C1BMO c1bmo);
}
