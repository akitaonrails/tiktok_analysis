package com.ss.android.ugc.aweme.tako.multiconversation.sug;

import X.AbstractC642490PHz;
import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C1858020yS0;
import X.C326960Crm;
import X.C643310PLd;
import X.InterfaceC1858000yRy;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMiddlePageSugCardProtocol implements ITakoCardProtocol<C326960Crm> {
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final C13IQ<C326960Crm> getDataType() {
        return C13LE.LIZ(C326960Crm.class);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final int qO2() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final AbstractC642490PHz<C326960Crm> getConfig() {
        return new C643310PLd();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return TakoMiddlePageSugListCardCell.class;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final InterfaceC1891350zJl l51(InterfaceC1858000yRy interfaceC1858000yRy) {
        return new C1858020yS0((C326960Crm) interfaceC1858000yRy);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final boolean ru1(InterfaceC1858000yRy interfaceC1858000yRy) {
        TakoSug takoSug = ((C326960Crm) interfaceC1858000yRy).LLILLJJLI;
        if (!takoSug.LJIIJJI && !takoSug.LJIIL) {
            return false;
        }
        return true;
    }
}
