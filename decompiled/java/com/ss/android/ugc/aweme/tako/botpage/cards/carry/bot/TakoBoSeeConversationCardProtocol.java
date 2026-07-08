package com.ss.android.ugc.aweme.tako.botpage.cards.carry.bot;

import X.AbstractC642490PHz;
import X.C03H5;
import X.C07I5;
import X.C13IQ;
import X.C1857760yRa;
import X.C1857770yRb;
import X.C1858030yS1;
import X.C298830BnV;
import X.C326880Cre;
import X.C643310PLd;
import X.InterfaceC1858000yRy;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoAnswerCarryCardProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoBoSeeConversationCardProtocol implements ITakoAnswerCarryCardProtocol {
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
        return TakoBotSeeConversationCell.class;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoAnswerCarryCardProtocol
    public final boolean Hq(C326880Cre c326880Cre) {
        TakoMixFeed takoMixFeedLJIIIZ;
        if ((!C07I5.LIZ() && !C298830BnV.LIZ()) || (takoMixFeedLJIIIZ = c326880Cre.LLILLL.LJIIIZ()) == null || takoMixFeedLJIIIZ.cardType != 1011) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final InterfaceC1891350zJl l51(InterfaceC1858000yRy interfaceC1858000yRy) {
        TakoBotInfo takoBotInfo;
        TakoBotItem takoBotItem;
        TakoBotItem takoBotItem2;
        C326880Cre c326880Cre = (C326880Cre) interfaceC1858000yRy;
        TakoMixFeed takoMixFeedLJIIIZ = c326880Cre.LLILLL.LJIIIZ();
        String str = null;
        if (takoMixFeedLJIIIZ != null && (takoBotItem2 = takoMixFeedLJIIIZ.bot) != null) {
            takoBotInfo = takoBotItem2.botInfo;
        } else {
            takoBotInfo = null;
        }
        TakoMixFeed takoMixFeedLJIIIZ2 = c326880Cre.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ2 != null && (takoBotItem = takoMixFeedLJIIIZ2.bot) != null) {
            str = takoBotItem.botSessionId;
        }
        return new C1858030yS1(takoBotInfo, str, c326880Cre);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final boolean ru1(InterfaceC1858000yRy interfaceC1858000yRy) {
        return C1857760yRa.LIZ(this, (C326880Cre) interfaceC1858000yRy);
    }
}
