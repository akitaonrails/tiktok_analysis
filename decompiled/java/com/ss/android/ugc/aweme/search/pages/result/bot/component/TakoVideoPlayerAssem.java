package com.ss.android.ugc.aweme.search.pages.result.bot.component;

import X.C0BQH;
import X.C1913107eT;
import X.C21565319aV;
import X.C418440Gaw;
import X.C653660PkS;
import X.InterfaceC435460H5s;
import X.InterfaceC436740HAq;
import X.InterfaceC652490PiZ;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoVideoPlayerAssem extends SearchCardVideoPlayerAssem {
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem
    public final String Ap() {
        return "TakoVideoPlayerAssem";
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Integer numValueOf = Integer.valueOf(C1913107eT.LIZJ());
        if (numValueOf.intValue() > 0) {
            C21565319aV.LIZIZ(view, Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(numValueOf.intValue()))), null, null, null, null, 30);
        }
        if (C0BQH.LIZ()) {
            C21565319aV.LIZIZ(view, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem
    public final void op(C653660PkS c653660PkS) {
        String providerDocIdStr;
        InterfaceC436740HAq interfaceC436740HAq;
        SearchMixFeed searchMixFeedLIZ;
        InterfaceC435460H5s interfaceC435460H5s = this.LLJZIJLIL;
        if (!(interfaceC435460H5s instanceof InterfaceC652490PiZ) || (interfaceC436740HAq = (InterfaceC436740HAq) interfaceC435460H5s) == null || (searchMixFeedLIZ = interfaceC436740HAq.LIZ()) == null || (providerDocIdStr = searchMixFeedLIZ.getProviderDocIdStr()) == null) {
            providerDocIdStr = "";
        }
        c653660PkS.LJIJI = providerDocIdStr;
        c653660PkS.LJJII = "tikbot";
    }
}
