package com.ss.android.ugc.aweme.tako.otherpage.share.cards.sharetitle;

import X.AbstractC642490PHz;
import X.C0284007u;
import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C326930Crj;
import X.C643310PLd;
import X.InterfaceC1858000yRy;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoShareTitleCardProtocol implements ITakoCardProtocol<C326930Crj> {
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final C13IQ<C326930Crj> getDataType() {
        return C13LE.LIZ(C326930Crj.class);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final int qO2() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final AbstractC642490PHz<C326930Crj> getConfig() {
        return new C643310PLd();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return TakoShareTitleCell.class;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final InterfaceC1891350zJl l51(InterfaceC1858000yRy interfaceC1858000yRy) {
        return new C0284007u(((C326930Crj) interfaceC1858000yRy).LL);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final /* bridge */ /* synthetic */ boolean ru1(InterfaceC1858000yRy interfaceC1858000yRy) {
        return true;
    }
}
