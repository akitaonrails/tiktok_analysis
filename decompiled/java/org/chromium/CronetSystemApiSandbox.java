package org.chromium;

import X.InterfaceC789930Uyl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class CronetSystemApiSandbox implements InterfaceC789930Uyl {
    public static volatile CronetSystemApiSandbox sInstance;

    public static CronetSystemApiSandbox inst() {
        if (sInstance == null) {
            synchronized (CronetSystemApiSandbox.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new CronetSystemApiSandbox();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    @Override // X.InterfaceC789930Uyl
    public String getNetworkOperator() {
        return CronetAppProviderManager.inst().getNetworkOperator();
    }

    @Override // X.InterfaceC789930Uyl
    public String getSimOperator() {
        return CronetAppProviderManager.inst().getSimOperator();
    }

    @Override // X.InterfaceC789930Uyl
    public int getWifiFrequency() {
        return CronetAppProviderManager.inst().getWifiFrequency();
    }

    @Override // X.InterfaceC789930Uyl
    public int getWifiRssi() {
        return CronetAppProviderManager.inst().getWifiRssi();
    }
}
