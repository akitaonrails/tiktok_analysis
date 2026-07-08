package com.ss.android.ugc.aweme.ecommerce.dependency.network;

import X.C04TD;
import X.C1499850p8J;
import X.InterfaceC859903Xp;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.TTRetrofit;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkDependencyService implements INetworkDependencyService {
    public void initService() {
    }

    public static INetworkDependencyService createINetworkDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(INetworkDependencyService.class, z);
        if (objLIZ != null) {
            return (INetworkDependencyService) objLIZ;
        }
        if (C04TD.H == null) {
            synchronized (INetworkDependencyService.class) {
                if (C04TD.H == null) {
                    C04TD.H = new NetworkDependencyService();
                }
            }
        }
        return C04TD.H;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkDependencyService
    public InterfaceC859903Xp createBuilder(String str) {
        final C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str);
        return new InterfaceC859903Xp(c1499850p8JCreateBuilder) { // from class: X.0pK2
            public final InterfaceC1507130pK3 LIZ;

            @Override // X.InterfaceC859903Xp
            public final InterfaceC859903Xp LIZJ() {
                this.LIZ.LIZLLL(C0CWR.LIZ);
                return this;
            }

            @Override // X.InterfaceC859903Xp
            public final C01K1 build() {
                final TTRetrofit tTRetrofitBuild = this.LIZ.build();
                return new C01K1() { // from class: X.05Is
                    @Override // X.C01K1
                    public final <T> T create(Class<T> cls) {
                        return (T) tTRetrofitBuild.create(cls);
                    }
                };
            }

            {
                this.LIZ = c1499850p8JCreateBuilder;
            }

            @Override // X.InterfaceC859903Xp
            public final InterfaceC859903Xp LIZ(InterfaceC1904907d9 interfaceC1904907d9) {
                this.LIZ.LIZ(interfaceC1904907d9);
                return this;
            }

            @Override // X.InterfaceC859903Xp
            public final InterfaceC859903Xp LIZIZ(NetworkPartner networkPartner) {
                this.LIZ.LIZIZ(networkPartner);
                return this;
            }

            @Override // X.InterfaceC859903Xp
            public final InterfaceC859903Xp LIZLLL(C1507090pJz c1507090pJz) {
                this.LIZ.LIZJ(c1507090pJz);
                return this;
            }
        };
    }
}
