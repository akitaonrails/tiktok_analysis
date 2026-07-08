package com.ss.android.ugc.aweme.ecommerce.network;

import X.AnonymousClass0317;
import X.C01K1;
import X.C034S;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1AQS;
import X.InterfaceC1904907d9;
import X.InterfaceC859903Xp;
import android.os.SystemClock;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.ecommerce.dependency.network.NetworkDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ECRetrofitFactory implements IECRetrofitFactory {
    @Override // com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory
    public final C01K1 LIZ(String str) {
        return createBuilder(str).build();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory
    public final InterfaceC859903Xp createBuilder(String str) {
        AnonymousClass0317 anonymousClass0317CreateINetworkDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateINetworkDependencyServicebyMonsterPlugin = NetworkDependencyService.createINetworkDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateINetworkDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = INetworkDependencyService.class.getName();
            if (anonymousClass0317CreateINetworkDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateINetworkDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateINetworkDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(INetworkDependencyService.class);
        }
        InterfaceC859903Xp interfaceC859903XpCreateBuilder = ((INetworkDependencyService) anonymousClass0317CreateINetworkDependencyServicebyMonsterPlugin).createBuilder(str);
        C1120604Zw.LIZ.getClass();
        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LIZIZ) {
            ArrayList<InterfaceC1904907d9> arrayList = new ArrayList();
            ArrayList<NetworkPartner> arrayList2 = new ArrayList();
            for (INetworkSaasBuilder iNetworkSaasBuilder : ServiceManager.get().getServices(INetworkSaasBuilder.class)) {
                arrayList.addAll(iNetworkSaasBuilder.LIZIZ());
                arrayList2.addAll(iNetworkSaasBuilder.LIZ());
            }
            for (InterfaceC1904907d9 interfaceC1904907d9 : arrayList) {
                if (interfaceC1904907d9 != null) {
                    interfaceC859903XpCreateBuilder.LIZ(interfaceC1904907d9);
                }
            }
            for (NetworkPartner networkPartner : arrayList2) {
                if (networkPartner != null) {
                    interfaceC859903XpCreateBuilder.LIZIZ(networkPartner);
                }
            }
        }
        return interfaceC859903XpCreateBuilder;
    }
}
