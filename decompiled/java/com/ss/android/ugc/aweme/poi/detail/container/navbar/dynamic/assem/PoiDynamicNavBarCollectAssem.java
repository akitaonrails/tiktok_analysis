package com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.assem;

import X.C01GW;
import X.C1155380gAi;
import X.C1180060goW;
import X.C1185430gxB;
import X.C1252710ihh;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.InterfaceC1184330gvP;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.IDynamicNavBarIconAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDynamicNavBarCollectAssem extends PoiCollectStatusBaseAssem {
    public final C1559260qg8 LLJJJJLIIL = new C1559260qg8(new C723580SZw(this, C1155380gAi.class, "poi_dynamic_nav_bar_collect_hierarchy_data"), checkSupervisorPrepared());
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1076));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1077));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1078));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1079));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2z;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Gp() {
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        c1185430gxB.getClass();
        C1185430gxB.LJJJJ(interfaceC665370Q7zLJIIL, "favourite");
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View zp() {
        return (View) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Ep(boolean z) {
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        if (interfaceC1184330gvP != null) {
            interfaceC1184330gvP.NM(z, "", null, "top_operate_btn", null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Jp(boolean z) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        boolean zLJFF = false;
        String str = null;
        if (z) {
            C1155380gAi c1155380gAi = (C1155380gAi) this.LLJJJJLIIL.getValue();
            if (c1155380gAi != null) {
                zLJFF = Intrinsics.LJFF(c1155380gAi.LLILLJJLI, Boolean.TRUE);
            }
            if (zLJFF) {
                PoiDynamicNavBarCollectClickEventData poiDynamicNavBarCollectClickEventData = (PoiDynamicNavBarCollectClickEventData) this.LLJJL.getValue();
                if (poiDynamicNavBarCollectClickEventData != null) {
                    str = poiDynamicNavBarCollectClickEventData.collectedIcon;
                }
                Qp(context, R.raw.icon_bookmark_fill, str);
                return;
            }
            PoiDynamicNavBarCollectClickEventData poiDynamicNavBarCollectClickEventData2 = (PoiDynamicNavBarCollectClickEventData) this.LLJJL.getValue();
            if (poiDynamicNavBarCollectClickEventData2 != null) {
                str = poiDynamicNavBarCollectClickEventData2.collectedIcon;
            }
            Qp(context, R.raw.icon_bookmark_fill, str);
            return;
        }
        C1155380gAi c1155380gAi2 = (C1155380gAi) this.LLJJJJLIIL.getValue();
        if (c1155380gAi2 != null) {
            zLJFF = Intrinsics.LJFF(c1155380gAi2.LLILLJJLI, Boolean.TRUE);
        }
        if (zLJFF) {
            PoiDynamicNavBarCollectClickEventData poiDynamicNavBarCollectClickEventData3 = (PoiDynamicNavBarCollectClickEventData) this.LLJJL.getValue();
            if (poiDynamicNavBarCollectClickEventData3 != null) {
                str = poiDynamicNavBarCollectClickEventData3.unCollectedIcon;
            }
            Qp(context, R.raw.icon_bookmark, str);
            return;
        }
        PoiDynamicNavBarCollectClickEventData poiDynamicNavBarCollectClickEventData4 = (PoiDynamicNavBarCollectClickEventData) this.LLJJL.getValue();
        if (poiDynamicNavBarCollectClickEventData4 != null) {
            str = poiDynamicNavBarCollectClickEventData4.unCollectedIcon;
        }
        Qp(context, R.raw.icon_bookmark, str);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        IDynamicNavBarIconAbility iDynamicNavBarIconAbility;
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (iDynamicNavBarIconAbility = (IDynamicNavBarIconAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IDynamicNavBarIconAbility.class, null)) != null) {
            iDynamicNavBarIconAbility.p62((TuxIconView) this.LLJL.getValue());
        }
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        if (interfaceC1184330gvP != null) {
            interfaceC1184330gvP.DK(null, "top_operate_btn", null, null, null);
        }
    }

    public final void Qp(Context context, int i, String str) {
        Integer numLJIIIIZZ;
        if (str != null && (numLJIIIIZZ = C1180060goW.LJIIIIZZ(context, str, Integer.valueOf(i))) != null) {
            i = numLJIIIIZZ.intValue();
        }
        ((TuxIconView) this.LLJL.getValue()).setIconRes(i);
    }
}
