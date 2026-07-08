package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.time;

import X.C00X3;
import X.C03H5;
import X.C1165804hE;
import X.C13IQ;
import X.C13LE;
import X.InterfaceC1467705op;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class CommerceAgentMsgTimeProtocol implements ICommerceAgentCardProtocol<C1165804hE> {
    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final C13IQ<C1165804hE> getDataType() {
        return C13LE.LIZ(C1165804hE.class);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return CommerceAgentMsgTimeCell.class;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final InterfaceC1891350zJl vC(InterfaceC1467705op interfaceC1467705op) {
        interfaceC1467705op.getClass();
        return new C00X3(null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final /* bridge */ /* synthetic */ boolean z11(InterfaceC1467705op interfaceC1467705op) {
        return true;
    }
}
