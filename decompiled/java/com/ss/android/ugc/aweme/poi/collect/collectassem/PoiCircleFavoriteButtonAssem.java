package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C01GW;
import X.C1252710ihh;
import X.C13LE;
import X.C452501pT;
import X.C724240Sb0;
import X.InterfaceC1184330gvP;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCircleFavoriteButtonAssem extends PoiCollectStatusBaseAssem {
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 900));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 901));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 902));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dzq;
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

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Jp(boolean z) {
        if (z) {
            zp().setBackgroundResource(R.drawable.cua);
            ((TuxIconView) this.LLJJL.getValue()).setTintColorRes(R.attr.a1h);
            ((TuxIconView) this.LLJJL.getValue()).setIconRes(R.raw.icon_bookmark_fill);
        } else {
            zp().setBackgroundResource(R.drawable.cv9);
            ((TuxIconView) this.LLJJL.getValue()).setTintColorRes(R.attr.a0p);
            ((TuxIconView) this.LLJJL.getValue()).setIconRes(R.raw.icon_bookmark);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        if (interfaceC1184330gvP != null) {
            interfaceC1184330gvP.DK(null, "click_button", null, null, PageFinder.via(C724240Sb0.LJI(this)));
        }
    }
}
