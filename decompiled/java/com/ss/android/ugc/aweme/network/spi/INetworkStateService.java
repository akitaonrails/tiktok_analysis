package com.ss.android.ugc.aweme.network.spi;

import X.C0CSC;
import X.C0XI7;
import X.EnumC1493070oxN;
import X.EnumC325100Com;

/* JADX INFO: loaded from: classes24.dex */
public interface INetworkStateService {
    int getEffectiveConnectionType();

    EnumC1493070oxN getMultiNetworkState();

    EnumC325100Com getNetworkStatus();

    boolean isFakeNetwork();

    boolean isWeakNetwork();

    void observeMultiNetworkChange(C0XI7 c0xi7);

    void observerNetworkChange(C0CSC c0csc);

    void removeNetworkChangeObserver(C0CSC c0csc);
}
