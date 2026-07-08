package com.ss.android.ugc.aweme.services;

import X.C036E;
import X.C0CSC;
import X.C0O0L;
import X.C0XI7;
import X.C1411240mpO;
import X.C2162308dZ;
import X.C844470XAv;
import X.EnumC1493070oxN;
import X.EnumC1661320tKk;
import X.EnumC325100Com;
import X.InterfaceC486620J6m;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes26.dex */
public abstract class NetworkStateBaseService implements INetworkStateService {
    public C1411240mpO netLevel = NetworkLevelKt.defaultNetworkLevel();
    public final CopyOnWriteArrayList<C0CSC> statusListeners = new CopyOnWriteArrayList<>();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC1661320tKk.values().length];
            try {
                iArr[EnumC1661320tKk.FAKE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[EnumC1661320tKk.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[EnumC1661320tKk.OFFLINE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr[EnumC1661320tKk.SLOW.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public boolean isVPN() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public void observeMultiNetworkChange(C0XI7 c0xi7) {
    }

    public void removeMultiNetworkChangeObserver(C0XI7 c0xi7) {
    }

    private final void notifyNetworkChanged() {
        Iterator<C0CSC> it2 = this.statusListeners.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(getNetworkStatus());
        }
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public int getEffectiveConnectionType() {
        return getNetworkLevel().LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public EnumC325100Com getNetworkStatus() {
        int i = WhenMappings.$EnumSwitchMapping$0[getNetworkLevel().LIZ.ordinal()];
        return i != 1 ? (i == 2 || i == 3) ? EnumC325100Com.NOT_AVAILABLE : i != 4 ? EnumC325100Com.STRONG : EnumC325100Com.WEAK : EnumC325100Com.FAKE;
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public boolean isFakeNetwork() {
        return NetworkLevelKt.isFake(getNetworkLevel());
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public boolean isWeakNetwork() {
        return NetworkLevelKt.isWeak(getNetworkLevel());
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public EnumC1493070oxN getMultiNetworkState() {
        return EnumC1493070oxN.STOPPED;
    }

    public C1411240mpO getNetworkLevel() {
        return this.netLevel;
    }

    public static boolean INVOKESTATIC_com_ss_android_ugc_aweme_services_NetworkStateBaseService_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    private final void handleNetworkLevelLogic(C1411240mpO c1411240mpO) {
        ILiveOuterService iLiveOuterServiceQ4;
        InterfaceC486620J6m interfaceC486620J6mI4;
        ILiveOuterService iLiveOuterServiceQ42;
        InterfaceC486620J6m interfaceC486620J6mI42;
        if (NetworkLevelKt.isFake(c1411240mpO)) {
            C036E.LIZ.LJ(C0O0L.FAKE);
        } else if (NetworkLevelKt.isOffline(c1411240mpO)) {
            C036E.LIZ.LJ(C0O0L.NOT_AVAILABLE);
        } else if (NetworkLevelKt.isUnknown(c1411240mpO)) {
            C036E.LIZ.LJ(C0O0L.UNKNOWN);
        } else {
            C844470XAv.LIZ.getClass();
            if (INVOKESTATIC_com_ss_android_ugc_aweme_services_NetworkStateBaseService_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable(C844470XAv.LIZ())) {
                C036E.LIZ.LJ(C0O0L.AVAILABLE);
            }
        }
        C844470XAv.LIZ.getClass();
        if (C2162308dZ.LJI(C844470XAv.LIZ())) {
            if (NetworkLevelKt.lteOffline(c1411240mpO)) {
                ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                if (iLiveOuterService != null && (iLiveOuterServiceQ42 = iLiveOuterService.q4()) != null && (interfaceC486620J6mI42 = iLiveOuterServiceQ42.i4()) != null) {
                    interfaceC486620J6mI42.v3();
                    return;
                }
                return;
            }
            ILiveOuterService iLiveOuterService2 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            if (iLiveOuterService2 == null || (iLiveOuterServiceQ4 = iLiveOuterService2.q4()) == null || (interfaceC486620J6mI4 = iLiveOuterServiceQ4.i4()) == null) {
                return;
            }
            interfaceC486620J6mI4.P4();
        }
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public void observerNetworkChange(C0CSC c0csc) {
        this.statusListeners.add(c0csc);
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public void removeNetworkChangeObserver(C0CSC c0csc) {
        this.statusListeners.remove(c0csc);
    }

    public final void updateNetLevel(C1411240mpO c1411240mpO) {
        this.netLevel = c1411240mpO;
        handleNetworkLevelLogic(c1411240mpO);
        notifyNetworkChanged();
    }
}
