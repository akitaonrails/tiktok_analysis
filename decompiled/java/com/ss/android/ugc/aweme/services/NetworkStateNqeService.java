package com.ss.android.ugc.aweme.services;

import X.C1411240mpO;
import X.C20684815ws;
import X.C2097608Jq;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import kotlin.Pair;

/* JADX INFO: loaded from: classes26.dex */
public final class NetworkStateNqeService extends NetworkStateBaseService {
    public static final NetworkStateNqeService INSTANCE = new NetworkStateNqeService();
    public static long weakStartTime;

    @Override // com.ss.android.ugc.aweme.services.NetworkStateBaseService
    public C1411240mpO getNetworkLevel() {
        C1411240mpO networkLevel = super.getNetworkLevel();
        if (!NetworkLevelKt.isDefault(networkLevel)) {
            return networkLevel;
        }
        try {
            return NetworkLevelKt.obtainNetworkLevelByTTNetNqe(TTNetInit.getEffectiveConnectionType());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return NetworkLevelKt.defaultNetworkLevel();
        }
    }

    public final void notifyNQEChange(C1411240mpO c1411240mpO) {
        C1411240mpO networkLevel = getNetworkLevel();
        if (networkLevel.LIZIZ != c1411240mpO.LIZIZ) {
            mobNQEWeakEvent(networkLevel, c1411240mpO);
        }
        updateNetLevel(c1411240mpO);
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
        if (iFeedDebugService != null) {
            iFeedDebugService.LJIILL();
        }
    }

    private final void mobNQEWeakEvent(C1411240mpO c1411240mpO, C1411240mpO c1411240mpO2) {
        if (NetworkLevelKt.isDefault(c1411240mpO) && NetworkLevelKt.isWeak(c1411240mpO2)) {
            weakStartTime = System.currentTimeMillis();
        }
        if (!NetworkLevelKt.isWeak(c1411240mpO) && NetworkLevelKt.isWeak(c1411240mpO2)) {
            weakStartTime = System.currentTimeMillis();
            return;
        }
        if (!NetworkLevelKt.isWeak(c1411240mpO) || NetworkLevelKt.isWeak(c1411240mpO2) || weakStartTime == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - weakStartTime;
        weakStartTime = 0L;
        if (jCurrentTimeMillis <= 0 || !C20684815ws.LJI("network_status_change")) {
            return;
        }
        C20684815ws.LJIILLIIL("network_status_change", C2097608Jq.LJIIIIZZ(new Pair("network_status_from", String.valueOf(c1411240mpO.LIZIZ)), new Pair("network_status_to", String.valueOf(c1411240mpO2.LIZIZ)), new Pair("duration", String.valueOf(jCurrentTimeMillis))));
    }
}
