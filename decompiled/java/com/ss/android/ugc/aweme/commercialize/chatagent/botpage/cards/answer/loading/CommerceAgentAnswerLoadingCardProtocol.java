package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.answer.loading;

import X.C03H5;
import X.C13IQ;
import X.C321340Cii;
import X.C321490Cix;
import X.C321730CjL;
import X.C322650Ckp;
import X.InterfaceC1467705op;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentServerCardProtocol;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentAnswerLoadingCardProtocol implements ICommerceAgentServerCardProtocol {
    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final C13IQ<C321490Cix> getDataType() {
        return C322650Ckp.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return CommerceAgentAnswerLoadingCell.class;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final InterfaceC1891350zJl vC(InterfaceC1467705op interfaceC1467705op) {
        return new C321340Cii((C321490Cix) interfaceC1467705op);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final boolean z11(InterfaceC1467705op interfaceC1467705op) {
        C321490Cix c321490Cix = (C321490Cix) interfaceC1467705op;
        C321730CjL.LIZIZ(c321490Cix.LIZJ);
        if (C322650Ckp.LIZIZ(c321490Cix)) {
            Message message = c321490Cix.LIZJ;
            int i = message.msgType;
            if ((i == 2 || i == 5 || i == 999) && C321730CjL.LIZIZ(message)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
