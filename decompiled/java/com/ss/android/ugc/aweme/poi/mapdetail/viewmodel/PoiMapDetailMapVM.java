package com.ss.android.ugc.aweme.poi.mapdetail.viewmodel;

import X.AnonymousClass0956;
import X.C1175770ghb;
import X.C1176270giP;
import X.C1176490gil;
import X.EnumC1175790ghd;
import X.EnumC1176250giN;
import X.EnumC1176260giO;
import X.InterfaceC0148002o;
import X.InterfaceC1177250gjz;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDetailMapVM extends AssemViewModel<C1176490gil> {
    public InterfaceC1177250gjz LL;
    public PoiMapDetailPageVM LLILLJJLI;
    public AnonymousClass0956 LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1176490gil(null, null);
    }

    public final void vQ2(MapBounds mapBounds) {
        Integer numValueOf;
        C1175770ghb c1175770ghb;
        EnumC1175790ghd enumC1175790ghd;
        PoiMapDetailPageVM poiMapDetailPageVM = this.LLILLJJLI;
        if (poiMapDetailPageVM != null && (c1175770ghb = poiMapDetailPageVM.LL) != null && (enumC1175790ghd = c1175770ghb.LIZIZ) != null) {
            enumC1175790ghd.onSearchArea(c1175770ghb);
        }
        PoiMapDetailPageVM poiMapDetailPageVM2 = this.LLILLJJLI;
        if (poiMapDetailPageVM2 != null) {
            EnumC1176250giN enumC1176250giNWQ2 = poiMapDetailPageVM2.wQ2(false);
            if (enumC1176250giNWQ2 != null) {
                numValueOf = Integer.valueOf(enumC1176250giNWQ2.getValue());
            } else {
                numValueOf = null;
            }
            PoiMapDetailPageVM.vQ2(poiMapDetailPageVM2, new C1176270giP(numValueOf, EnumC1176260giO.BACK_TO_HOTEL, mapBounds), false, false, 0L, 12);
        }
    }
}
