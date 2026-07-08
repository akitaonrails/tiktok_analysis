package com.ss.android.ugc.aweme.tako.botpage.cards.answer.retry;

import X.AbstractC642490PHz;
import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C1857070yQT;
import X.C326900Crg;
import X.C643310PLd;
import X.InterfaceC1858000yRy;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerRetryCardProtocol implements ITakoCardProtocol<C326900Crg> {
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final C13IQ<C326900Crg> getDataType() {
        return C13LE.LIZ(C326900Crg.class);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final int qO2() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final AbstractC642490PHz<C326900Crg> getConfig() {
        return new C643310PLd();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return TakoAnswerRetryCell.class;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final InterfaceC1891350zJl l51(InterfaceC1858000yRy interfaceC1858000yRy) {
        C326900Crg c326900Crg = (C326900Crg) interfaceC1858000yRy;
        return new C1857070yQT(c326900Crg.LLILLJJLI, c326900Crg.LLILLL, c326900Crg.LLILZ);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final boolean ru1(InterfaceC1858000yRy interfaceC1858000yRy) {
        Integer num = ((C326900Crg) interfaceC1858000yRy).LL;
        if (num != null && num.intValue() == -2000) {
            return true;
        }
        return false;
    }
}
