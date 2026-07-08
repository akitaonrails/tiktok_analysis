package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.answer.retry;

import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C321720CjK;
import X.C322670Ckr;
import X.InterfaceC1467705op;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentAnswerRetryCardProtocol implements ICommerceAgentCardProtocol<C321720CjK> {
    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final C13IQ<C321720CjK> getDataType() {
        return C13LE.LIZ(C321720CjK.class);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return CommerceAgentAnswerRetryCell.class;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final InterfaceC1891350zJl vC(InterfaceC1467705op interfaceC1467705op) {
        C321720CjK c321720CjK = (C321720CjK) interfaceC1467705op;
        return new C322670Ckr(c321720CjK.LIZIZ, c321720CjK.LIZJ, c321720CjK.LIZLLL);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final boolean z11(InterfaceC1467705op interfaceC1467705op) {
        Integer num = ((C321720CjK) interfaceC1467705op).LIZ;
        if (num != null && num.intValue() == -2000) {
            return true;
        }
        return false;
    }
}
