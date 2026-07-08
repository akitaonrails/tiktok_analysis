package com.ss.android.ugc.aweme.tako.botpage.cards.interceptor;

import X.AbstractC642490PHz;
import X.C03H5;
import X.C13IQ;
import X.C1857770yRb;
import X.C1858670yT3;
import X.C322730Ckx;
import X.C326880Cre;
import X.C643310PLd;
import X.InterfaceC1858000yRy;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoServerCardProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoInterceptorProtocol implements ITakoServerCardProtocol {
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final int qO2() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final AbstractC642490PHz<C326880Cre> getConfig() {
        return new C643310PLd();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final C13IQ<C326880Cre> getDataType() {
        return C1857770yRb.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return TakoInterceptorCell.class;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final InterfaceC1891350zJl l51(InterfaceC1858000yRy interfaceC1858000yRy) {
        String str;
        C326880Cre c326880Cre = (C326880Cre) interfaceC1858000yRy;
        TakoMixFeed takoMixFeedLJIIIZ = c326880Cre.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ != null) {
            str = takoMixFeedLJIIIZ.text;
        } else {
            str = null;
        }
        Message message = c326880Cre.LLILLL;
        return new C322730Ckx(str, c326880Cre, message.uuid, message.subSessionId, message.subConversationId, message.actionId, message.botId);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final boolean ru1(InterfaceC1858000yRy interfaceC1858000yRy) {
        C326880Cre c326880Cre = (C326880Cre) interfaceC1858000yRy;
        if ((!C1858670yT3.LJIIIZ(c326880Cre.LLILLL)) && C1858670yT3.LJIIL(c326880Cre.LLILLL)) {
            return true;
        }
        return false;
    }
}
