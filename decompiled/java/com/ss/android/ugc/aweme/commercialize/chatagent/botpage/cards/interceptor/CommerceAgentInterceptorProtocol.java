package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.interceptor;

import X.C03H5;
import X.C13IQ;
import X.C321490Cix;
import X.C322650Ckp;
import X.C322660Ckq;
import X.InterfaceC1467705op;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentServerCardProtocol;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceAgentMixFeed;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentInterceptorProtocol implements ICommerceAgentServerCardProtocol {
    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final C13IQ<C321490Cix> getDataType() {
        return C322650Ckp.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return CommerceAgentInterceptorCell.class;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final InterfaceC1891350zJl vC(InterfaceC1467705op interfaceC1467705op) {
        String str;
        C321490Cix c321490Cix = (C321490Cix) interfaceC1467705op;
        CommerceAgentMixFeed commerceAgentMixFeedLIZIZ = c321490Cix.LIZJ.LIZIZ();
        if (commerceAgentMixFeedLIZIZ != null) {
            str = commerceAgentMixFeedLIZIZ.text;
        } else {
            str = null;
        }
        Message message = c321490Cix.LIZJ;
        return new C322660Ckq(str, c321490Cix, message.uuid, message.subSessionId, message.actionId, message.botId);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol
    public final boolean z11(InterfaceC1467705op interfaceC1467705op) {
        CommerceAgentMixFeed commerceAgentMixFeedLIZIZ;
        CommerceAgentMixFeed commerceAgentMixFeedLIZIZ2;
        CommerceAgentMixFeed commerceAgentMixFeedLIZIZ3;
        C321490Cix c321490Cix = (C321490Cix) interfaceC1467705op;
        if (!C322650Ckp.LIZIZ(c321490Cix)) {
            return false;
        }
        Message message = c321490Cix.LIZJ;
        CommerceAgentMixFeed commerceAgentMixFeedLIZIZ4 = message.LIZIZ();
        if ((commerceAgentMixFeedLIZIZ4 == null || commerceAgentMixFeedLIZIZ4.cardType != 1001) && (((commerceAgentMixFeedLIZIZ = message.LIZIZ()) == null || commerceAgentMixFeedLIZIZ.cardType != 1002) && (((commerceAgentMixFeedLIZIZ2 = message.LIZIZ()) == null || commerceAgentMixFeedLIZIZ2.cardType != 1003) && ((commerceAgentMixFeedLIZIZ3 = message.LIZIZ()) == null || commerceAgentMixFeedLIZIZ3.cardType != 1012)))) {
            return false;
        }
        return true;
    }
}
