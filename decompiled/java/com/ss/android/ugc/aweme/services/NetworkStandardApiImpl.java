package com.ss.android.ugc.aweme.services;

import X.C04TD;
import X.C1BMO;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.network.spi.INetworkStandardApi;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes35.dex */
public final class NetworkStandardApiImpl implements INetworkStandardApi {
    public final CopyOnWriteArrayList<Object> safetyListeners = new CopyOnWriteArrayList<>();

    public NetworkStandardApiImpl() {
        EffectiveConnectionTypeDispatcher.INSTANCE.setNetworkStandardApi$aweme_network_release(this);
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStandardApi
    public int getEffectiveConnectionType() {
        return TTNetInit.getEffectiveConnectionType();
    }

    public static final class EffectiveConnectionTypeDispatcher {
        public static final EffectiveConnectionTypeDispatcher INSTANCE = new EffectiveConnectionTypeDispatcher();
        public static volatile NetworkStandardApiImpl networkStandardApi;

        public final void notifyEffectiveConnectionTypeChanged(int i) {
            NetworkStandardApiImpl networkStandardApiImpl = networkStandardApi;
            if (networkStandardApiImpl != null) {
                networkStandardApiImpl.notifyEffectiveConnectionTypeChanged(i);
            }
        }

        public final void setNetworkStandardApi$aweme_network_release(NetworkStandardApiImpl networkStandardApiImpl) {
            networkStandardApi = networkStandardApiImpl;
        }
    }

    public static INetworkStandardApi createINetworkStandardApibyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(INetworkStandardApi.class, z);
        if (objLIZ != null) {
            return (INetworkStandardApi) objLIZ;
        }
        if (C04TD.D4 == null) {
            synchronized (INetworkStandardApi.class) {
                if (C04TD.D4 == null) {
                    C04TD.D4 = new NetworkStandardApiImpl();
                }
            }
        }
        return C04TD.D4;
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStandardApi
    public void addEffectiveConnectionTypeChangedListener(C1BMO c1bmo) {
        if (!this.safetyListeners.contains(c1bmo)) {
            this.safetyListeners.add(c1bmo);
        }
    }

    public final void notifyEffectiveConnectionTypeChanged(int i) {
        for (Object obj : this.safetyListeners) {
            if (obj instanceof C1BMO) {
                ((C1BMO) obj).onEffectiveConnectionTypeChanged(i);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStandardApi
    public void removeEffectiveConnectionTypeChangedListener(C1BMO c1bmo) {
        this.safetyListeners.remove(c1bmo);
    }
}
