package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C1252710ihh;
import X.C13LE;
import X.C786410Ut5;
import X.InterfaceC1184330gvP;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCollectStatusTopNavBarAssem extends PoiCollectStatusBaseAssem {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e29;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View zp() {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Ep(boolean z) {
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        if (interfaceC1184330gvP != null) {
            interfaceC1184330gvP.NM(z, "", null, "click_banner", null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Jp(boolean z) {
        if (z) {
            throw null;
        }
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.re6));
        throw null;
    }
}
