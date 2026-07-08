package com.ss.android.ugc.aweme.tako.botpage.cards.answer.product;

import X.AbstractC642490PHz;
import X.C03H5;
import X.C0R2S;
import X.C13IQ;
import X.C1857770yRb;
import X.C1857820yRg;
import X.C1858810yTH;
import X.C326880Cre;
import X.C643300PLc;
import X.InterfaceC1858000yRy;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoAnswerCardProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerProductCardProtocol implements ITakoAnswerCardProtocol {
    public final C0R2S LL = C643300PLc.LIZ;

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final int qO2() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final C13IQ<C326880Cre> getDataType() {
        return C1857770yRb.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return TakoAnswerProductCell.class;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final AbstractC642490PHz<C326880Cre> getConfig() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoAnswerCardProtocol
    public final boolean Hq(C326880Cre c326880Cre) {
        TakoMixFeed takoMixFeedLJIIIZ = c326880Cre.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ != null && takoMixFeedLJIIIZ.cardType == 11) {
            return true;
        }
        TakoMixFeed takoMixFeedLJIIIZ2 = c326880Cre.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ2 != null && takoMixFeedLJIIIZ2.cardType == 12) {
            return true;
        }
        TakoMixFeed takoMixFeedLJIIIZ3 = c326880Cre.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ3 != null && takoMixFeedLJIIIZ3.cardType == 13) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final InterfaceC1891350zJl l51(InterfaceC1858000yRy interfaceC1858000yRy) {
        return new C1858810yTH((C326880Cre) interfaceC1858000yRy);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final boolean ru1(InterfaceC1858000yRy interfaceC1858000yRy) {
        return C1857820yRg.LIZ(this, (C326880Cre) interfaceC1858000yRy);
    }
}
