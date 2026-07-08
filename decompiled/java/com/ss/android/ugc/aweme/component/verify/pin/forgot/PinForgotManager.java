package com.ss.android.ugc.aweme.component.verify.pin.forgot;

import X.EnumC1717460unI;
import X.InterfaceC1717160umo;
import X.InterfaceC1717200ums;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.component.register.BaseRegisterManager;

/* JADX INFO: loaded from: classes27.dex */
public final class PinForgotManager extends BaseRegisterManager {
    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final void LJIIJ(InterfaceC1717200ums interfaceC1717200ums, Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final EnumC1717460unI LJ() {
        return EnumC1717460unI.FORGOT;
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final void LJIIIZ(InterfaceC1717160umo interfaceC1717160umo) {
        LJIILJJIL();
        interfaceC1717160umo.LJ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PinForgotManager(WalletFlowDecision walletFlowDecision, String str, String str2) {
        String str3 = str2;
        super(str, str3 == null ? "" : str3, walletFlowDecision, "", "", null, null, 96);
    }
}
