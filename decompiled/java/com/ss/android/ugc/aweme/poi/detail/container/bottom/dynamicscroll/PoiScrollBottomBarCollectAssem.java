package com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamicscroll;

import X.C01GW;
import X.C061L;
import X.C1180060goW;
import X.C1185430gxB;
import X.C1206904nr;
import X.C1252710ihh;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C197039127h;
import X.C2500209qy;
import X.C452501pT;
import X.C723580SZw;
import X.InterfaceC1184330gvP;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiScrollBottomBarCollectAssem extends PoiCollectStatusBaseAssem {
    public final C1559260qg8 LLJJJJLIIL = new C1559260qg8(new C723580SZw(this, C061L.class, "poi_scroll_bottom_bar_collect_hierarchy_data"), checkSupervisorPrepared());
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1069));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 43));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1070));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1071));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2r;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Gp() {
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        c1185430gxB.getClass();
        C1185430gxB.LJJII(interfaceC665370Q7zLJIIL, "favourite");
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View zp() {
        return (View) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C197039127h Qp() {
        View view;
        ViewGroup viewGroup;
        Object next;
        View viewLJJIJL = LJJIJL();
        if (!(viewLJJIJL instanceof ViewGroup) || (viewGroup = (ViewGroup) viewLJJIJL) == null) {
            view = null;
        } else {
            Iterator it2 = new C2500209qy(viewGroup, 10).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next instanceof C197039127h) {
                    break;
                }
            }
            view = (View) next;
        }
        if (view instanceof C197039127h) {
            return (C197039127h) view;
        }
        return null;
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
        String string;
        String string2;
        Context context = getContext();
        if (context == null) {
            return;
        }
        boolean zLIZ = C1206904nr.LIZ();
        String str = null;
        if (z) {
            C197039127h c197039127hQp = Qp();
            if (c197039127hQp != null) {
                c197039127hQp.setButtonVariant(1);
            }
            PoiScrollBottomBarCollectClickEventData poiScrollBottomBarCollectClickEventData = (PoiScrollBottomBarCollectClickEventData) this.LLJJL.getValue();
            if (poiScrollBottomBarCollectClickEventData != null) {
                str = poiScrollBottomBarCollectClickEventData.collectedIcon;
            }
            if (zLIZ) {
                string2 = LJJIJL().getContext().getString(2131844689);
            } else {
                PoiScrollBottomBarCollectClickEventData poiScrollBottomBarCollectClickEventData2 = (PoiScrollBottomBarCollectClickEventData) this.LLJJL.getValue();
                if (poiScrollBottomBarCollectClickEventData2 == null || (string2 = poiScrollBottomBarCollectClickEventData2.collectedText) == null) {
                    string2 = LJJIJL().getContext().getString(2131844691);
                }
            }
            Tp(context, str, R.raw.icon_bookmark_fill, string2);
            return;
        }
        C197039127h c197039127hQp2 = Qp();
        if (c197039127hQp2 != null) {
            c197039127hQp2.setButtonVariant(0);
        }
        PoiScrollBottomBarCollectClickEventData poiScrollBottomBarCollectClickEventData3 = (PoiScrollBottomBarCollectClickEventData) this.LLJJL.getValue();
        if (poiScrollBottomBarCollectClickEventData3 != null) {
            str = poiScrollBottomBarCollectClickEventData3.unCollectedIcon;
        }
        if (zLIZ) {
            string = LJJIJL().getContext().getString(2131844688);
        } else {
            PoiScrollBottomBarCollectClickEventData poiScrollBottomBarCollectClickEventData4 = (PoiScrollBottomBarCollectClickEventData) this.LLJJL.getValue();
            if (poiScrollBottomBarCollectClickEventData4 == null || (string = poiScrollBottomBarCollectClickEventData4.unCollectedText) == null) {
                string = LJJIJL().getContext().getString(2131844690);
            }
        }
        Tp(context, str, R.raw.icon_bookmark, string);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        if (interfaceC1184330gvP != null) {
            interfaceC1184330gvP.DK(null, "bottom_operate_btn", null, null, null);
        }
    }

    public final void Tp(Context context, String str, int i, String str2) {
        Integer numLJIIIIZZ;
        if (str != null && (numLJIIIIZZ = C1180060goW.LJIIIIZZ(context, str, Integer.valueOf(i))) != null) {
            i = numLJIIIIZZ.intValue();
        }
        C197039127h c197039127hQp = Qp();
        if (c197039127hQp != null) {
            c197039127hQp.setButtonStartIcon(Integer.valueOf(i));
            c197039127hQp.setText(str2);
        }
    }
}
