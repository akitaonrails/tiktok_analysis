package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C01GW;
import X.C1206904nr;
import X.C1252710ihh;
import X.C13LE;
import X.C1558520qew;
import X.C197039127h;
import X.C2211631BhB;
import X.C452501pT;
import X.InterfaceC1184330gvP;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailFavoriteButtonAssem extends PoiCollectStatusBaseAssem {
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 923));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 924));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 925));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 922));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dzr;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final boolean up() {
        return false;
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
            interfaceC1184330gvP.NM(z, "", null, "bottom_operate_btn", null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Jp(boolean z) {
        int i;
        int i2;
        boolean zLIZ = C1206904nr.LIZ();
        if (z) {
            C197039127h c197039127hQp = Qp();
            if (zLIZ) {
                i2 = 2131844689;
            } else {
                i2 = 2131844691;
            }
            c197039127hQp.setText(i2);
            Qp().setButtonStartIcon(Integer.valueOf(R.raw.icon_bookmark_fill));
            Qp().setButtonVariant(1);
        } else {
            C197039127h c197039127hQp2 = Qp();
            if (zLIZ) {
                i = 2131844688;
            } else {
                i = 2131844690;
            }
            c197039127hQp2.setText(i);
            Qp().setButtonStartIcon(Integer.valueOf(R.raw.icon_bookmark));
            Qp().setButtonVariant(0);
        }
        IPoiCollectStatusAbility iPoiCollectStatusAbility = (IPoiCollectStatusAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPoiCollectStatusAbility.class, null);
        if (iPoiCollectStatusAbility != null) {
            iPoiCollectStatusAbility.Pe2(sp().LIZ, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C2211631BhB.LJ(view, new AwS384S0200000_18(view, this, 75));
    }
}
