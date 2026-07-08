package com.ss.android.ugc.aweme.services;

import X.C0CSC;
import X.C0XI7;
import X.EnumC1493070oxN;
import X.EnumC325100Com;
import X.InterfaceC1493160oxW;
import com.bytedance.ttnet.TTMultiNetwork;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes24.dex */
public final class NetworkStateServiceImpl implements INetworkStateService {
    public final INetworkStateService networkStateDelegate = NetworkStateNqeService.INSTANCE;
    public final CopyOnWriteArrayList<C0XI7> multiNetworkChangeCallback = new CopyOnWriteArrayList<>();

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public int getEffectiveConnectionType() {
        return this.networkStateDelegate.getEffectiveConnectionType();
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public EnumC325100Com getNetworkStatus() {
        return this.networkStateDelegate.getNetworkStatus();
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public boolean isFakeNetwork() {
        return this.networkStateDelegate.isFakeNetwork();
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public boolean isWeakNetwork() {
        return this.networkStateDelegate.isWeakNetwork();
    }

    public NetworkStateServiceImpl() {
        TTMultiNetwork.registerMultiNetObserver(new InterfaceC1493160oxW() { // from class: com.ss.android.ugc.aweme.services.NetworkStateServiceImpl.1
            @Override // X.InterfaceC1493160oxW
            public void onUserSpecifiedNetworkEnabled(boolean z, long j) {
            }

            @Override // X.InterfaceC1493160oxW
            public void onMultiNetStateChanged(EnumC1493070oxN enumC1493070oxN, EnumC1493070oxN enumC1493070oxN2, long j) {
                Iterator<C0XI7> it2 = NetworkStateServiceImpl.this.multiNetworkChangeCallback.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(enumC1493070oxN2);
                }
            }
        }, null);
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public EnumC1493070oxN getMultiNetworkState() {
        return TTMultiNetwork.getCurrentState();
    }

    public boolean isVPN() {
        return getMultiNetworkState() == EnumC1493070oxN.DEFAULT_VPN;
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public void observeMultiNetworkChange(C0XI7 c0xi7) {
        this.multiNetworkChangeCallback.add(c0xi7);
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public void observerNetworkChange(C0CSC c0csc) {
        this.networkStateDelegate.observerNetworkChange(c0csc);
    }

    public void removeMultiNetworkChangeObserver(C0XI7 c0xi7) {
        this.multiNetworkChangeCallback.remove(c0xi7);
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public void removeNetworkChangeObserver(C0CSC c0csc) {
        this.networkStateDelegate.removeNetworkChangeObserver(c0csc);
    }
}
