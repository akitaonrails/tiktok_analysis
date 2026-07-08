package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.p004default;

import X.C03H5;
import X.C13IQ;
import X.C321310Cif;
import X.C321490Cix;
import X.C321730CjL;
import X.C322650Ckp;
import X.InterfaceC1467705op;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentServerCardProtocol;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.MessageSender;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentDefaultAnswerProtocol implements ICommerceAgentServerCardProtocol {
    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final C13IQ<C321490Cix> getDataType() {
        return C322650Ckp.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return CommerceAgentDefaultAnswerCell.class;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final boolean z11(C321490Cix c321490Cix) {
        Message message;
        MessageSender messageSender;
        if (!C322650Ckp.LIZIZ(c321490Cix) || (messageSender = (message = c321490Cix.LIZJ).sender) == null || !(!messageSender.isSelf) || C321730CjL.LIZIZ(message) || C321730CjL.LIZ(c321490Cix.LIZJ)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final InterfaceC1891350zJl vC(InterfaceC1467705op interfaceC1467705op) {
        return new C321310Cif((C321490Cix) interfaceC1467705op);
    }
}
