package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C01GW;
import X.C1252710ihh;
import X.C13LE;
import X.C197039127h;
import X.C452501pT;
import X.C724240Sb0;
import X.InterfaceC1184330gvP;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public class PoiCollectStatusRedBtnRegionHeaderAssem extends PoiCollectStatusBaseAssem {
    public static final /* synthetic */ int LLJLIL = 0;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 915));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 916));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 917));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 914));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2_;
    }

    public final C197039127h Qp() {
        return (C197039127h) this.LLJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View zp() {
        return (View) this.LLJJJJLIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Ep(boolean z) {
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        if (interfaceC1184330gvP != null) {
            interfaceC1184330gvP.NM(z, "", null, "click_button", null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jp(boolean r10) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusRedBtnRegionHeaderAssem.Jp(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        PageFinder.via(C724240Sb0.LJI(this));
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        if (interfaceC1184330gvP != null) {
            interfaceC1184330gvP.DK(null, "click_button", null, null, PageFinder.via(C724240Sb0.LJI(this)));
        }
    }
}
