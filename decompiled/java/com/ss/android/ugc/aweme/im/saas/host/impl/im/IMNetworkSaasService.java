package com.ss.android.ugc.aweme.im.saas.host.impl.im;

import X.C036E;
import X.C0CSC;
import X.C0I0B;
import X.C1954807lC;
import X.C325360CpC;
import X.C894660Z7w;
import X.C908310ZkD;
import X.C908330ZkF;
import X.C908340ZkG;
import X.C908350ZkH;
import X.C908360ZkI;
import X.C908370ZkJ;
import X.C908380ZkK;
import X.C908390ZkL;
import X.C908400ZkM;
import X.C908410ZkN;
import X.C908420ZkO;
import X.C908450ZkR;
import X.C912260Zqa;
import X.EnumC1661320tKk;
import X.EnumC325100Com;
import X.EnumC908290ZkB;
import X.InterfaceC902990Zbd;
import X.InterfaceC908320ZkE;
import X.InterfaceC908430ZkP;
import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMNetworkSaasService implements IMNetworkSaasApi {
    public final ConcurrentHashMap<InterfaceC902990Zbd, C0CSC> LIZIZ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi
    public final boolean LIZIZ() {
        return C912260Zqa.LIZIZ.getNqeNetworkLevel().LIZ == EnumC1661320tKk.OFFLINE;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi
    public final boolean LJLJLJ() {
        return ChatRoomAdaptiveRequestManager.LIZ.LJLJLJ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi
    public final EnumC908290ZkB getNetworkState() {
        EnumC325100Com networkStatus;
        INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
        if (iNetworkStateService != null && (networkStatus = iNetworkStateService.getNetworkStatus()) != null) {
            int i = C325360CpC.LIZ[networkStatus.ordinal()];
            if (i == 1) {
                return EnumC908290ZkB.NOT_AVAILABLE;
            }
            if (i == 2) {
                return EnumC908290ZkB.NOT_AVAILABLE;
            }
            if (i == 3) {
                return EnumC908290ZkB.NOT_AVAILABLE;
            }
            if (i == 4) {
                return EnumC908290ZkB.STRONG;
            }
        }
        return EnumC908290ZkB.NOT_AVAILABLE;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi
    public final InterfaceC908320ZkE getNetworkStateForSharePanel() {
        InterfaceC908430ZkP networkStateForSharePanel;
        INetworkStandardUIService iNetworkStandardUIService = (INetworkStandardUIService) PluggableExtentionKt.pluggableSpi$default(INetworkStandardUIService.class, false, false, false, 14, null);
        if (iNetworkStandardUIService == null || (networkStateForSharePanel = iNetworkStandardUIService.getNetworkStateForSharePanel()) == null) {
            return null;
        }
        if (Intrinsics.LJFF(networkStateForSharePanel, C908340ZkG.LIZ)) {
            return C908310ZkD.LIZ;
        }
        if (Intrinsics.LJFF(networkStateForSharePanel, C908420ZkO.LIZ)) {
            return C908330ZkF.LIZ;
        }
        if (Intrinsics.LJFF(networkStateForSharePanel, C908450ZkR.LIZ)) {
            return C908380ZkK.LIZ;
        }
        if (Intrinsics.LJFF(networkStateForSharePanel, C908360ZkI.LIZ)) {
            return C908400ZkM.LIZ;
        }
        if (Intrinsics.LJFF(networkStateForSharePanel, C908350ZkH.LIZ)) {
            return C908390ZkL.LIZ;
        }
        if (Intrinsics.LJFF(networkStateForSharePanel, C908370ZkJ.LIZ)) {
            return C908410ZkN.LIZ;
        }
        throw new C1954807lC();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi
    public final int getNqeNetworkLevel() {
        return C912260Zqa.LIZIZ.getNqeNetworkLevel().LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi
    public final boolean isNetworkAvailable() {
        C0I0B.LJFF.LIZJ();
        C894660Z7w.LIZ();
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi
    public final void LIZJ(InterfaceC902990Zbd interfaceC902990Zbd) {
        INetworkStateService iNetworkStateService;
        C0CSC c0cscRemove = this.LIZIZ.remove(interfaceC902990Zbd);
        if (c0cscRemove != null && (iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null)) != null) {
            iNetworkStateService.removeNetworkChangeObserver(c0cscRemove);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi
    public final void LIZLLL(final InterfaceC902990Zbd interfaceC902990Zbd) {
        INetworkStateService iNetworkStateService;
        C0CSC c0csc = new C0CSC() { // from class: X.0ZkC
            @Override // X.C0CSC
            public final void LIZ(EnumC325100Com enumC325100Com) {
                EnumC908290ZkB enumC908290ZkB;
                InterfaceC902990Zbd interfaceC902990Zbd2 = interfaceC902990Zbd;
                this.getClass();
                int i = C325360CpC.LIZ[enumC325100Com.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                enumC908290ZkB = EnumC908290ZkB.STRONG;
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            enumC908290ZkB = EnumC908290ZkB.WEAK;
                        }
                    } else {
                        enumC908290ZkB = EnumC908290ZkB.FAKE;
                    }
                } else {
                    enumC908290ZkB = EnumC908290ZkB.NOT_AVAILABLE;
                }
                interfaceC902990Zbd2.LIZ(enumC908290ZkB);
            }
        };
        if (this.LIZIZ.putIfAbsent(interfaceC902990Zbd, c0csc) == null && (iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null)) != null) {
            iNetworkStateService.observerNetworkChange(c0csc);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi
    public final void LIZ(Activity activity, InterfaceC908320ZkE interfaceC908320ZkE, String str) {
        InterfaceC908430ZkP interfaceC908430ZkP;
        INetworkStandardUIService iNetworkStandardUIService = (INetworkStandardUIService) PluggableExtentionKt.pluggableSpi$default(INetworkStandardUIService.class, false, false, false, 14, null);
        if (iNetworkStandardUIService != null) {
            if (Intrinsics.LJFF(interfaceC908320ZkE, C908310ZkD.LIZ)) {
                interfaceC908430ZkP = C908340ZkG.LIZ;
            } else if (Intrinsics.LJFF(interfaceC908320ZkE, C908330ZkF.LIZ)) {
                interfaceC908430ZkP = C908420ZkO.LIZ;
            } else if (Intrinsics.LJFF(interfaceC908320ZkE, C908380ZkK.LIZ)) {
                interfaceC908430ZkP = C908450ZkR.LIZ;
            } else if (Intrinsics.LJFF(interfaceC908320ZkE, C908400ZkM.LIZ)) {
                interfaceC908430ZkP = C908360ZkI.LIZ;
            } else if (Intrinsics.LJFF(interfaceC908320ZkE, C908390ZkL.LIZ)) {
                interfaceC908430ZkP = C908350ZkH.LIZ;
            } else if (Intrinsics.LJFF(interfaceC908320ZkE, C908410ZkN.LIZ)) {
                interfaceC908430ZkP = C908370ZkJ.LIZ;
            } else {
                throw new C1954807lC();
            }
            iNetworkStandardUIService.showNetworkToast(activity, interfaceC908430ZkP, str);
        }
    }
}
