package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.ui;

import X.C12P4;
import X.C1558520qew;
import X.C1913107eT;
import X.C21565319aV;
import X.C418440Gaw;
import X.C641200PDa;
import X.C653660PkS;
import X.C661490Px5;
import X.InterfaceC435460H5s;
import X.InterfaceC436740HAq;
import X.InterfaceC652490PiZ;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;

/* JADX INFO: loaded from: classes11.dex */
public final class AggregatedVideoPlayerAssem extends SearchCardVideoPlayerAssem implements ISearchCardVideoPlayerAbility {
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem
    public final String Ap() {
        return "AggregatedVideoPlayerAssem";
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem
    public final void tp() {
        InterfaceC436740HAq interfaceC436740HAq;
        SearchMixFeed searchMixFeedLIZ;
        C661490Px5 dataProvider;
        super.tp();
        InterfaceC435460H5s interfaceC435460H5s = this.LLJZIJLIL;
        if ((interfaceC435460H5s instanceof InterfaceC652490PiZ) && (interfaceC436740HAq = (InterfaceC436740HAq) interfaceC435460H5s) != null && (searchMixFeedLIZ = interfaceC436740HAq.LIZ()) != null && (dataProvider = Bp().getDataProvider()) != null) {
            InterfaceC435460H5s interfaceC435460H5s2 = this.LLJZIJLIL;
            dataProvider.LJJII = String.valueOf(C641200PDa.LIZ(interfaceC435460H5s2 != null ? interfaceC435460H5s2.getAweme() : null, searchMixFeedLIZ));
        }
        C1558520qew.LJI(this, VideoSubCardScope.class, this, ISearchCardVideoPlayerAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.ui.ISearchCardVideoPlayerAbility
    public final FrameLayout Vr1() {
        return (FrameLayout) this.LLJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.ui.ISearchCardVideoPlayerAbility
    public final C12P4 q42() {
        return (C12P4) this.LLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem, X.InterfaceC712990Rxx
    public final void unBind() throws IllegalAccessException {
        super.unBind();
        C1558520qew.LJIIJ(this, VideoSubCardScope.class, ISearchCardVideoPlayerAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem
    public final void Ep() {
        super.Ep();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Integer numValueOf = Integer.valueOf(C1913107eT.LIZJ());
        if (numValueOf.intValue() > 0) {
            C21565319aV.LIZIZ(view, Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(numValueOf.intValue()))), null, null, null, null, 30);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem
    public final void op(C653660PkS c653660PkS) {
        String str = c653660PkS.LJJLIIIJILLIZJL;
        if (str != null) {
            c653660PkS.LJIJI = str;
        }
        c653660PkS.LJJII = c653660PkS.LJJLIIIJ;
        c653660PkS.LJIJ = String.valueOf(c653660PkS.LJIILL);
    }
}
