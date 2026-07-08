package com.ss.android.ugc.aweme.tako.botpage.cards.novel.divider;

import X.AbstractC642490PHz;
import X.C00XJ;
import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C326910Crh;
import X.C643310PLd;
import X.InterfaceC1858000yRy;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoNovelChapterDividerCardProtocol implements ITakoCardProtocol<C326910Crh> {
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final C13IQ<C326910Crh> getDataType() {
        return C13LE.LIZ(C326910Crh.class);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final int qO2() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final AbstractC642490PHz<C326910Crh> getConfig() {
        return new C643310PLd();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return TakoNovelChapterDividerCell.class;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final InterfaceC1891350zJl l51(InterfaceC1858000yRy interfaceC1858000yRy) {
        return new C00XJ();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final /* bridge */ /* synthetic */ boolean ru1(InterfaceC1858000yRy interfaceC1858000yRy) {
        return true;
    }
}
