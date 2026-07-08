package com.ss.android.ugc.aweme.tako.botpage.cards.answer.videoenhanced;

import X.AbstractC642490PHz;
import X.C03H5;
import X.C0R2V;
import X.C0R3A;
import X.C13IQ;
import X.C1857770yRb;
import X.C1857820yRg;
import X.C326880Cre;
import X.InterfaceC1858000yRy;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoAnswerCardProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoEnhancedItemInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoAnswerVideoEnhancedCardProtocol implements ITakoAnswerCardProtocol {
    public final C0R2V LL = new AbstractC642490PHz<C326880Cre>() { // from class: X.0R2V
        public final C642240PHa LIZIZ = new C642240PHa(true, true, 0, false, false, true, false, false, true, false, null, null, 15228);

        @Override // X.AbstractC642490PHz
        public final C642240PHa LIZIZ() {
            return this.LIZIZ;
        }

        @Override // X.AbstractC642490PHz
        public final List LIZ(InterfaceC1858000yRy interfaceC1858000yRy) {
            List list;
            TakoEnhancedItemInfo takoEnhancedItemInfo;
            C326880Cre c326880Cre = (C326880Cre) interfaceC1858000yRy;
            TakoMixFeed takoMixFeedLJIIIZ = c326880Cre.LLILLL.LJIIIZ();
            if (takoMixFeedLJIIIZ == null || (takoEnhancedItemInfo = takoMixFeedLJIIIZ.enhancedVideoItemInfo) == null || (list = takoEnhancedItemInfo.videoList) == null) {
                list = C13BV.INSTANCE;
            }
            return Collections.singletonList(new C642570PIh(c326880Cre, list));
        }
    };

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
        return TakoAnswerVideoEnhancedCell.class;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final AbstractC642490PHz<C326880Cre> getConfig() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoAnswerCardProtocol
    public final boolean Hq(C326880Cre c326880Cre) {
        TakoMixFeed takoMixFeedLJIIIZ = c326880Cre.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ == null || takoMixFeedLJIIIZ.cardType != 18) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final InterfaceC1891350zJl l51(InterfaceC1858000yRy interfaceC1858000yRy) {
        return new C0R3A((C326880Cre) interfaceC1858000yRy);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final boolean ru1(InterfaceC1858000yRy interfaceC1858000yRy) {
        return C1857820yRg.LIZ(this, (C326880Cre) interfaceC1858000yRy);
    }
}
