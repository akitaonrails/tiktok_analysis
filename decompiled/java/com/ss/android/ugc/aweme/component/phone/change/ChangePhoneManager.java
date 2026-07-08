package com.ss.android.ugc.aweme.component.phone.change;

import X.C1440005kM;
import X.C1716930umR;
import X.C1717070umf;
import X.C1718160uoQ;
import X.EnumC1717220umu;
import X.InterfaceC1717160umo;
import X.InterfaceC1717200ums;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.component.register.BaseRegisterManager;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public class ChangePhoneManager extends BaseRegisterManager {
    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public Function0<String> LIZLLL() {
        return new AwS570S0100000_26(this, 147);
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public void LJIIL(InterfaceC1717200ums interfaceC1717200ums) {
        InterfaceC1717160umo interfaceC1717160umoLIZ;
        if (TextUtils.equals(interfaceC1717200ums.getClass().getSimpleName(), C1716930umR.class.getSimpleName()) && (interfaceC1717160umoLIZ = interfaceC1717200ums.LIZ()) != null) {
            interfaceC1717160umoLIZ.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.component.register.BaseRegisterManager
    public final void LJIIJJI(InterfaceC1717200ums interfaceC1717200ums, Object obj) {
        if (TextUtils.equals(interfaceC1717200ums.getClass().getSimpleName(), C1717070umf.class.getSimpleName())) {
            InterfaceC1717160umo interfaceC1717160umoLIZ = interfaceC1717200ums.LIZ();
            if (interfaceC1717160umoLIZ != null) {
                interfaceC1717160umoLIZ.LIZIZ(EnumC1717220umu.COLLECT_MOBILE);
                return;
            }
            return;
        }
        if (!TextUtils.equals(interfaceC1717200ums.getClass().getSimpleName(), C1718160uoQ.class.getSimpleName())) {
            return;
        }
        C1440005kM.LIZ(new IEvent() { // from class: X.0ulk
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChangePhoneManager(WalletFlowDecision walletFlowDecision, String str, String str2, String str3) {
        String str4 = str2;
        super(str, str4 == null ? "" : str4, walletFlowDecision, "", str3 != null ? str3 : "", null, null, 96);
    }
}
