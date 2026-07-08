package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.carry.privacy;

import X.C0282007s;
import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C321520Cj0;
import X.InterfaceC1467705op;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentLocalPrivacyTipsMessageProtocol implements ICommerceAgentCardProtocol<C321520Cj0> {
    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final C13IQ<C321520Cj0> getDataType() {
        return C13LE.LIZ(C321520Cj0.class);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return CommerceAgentLocalPrivacyTipsMessageCell.class;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final InterfaceC1891350zJl vC(InterfaceC1467705op interfaceC1467705op) {
        return new C0282007s(((C321520Cj0) interfaceC1467705op).LIZ);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final /* bridge */ /* synthetic */ boolean z11(InterfaceC1467705op interfaceC1467705op) {
        return true;
    }
}
