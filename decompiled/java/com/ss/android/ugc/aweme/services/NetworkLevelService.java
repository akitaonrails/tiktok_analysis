package com.ss.android.ugc.aweme.services;

import X.C1411240mpO;
import X.C1476680oWw;
import X.C310360CEo;
import X.InterfaceC1476720oX0;
import com.ss.android.ugc.aweme.network.spi.INetworkLevelService;
import com.ss.android.ugc.aweme.services.NetworkStandardApiImpl;
import com.ss.mediakit.net.NetworkState;

/* JADX INFO: loaded from: classes36.dex */
public final class NetworkLevelService implements INetworkLevelService {
    public static final Companion Companion = new Companion();

    public static final class Companion {
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkLevelService
    public C1411240mpO getNqeNetworkLevel() {
        return NetworkStateNqeService.INSTANCE.getNetworkLevel();
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkLevelService
    public void init() {
        if (((Boolean) C310360CEo.LIZJ.getValue()).booleanValue()) {
            C1476680oWw c1476680oWw = C1476680oWw.LIZ;
            InterfaceC1476720oX0 interfaceC1476720oX0 = new InterfaceC1476720oX0() { // from class: com.ss.android.ugc.aweme.services.NetworkLevelService.init.1
                @Override // X.InterfaceC1476720oX0
                public void onNetworkQualityCallBack(NetworkState networkState) {
                    int i = networkState.scenario;
                    if (i == 2) {
                        NewNqeProcessor.INSTANCE.onVodNqeChanged(networkState.networkQuality);
                    } else {
                        if (i != 1) {
                            return;
                        }
                        NewNqeProcessor.INSTANCE.onLiveNqeChanged(networkState.networkQuality);
                    }
                }
            };
            synchronized (c1476680oWw) {
                if (!C1476680oWw.LIZJ || !C1476680oWw.LIZLLL) {
                    C1476680oWw.LIZLLL = C1476680oWw.LIZIZ();
                    C1476680oWw.LIZJ = true;
                }
            }
            C1476680oWw.LIZIZ.put("tiktok_nqe_caller", interfaceC1476720oX0);
        }
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkLevelService
    public void onTTNetNqeChanged(int i) {
        NetworkStandardApiImpl.EffectiveConnectionTypeDispatcher.INSTANCE.notifyEffectiveConnectionTypeChanged(i);
        if (!((Boolean) C310360CEo.LIZJ.getValue()).booleanValue()) {
            NetworkStateNqeService.INSTANCE.notifyNQEChange(NetworkLevelKt.obtainNetworkLevelByTTNetNqe(i));
        } else {
            NewNqeProcessor.INSTANCE.onTTNetNqeChanged(i);
        }
    }
}
