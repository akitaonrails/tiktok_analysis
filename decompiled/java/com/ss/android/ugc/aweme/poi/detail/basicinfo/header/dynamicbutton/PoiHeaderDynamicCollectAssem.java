package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.dynamicbutton;

import X.C01GW;
import X.C061K;
import X.C1077410e8x;
import X.C1077420e8y;
import X.C1180060goW;
import X.C1185430gxB;
import X.C1206904nr;
import X.C1252710ihh;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C197039127h;
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
public final class PoiHeaderDynamicCollectAssem extends PoiCollectStatusBaseAssem {
    public final C1559260qg8 LLJJJJLIIL = new C1559260qg8(new C723580SZw(this, C061K.class, "poi_dynamic_nav_bar_collect_hierarchy_data"), checkSupervisorPrepared());
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1008));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 42));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1009));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1010));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2r;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Gp() {
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        c1185430gxB.getClass();
        C1185430gxB.LJJIIZ(interfaceC665370Q7zLJIIL, "favourite");
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View zp() {
        return (View) this.LLJJLIIIJLLLLLLLZ.getValue();
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
        String string;
        String string2;
        Context context = getContext();
        if (context == null) {
            return;
        }
        boolean zLIZ = C1206904nr.LIZ();
        String str = null;
        if (z) {
            PoiHeaderDynamicCollectClickEventData poiHeaderDynamicCollectClickEventData = (PoiHeaderDynamicCollectClickEventData) this.LLJJL.getValue();
            if (poiHeaderDynamicCollectClickEventData != null) {
                str = poiHeaderDynamicCollectClickEventData.collectedIcon;
            }
            if (zLIZ) {
                string2 = LJJIJL().getContext().getString(2131844689);
            } else {
                PoiHeaderDynamicCollectClickEventData poiHeaderDynamicCollectClickEventData2 = (PoiHeaderDynamicCollectClickEventData) this.LLJJL.getValue();
                if (poiHeaderDynamicCollectClickEventData2 == null || (string2 = poiHeaderDynamicCollectClickEventData2.collectedText) == null) {
                    string2 = LJJIJL().getContext().getString(2131844691);
                }
            }
            Qp(context, str, R.raw.icon_bookmark_fill, string2);
            return;
        }
        PoiHeaderDynamicCollectClickEventData poiHeaderDynamicCollectClickEventData3 = (PoiHeaderDynamicCollectClickEventData) this.LLJJL.getValue();
        if (poiHeaderDynamicCollectClickEventData3 != null) {
            str = poiHeaderDynamicCollectClickEventData3.unCollectedIcon;
        }
        if (zLIZ) {
            string = LJJIJL().getContext().getString(2131844688);
        } else {
            PoiHeaderDynamicCollectClickEventData poiHeaderDynamicCollectClickEventData4 = (PoiHeaderDynamicCollectClickEventData) this.LLJJL.getValue();
            if (poiHeaderDynamicCollectClickEventData4 == null || (string = poiHeaderDynamicCollectClickEventData4.unCollectedText) == null) {
                string = LJJIJL().getContext().getString(2131844690);
            }
        }
        Qp(context, str, R.raw.icon_bookmark, string);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1252710ihh.LJI(this, C13LE.LIZ(InterfaceC1184330gvP.class), null);
        if (interfaceC1184330gvP != null) {
            interfaceC1184330gvP.DK(null, "click_button", null, null, null);
        }
    }

    public final void Qp(Context context, String str, int i, String str2) {
        View view;
        C197039127h c197039127h;
        ViewGroup viewGroup;
        Object next;
        Integer numLJIIIIZZ;
        if (str != null && (numLJIIIIZZ = C1180060goW.LJIIIIZZ(context, str, Integer.valueOf(i))) != null) {
            i = numLJIIIIZZ.intValue();
        }
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
            Iterator it2 = new C1077420e8y(viewGroup, 1).iterator();
            while (true) {
                C1077410e8x c1077410e8x = (C1077410e8x) it2;
                if (c1077410e8x.hasNext()) {
                    next = c1077410e8x.next();
                    if (next instanceof C197039127h) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            view = (View) next;
        } else {
            view = null;
        }
        if ((view instanceof C197039127h) && (c197039127h = (C197039127h) view) != null) {
            c197039127h.setButtonStartIcon(Integer.valueOf(i));
            c197039127h.setText(str2);
        }
    }
}
