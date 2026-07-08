package com.ss.android.ugc.aweme.ecommerce.dependency.network;

import X.C036E;
import X.C04TD;
import X.C0CSC;
import X.C0XHQ;
import X.C1954807lC;
import X.C804420Vh2;
import X.EnumC1323320kXa;
import X.EnumC325100Com;
import X.InterfaceC1323360kXe;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes24.dex */
public final class NetworkUtilDependencyService implements INetworkUtilDependencyService {
    public final ConcurrentHashMap<InterfaceC1323360kXe, C0CSC> statusListeners = new ConcurrentHashMap<>();

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService
    public boolean isWeakNetwork() {
        return ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).isWeakNetwork();
    }

    public static boolean INVOKESTATIC_com_ss_android_ugc_aweme_ecommerce_dependency_network_NetworkUtilDependencyService_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static INetworkUtilDependencyService createINetworkUtilDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(INetworkUtilDependencyService.class, z);
        if (objLIZ != null) {
            return (INetworkUtilDependencyService) objLIZ;
        }
        if (C04TD.I == null) {
            synchronized (INetworkUtilDependencyService.class) {
                if (C04TD.I == null) {
                    C04TD.I = new NetworkUtilDependencyService();
                }
            }
        }
        return C04TD.I;
    }

    public final EnumC1323320kXa convertStatus(EnumC325100Com enumC325100Com) {
        int i = C0XHQ.LIZ[enumC325100Com.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return EnumC1323320kXa.WEAK;
                    }
                    throw new C1954807lC();
                }
                return EnumC1323320kXa.STRONG;
            }
            return EnumC1323320kXa.NOT_AVAILABLE;
        }
        return EnumC1323320kXa.FAKE;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService
    public boolean isNetworkAvailable(Context context) {
        return INVOKESTATIC_com_ss_android_ugc_aweme_ecommerce_dependency_network_NetworkUtilDependencyService_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(context);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService
    public boolean isWifi(Context context) {
        return C804420Vh2.LJI(context);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService
    public void observerNetworkChange(final InterfaceC1323360kXe interfaceC1323360kXe) {
        C0CSC c0csc = new C0CSC() { // from class: X.0puQ
            @Override // X.C0CSC
            public final void LIZ(EnumC325100Com enumC325100Com) {
                interfaceC1323360kXe.LIZ(this.convertStatus(((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getNetworkStatus()));
            }
        };
        removeNetworkChangeObserver(interfaceC1323360kXe);
        this.statusListeners.put(interfaceC1323360kXe, c0csc);
        ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).observerNetworkChange(c0csc);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService
    public void removeNetworkChangeObserver(InterfaceC1323360kXe interfaceC1323360kXe) {
        C0CSC c0cscRemove = this.statusListeners.remove(interfaceC1323360kXe);
        if (c0cscRemove != null) {
            ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).removeNetworkChangeObserver(c0cscRemove);
        }
    }
}
